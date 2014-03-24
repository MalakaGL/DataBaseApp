/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllLayer.Manager;

import DataLayer.ConnectManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.text.TableView;

/**
 *
 * @author Malakagl
 */
public class ManagerController {

    public static int insertCustomer(ArrayList<Object> detail) {
        String[] details = new String[8];
        for (int i = 0; i < 8; i++) {
            details[i] = (String) detail.get(i);
        }
        int t1 = ConnectManager.insertData("Customer", details);
        if (!((String) detail.get(8)).equals("0")) {
            details = new String[7];
            details[0] = (String) detail.get(0);
            details[1] = (String) detail.get(8);
            details[2] = (String) detail.get(8);
            details[3] = null;
            details[4] = "0";
            details[5] = "0";
            details[5] = "0";
            ConnectManager.insertData("creditfacility", details);
        }
        details = new String[2];
        for (int i = 9; i < detail.size(); i++) {
            details[0] = (String) detail.get(i);
            details[1] = (String) detail.get(0);
            if (ConnectManager.insertData("CustomerContact", details) <= 0) {
                System.out.println("failed insert num");
                return 0;
            }
        }
        return t1;
    }

    public static int insertSupplier(ArrayList<Object> detail) {
        String[] details = new String[5];
        for (int i = 0; i < details.length; i++) {
            details[i] = (String) detail.get(i);
        }
        int t1 = ConnectManager.insertData("Supplier", details);
        details = new String[2];
        for (int i = 5; i < detail.size(); i++) {
            details[0] = (String) detail.get(i);
            details[1] = (String) detail.get(0);
            if (ConnectManager.insertData("SupplierContact", details) <= 0) {
                System.out.println("failed insert num");
                return 0;
            }
        }
        return t1;
    }

    public static int insertSalesRep(ArrayList<Object> detail) {
        String[] details = new String[3];
        for (int i = 0; i < details.length; i++) {
            details[i] = (String) detail.get(i);
        }
        int t1 = ConnectManager.insertData("salesrepid", details);
        details = new String[2];
        for (int i = 3; i < detail.size(); i++) {
            details[0] = (String) detail.get(i);
            details[1] = (String) detail.get(0);
            if (ConnectManager.insertData("EmployeeContact", details) <= 0) {
                System.out.println("failed insert num");
                return 0;
            }
        }
        return t1;
    }

    public static int insertUser(String user, String password,
            String accNum, String type) {
        String details[] = new String[4];
        details[0] = user;
        details[1] = password;
        details[3] = accNum;
        details[2] = type.substring(0, 2);
        return ConnectManager.insertData("useraccount", details);
    }

    public static JTable getSearchResult(Object[] conds) {
        String all[] = new String[1];
        all[0] = "*";

        ResultSet resultSet = ConnectManager.getSelectedData("customerdetails",
                all, (String)conds[0], (String) conds[1]);
        if (resultSet == null ) {
            return null;
        } else {
            return getTable(resultSet);
        }
    }

    private static JTable getTable(ResultSet resultSet) {
        try {
            Vector columnNames = new Vector();
            Vector data = new Vector();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(metaData.getColumnName(i));
                System.out.println("Column " + metaData.getColumnName(i));
            }

            while (resultSet.next()) {
                System.out.println("while in gettable managecon");
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    row.addElement(resultSet.getObject(i));
                }
                data.addElement(row);
            }
            resultSet.close();

