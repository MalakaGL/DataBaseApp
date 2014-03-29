/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer.Manager;

import ControllLayer.Controller;
import ViewLayer.Cashier.CashierView;
import com.alee.laf.WebLookAndFeel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import onestopshop.LogIn;

/**
 *
 * @author Malakagl
 */
public class ManagerView extends javax.swing.JFrame {

    public static void showMessage(String string) {
        JOptionPane.showMessageDialog(null, string);
    }

    /**
     * Creates new form ManagerView
     */
    public ManagerView() {
        initComponents();
        this.setNotifications();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnHomeCustomers = new javax.swing.JButton();
        btnHomeSuppliers = new javax.swing.JButton();
        btnHomeStock = new javax.swing.JButton();
        btnHomeRep = new javax.swing.JButton();
        btnHomeOrders = new javax.swing.JButton();
        btnHomeUserAcco = new javax.swing.JButton();
        pnlCustomers = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        pnlSearchCust = new javax.swing.JPanel();
        pnlEditCust = new javax.swing.JPanel();
        pnlNewCust = new javax.swing.JPanel();
        pnlSuppliers = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        pnlSearchSup = new javax.swing.JPanel();
        pnlEditSup = new javax.swing.JPanel();
        pnlNewSup = new javax.swing.JPanel();
        pnlSalesReps = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        pnlSearchRep = new javax.swing.JPanel();
        pnlEditRep = new javax.swing.JPanel();
        pnlNewRep = new javax.swing.JPanel();
        pnlStock = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        pnlSearchItem = new javax.swing.JPanel();
        pnlEditItem = new javax.swing.JPanel();
        pnlNewItem = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        pnlSearchUser = new javax.swing.JPanel();
        pnlEditUser = new javax.swing.JPanel();
        pnlNewUser = new javax.swing.JPanel();
        pnlOrders = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        pnlSearchOrder = new javax.swing.JPanel();
        pnlEditOrder = new javax.swing.JPanel();
        pnlNewOrder = new javax.swing.JPanel();
        pnlProcessOrder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblLoginData = new javax.swing.JLabel();
        btnHomeLogOut = new javax.swing.JButton();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("One-Stop-Shop");

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTabbedPane1PropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Manager/logo.png"))); // NOI18N
        jLabel8.setText("One-Stop-Shop");

        btnHomeCustomers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHomeCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Manager/Customer.png"))); // NOI18N
        btnHomeCustomers.setText("Customers");
        btnHomeCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeCustomersActionPerformed(evt);
            }
        });

        btnHomeSuppliers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHomeSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Manager/Supplier.png"))); // NOI18N
        btnHomeSuppliers.setText("Suppliers");
        btnHomeSuppliers.setPreferredSize(new java.awt.Dimension(10, 50));
        btnHomeSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeSuppliersActionPerformed(evt);
            }
        });

        btnHomeStock.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHomeStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Manager/stock.png"))); // NOI18N
        btnHomeStock.setText("Stock");
        btnHomeStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeStockActionPerformed(evt);
            }
        });

        btnHomeRep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHomeRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Manager/SalesRep.png"))); // NOI18N
        btnHomeRep.setText("Sales Representatives");
        btnHomeRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeRepActionPerformed(evt);
            }
        });

        btnHomeOrders.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHomeOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Manager/orders.png"))); // NOI18N
        btnHomeOrders.setText("Orders");
        btnHomeOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeOrdersActionPerformed(evt);
            }
        });

        btnHomeUserAcco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHomeUserAcco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Manager/customerservice.png"))); // NOI18N
        btnHomeUserAcco.setText("User Accounts");
        btnHomeUserAcco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeUserAccoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHomeRep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnHomeSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnHomeCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHomeOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnHomeStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnHomeUserAcco, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(btnHomeStock, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHomeOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(btnHomeUserAcco, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(btnHomeCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHomeSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(btnHomeRep, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
        );

        jTabbedPane1.addTab("Home", pnlHome);

        pnlCustomers.setLayout(new java.awt.CardLayout());

        pnlSearchCust.setLayout(new java.awt.CardLayout());
        jTabbedPane8.addTab("Search Customer", pnlSearchCust);

        pnlEditCust.setLayout(new java.awt.CardLayout());
        jTabbedPane8.addTab("Edit Customer", pnlEditCust);

        pnlNewCust.setLayout(new java.awt.CardLayout());
        jTabbedPane8.addTab("New Customer", pnlNewCust);

        pnlCustomers.add(jTabbedPane8, "card2");

        jTabbedPane1.addTab("Customers", pnlCustomers);

        pnlSearchSup.setLayout(new java.awt.CardLayout());
        jTabbedPane4.addTab("Search Supplier", pnlSearchSup);

        pnlEditSup.setLayout(new java.awt.CardLayout());
        jTabbedPane4.addTab("Edit Supplier", pnlEditSup);

        pnlNewSup.setLayout(new java.awt.CardLayout());
        jTabbedPane4.addTab("New Supplier", pnlNewSup);

        javax.swing.GroupLayout pnlSuppliersLayout = new javax.swing.GroupLayout(pnlSuppliers);
        pnlSuppliers.setLayout(pnlSuppliersLayout);
        pnlSuppliersLayout.setHorizontalGroup(
            pnlSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        pnlSuppliersLayout.setVerticalGroup(
            pnlSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Suppliers", pnlSuppliers);

        pnlSearchRep.setLayout(new java.awt.CardLayout());
        jTabbedPane6.addTab("Search Sales Rep", pnlSearchRep);

        pnlEditRep.setLayout(new java.awt.CardLayout());
        jTabbedPane6.addTab("Edit Sales Rep Details", pnlEditRep);

        pnlNewRep.setLayout(new java.awt.CardLayout());
        jTabbedPane6.addTab("New Sales Rep", pnlNewRep);

        javax.swing.GroupLayout pnlSalesRepsLayout = new javax.swing.GroupLayout(pnlSalesReps);
        pnlSalesReps.setLayout(pnlSalesRepsLayout);
        pnlSalesRepsLayout.setHorizontalGroup(
            pnlSalesRepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        pnlSalesRepsLayout.setVerticalGroup(
            pnlSalesRepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sales Reps", pnlSalesReps);

        pnlSearchItem.setLayout(new java.awt.CardLayout());
        jTabbedPane5.addTab("Search Item", pnlSearchItem);

        pnlEditItem.setLayout(new java.awt.CardLayout());
        jTabbedPane5.addTab("Edit Item Details", pnlEditItem);

        pnlNewItem.setLayout(new java.awt.CardLayout());
        jTabbedPane5.addTab("New Item Details", pnlNewItem);

        javax.swing.GroupLayout pnlStockLayout = new javax.swing.GroupLayout(pnlStock);
        pnlStock.setLayout(pnlStockLayout);
        pnlStockLayout.setHorizontalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        pnlStockLayout.setVerticalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Stock", pnlStock);

        pnlSearchUser.setLayout(new java.awt.CardLayout());
        jTabbedPane7.addTab("Search User", pnlSearchUser);

        pnlEditUser.setLayout(new java.awt.CardLayout());
        jTabbedPane7.addTab("Edit User", pnlEditUser);

        pnlNewUser.setLayout(new java.awt.CardLayout());
        jTabbedPane7.addTab("Create User", pnlNewUser);

        jTabbedPane1.addTab("User Account", jTabbedPane7);

        pnlSearchOrder.setLayout(new java.awt.CardLayout());
        jTabbedPane3.addTab("Search Order", pnlSearchOrder);

        pnlEditOrder.setLayout(new java.awt.CardLayout());
        jTabbedPane3.addTab("Edit Order", pnlEditOrder);

        pnlNewOrder.setLayout(new java.awt.CardLayout());
        jTabbedPane3.addTab("New Order", pnlNewOrder);

        pnlProcessOrder.setLayout(new java.awt.CardLayout());
        jTabbedPane3.addTab("Process Order", pnlProcessOrder);

        javax.swing.GroupLayout pnlOrdersLayout = new javax.swing.GroupLayout(pnlOrders);
        pnlOrders.setLayout(pnlOrdersLayout);
        pnlOrdersLayout.setHorizontalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        pnlOrdersLayout.setVerticalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Orders", pnlOrders);

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Notifications");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Please Review Items shown Below"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable2);

        jButton2.setText("Review");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(66, 66, 66))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        String str = "You are logged in as " + Controller.getCurrentUser();
        lblLoginData.setText(str);

        btnHomeLogOut.setText("Log Out");
        btnHomeLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblLoginData, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnHomeLogOut)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginData, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeLogOut))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeCustomersActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnHomeCustomersActionPerformed

    private void btnHomeRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeRepActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnHomeRepActionPerformed

    private void btnHomeUserAccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeUserAccoActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_btnHomeUserAccoActionPerformed

    private void btnHomeSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeSuppliersActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnHomeSuppliersActionPerformed

    private void btnHomeOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeOrdersActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_btnHomeOrdersActionPerformed

    private void btnHomeLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LogIn logIn = new LogIn();
        logIn.setVisible(true);
    }//GEN-LAST:event_btnHomeLogOutActionPerformed

    private void btnHomeStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeStockActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnHomeStockActionPerformed

    private void jTabbedPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1PropertyChange

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        JPanel temp;
        switch (sourceTabbedPane.getSelectedIndex()) {
            case 1:
                temp = new CustSearch();
                pnlSearchCust.removeAll();
                pnlSearchCust.add(temp);
                pnlSearchCust.validate();
                pnlSearchCust.repaint();

                temp = new CustEdit();
                pnlEditCust.removeAll();
                pnlEditCust.add(temp);
                pnlEditCust.validate();
                pnlEditCust.repaint();

                temp = new CustNew();
                pnlNewCust.removeAll();
                pnlNewCust.add(temp);
                pnlNewCust.validate();
                pnlNewCust.repaint();
                break;
            case 2:
                temp = new SupNew();
                pnlNewSup.removeAll();
                pnlNewSup.add(temp);
                pnlNewSup.validate();
                pnlNewSup.repaint();

                temp = new SupEdit();
                pnlEditSup.removeAll();
                pnlEditSup.add(temp);
                pnlEditSup.validate();
                pnlEditSup.repaint();

                temp = new SupFind();
                pnlSearchSup.removeAll();
                pnlSearchSup.add(temp);
                pnlSearchSup.validate();
                pnlSearchSup.repaint();
                break;
            case 3:
                temp = new RepNew();
                pnlNewRep.removeAll();
                pnlNewRep.add(temp);
                pnlNewRep.validate();
                pnlNewRep.repaint();

                temp = new RepEdit();
                pnlEditRep.removeAll();
                pnlEditRep.add(temp);
                pnlEditRep.validate();
                pnlEditRep.repaint();

                temp = new RepFind();
                pnlSearchRep.removeAll();
                pnlSearchRep.add(temp);
                pnlSearchRep.validate();
                pnlSearchRep.repaint();
                break;
            case 4:
                temp = new ItemNew();
                pnlNewItem.removeAll();
                pnlNewItem.add(temp);
                pnlNewItem.validate();
                pnlNewItem.repaint();

                temp = new ItemSearch();
                pnlSearchItem.removeAll();
                pnlSearchItem.add(temp);
                pnlSearchItem.validate();
                pnlSearchItem.repaint();

                temp = new ItemEdit();
                pnlEditItem.removeAll();
                pnlEditItem.add(temp);
                pnlEditItem.validate();
                pnlEditItem.repaint();
                break;
            case 5:
                temp = new UserEdit();
                pnlEditUser.removeAll();
                pnlEditUser.add(temp);
                pnlEditUser.validate();
                pnlEditUser.repaint();

                temp = new UserNew();
                pnlNewUser.removeAll();
                pnlNewUser.add(temp);
                pnlNewUser.validate();
                pnlNewUser.repaint();

                temp = new UserSearch();
                pnlSearchUser.removeAll();
                pnlSearchUser.add(temp);
                pnlSearchUser.validate();
                pnlSearchUser.repaint();
                break;
            case 6:
                temp = new OrderNew();
                pnlNewOrder.removeAll();
                pnlNewOrder.add(temp);
                pnlNewOrder.validate();
                pnlNewOrder.repaint();

                temp = new OrderEdit();
                pnlEditOrder.removeAll();
                pnlEditOrder.add(temp);
                pnlEditOrder.validate();
                pnlEditOrder.repaint();

                temp = new OrderSearch();
                pnlSearchOrder.removeAll();
                pnlSearchOrder.add(temp);
                pnlSearchOrder.validate();
                pnlSearchOrder.repaint();
                
                temp = new OrderProcess();
                pnlProcessOrder.removeAll();
                pnlProcessOrder.add(temp);
                pnlProcessOrder.validate();
                pnlProcessOrder.repaint();
                break;
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
             if ("Nimbus".equals(info.getName())) {
             javax.swing.UIManager.setLookAndFeel(info.getClassName());
             break;
             }
             }*/

            // Set System L&F
        /*UIManager.setLookAndFeel(
             UIManager.getSystemLookAndFeelClassName());*/

            //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");
            UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info :
//                    javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (InstantiationException ex) {
//            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LogIn.class.getName())
//                    .log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManagerView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHomeCustomers;
    private javax.swing.JButton btnHomeLogOut;
    private javax.swing.JButton btnHomeOrders;
    private javax.swing.JButton btnHomeRep;
    private javax.swing.JButton btnHomeStock;
    private javax.swing.JButton btnHomeSuppliers;
    private javax.swing.JButton btnHomeUserAcco;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblLoginData;
    private javax.swing.JPanel pnlCustomers;
    private javax.swing.JPanel pnlEditCust;
    private javax.swing.JPanel pnlEditItem;
    private javax.swing.JPanel pnlEditOrder;
    private javax.swing.JPanel pnlEditRep;
    private javax.swing.JPanel pnlEditSup;
    private javax.swing.JPanel pnlEditUser;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlNewCust;
    private javax.swing.JPanel pnlNewItem;
    private javax.swing.JPanel pnlNewOrder;
    private javax.swing.JPanel pnlNewRep;
    private javax.swing.JPanel pnlNewSup;
    private javax.swing.JPanel pnlNewUser;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlProcessOrder;
    private javax.swing.JPanel pnlSalesReps;
    private javax.swing.JPanel pnlSearchCust;
    private javax.swing.JPanel pnlSearchItem;
    private javax.swing.JPanel pnlSearchOrder;
    private javax.swing.JPanel pnlSearchRep;
    private javax.swing.JPanel pnlSearchSup;
    private javax.swing.JPanel pnlSearchUser;
    private javax.swing.JPanel pnlStock;
    private javax.swing.JPanel pnlSuppliers;
    // End of variables declaration//GEN-END:variables

    private void setNotifications() {
    }
}