/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Malakagl
 */
public class ConnectManager {

    //pagoda --app=one-stop-shop --username=malakagl --password=Malaka  tunnel -c db1
    public static Connection getConnection() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/one_stop_shop", "root", "");
                    //"jdbc:mysql://localhost:45000/one_stop_shop", "noma", "RoEqnC7b");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);

        }
        return null;
    }

    public static int insertData(String table, String[] details) {
        int temp = 0;
        try {
            Connection con = getConnection();
            String values = "";

            for (int i = 0; i < details.length; i++) {
                values += " ? ,";
            }
            values = values.substring(0, values.length() - 1);
            String st = "insert into " + table + " value( " + values + " )";

            PreparedStatement pStmt = con.prepareStatement(st);
            for (int i = 0; i < details.length; i++) {
                pStmt.setString(i + 1, details[i]);
            }
            System.out.println("Statement : " + pStmt);
            temp = pStmt.executeUpdate();
            pStmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return temp;
    }

    public static String getNextId(String table, String tid) {
        int temp = 1;
        try {
            String id = "0";
            Connection con = getConnection();
            String query = "select " + tid + " from " + table + " order by 1 desc "
                    + "limit 1";
            Statement stmnt = con.createStatement();
            ResultSet res = stmnt.executeQuery(query);
            System.out.println("Checked." + res);
            if (res == null) {
                return "000001";
            }
            while (res.next()) {
                id = res.getString(1);
            }
            System.out.println(id);
            temp = Integer.parseInt(id);
            temp++;
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        String s = Float.toString(temp);
        s = s.substring(0, s.length() - 2);
        System.out.println(s);
        while (s.length() < 6) {
            s = "0" + s;
        }
        return s;
    }

    public static ResultSet getSelectedData(String tableName, String[] param,
            String attr, String predicate) {
        try {
            String values = "";
            for (int i = 0; i < param.length; i++) {
                System.out.println("Parameter " + i + " : " + param[i]);
                if (!param[i].equals("")) {
                    values += param[i] + ",";
                }
            }

            values = values.substring(0, values.length() - 1);
            System.out.println("Values " + values);
            System.out.println("Predicates " + predicate);

            Connection con = ConnectManager.getConnection();
            PreparedStatement pStmt = con.prepareStatement(
                    "select " + values + " from " + tableName + " where "
                    + attr + " = '" + predicate + "';");
            System.out.println("Statement " + pStmt);
            ResultSet resultSet = pStmt.executeQuery();

            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return null;
    }

    public static ResultSet getAllData(String table, String[] all) {
        try {
            String values = "";
            for (int i = 0; i < all.length; i++) {
                values += all[i] + ",";
            }
            values = values.substring(0, values.length()-1);
            Connection con = ConnectManager.getConnection();
            PreparedStatement pStmt = con.prepareStatement(
                    "select " + values + " from " + table);
            System.out.println("Statement " + pStmt);
            ResultSet resultSet = pStmt.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean update(String table, String update) {
        try {
            Connection con = ConnectManager.getConnection();
            PreparedStatement pStmt = con.prepareStatement(update);
            pStmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
            return false;
        }
    }

    public static boolean remove(String table, String val, String attr) {
        try {
            Connection con = ConnectManager.getConnection();
            PreparedStatement pStmt = con.prepareStatement(
                    "DELETE FROM " + table + " WHERE " + attr + " = '"
                    + val + "'");
            return pStmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
            return false;
        }
    }

    public static ResultSet getPassword(String username) {
        try {
            Connection con = ConnectManager.getConnection();
            PreparedStatement pStmt = con.prepareStatement(
                    "Select password, accountType,accountnumber FROM UserAccount "
                    + "WHERE username = ?");
            pStmt.setString(1, username);
            System.out.println("statement : " + pStmt);
            return pStmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static ResultSet getDate(String tableName, String[] param){
        try {
            String values = "";
            for (int i = 0; i < param.length; i++) {
                System.out.println("Parameter " + i + " : " + param[i]);
                if (!param[i].equals("")) {
                    values += param[i] + ",";
                }
            }

            values = values.substring(0, values.length() - 1);
            System.out.println("Values " + values);

            Connection con = ConnectManager.getConnection();
            PreparedStatement pStmt = con.prepareStatement(
                    "select " + values + " from " + tableName+ ";");
            System.out.println("Statement " + pStmt);
            ResultSet resultSet = pStmt.executeQuery();

            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return null;
    }
    
    public static ResultSet getSelectedDataExtended(String tableName, String[] param,
            String attr, String predicate, String additionValue,String operator) {
        try {
            String values="";
            //String values = additionValue;
            System.out.println("param length " + param.length);
            for (int i = 0; i < param.length; i++) {
                System.out.println("Parameter " + i + " : " + param[i]);
                if (!param[i].equals("")) {
                    if(param[i].equals("ItemCode")){
                        values+= " " + additionValue;
                    }
                    values += param[i] + ",";
                }
            }

            values = values.substring(0, values.length() - 1);
            System.out.println("Values " + values);
            System.out.println("Predicates " + predicate);
            
            PreparedStatement pStmt;
            Connection con = ConnectManager.getConnection();
            
            if(attr.equals("ItemCode")){
                attr="CONCAT( BrandCode, ItemTypeCode )";
            pStmt = con.prepareStatement(
                    "select " + values + " from " + tableName + " where "
                    + attr +  operator +  predicate + ";");                
            }
            pStmt = con.prepareStatement(
                    "select " + values + " from " + tableName + " where "
                    + attr + operator+ predicate + ";");
            System.out.println("Statement " + pStmt);
            ResultSet resultSet = pStmt.executeQuery();

            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return null;
    }
    
    public static ResultSet runquery(String query){
        Connection con = getConnection();
        PreparedStatement pStmt;
        try {
            pStmt = con.prepareStatement(query);
            ResultSet resultSet = pStmt.executeQuery();
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    
    public static ResultSet getLastId(String table) {
        String query="SELECT max(ItemID) from " + table;
            Connection con=getConnection();       
            Statement stmnt;
        try {
            stmnt = con.createStatement();
            ResultSet res = stmnt.executeQuery(query);
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static int insertData(String table , String [][] details) {
        int temp = 0;
        try {
            Connection con = getConnection();
            String values = "'";
            
            for (int i = 0; i < details.length; i++) {
                    values += details[i][0] +"','";
            }
            
            values = values.substring(0, values.length()-2);
            PreparedStatement pStmt = con.prepareStatement(
                    "insert into "+ table +" value("+values+")");
            System.out.println("Statement : " + pStmt);
            temp = pStmt.executeUpdate();
            pStmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return temp;
    }
    
//    public static ResultSet getView(String customerDetails, String[] param, 
//            String attr, String predicate) {
//        try {
//            ResultSet rs = null;
//            String values = "";
//            for (int i = 0; i < param.length; i++) {
//                System.out.println("Parameter " + i + " : " + param[i]);
//                if (!param[i].equals("")) {
//                    values += param[i] + ",";
//                }
//            }
//            values = values.substring(0, values.length() - 1);
//            Connection con = ConnectManager.getConnection();
//            PreparedStatement pStmt = con.prepareStatement(
//                    "Select " + values
//                    + " FROM " + customerDetails 
//                    + " WHERE " + attr + " = '" + predicate + "'");
//            System.out.println("statement : " + pStmt);
//            return pStmt.executeQuery();
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
}


//create view CustomerDetails as
//select c.customerid,c.firstname, c.lastname, c.addresscity,
//	c.email, c.customertype, f.creditlimit, f.availablecredit,
//        f.totalpoint ,
//       max(p.telephonenumber) Phone_Num_1,
//       case 
//           when max(p.telephoneNumber) = min(p.telephonenumber) then NULL 
//           else min(p.telephonenumber) 
//       end Phone_Num_2
//from customer c natural join creditfacility f
//left join customercontact p on c.customerid = p.id
//group by c.customerid

//
//create view customerdetails as
//select c.customerid,c.firstname, c.lastname, c.addressnumber + c.addressstreet + 
//        c.addresscity, c.email, c.customertype, f.creditlimit, f.availablecredit,
//        f.totalpoint, telephonenumber, f.firstissue, f.dueperiod, f.clearcount
//from customer c natural join customercontact natural join creditfacility f
//where c.customerid =  customercontact.id
//group by customerid