package ControllLayer;

import ControllLayer.Manager.ManagerController;
import DataLayer.ConnectManager;
import ViewLayer.Cashier.CashierView;
import ViewLayer.Manager.ManagerView;
import ViewLayer.StoreKeeper.StoreKeeperView;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import onestopshop.LogIn;

public class Controller {

    static String currentUser, accNumber, accType;

    public static boolean checkAuthority(String userName, char[] passwordEntered) {
        try {
            ResultSet user = ConnectManager.getPassword(userName);
            while (user.next()) {
                try {
                    String pass = encrypt(passwordEntered);
                    if (pass.equals(user.getString(1))) {
                        currentUser = userName;
                        accNumber = user.getString("accountnumber");
                        accType = user.getString("accounttype");
                        return true;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static String getCurrentUser() {
        return currentUser;
    }

    public static int createUser(String text, char[] password, String type, String accNum) {
        int result = ManagerController.insertUser(text, encrypt(password),
                type.substring(0,2), accNum.substring(0, accNum.length()));
        return result;
    }

    private static String encrypt(char[] password) {
        String str = new String(password);
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(str.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }

    public static void getControll() {
        switch(accType){
            case "MA":
                new ManagerView();
                break;
            case "CA":
                new CashierView();
                break;
            case "SK":
                new StoreKeeperView();
                break;
        }
    }

    public void readLogIn() {
        try {
            FileReader fr = new FileReader("log.tmp");
            BufferedReader br = new BufferedReader(fr);
            String str;
            try {
                while ((str = br.readLine()) != null) {
                    System.out.println(new String(Base64.decode(str)));
                }
            } catch (IOException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private class user {
        String username;
        String password;
        String accType;
        String accNum;

        user(String name, String pwd, String accT, String accN) {
            username = name;
            password = pwd;
            accType = accT;
        }
    }
    
    public static void main(String a[]){
        System.out.println(encrypt("123".toCharArray()));
    }
}
