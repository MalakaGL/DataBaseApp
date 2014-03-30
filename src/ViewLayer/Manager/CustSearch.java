/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer.Manager;

import ControllLayer.Manager.ManagerController;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Malakagl
 */
public class CustSearch extends javax.swing.JPanel {
    private JTable current;

    /**
     * Creates new form CustSearch
     */
    public CustSearch() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbFindCustBy = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtFindCustVal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        chkBoxFindCustCustID = new javax.swing.JCheckBox();
        chkBoxFindCustEmail = new javax.swing.JCheckBox();
        chkBoxFindCustCity = new javax.swing.JCheckBox();
        chkBoxFindCustName = new javax.swing.JCheckBox();
        chkBoxFindCustType = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFindCust = new javax.swing.JTable();
        btnFindCustFind = new javax.swing.JButton();
        chkBoxFindCustTP = new javax.swing.JCheckBox();
        btnFindCustCancel = new javax.swing.JButton();
        chkboxFindCustCredit = new javax.swing.JCheckBox();
        chkBoxFindCustCreditAvail = new javax.swing.JCheckBox();
        chkBoxFindCustClrCount = new javax.swing.JCheckBox();
        chkBoxFindCustPoint = new javax.swing.JCheckBox();
        chkBoxFindCustType1 = new javax.swing.JCheckBox();
        chkBoxFindCustTP1 = new javax.swing.JCheckBox();

        jLabel2.setText("Find Customer by ");

        cmbFindCustBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "CustomerID", "FirstName", "AddressCity", "AddressStreet", "Email", "CustomerType" }));

        jLabel3.setText("Value searching for ");

        txtFindCustVal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFindCustValFocusGained(evt);
            }
        });

        jLabel4.setText("Show me ");

        chkBoxFindCustCustID.setSelected(true);
        chkBoxFindCustCustID.setText("CustomerID");
        chkBoxFindCustCustID.setEnabled(false);
        chkBoxFindCustCustID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustCustIDItemStateChanged(evt);
            }
        });

        chkBoxFindCustEmail.setSelected(true);
        chkBoxFindCustEmail.setText("Email");
        chkBoxFindCustEmail.setEnabled(false);
        chkBoxFindCustEmail.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustEmailItemStateChanged(evt);
            }
        });

        chkBoxFindCustCity.setSelected(true);
        chkBoxFindCustCity.setText("LastName");
        chkBoxFindCustCity.setEnabled(false);
        chkBoxFindCustCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustCityItemStateChanged(evt);
            }
        });

        chkBoxFindCustName.setSelected(true);
        chkBoxFindCustName.setText("FirstName");
        chkBoxFindCustName.setEnabled(false);
        chkBoxFindCustName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustNameItemStateChanged(evt);
            }
        });

        chkBoxFindCustType.setSelected(true);
        chkBoxFindCustType.setText("Address");
        chkBoxFindCustType.setEnabled(false);
        chkBoxFindCustType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustTypeItemStateChanged(evt);
            }
        });

        jScrollPane2.setViewportView(tableFindCust);

        btnFindCustFind.setText("Find");
        btnFindCustFind.setEnabled(false);
        btnFindCustFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCustFindActionPerformed(evt);
            }
        });

        chkBoxFindCustTP.setSelected(true);
        chkBoxFindCustTP.setText("CustomerType");
        chkBoxFindCustTP.setEnabled(false);
        chkBoxFindCustTP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustTPItemStateChanged(evt);
            }
        });

        btnFindCustCancel.setText("Cancel");
        btnFindCustCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCustCancelActionPerformed(evt);
            }
        });

        chkboxFindCustCredit.setSelected(true);
        chkboxFindCustCredit.setText("Credit Limit");
        chkboxFindCustCredit.setEnabled(false);
        chkboxFindCustCredit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkboxFindCustCreditItemStateChanged(evt);
            }
        });

        chkBoxFindCustCreditAvail.setSelected(true);
        chkBoxFindCustCreditAvail.setText("Available credit");
        chkBoxFindCustCreditAvail.setEnabled(false);
        chkBoxFindCustCreditAvail.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustCreditAvailItemStateChanged(evt);
            }
        });

        chkBoxFindCustClrCount.setSelected(true);
        chkBoxFindCustClrCount.setText("Clear Count");
        chkBoxFindCustClrCount.setEnabled(false);
        chkBoxFindCustClrCount.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustClrCountItemStateChanged(evt);
            }
        });

        chkBoxFindCustPoint.setSelected(true);
        chkBoxFindCustPoint.setText("Total Point");
        chkBoxFindCustPoint.setEnabled(false);
        chkBoxFindCustPoint.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustPointItemStateChanged(evt);
            }
        });

        chkBoxFindCustType1.setSelected(true);
        chkBoxFindCustType1.setText("Telephone");
        chkBoxFindCustType1.setEnabled(false);
        chkBoxFindCustType1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustType1ItemStateChanged(evt);
            }
        });

        chkBoxFindCustTP1.setSelected(true);
        chkBoxFindCustTP1.setText("FirstIssueDate");
        chkBoxFindCustTP1.setEnabled(false);
        chkBoxFindCustTP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkBoxFindCustTP1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFindCustCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFindCustBy, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFindCustVal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFindCustFind))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(chkBoxFindCustCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkBoxFindCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkBoxFindCustCity, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkBoxFindCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkBoxFindCustType, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(chkBoxFindCustCreditAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkBoxFindCustClrCount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkBoxFindCustPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkboxFindCustCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkBoxFindCustTP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chkBoxFindCustTP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkBoxFindCustType1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
                        .addGap(0, 148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbFindCustBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtFindCustVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindCustFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkBoxFindCustCustID)
                            .addComponent(chkBoxFindCustEmail)
                            .addComponent(chkBoxFindCustCity)
                            .addComponent(chkBoxFindCustName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkBoxFindCustCreditAvail)
                            .addComponent(chkBoxFindCustPoint)
                            .addComponent(chkBoxFindCustClrCount)
                            .addComponent(chkboxFindCustCredit)
                            .addComponent(chkBoxFindCustTP)
                            .addComponent(chkBoxFindCustTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkBoxFindCustType1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkBoxFindCustType)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnFindCustCancel)
                .addGap(39, 39, 39))
        );

        jScrollPane6.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFindCustValFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFindCustValFocusGained
        // TODO add your handling code here:
        btnFindCustFind.setEnabled(true);
    }//GEN-LAST:event_txtFindCustValFocusGained

    private void chkBoxFindCustEmailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustEmailItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustEmailItemStateChanged

    private void chkBoxFindCustCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustCityItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustCityItemStateChanged

    private void chkBoxFindCustTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustTypeItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustTypeItemStateChanged

    private void btnFindCustFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCustFindActionPerformed
        // TODO add your handling code here:
        if (txtFindCustVal.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a value to "
                + "do search.");
            return;
        }

        Object[] conditions = new Object[2];
        conditions[0] = cmbFindCustBy.getSelectedItem();
        conditions[1] = txtFindCustVal.getText();

        JTable table = ManagerController.getSearchResult(conditions);
        current = new JTable(table.getModel());

        if (table == null || table.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No result found.");
        } else {
            chkBoxFindCustCity.setEnabled(true);
            chkBoxFindCustCustID.setEnabled(true);
            chkBoxFindCustEmail.setEnabled(true);
            chkBoxFindCustName.setEnabled(true);
            chkBoxFindCustType.setEnabled(true);
            chkBoxFindCustClrCount.setEnabled(true);
            chkBoxFindCustCreditAvail.setEnabled(true);
            chkBoxFindCustPoint.setEnabled(true);
            chkboxFindCustCredit.setEnabled(true);
            chkBoxFindCustTP.setEnabled(true);
            tableFindCust.setModel(table.getModel());
        }
    }//GEN-LAST:event_btnFindCustFindActionPerformed

    private void chkBoxFindCustTPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustTPItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustTPItemStateChanged

    private void btnFindCustCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCustCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindCustCancelActionPerformed

    private void chkboxFindCustCreditItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkboxFindCustCreditItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkboxFindCustCreditItemStateChanged

    private void chkBoxFindCustCreditAvailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustCreditAvailItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustCreditAvailItemStateChanged

    private void chkBoxFindCustClrCountItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustClrCountItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustClrCountItemStateChanged

    private void chkBoxFindCustPointItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustPointItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustPointItemStateChanged

    private void chkBoxFindCustType1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustType1ItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustType1ItemStateChanged

    private void chkBoxFindCustTP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustTP1ItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustTP1ItemStateChanged

    private void chkBoxFindCustCustIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustCustIDItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustCustIDItemStateChanged

    private void chkBoxFindCustNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkBoxFindCustNameItemStateChanged
        // TODO add your handling code here:
        refresh(evt);
    }//GEN-LAST:event_chkBoxFindCustNameItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindCustCancel;
    private javax.swing.JButton btnFindCustFind;
    private javax.swing.JCheckBox chkBoxFindCustCity;
    private javax.swing.JCheckBox chkBoxFindCustClrCount;
    private javax.swing.JCheckBox chkBoxFindCustCreditAvail;
    private javax.swing.JCheckBox chkBoxFindCustCustID;
    private javax.swing.JCheckBox chkBoxFindCustEmail;
    private javax.swing.JCheckBox chkBoxFindCustName;
    private javax.swing.JCheckBox chkBoxFindCustPoint;
    private javax.swing.JCheckBox chkBoxFindCustTP;
    private javax.swing.JCheckBox chkBoxFindCustTP1;
    private javax.swing.JCheckBox chkBoxFindCustType;
    private javax.swing.JCheckBox chkBoxFindCustType1;
    private javax.swing.JCheckBox chkboxFindCustCredit;
    private javax.swing.JComboBox cmbFindCustBy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tableFindCust;
    private javax.swing.JTextField txtFindCustVal;
    // End of variables declaration//GEN-END:variables
    ArrayList<Object> details = new ArrayList<>();
    ArrayList<Object> numbers = new ArrayList<>();
    ArrayList<String> users = new ArrayList<>();

    private void refresh(ItemEvent evt) {
        if (evt.getStateChange() == 2) {
            details.add(((JCheckBox) evt.getSource()).getText());
        } else {
            details.remove(((JCheckBox) evt.getSource()).getText());
        }
        tableFindCust.setModel(ManagerController.refreshTable(current, details));
    }
}
