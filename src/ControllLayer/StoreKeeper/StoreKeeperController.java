/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllLayer.StoreKeeper;

import ControllLayer.Manager.ManagerController;
import DataLayer.ConnectManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableColumn;


import java.util.ArrayList;


/**
 *
 * @author Malakagl
 */
public class StoreKeeperController {
  //*****************  
    public static JTable getInitialTable(String[] param){ // not a generalized method
        param[0]="CONCAT( BrandCode, ItemTypeCode ) AS ItemCode";
        ResultSet resultSet=ConnectManager.getDate("ItemDetail", param);
        try {
            if (!resultSet.isBeforeFirst()) { //if result set is empty
                return null;
            } else {
                return resultsetToTable(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreKeeperController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static JTable getTable(Object[] conds) {

        String[] param = new String[11];
        for (int i = 0; i < param.length; i++) {
            param[i] = "";
        }

        String attr, predicate,addValue;

        attr = (String)conds[0];
        predicate = "'" +(String) conds[1] +"'";
        addValue="";

        if ((Boolean) conds[2]) {
            param[0] = "ItemCode";
            addValue="CONCAT( BrandCode, ItemTypeCode ) AS ";
        }
        if ((Boolean) conds[3]) {
            param[1] = "ItemTypeName";
        }
        if ((Boolean) conds[4]) {
            param[2] = "BrandName";
        }
        if ((Boolean) conds[5]) {
            param[3] = "BuyingPrice";
        }
        if ((Boolean) conds[6]) {
            param[4] = "SellingPrice";
        }
       if ((Boolean) conds[7]) {
           param[5] = "LastIntake";
       }
        if ((Boolean) conds[8]) {
            param[6] = "LastBuyingQty";
        }  
        if ((Boolean) conds[9]) {
            param[7] = "AvailableQty";
        }
        if ((Boolean) conds[10]) {
            param[8] = "Description";
        }
        if ((Boolean) conds[11]) {
            param[9] = "SizeDesc";
        }

        ResultSet resultSet = ConnectManager.getSelectedDataExtended("ItemDetail", 
                param, attr, predicate,addValue, "=");

        if (resultSet == null) { //this is not working
            return null;
        } else {
            return resultsetToTable(resultSet);
        }
    }
    
      private static JTable resultsetToTable(ResultSet resultSet) {
        try {
            Vector columnNames = new Vector();
            Vector data = new Vector();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();
            
            columnNames.addElement("");

            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(metaData.getColumnName(i));
                System.out.println("Column " + metaData.getColumnName(i));
            }
                        
            int j=0;
            while (resultSet.next()) {
                System.out.println("while");
                Vector row = new Vector(columns);
                j++;
                row.addElement(j);
                
                for (int i = 1; i <= columns; i++) {
                    row.addElement(resultSet.getObject(i));
                }
                System.out.println(j);
               
                System.out.println(row);
                data.addElement(row);    
            }
            resultSet.close();

            JTable table = new JTable(data, columnNames);
            
            TableColumn column;
            for (int i = 0; i < table.getColumnCount(); i++) {
                column = table.getColumnModel().getColumn(i);
                column.setMaxWidth(250);
            }

            return table;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      
      public static JTable updateOrderTable(String[] conds){
        try {
            String[] param = new String[4];
            for (int i = 0; i < param.length; i++) {
                param[i] = "";
            }   String attr,predicate,addValue;
        attr=conds[0];
            predicate="'" +conds[1]+ "'";
            param[0]=conds[2];
            param[1]=conds[3];
            param[2]=conds[4];
            param[3]=conds[5];
            addValue="CONCAT( BrandCode, ItemTypeCode ) AS ";
            ResultSet resultSet = ConnectManager.getSelectedDataExtended("ItemDetail",
                    param, attr, predicate,addValue, "<");
            if (!resultSet.isBeforeFirst()) {
                return null;
            } else {
                return resultsetToTable(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreKeeperController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
      }
 
      //when amount of items is low notify to manager-by searching
      public static String notifyOrderItems(String[][] OrderItemList){
           //check item already notified
//          String statement="SELECT concat( BrandCode, ItemTypeCode ) AS Itemcode\n" +
//                            "FROM item\n" +
//                            "JOIN stocknotification ON item.ItemID = stocknotification.ItemID\n" +
//                            "WHERE forwarded = '1'";
          String statement="SELECT concat( BrandCode, ItemTypeCode ) AS Itemcode\n" +
                            ", forwarded FROM Item\n" +
                            "JOIN StockNotification ON Item.ItemID = StockNotification.ItemID"
                            ;
                           
          ResultSet resultSet=ConnectManager.runquery(statement);
          System.out.println(statement);
          Vector ItemCode_exist=new Vector();
          ItemCode_exist=resultsetToVector(resultSet);
          System.out.println("ItemCodeExist" +ItemCode_exist);
          
          ArrayList listExist=new ArrayList();
          ArrayList listExistNF=new ArrayList();
          ArrayList listNotExist=new ArrayList();
          
          for(int i=0;i<OrderItemList.length;i++){
              int k=0;
              for(int j=0;j<ItemCode_exist.size();j=j+2){
                  if(OrderItemList[i][0].equals(ItemCode_exist.elementAt(j))){
                      if(ItemCode_exist.get(j+1).equals("true")){
                        listExist.add(OrderItemList[i][0]);                   
                        k=1;
                      }
                      else{
                         listExistNF.add(OrderItemList[i][0]);
                         k=2;
                      }
                      break;
                  }
              }
              if(k==0){
                  listNotExist.add(OrderItemList[i][0]);
              }
          
          }
          System.out.println("list exist.....\n");
          for(int i=0;i<listExist.size();i++){
              System.out.println(String.valueOf(listExist.get(i)));
          }
          
          System.out.println("list not forwarded....\n");
          for(int j=0;j<listExistNF.size();j++){
             System.out.println(String.valueOf(listExistNF.get(j))); 
          }
          
          System.out.println("list not exist....\n");
          for(int j=0;j<listNotExist.size();j++){
             System.out.println(String.valueOf(listNotExist.get(j))); 
          }          
          String returnStatement="";
            String[] param=new String[1];
            String[][] values=new String[5][1];
          
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(dateFormat.format(date));
          
          String LastID=String.valueOf(resultsetToVector(ConnectManager.getLastId("StockNotification")));
          
          int LastIDInt=Integer.parseInt(LastID.substring(1, LastID.length()-1));
          values[1][0]=dateFormat.format(date);//datetime
          values[2][0]="0";//processed
          values[3][0]="1";//forwarded

           param[0]="ItemID";
           String attr="concat( BrandCode, ItemTypeCode )";
           
          //if not notified before
          if(listNotExist.size()>0){

           String predicate="('"+ String.valueOf(listNotExist.get(0))+"'" ;
           
           for(int i=1;i<listNotExist.size();i++){
               predicate +=", '" + String.valueOf(listNotExist.get(i)) + "'";
           }
           predicate = predicate +")";
           ResultSet resultSet1=ConnectManager.getSelectedDataExtended("Item", param, attr, predicate, "", " IN ");
           Vector ItemIDList=resultsetToVector(resultSet1);
           
           for(int i=0;i<ItemIDList.size();i++){
               values[4][0]=String.valueOf(ItemIDList.elementAt(i));
               values[0][0]=Integer.toString(LastIDInt+i+1);
               ConnectManager.insertData(" StockNotification ", values);
           }
           returnStatement=predicate.substring(1, predicate.length()-1)+ " forwarded to manager";
           return returnStatement;
          }
          //in stocknotification table but not forwarded
          else if(listExistNF.size()>0){
           String predicate="('"+ String.valueOf(listExistNF.get(0))+"'" ;
           
           for(int i=1;i<listNotExist.size();i++){
               predicate +=", '" + String.valueOf(listExistNF.get(i)) + "'";
           }
              predicate = predicate +")";
              ResultSet resultSet1=ConnectManager.getSelectedDataExtended("Item", param, attr, predicate, "", " IN ");
              Vector ItemIDList=resultsetToVector(resultSet1);
              String ItemList="";
              for(int i=0;i<ItemIDList.size();i++){
                   ItemList+=ItemIDList.get(i);
              }
              String update="UPDATE stocknotification SET processed='0', forwarded='1'"
                          + "WHERE ItemID in ('"+ItemList+"');";
              ConnectManager.update("StockNotification", update);
              System.out.println(update);
                returnStatement=predicate.substring(1, predicate.length()-1)+ " forwarded to manager";
                return returnStatement;             
          }
          else{
              return "Allready forwarded to manager";
          }
      }
      
      public static String[] updateItems_show(String[] param,String attr,String predicate){
        String addValue="CONCAT( BrandCode, ItemTypeCode ) AS ";   
        //get result set from database
        ResultSet resultSet = ConnectManager.getSelectedDataExtended("ItemDetail", 
        param, attr, predicate,addValue, "=");
        try {
            if(!resultSet.isBeforeFirst()){//if result set is empty
                String[] ReturnStatement=new String[1];
                ReturnStatement[0]="Item " + predicate+ " does not exist.";
                return ReturnStatement;
            }
            else{//id result set contains data
                Vector result=resultsetToVector(resultSet);
                String[] ResultS=new String[result.size()];
                for(int i=0;i<result.size();i++){
                    ResultS[i]=String.valueOf(result.elementAt(i));
                    System.out.println(ResultS[i]);
                }
                return ResultS;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreKeeperController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
      }
      
      //when result set contains data of one row convert it to vector
      private static Vector resultsetToVector(ResultSet resultSet){
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();
            Vector dataRow=new Vector(columns);
            
            while(resultSet.next()){
                for (int i = 1; i <= columns; i++) {
                    dataRow.addElement(String.valueOf(resultSet.getObject(i)));;
                }      
            }
            return dataRow;
        } catch (SQLException ex) {
            Logger.getLogger(StoreKeeperController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
      }
      
      private static Vector data_table=new Vector();
      //update data base and add chnages to table
      public static JTable updateItem_viewTable(String[] values,String[] columns){
          //update database
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String LastIntake=dateFormat.format(date);
          String updateStatement="UPDATE ItemDetail SET LastIntake= '" + LastIntake + 
                  "' , LastBuyingQty= " + values[5]+" , AvailableQty= "+values[4]+
                  " WHERE concat(BrandCode,ItemTypeCode) in ('"+values[0]+"');";
          ConnectManager.update("ItemDetail", updateStatement);
          System.out.println(updateStatement);
          
          //add changes to table
          Vector dataRow_table=new Vector();
          Vector columnNames=new Vector();
          
          for(int i=0;i<values.length-1;i++){
              dataRow_table.addElement(values[i]);
          }
          for(int i=0;i<columns.length;i++){
              columnNames.addElement(columns[i]);
          }
          
          System.out.println(dataRow_table);
          data_table.addElement(dataRow_table);
          JTable table=new JTable(data_table,columnNames);
          return table;        
      }
      
     public static JTable viewNotifications(){         
            String query="SELECT Concat( BrandCode, "
                    + "ItemTypeCode ) AS ItemCode ,AvailableQty FROM Item JOIN "
                    + "StockNotification ON Item.ItemID = StockNotification.ItemID"
                    + " WHERE processed = '0' and forwarded='0'";
            ResultSet resultSet=ConnectManager.runquery(query);
            System.out.println(query);
            
        try {
            if (!resultSet.isBeforeFirst()) {
                return null;
            } else {
                return resultsetToTable(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreKeeperController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
     
     public static boolean addNotifications_process(String selected_ItemCodes){//********* check now need 2 queries
         //get ItemIDs of selected ItemCodes
         String[] param=new String[1];
         param[0]="ItemID";
         String addValue="CONCAT( BrandCode, ItemTypeCode ) AS ";
         
         String selected="";
         int length=selected_ItemCodes.length();
         System.out.println(length);
         
         if(length==9){
             selected="'"+selected_ItemCodes.substring(1, 8)+"'";
         }
         else{
             int y=8;
             selected="'"+selected_ItemCodes.substring(1, 8)+"'";
             while(y!=length-1){
                 selected+=", '"+selected_ItemCodes.substring(y+2, y+9)+"'";
                 y=y+9;
                 //System.out.println(y);
            }
         }
         String predicate="(" +selected+")";
         System.out.println(predicate);

         ResultSet resultSet1=ConnectManager.getSelectedDataExtended("Item", 
                 param, "ItemCode", predicate, addValue, " IN ");
         String Selected_ID=(resultsetToVector(resultSet1)).toString();
         System.out.println(Selected_ID);
         //update stocknotification table
         String statement="UPDATE StockNotification SET processed='1',forwarded='0' "
                 + "WHERE ItemID IN " +"(" +Selected_ID.substring(1, Selected_ID.length()-1)+")";
         System.out.println(statement);
         
         return ConnectManager.update("StockNotification", statement);
     }
     
     public static boolean addNotifications_forward(String selected_ItemCodes){//********* check now need 2 queries
         //get ItemIDs of selected ItemCodes
         String[] param=new String[1];
         param[0]="ItemID";
         String addValue="CONCAT( BrandCode, ItemTypeCode ) AS ";
         
         String selected="";
         int length=selected_ItemCodes.length();
         System.out.println(length);
         
         if(length==9){
             selected="'"+selected_ItemCodes.substring(1, 8)+"'";
         }
         else{
             int y=8;
             selected="'"+selected_ItemCodes.substring(1, 8)+"'";
             while(y!=length-1){
                 selected+=", '"+selected_ItemCodes.substring(y+2, y+9)+"'";
                 y=y+9;
                 //System.out.println(y);
            }
         }
         String predicate="(" +selected+")";
         System.out.println(predicate);

         ResultSet resultSet1=ConnectManager.getSelectedDataExtended("Item", 
                 param, "ItemCode", predicate, addValue, " IN ");
         String Selected_ID=(resultsetToVector(resultSet1)).toString();
         System.out.println(Selected_ID);
         //update stocknotification table
         String statement="UPDATE StockNotification SET processed='0',forwarded='1' "
                 + "WHERE ItemID IN " +"(" +Selected_ID.substring(1, Selected_ID.length()-1)+")";
         System.out.println(statement);     
         return ConnectManager.update("StockNotification", statement);
     }
      
}


