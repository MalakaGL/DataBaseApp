/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllLayer.Cashier;

import ViewLayer.Cashier.Keys;
import DataLayer.ConnectCashier;
import ViewLayer.Cashier.CashierView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rajind
 */
public class Pay_by_cash_controller {
    static CashierView cashier_view;
   
    public static class amount_text_fieldActionListener implements ActionListener{
        public amount_text_fieldActionListener(CashierView cv){
            cashier_view = cv;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean good_to_go = false;
            double total = Double.parseDouble(cashier_view.getTotal().getText().substring(3));
            int amount = 0;
            try{ 
                amount = Integer.parseInt(cashier_view.getAmount().getText());
                good_to_go = true;
            }catch (NumberFormatException ex){
                JOptionPane.showConfirmDialog(null, "Please enter a number", "Warning", JOptionPane.CANCEL_OPTION);
            }
            if(good_to_go){
                System.out.println("Came Here");
                String itemCode = cashier_view.getItemCode().getText();
                TreeMap<String, Object> map = ConnectCashier.getBillDetails(itemCode.substring(0, 2), itemCode.substring(2, 7), itemCode.substring(7, 9));
                String type = map.get(Keys.BrandName)+" "+map.get(Keys.ItemTypeName)+" "+map.get(Keys.SizeDesc);
                if(map.get(Keys.SellingPrice) != null){
                    double cost = (double) map.get(Keys.SellingPrice);
                    cashier_view.insertRow(type, cost);
                    total = total + cost*amount;
                    cashier_view.setTotal(total);
                }else{
                    JOptionPane.showConfirmDialog(null, "Wrong Item Code", "Warning", JOptionPane.CANCEL_OPTION);
                }
            }else{
                System.out.println("Something is wrong");
            }
        }
        
    }
    
    public static class finish_buttonActionListener implements ActionListener{
        public finish_buttonActionListener(CashierView cv){
            cashier_view = cv;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JTable table = cashier_view.getTable();
            int rowCount = table.getRowCount();
            String itemCode = null;
            int amount_taken;
            int currentQty;
            for(int i=0; i<rowCount; i++){
                amount_taken = Integer.parseInt(table.getModel().getValueAt(i, 2).toString());
                itemCode = table.getModel().getValueAt(i, 0).toString();
                currentQty = ConnectCashier.getAvailableQty(itemCode.substring(0, 2), itemCode.substring(2, 7), itemCode.substring(7, 9));
                System.out.println("Current amount Before" +currentQty);
                currentQty = currentQty - amount_taken;
                System.out.println("Amount taken" +amount_taken);
                System.out.println("Current amount After" +currentQty);
                ConnectCashier.updateItemQuantity(itemCode.substring(0, 2), itemCode.substring(2, 7), itemCode.substring(7, 9), currentQty);
            }
            JTextField total = cashier_view.getTotal();
            JTextField amount = cashier_view.getAmount();
            JTextField itemCodeField = cashier_view.getItemCode();
            total.setText("");
            amount.setText("");
            itemCodeField.setText("");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            
        }
    }
}
       

