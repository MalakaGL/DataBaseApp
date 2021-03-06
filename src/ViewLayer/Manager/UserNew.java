/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer.Manager;

import ControllLayer.Controller;
import ControllLayer.Manager.ManagerController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Malakagl
 */
public class UserNew extends javax.swing.JPanel {

    /**
     * Creates new form UserNew
     */
    public UserNew() {
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

        jPanel6 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        btnUserCancel = new javax.swing.JButton();
        txtUserAccNum = new javax.swing.JTextField();
        txtUserPass = new javax.swing.JPasswordField();
        jLabel77 = new javax.swing.JLabel();
        cmbUserType = new javax.swing.JComboBox();
        jLabel79 = new javax.swing.JLabel();
        btnUserCreate = new javax.swing.JButton();
        txtUserPassConfirm = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        lblPassMatch = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();

        jLabel76.setText("Password");

        btnUserCancel.setText("Cancel");
        btnUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserCancelActionPerformed(evt);
            }
        });

        txtUserPass.setEditable(false);
        txtUserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserPassActionPerformed(evt);
            }
        });
        txtUserPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserPassFocusLost(evt);
            }
        });

        jLabel77.setText("Confirm Password");

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "MANAGER", "CASHIER", "STOREKEEPER", "SALESREP" }));
        cmbUserType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUserTypeItemStateChanged(evt);
            }
        });

        jLabel79.setText("Account Number");

        btnUserCreate.setText("Create");
        btnUserCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserCreateActionPerformed(evt);
            }
        });

        txtUserPassConfirm.setEditable(false);
        txtUserPassConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserPassConfirmActionPerformed(evt);
            }
        });
        txtUserPassConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserPassConfirmFocusLost(evt);
            }
        });
        txtUserPassConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserPassConfirmKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserPassConfirmKeyTyped(evt);
            }
        });

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        jLabel75.setText("User Name");

        jLabel78.setText("Account Type");

        lblPassMatch.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName)
                            .addComponent(txtUserPass)
                            .addComponent(txtUserAccNum)
                            .addComponent(txtUserPassConfirm)
                            .addComponent(cmbUserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnUserCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUserCancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassMatch)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel77))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassMatch))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserCancel)
                    .addComponent(btnUserCreate))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserCancelActionPerformed
        // TODO add your handling code here:
        ManagerView.jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnUserCancelActionPerformed

    private void txtUserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPassActionPerformed

    private void txtUserPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserPassFocusGained
        // TODO add your handling code here:
        txtUserPassConfirm.setEditable(true);
    }//GEN-LAST:event_txtUserPassFocusGained

    private void txtUserPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserPassFocusLost
        // TODO add your handling code here:
        txtUserPassConfirm.setEditable(true);
    }//GEN-LAST:event_txtUserPassFocusLost

    private void cmbUserTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUserTypeItemStateChanged
        // TODO add your handling code here:
        txtUserAccNum.setText(ManagerController.getNewAccNum());
        switch (cmbUserType.getSelectedIndex()) {
            case 1:
            txtUserAccNum.setText("MA" + txtUserAccNum.getText());
            break;
            case 2:
            txtUserAccNum.setText("CA" + txtUserAccNum.getText());
            break;
            case 3:
            txtUserAccNum.setText("SK" + txtUserAccNum.getText());
            break;
            case 4:
            txtUserAccNum.setText("SR" + txtUserAccNum.getText());
            break;
        }
    }//GEN-LAST:event_cmbUserTypeItemStateChanged

    private void btnUserCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserCreateActionPerformed
        // TODO add your handling code here:
        if ((lblPassMatch.getText()).equals("Passwords Matched.")
            && lblUserName.getText().equals("")) {
            if(Controller.createUser(txtUserName.getText(),
                txtUserPass.getPassword(),(String)cmbUserType.getSelectedItem(),
                txtUserAccNum.getText())>0){
            JOptionPane.showMessageDialog(this, "User Created Successfully.");
        }else{
            JOptionPane.showMessageDialog(this, "Something went wrong.");
        }
        } else {
            JOptionPane.showMessageDialog(this, "Passwords do not match.");
        }
    }//GEN-LAST:event_btnUserCreateActionPerformed

    private void txtUserPassConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserPassConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPassConfirmActionPerformed

    private void txtUserPassConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserPassConfirmFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPassConfirmFocusLost

    private void txtUserPassConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPassConfirmKeyReleased
        // TODO add your handling code here:
        boolean flag;
        flag = txtUserPass.getText().equals(
            txtUserPassConfirm.getText());
        System.out.println("Pass : " + txtUserPass.getText());
        System.out.println("PassConfirm : " + txtUserPassConfirm.getText());
        if (flag) {
            lblPassMatch.setText("Passwords Matched.");
        } else {
            lblPassMatch.setText("Passwords Do Not Matched.");
        }
    }//GEN-LAST:event_txtUserPassConfirmKeyReleased

    private void txtUserPassConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPassConfirmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPassConfirmKeyTyped

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        txtUserPass.setEditable(true);
        txtUserAccNum.setText(ManagerController.getNewAccNum());
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        if (!txtUserName.equals("")) {
            txtUserPass.setEditable(true);
        } else {
            txtUserPass.setEditable(false);
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        if (users.contains(txtUserName.getText())) {
            lblUserName.setText("User Name Exists...!");
        } else {
            lblUserName.setText("");
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserCancel;
    private javax.swing.JButton btnUserCreate;
    private javax.swing.JComboBox cmbUserType;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblPassMatch;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtUserAccNum;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtUserPass;
    private javax.swing.JPasswordField txtUserPassConfirm;
    // End of variables declaration//GEN-END:variables
    ArrayList<String> users = new ArrayList<>();
}
