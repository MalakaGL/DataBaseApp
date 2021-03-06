/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllLayer.Manager;

import ControllLayer.ParityCheck;
import DataLayer.ConnectManager;
import ViewLayer.Manager.ManagerView;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
        String id = ConnectManager.getNextId("Customer", "CustomerID");
        if (!((String) detail.get(0)).equals(id)) {
            details[0] = id;
            detail.set(0, id);
            ManagerView.showMessage("Customer ID Was Changed To CU" + id
                    + ParityCheck.getKey(id));
        }
        int t1 = ConnectManager.insertData("Customer", details);

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
        String id = ConnectManager.getNextId("Supplier", "SupplierID");
        if (!details[0].equals(id)) {
            ManagerView.showMessage("Suplier ID was changed to SU" + id
                    + ParityCheck.getKey(id));
            details[0] = id;
            detail.set(0, id);
        }
        int t1 = ConnectManager.insertData("Supplier", details);
        details = new String[2];
        for (int i = 5; i < detail.size(); i++) {
            details[0] = (String) detail.get(i);
            details[1] = (String) detail.get(0);
            if (ConnectManager.insertData("SupplierContact", details) <= 0) {
                System.out.println("Failed to Insert Suplier Contact Number");
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
        String id = ConnectManager.getNextId("Employee", "SalesRepID");
        if (!details[0].equals(id)) {
            ManagerView.showMessage("SalesRep ID was changed to SR" + id
                    + ParityCheck.getKey(id));
            details[0] = id;
            detail.set(0, id);
        }
        int t1 = ConnectManager.insertData("Employee", details);
        details = new String[2];
        for (int i = 3; i < detail.size(); i++) {
            details[0] = (String) detail.get(i);
            details[1] = (String) detail.get(0);
            if (ConnectManager.insertData("EmployeeContact", details) <= 0) {
                System.out.println("Failed Insert Contact Number");
                return 0;
            }
        }
        return t1;
    }

    public static int insertUser(String user, String password,
        String type, String AccNum) {
        String details[] = new String[4];
        details[0] = user;
        details[1] = password;
        details[3] = AccNum;
        details[2] = type.substring(0, 2);
        return ConnectManager.insertData("UserAccount", details);
    }

    public static JTable getSearchResult(Object[] conds) {
        String all[] = new String[1];
        all[0] = "*";

        ResultSet resultSet = ConnectManager.getSelectedData("CustomerDetails",
                all, (String) conds[0], (String) conds[1]);
        if (resultSet == null) {
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
            }
            while (resultSet.next()) {
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    row.addElement(resultSet.getObject(i));
                }
                data.addElement(row);
            }
            resultSet.close();
            JTable table = new JTable(data, columnNames);
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
        boolean result = ConnectManager.remove("CustomerContact", id, "ID");
        boolean result2 = ConnectManager.remove("CreditFacility", id, "CustomerID");
        boolean result3 = ConnectManager.remove("CreditFacility", id, "CustomerID");
        return result && result2 && result3;
    }

    public static String getNewCustomerID() {
        return ConnectManager.getNextId("Customer", "CustomerID");
    }

    public static String getNewSupplierID() {
        return ConnectManager.getNextId("Supplier", "SupplierID");
    }

    public static String getNewSRepID() {
        return ConnectManager.getNextId("Employee", "SalesRepID");
    }

    public static String getNewAccNum() {
        return ConnectManager.getNextId("UserAccount", "AccountNumber");
    }

    public static ArrayList<String> getUsers() {
        try {
            String[] all = new String[1];
            all[0] = "username";
            ResultSet rs = ConnectManager.getAllData("UserAccount", all);
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
            ResultSet rs = ConnectManager.getSelectedData("CustomerDetails",
                    all, "CustomerID", id);
            String[] details = new String[13];
            int i = 0;
            while (rs.next()) {
                for (int j = 0; j < details.length; j++) {
                    details[j] = rs.getString(j + 1);
                    System.out.println(rs.getString(j + 1));
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
        for (int k = 0; k < name.size(); k++) {
            for (int i = 0; i < table.getColumnCount(); i++) {
                String cl = table.getColumnName(i);
                String na = (String) name.get(k);
                System.out.println("\n\ncolumn : " + cl);
                System.out.println("name : " + na);
                if ((cl.toLowerCase()).equals(na.toLowerCase())) {
                    System.out.println("removing column name : " + table.getColumnName(i) + ""
                            + "  " + (String) name.get(k));
                    temp = new JTable(removeColumn(i, temp));
                }
                for (int j = 0; j < temp.getColumnCount(); j++) {
                    System.out.println("Table : " + temp.getColumnName(j));
                }
            }
        }
        return temp.getModel();
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

        return new DefaultTableModel(data, getRemainingIdentifiers(columnIndex, table));

    }

    public static JTable getTable(Object[] conds) {

        String[] param = new String[11];
        for (int i = 0; i < param.length; i++) {
            param[i] = "";
        }

        String attr, predicate, addValue;

        attr = (String) conds[0];
        predicate = "'" + (String) conds[1] + "'";
        addValue = "";

        if ((Boolean) conds[2]) {
            param[0] = "ItemCode";
            addValue = "CONCAT( BrandCode, ItemTypeCode ) AS ";
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
                param, attr, predicate, addValue, "=");

        if (resultSet == null) { //this is not working
            return null;
        } else {
            return getTable(resultSet);
        }
    }

    public static String[] getReps() {
        try {
            String param[] = new String[2];
            param[0] = "FirstName";
            param[1] = "SalesRepID";
            String predicate = "1";
            String attr = "1";
            ResultSet rs = ConnectManager.getSelectedData("Employee", param,
                    attr, predicate);
            String result[] = null;
            if (rs.next()) {
                rs.last();
                result = new String[rs.getRow() + 1];
                rs.beforeFirst();
            }
            result[0] = "";
            while (rs.next()) {
                String sid = rs.getString("SalesRepID");
                result[rs.getRow()] = rs.getString("FirstName") + "(SR"
                        + sid + "" + ParityCheck.getKey(sid) + ")";
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void insertMailOrder(String id) {
        String details[] = new String[2];
        details[0] = id;
        details[1] = ConnectManager.getNextId("MailOrderCustomer", "TRN");
        ConnectManager.insertData("MaiOrderCustomer", details);
    }

    public static void insertLargeOrder(ArrayList<Object> details) {
        String detail[] = new String[4];
        detail[0] = (String) details.get(0);
        String sr = (String) details.get(1);
        if (details.size() > 2) {
            detail[1] = "1";
            String[] facility = new String[7];
            facility[0] = detail[0];
            facility[1] = (String) details.get(2);
            facility[2] = facility[1];
            facility[3] = null;
            facility[4] = (String) details.get(3);
            facility[5] = "0";
            facility[6] = "0";
            ConnectManager.insertData("CreditFacility", facility);
        } else {
            detail[1] = "0";
        }
        detail[3] = sr.substring(sr.length() - 8, sr.length() - 2);
        detail[2] = ConnectManager.getNextId("LargeOrderCustomer", "BRN");
        ConnectManager.insertData("LargeOrderCustomer", detail);
    }

    public static void insertWalkIn(ArrayList<Object> details) {
        String detail[] = new String[4];
        detail[0] = (String) details.get(0);
        if (details.size() > 2) {
            detail[1] = "1";
            String[] facility = new String[7];
            facility[0] = detail[0];
            facility[1] = (String) details.get(2);
            facility[2] = facility[1];
            facility[3] = null;
            facility[4] = (String) details.get(3);
            facility[5] = "0";
            facility[6] = "0";
            ConnectManager.insertData("CreditFacility", facility);
        } else {
            detail[0] = "0";
        }
        detail[2] = ConnectManager.getNextId("WalkInVIP", "TRN");
        ConnectManager.insertData("WalkInVIP", detail);
    }
}