            JTable table = new JTable(data, columnNames);
            System.out.println("table rows : " + table.getRowCount());
            for (int i = 0; i < table.getRowCount() - 1; i++) {
                if (table.getValueAt(i, 0).equals(table.getValueAt(i + 1, 0))) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        System.out.println(table.getValueAt(i, j));
                        System.out.println(table.getValueAt(i + 1, j));
                        if (table.getValueAt(i, j) != null
                                && table.getValueAt(i + 1, j) != null
                                && !((table.getValueAt(i, j)).equals(table
                                .getValueAt(i + 1, j)))) {
                            table.setValueAt((String) table.getValueAt(i, j)
                                    + " , " + (String) table.getValueAt(i + 1, j), i, j);
                        }
                    }
                    ((DefaultTableModel) table.getModel()).removeRow(i + 1);
                }

            }

            return table;


        } catch (SQLException ex) {
            Logger.getLogger(ManagerController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean updateCust(String[] details) {
        String update = "UPDATE Customer SET Name = '" + details[1]
                + "' , AddressCity = '" + details[2] + "' , AddressStreet = '"
                + details[3] + "' , AddressNumber = '" + details[4]
                + "' , Email = '" + details[5] + "' , CustomerType = '"
                + details[6] + "' WHERE CustomerID = '" + details[0] + "';";
        System.out.println("update : " + update);
        return ConnectManager.update("Customer", update);
    }

    public static boolean removeCust(String table, String id) {
        boolean result = ConnectManager.remove("customercontact", id, "ID");
        boolean result2 = ConnectManager.remove("creditfacility", id, "CustomerID");
        boolean result3 = ConnectManager.remove("creditfacility", id, "CustomerID");
        return result && result2 && result3;
    }

    public static String getNewCustomerID() {
        return ConnectManager.getNextId("Customer", "customerid");
    }

    public static String getNewSupplierID() {
        return ConnectManager.getNextId("Supplier", "supplierid");
    }

    public static String getNewSRepID() {
        return ConnectManager.getNextId("SalesRepId", "salesrepid");
    }

    public static String getNewAccNum() {
        return ConnectManager.getNextId("useraccount", "AccountNumber");
    }

    public static ArrayList<String> getUsers() {
        try {
            String[] all = new String[1];
            all[0] = "username";
            ResultSet rs = ConnectManager.getAllData("useraccount", all);
            ArrayList<String> users = new ArrayList<>();
            while (rs.next()) {
                users.add(rs.getString(1));
            }
            return users;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String[] getCustomerDetails(String id) {
        try {
            String all[] = new String[1];
            all[0] = "*";
            ResultSet rs = ConnectManager.getSelectedData("Customerdetails",
                    all, "Customerid", id);
            String[] details = new String[13];
            int i = 0;
            while (rs.next()) {
                for (int j = 0; i == 0 && j < details.length; j++) {
                    details[j] = rs.getString(j + 1);
                    System.out.println(rs.getString(j + 1));
                }
                if (i > 0) {
                    details[9] += " , " + rs.getString("Telephone Number");
                }
                i++;
            }
            return details;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String args[]) {
        getCustomerDetails("000001");
    }

    public static TableModel refreshTable(JTable table, ArrayList<Object> name) {
        JTable temp = new JTable(table.getModel());
        for (int i = 0; i < table.getColumnCount() && i < name.size(); i++) {
            System.out.println("removing column name : " + table.getColumnName(i)+""
                    + "  " + (String)name.get(i));
            if((table.getColumnName(i)).equals((String)name.get(i))){
                System.out.println("not null return refresh");
                return removeColumn(i,temp);
            }
        }
        System.out.println("null return refreshtable");
        return table.getModel();
    }

    private static String[] getRemainingIdentifiers(int columnIndex, JTable table) {
        String[] identifiers = new String[table.getColumnCount() - 1];
        int k = 0;
        for (int i = 0; i < table.getColumnCount(); i++) {
            if (i != columnIndex) {
                identifiers[k++] = table.getColumnName(i);
            }
        }
        return identifiers;
    }

    private static DefaultTableModel removeColumn(int columnIndex, JTable table) {

        String[][] data = new String[table.getRowCount()][table.getColumnCount() - 1];

        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {

                if (j != columnIndex) {
                    if (table.getValueAt(i, j) == null) {
                        table.setValueAt("", i, j);
                    }
                    if (j < columnIndex) {
                        data[i][j] = table.getValueAt(i, j).toString();
                    } else {
                        data[i][j - 1] = table.getValueAt(i, j).toString();
                    }
                }
            }
        }

        return new DefaultTableModel(data, getRemainingIdentifiers(columnIndex,table));

    }
}
//public static String[] getCustomerDetails(String id) {
//        String[] details = new String[8];
//        try {
//            String[] all = new String[1];
//            all[0] = "*";
//
//            ResultSet rs = ConnectManager.getSelectedData("Customer natural "
//                    + "join customercontact", all, "CustomerID", id);
//            System.out.println("Resultset : " + rs);
//            if (rs.next()) {
//                details[0] = rs.getString(1);
//                details[1] = rs.getString(2);
//                details[2] = rs.getString(3);
//                details[3] = rs.getString(4);
//                details[4] = rs.getString(5);
//                details[5] = rs.getString(6);
//                details[6] = rs.getString(7);
//                if (rs.next()) {
//                    details[7] = rs.getString(8);
//
//
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerController.class
//                    .getName()).log(
//                    Level.SEVERE, null, ex);
//        }
//        return details;
//    }
//String[] param = new String[12];
//        for (int i = 0; i < param.length; i++) {
//            param[i] = "";
//        }
//        String attr, predicate;
//        attr = (String) conds[0];
//        predicate = (String) conds[1];
//
//        if ((Boolean) conds[2]) {
//            param[0] = "CustomerID";
//        }
//        if ((Boolean) conds[3]) {
//            param[1] = "FirstName";
//        }
//        if ((Boolean) conds[4]) {
//            param[2] = "AddressCity";
//        }
//        if ((Boolean) conds[5]) {
//            param[3] = "Email";
//        }
//        if ((Boolean) conds[6]) {
//            param[4] = "CustomerType";
//        }
//        if ((Boolean) conds[7]) {
//            param[5] = "Phone_Num_";
//        }
//        if ((Boolean) conds[8]) {
//            param[6] = "Creditlimit";
//        }
//        if ((Boolean) conds[9]) {
//            param[7] = "availablecredit";
//        }
//        if ((Boolean) conds[10]) {
//            param[8] = "clearcount";
//        }
//        if ((Boolean) conds[11]) {
//            param[9] = "totalpoint";
//        }