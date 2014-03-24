/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import ViewLayer.Cashier.Keys;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rajind
 */
public class ConnectCashier {
    private static Connection con = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static Properties connectionProps = new Properties();
    final private static String url = "jdbc:mysql://localhost:3306/one_stop_shop?autoReconnect=true";
    //final private static String url = "jdbc:mysql://localhost:45000/one_stop_shop?autoReconnect=true";
    private static String user;
    private static String login_pwd;
    
    public static boolean login(String username, String password){
        try {
            user = username;
            login_pwd = password;
            connectionProps.put("user", user);
            connectionProps.put("password", login_pwd);
            con = DriverManager.getConnection(url, connectionProps);
            System.out.println("Login Successful\n");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectCashier.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static TreeMap<String, Object> getCustomerDetails(String CustomerID){
         TreeMap <String, Object> map = new TreeMap<>();
         login("root", "1234");
         try {
            String primary_key = CustomerID;
            int key = Integer.parseInt(CustomerID);
            String sql="SELECT CustomerType FROM Customer WHERE CustomerID = ?";
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1,key);
            rs = ps.executeQuery();
            String sql2 = null;
            if(rs.next()){
                String customer_type = rs.getString("CustomerType");
                System.out.println(customer_type);
                switch (customer_type){
                    case "W":
                        sql2 = "SELECT * FROM (SELECT * FROM customer "
                                + "NATURAL JOIN walkinvip NATURAL JOIN "
                                + "CreditFacility)k WHERE k.CustomerID = ?";
                        break;
                    /*case "M": 
                        sql2 = "SELECT * FROM (SELECT * FROM customer "
                                + "NATURAL JOIN mailordercustomer NATURAL JOIN "
                                + "CreditFacility)k WHERE k.CustomerID = ?";;
                        break; */
                    case "L":
                        sql2 = "SELECT * FROM (SELECT * FROM customer "
                                + "NATURAL JOIN largeordercustomer NATURAL JOIN "
                                + "CreditFacility)k WHERE k.CustomerID = ?";;
                        break;
                    default:
                        System.out.println("Error Selecting query according to customer_type");
                }
                System.out.println(sql2);
                ps = con.prepareStatement(sql2);
                ps.setInt(1,key);
                rs = ps.executeQuery();
                
                if(rs.next()){
                    //System.out.println(rs.getString("TotalPoint"));
                    map.put(Keys.AddressCity , rs.getString(Keys.AddressCity));
                    map.put(Keys.AddressNumber , rs.getString(Keys.AddressNumber));
                    map.put(Keys.AddressStreet, rs.getString(Keys.AddressStreet));
                    map.put(Keys.AddressStreet, rs.getString(Keys.AddressStreet));
                    map.put(Keys.AvailableCredit, rs.getDouble(Keys.AvailableCredit));
                    map.put(Keys.ClearCount, rs.getInt(Keys.ClearCount));
                    map.put(Keys.CreditFacilityAccepted, rs.getBoolean(Keys.CreditFacilityAccepted));
                    map.put(Keys.CreditLimit, rs.getDouble(Keys.CreditLimit));
                    map.put(Keys.DuePeriod, rs.getInt(Keys.DuePeriod));
                    map.put(Keys.Email, rs.getString(Keys.Email));
                    map.put(Keys.FirstIssue, rs.getString(Keys.FirstIssue));
                    map.put(Keys.FirstName, rs.getString(Keys.FirstName));
                    map.put(Keys.LastName, rs.getString(Keys.LastName));
                    map.put(Keys.TotalPoint, rs.getInt(Keys.TotalPoint));
                    
                    if( customer_type.equals("W")){
                        map.put(Keys.TRN, rs.getString(Keys.TRN));
                    }else {
                        if(customer_type.equals("L")){
                            map.put(Keys.BRN, rs.getString(Keys.BRN));
                            map.put(Keys.SalesRepID, rs.getString(Keys.SalesRepID));
                        }
                    }
                    
                    //map.put(Keys, rs.getString(Keys));
                }else{
                    System.out.println("Failed to obtain joined results");
                }
                
                
            }else{
                System.out.println("Failed Obtaining CustomerType. Empty Result Set");
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectCashier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (ps != null) {
                        ps.close();
                    }
                } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(ConnectCashier.class.getName());
                    lgr.log(Level.WARNING, ex.getMessage(), ex);
                }
        }
        return map;
    }
    
