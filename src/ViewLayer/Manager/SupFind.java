/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer.Manager;

/**
 *
 * @author Malakagl
 */
public class SupFind extends javax.swing.JPanel {

    /**
     * Creates new form SupFind
     */
    public SupFind() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        chkBoxFindSupAdd = new javax.swing.JCheckBox();
        cmbFindSupBy = new javax.swing.JComboBox();
        btnFindSupCancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFindSupDetails = new javax.swing.JTable();
        chkBoxFindSupName = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        btnFinndSupSearch = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        chkBoxFindSupEmail = new javax.swing.JCheckBox();
        txtFindSupVal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        chkBoxFindSupID = new javax.swing.JCheckBox();

        chkBoxFindSupAdd.setText("Address");
        chkBoxFindSupAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxFindSupAddActionPerformed(evt);
            }
        });

        cmbFindSupBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supplier ID", "Name", "City", "Street" }));

        btnFindSupCancel.setText("Cancel");
        btnFindSupCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSupCancelActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(tableFindSupDetails);

        chkBoxFindSupName.setText("Name");

        jLabel18.setText("Show me ");

        btnFinndSupSearch.setText("Search");

        jLabel17.setText("Value searching for ");

        chkBoxFindSupEmail.setText("Email");

        jLabel16.setText("Find Supplier by ");

        chkBoxFindSupID.setText("Supplier ID");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFindSupBy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFindSupVal))
                    .addComponent(jLabel18)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(chkBoxFindSupID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkBoxFindSupName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkBoxFindSupAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkBoxFindSupEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinndSupSearch))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnFindSupCancel)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbFindSupBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtFindSupVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBoxFindSupID)
                    .addComponent(chkBoxFindSupEmail)
                    .addComponent(chkBoxFindSupAdd)
                    .addComponent(chkBoxFindSupName)
                    .addComponent(btnFinndSupSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFindSupCancel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkBoxFindSupAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxFindSupAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBoxFindSupAddActionPerformed

    private void btnFindSupCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindSupCancelActionPerformed
        // TODO add your handling code here:
        ManagerView.jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnFindSupCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindSupCancel;
    private javax.swing.JButton btnFinndSupSearch;
    private javax.swing.JCheckBox chkBoxFindSupAdd;
    private javax.swing.JCheckBox chkBoxFindSupEmail;
    private javax.swing.JCheckBox chkBoxFindSupID;
    private javax.swing.JCheckBox chkBoxFindSupName;
    private javax.swing.JComboBox cmbFindSupBy;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableFindSupDetails;
    private javax.swing.JTextField txtFindSupVal;
    // End of variables declaration//GEN-END:variables
}
