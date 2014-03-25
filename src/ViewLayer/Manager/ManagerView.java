/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer.Manager;

import ControllLayer.Controller;
import ControllLayer.Manager.ManagerController;
import ControllLayer.ParityCheck;
import ControllLayer.StoreKeeper.StoreKeeperController;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;
import onestopshop.LogIn;

/**
 *
 * @author Malakagl
 */
public class ManagerView extends javax.swing.JFrame {

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
        lblLoginData = new javax.swing.JLabel();
        btnHomeCustomers = new javax.swing.JButton();
        btnHomeSuppliers = new javax.swing.JButton();
        btnHomeStock = new javax.swing.JButton();
        btnHomeRep = new javax.swing.JButton();
        btnHomeOrders = new javax.swing.JButton();
        btnHomeLogOut = new javax.swing.JButton();
        btnHomeUserAcco = new javax.swing.JButton();
        pnlCustomers = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnlFindCust = new javax.swing.JPanel();
        pnlNewCustomer = new javax.swing.JPanel();
        pnlEditCust = new javax.swing.JPanel();
        pnlSuppliers = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        pnlFindSup = new javax.swing.JPanel();
        pnlEditSup = new javax.swing.JPanel();
        pnlNewSup = new javax.swing.JPanel();
        pnlSalesReps = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        pnlFindCust1 = new javax.swing.JPanel();
        pnlNewSalesRep = new javax.swing.JPanel();
        pnlEditCust1 = new javax.swing.JPanel();
        pnlStock = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        pnlFindItem = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        pnlFindOrder1 = new javax.swing.JPanel();
        pnlEditOrder1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlOrders = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        pnlFindOrder = new javax.swing.JPanel();
        pnlNewOrder = new javax.swing.JPanel();
        pnlNewOrder1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlEditOrder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

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

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
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

        String str = "You are logged in as " + Controller.getCurrentUser();
        lblLoginData.setText(str);

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