    public static boolean updateCredit(String CustomerID, Double amount){
        login("root", "1234");
        try {
            String primary_key = CustomerID;
            String sql = "UPDATE CreditFacility SET AvailableCredit =? WHERE CustomerID ="+primary_key;
            ps = con.prepareStatement(sql);
            ps.setDouble(1, amount);
            ps.executeUpdate();
        return true;
         } catch (SQLException ex) {
            Logger.getLogger(ConnectCashier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (ps != null) {
                        ps.close();
                    }
                } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(ConnectCashier.class.getName());
                    lgr.log(Level.WARNING, ex.getMessage(), ex);
                }
        }  
        return false;
    }
    
    public static TreeMap<String, Object> getBillDetails(String BrandCode, String ItemTypeCode, String sizeCode){
        TreeMap <String, Object> map = new TreeMap<>();
        login("root", "1234");
        try {
            String sql = "SELECT SellingPrice FROM Item WHERE BrandCode =? AND ItemTypeCode=? AND size=?";
            ps = con.prepareCall(sql);
            ps.setString(1, BrandCode);
            ps.setString(2, ItemTypeCode);
            ps.setString(3, sizeCode);
            rs = ps.executeQuery();
            if(rs.next()){    
                map.put(Keys.SellingPrice, rs.getDouble(Keys.SellingPrice));
            }else{
                System.out.println("Error getting Selling price");
            }
            
            String sql2 = "SELECT ItemTypeName FROM ItemType WHERE ItemTypeCode=?";
            ps = con.prepareCall(sql2);
            ps.setString(1, ItemTypeCode);
            rs = ps.executeQuery();
            if(rs.next()){   
                map.put(Keys.ItemTypeName, rs.getString(Keys.ItemTypeName));
            }else{
                System.out.println("Error getting ItemTypeName");
            }
            
            ps.setString(1, ItemTypeCode);
            String sql3 = "SELECT BrandName FROM Brand WHERE BrandCode=?";
            ps = con.prepareCall(sql3);
            ps.setString(1, BrandCode);
            rs = ps.executeQuery();
            if(rs.next()){    
                map.put(Keys.BrandName, rs.getString(Keys.BrandName));
            }else{
                System.out.println("Error getting BrandName");
            }
            
            String sql4 = "SELECT SizeDesc FROM Size WHERE SizeCode=?";
            ps = con.prepareCall(sql4);
            ps.setString(1, sizeCode);
            rs = ps.executeQuery();
            if(rs.next()){ 
                map.put(Keys.SizeDesc, rs.getString(Keys.SizeDesc));
            }else{
                System.out.println("Error getting SizeDesc");
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(ConnectCashier.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (ps != null) {
                            ps.close();
                        }
                    } catch (SQLException ex) {
                        Logger lgr = Logger.getLogger(ConnectCashier.class.getName());
                        lgr.log(Level.WARNING, ex.getMessage(), ex);
                    }
        }
        return map;
    } 
    
    public static void main(String Args[]){
        //Database_adapter.updateCredit("110", 70000.00);
        //login("noma", "RoEqnC7b");
        //Database_adapter.getBillDetails("AW", "00001", "AC");
        //String x = "AABBCC";
        //System.out.println(x.substring(2, 4));
                
        
    }
    
    public static int getAvailableQty(String BrandCode, String ItemTypeCode, String sizeCode){
        login("root", "1234");
        int qty = 0;
        try {
            String sql = "SELECT AvailableQty FROM Item WHERE BrandCode =? AND ItemTypeCode=? AND size=?";
            ps = con.prepareCall(sql);
            ps.setString(1, BrandCode);
            ps.setString(2, ItemTypeCode);
            ps.setString(3, sizeCode);
            rs = ps.executeQuery();
            if(rs.next()){    
                qty = rs.getInt("AvailableQty");
            }else{
                System.out.println("Error getting AvailableQty");
            }
            
         } catch (SQLException ex) {
            Logger.getLogger(ConnectCashier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (ps != null) {
                        ps.close();
                    }
                } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(ConnectCashier.class.getName());
                    lgr.log(Level.WARNING, ex.getMessage(), ex);
                }
        }  
        return qty;
    }
    
    public static void updateItemQuantity(String BrandCode, String ItemTypeCode, String sizeCode, int new_qty){
        login("root", "1234");
        try {
            String sql = "UPDATE  Item SET AvailableQty=? WHERE BrandCode =? AND ItemTypeCode=? AND size=?";
            ps = con.prepareCall(sql);
            ps.setInt(1, new_qty);
            ps.setString(2, BrandCode);
            ps.setString(3, ItemTypeCode);
            ps.setString(4, sizeCode);
             ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectCashier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (ps != null) {
                        ps.close();
                    }
                } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(ConnectCashier.class.getName());
                    lgr.log(Level.WARNING, ex.getMessage(), ex);
                }
        }  
    }
}
