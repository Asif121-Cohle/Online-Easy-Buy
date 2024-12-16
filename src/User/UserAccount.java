/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class UserAccount extends javax.swing.JFrame {

    /**
     * Creates new form UserAccount
     */
    public UserAccount() {
        initComponents();
    }
    Color textPrimaryColor = new Color(102,120,138);
    Color primaryColor = new Color(42,58,73);
    int xx,xy;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        UserIdTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        PhoneTextField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        UserNameTextField = new javax.swing.JTextField();
        SecAnsTextField = new javax.swing.JTextField();
        StateTextField = new javax.swing.JTextField();
        CountryTextField = new javax.swing.JTextField();
        SecQuestionTextField = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BtnSave = new javax.swing.JButton();
        CrossLAbel = new javax.swing.JLabel();
        BackLabel = new javax.swing.JLabel();
        LogoutLAbel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("User Account");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 180, 40));

        UserIdTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        UserIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UserIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 30));

        EmailTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, 30));

        PhoneTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        PhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 250, 30));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 250, 30));

        UserNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 250, 30));

        SecAnsTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(SecAnsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 270, 30));

        StateTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(StateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 270, 30));

        CountryTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(CountryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 270, 30));

        SecQuestionTextField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        SecQuestionTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's you favourite color?", "What's your favourtite pet?", "What's your hobby?" }));
        SecQuestionTextField.setSelectedIndex(-1);
        jPanel1.add(SecQuestionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 270, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 60, 20));

        jLabel3.setBackground(new java.awt.Color(25, 118, 221));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 60, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Security Question:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address Line 1(State & Area):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address Line 2(Country):");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        BtnBack.setBackground(new java.awt.Color(242, 242, 242));
        BtnBack.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        BtnBack.setForeground(new java.awt.Color(0, 102, 102));
        BtnBack.setText("DELETE");
        jPanel1.add(BtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 120, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("x");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, -280, 33, 32));

        BtnSave.setBackground(new java.awt.Color(242, 242, 242));
        BtnSave.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        BtnSave.setForeground(new java.awt.Color(0, 102, 102));
        BtnSave.setText("UPDATE");
        jPanel1.add(BtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 120, 30));

        CrossLAbel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        CrossLAbel.setForeground(new java.awt.Color(255, 255, 255));
        CrossLAbel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrossLAbel.setText("x");
        CrossLAbel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossLAbelMouseClicked(evt);
            }
        });
        jPanel1.add(CrossLAbel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 33, 32));

        BackLabel.setText("jLabel7");
        BackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabelMouseClicked(evt);
            }
        });
        jPanel1.add(BackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        LogoutLAbel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogoutLAbel.setForeground(new java.awt.Color(0, 102, 102));
        LogoutLAbel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CART.png"))); // NOI18N
        LogoutLAbel.setText("Logout");
        LogoutLAbel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLAbelMouseClicked(evt);
            }
        });
        jPanel1.add(LogoutLAbel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIdTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void PhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextFieldActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void CrossLAbelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossLAbelMouseClicked
        setVisible(false);
        MainView.jPanel9.setBackground(primaryColor);
        MainView.jPanel10.setBackground(primaryColor);
        MainView.MyAccount.setForeground(textPrimaryColor);
        MainView.jLabel10.setVisible(true);
        MainView.jLabel21.setVisible(false);
    }//GEN-LAST:event_CrossLAbelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i=0;i<=1;i+=0.1)
        {
            String s = ""+ i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try{
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void BackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelMouseClicked
        MainView mainView = new MainView();
        mainView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackLabelMouseClicked

    private void LogoutLAbelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLAbelMouseClicked

        int a = JOptionPane.showConfirmDialog(this, "Do You Want To Logout Now?", "Logout", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutLAbelMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnSave;
    private javax.swing.JTextField CountryTextField;
    private javax.swing.JLabel CrossLAbel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel LogoutLAbel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JTextField SecAnsTextField;
    private javax.swing.JComboBox<String> SecQuestionTextField;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JTextField UserIdTextField;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