        btnHomeLogOut.setText("Log Out");
        btnHomeLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeLogOutActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHomeLayout.createSequentialGroup()
                                .addComponent(btnHomeRep, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addGap(169, 169, 169)
                                .addComponent(btnHomeUserAcco, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHomeCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(btnHomeSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                .addGap(169, 169, 169)
                                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHomeOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(btnHomeStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(lblLoginData, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHomeLogOut)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(btnHomeStock, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHomeOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(btnHomeUserAcco, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(btnHomeCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHomeSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(btnHomeRep, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
                .addGap(92, 92, 92)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginData, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeLogOut))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", pnlHome);

        jTabbedPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFindCustLayout = new javax.swing.GroupLayout(pnlFindCust);
        pnlFindCust.setLayout(pnlFindCustLayout);
        pnlFindCustLayout.setHorizontalGroup(
            pnlFindCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        pnlFindCustLayout.setVerticalGroup(
            pnlFindCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Search Customer", pnlFindCust);

        javax.swing.GroupLayout pnlNewCustomerLayout = new javax.swing.GroupLayout(pnlNewCustomer);
        pnlNewCustomer.setLayout(pnlNewCustomerLayout);
        pnlNewCustomerLayout.setHorizontalGroup(
            pnlNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        pnlNewCustomerLayout.setVerticalGroup(
            pnlNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Add New Customer", pnlNewCustomer);

        javax.swing.GroupLayout pnlEditCustLayout = new javax.swing.GroupLayout(pnlEditCust);
        pnlEditCust.setLayout(pnlEditCustLayout);
        pnlEditCustLayout.setHorizontalGroup(
            pnlEditCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        pnlEditCustLayout.setVerticalGroup(
            pnlEditCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Edit Customer Details", pnlEditCust);

        javax.swing.GroupLayout pnlCustomersLayout = new javax.swing.GroupLayout(pnlCustomers);
        pnlCustomers.setLayout(pnlCustomersLayout);
        pnlCustomersLayout.setHorizontalGroup(
            pnlCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        pnlCustomersLayout.setVerticalGroup(
            pnlCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Customers", pnlCustomers);

        javax.swing.GroupLayout pnlFindSupLayout = new javax.swing.GroupLayout(pnlFindSup);
        pnlFindSup.setLayout(pnlFindSupLayout);
        pnlFindSupLayout.setHorizontalGroup(
            pnlFindSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlFindSupLayout.setVerticalGroup(
            pnlFindSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Find Supplier", pnlFindSup);

        javax.swing.GroupLayout pnlEditSupLayout = new javax.swing.GroupLayout(pnlEditSup);
        pnlEditSup.setLayout(pnlEditSupLayout);
        pnlEditSupLayout.setHorizontalGroup(
            pnlEditSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlEditSupLayout.setVerticalGroup(
            pnlEditSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Edit Supplier", pnlEditSup);

        javax.swing.GroupLayout pnlNewSupLayout = new javax.swing.GroupLayout(pnlNewSup);
        pnlNewSup.setLayout(pnlNewSupLayout);
        pnlNewSupLayout.setHorizontalGroup(
            pnlNewSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlNewSupLayout.setVerticalGroup(
            pnlNewSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("New Supplier", pnlNewSup);

        javax.swing.GroupLayout pnlSuppliersLayout = new javax.swing.GroupLayout(pnlSuppliers);
        pnlSuppliers.setLayout(pnlSuppliersLayout);
        pnlSuppliersLayout.setHorizontalGroup(
            pnlSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        pnlSuppliersLayout.setVerticalGroup(
            pnlSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("Suppliers", pnlSuppliers);

        jTabbedPane6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout pnlFindCust1Layout = new javax.swing.GroupLayout(pnlFindCust1);
        pnlFindCust1.setLayout(pnlFindCust1Layout);
        pnlFindCust1Layout.setHorizontalGroup(
            pnlFindCust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        pnlFindCust1Layout.setVerticalGroup(
            pnlFindCust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Find Sales Rep", pnlFindCust1);

        javax.swing.GroupLayout pnlNewSalesRepLayout = new javax.swing.GroupLayout(pnlNewSalesRep);
        pnlNewSalesRep.setLayout(pnlNewSalesRepLayout);
        pnlNewSalesRepLayout.setHorizontalGroup(
            pnlNewSalesRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        pnlNewSalesRepLayout.setVerticalGroup(
            pnlNewSalesRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("New Sales Rep", pnlNewSalesRep);

        javax.swing.GroupLayout pnlEditCust1Layout = new javax.swing.GroupLayout(pnlEditCust1);
        pnlEditCust1.setLayout(pnlEditCust1Layout);
        pnlEditCust1Layout.setHorizontalGroup(
            pnlEditCust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        pnlEditCust1Layout.setVerticalGroup(
            pnlEditCust1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Edit Sales Rep Details", pnlEditCust1);

        javax.swing.GroupLayout pnlSalesRepsLayout = new javax.swing.GroupLayout(pnlSalesReps);
        pnlSalesReps.setLayout(pnlSalesRepsLayout);
        pnlSalesRepsLayout.setHorizontalGroup(
            pnlSalesRepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        pnlSalesRepsLayout.setVerticalGroup(
            pnlSalesRepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        jTabbedPane1.addTab("Sales Reps", pnlSalesReps);

        javax.swing.GroupLayout pnlFindItemLayout = new javax.swing.GroupLayout(pnlFindItem);
        pnlFindItem.setLayout(pnlFindItemLayout);
        pnlFindItemLayout.setHorizontalGroup(
            pnlFindItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlFindItemLayout.setVerticalGroup(
            pnlFindItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Search Item", pnlFindItem);

        javax.swing.GroupLayout pnlStockLayout = new javax.swing.GroupLayout(pnlStock);
        pnlStock.setLayout(pnlStockLayout);
        pnlStockLayout.setHorizontalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        pnlStockLayout.setVerticalGroup(
            pnlStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        jTabbedPane1.addTab("Stock", pnlStock);

        javax.swing.GroupLayout pnlFindOrder1Layout = new javax.swing.GroupLayout(pnlFindOrder1);
        pnlFindOrder1.setLayout(pnlFindOrder1Layout);
        pnlFindOrder1Layout.setHorizontalGroup(
            pnlFindOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlFindOrder1Layout.setVerticalGroup(
            pnlFindOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Create User", pnlFindOrder1);

        javax.swing.GroupLayout pnlEditOrder1Layout = new javax.swing.GroupLayout(pnlEditOrder1);
        pnlEditOrder1.setLayout(pnlEditOrder1Layout);
        pnlEditOrder1Layout.setHorizontalGroup(
            pnlEditOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlEditOrder1Layout.setVerticalGroup(
            pnlEditOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Edit User", pnlEditOrder1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Search User", jPanel2);

        jTabbedPane1.addTab("User Account", jTabbedPane7);

        javax.swing.GroupLayout pnlFindOrderLayout = new javax.swing.GroupLayout(pnlFindOrder);
        pnlFindOrder.setLayout(pnlFindOrderLayout);
        pnlFindOrderLayout.setHorizontalGroup(
            pnlFindOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlFindOrderLayout.setVerticalGroup(
            pnlFindOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Find Order", pnlFindOrder);

        javax.swing.GroupLayout pnlNewOrderLayout = new javax.swing.GroupLayout(pnlNewOrder);
        pnlNewOrder.setLayout(pnlNewOrderLayout);
        pnlNewOrderLayout.setHorizontalGroup(
            pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlNewOrderLayout.setVerticalGroup(
            pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("New Order", pnlNewOrder);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlNewOrder1Layout = new javax.swing.GroupLayout(pnlNewOrder1);
        pnlNewOrder1.setLayout(pnlNewOrder1Layout);
        pnlNewOrder1Layout.setHorizontalGroup(
            pnlNewOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNewOrder1Layout.setVerticalGroup(
            pnlNewOrder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Process Order", pnlNewOrder1);

        javax.swing.GroupLayout pnlEditOrderLayout = new javax.swing.GroupLayout(pnlEditOrder);
        pnlEditOrder.setLayout(pnlEditOrderLayout);
        pnlEditOrderLayout.setHorizontalGroup(
            pnlEditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnlEditOrderLayout.setVerticalGroup(
            pnlEditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Edit Order", pnlEditOrder);

        javax.swing.GroupLayout pnlOrdersLayout = new javax.swing.GroupLayout(pnlOrders);
        pnlOrders.setLayout(pnlOrdersLayout);
        pnlOrdersLayout.setHorizontalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        pnlOrdersLayout.setVerticalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3))
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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeStockActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnHomeStockActionPerformed

    private void btnHomeRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeRepActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnHomeRepActionPerformed

    private void btnHomeCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeCustomersActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnHomeCustomersActionPerformed

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

    private void btnHomeUserAccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeUserAccoActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_btnHomeUserAccoActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
        switch (((JTabbedPane) evt.getSource()).getSelectedIndex()) {
            case 0:
                details = new ArrayList<>();
        }
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        numbers = new ArrayList<>();
        switch (sourceTabbedPane.getSelectedIndex()) {
            case 1:
                CustNew.btnAddTP.doClick();
                break;
            case 2:
                SupNew.btnAddTPSup.doClick();
                break;
            case 3:
                RepNew.btnAddTPSRep.doClick();
            case 5:
                users = ManagerController.getUsers();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1PropertyChange

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
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (InstantiationException ex) {
            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    public static javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblLoginData;
    private javax.swing.JPanel pnlCustomers;
    private javax.swing.JPanel pnlEditCust;
    private javax.swing.JPanel pnlEditCust1;
    private javax.swing.JPanel pnlEditOrder;
    private javax.swing.JPanel pnlEditOrder1;
    private javax.swing.JPanel pnlEditSup;
    private javax.swing.JPanel pnlFindCust;
    private javax.swing.JPanel pnlFindCust1;
    private javax.swing.JPanel pnlFindItem;
    private javax.swing.JPanel pnlFindOrder;
    private javax.swing.JPanel pnlFindOrder1;
    private javax.swing.JPanel pnlFindSup;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlNewCustomer;
    private javax.swing.JPanel pnlNewOrder;
    private javax.swing.JPanel pnlNewOrder1;
    private javax.swing.JPanel pnlNewSalesRep;
    private javax.swing.JPanel pnlNewSup;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlSalesReps;
    private javax.swing.JPanel pnlStock;
    private javax.swing.JPanel pnlSuppliers;
    // End of variables declaration//GEN-END:variables
    ArrayList<Object> details = new ArrayList<>();
    ArrayList<Object> numbers = new ArrayList<>();
    ArrayList<String> users = new ArrayList<>();
    JTable current = new JTable();
    private void setNotifications(){
    }
}