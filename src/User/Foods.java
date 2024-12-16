/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Foods extends javax.swing.JFrame {

    /**
     * Creates new form Foods
     */
    public Foods() {
        initComponents();
        Foods5.setVisible(false);
        Foods5Txt.setVisible(false);
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
        CakeTxt = new javax.swing.JLabel();
        NuggetsTxt = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        PizzaTxt = new javax.swing.JLabel();
        BurgersTxt = new javax.swing.JLabel();
        LogoutLabel = new javax.swing.JLabel();
        BackLabel = new javax.swing.JLabel();
        CrossLabel = new javax.swing.JLabel();
        Cake = new javax.swing.JButton();
        Nuggets = new javax.swing.JButton();
        Pizza = new javax.swing.JButton();
        Foods5 = new javax.swing.JButton();
        Burgers = new javax.swing.JButton();
        Foods5Txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CakeTxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CakeTxt.setForeground(new java.awt.Color(0, 102, 102));
        CakeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CakeTxt.setText("Cake");
        jPanel1.add(CakeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 60, 30));

        NuggetsTxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        NuggetsTxt.setForeground(new java.awt.Color(0, 102, 102));
        NuggetsTxt.setText("Nuggets");
        jPanel1.add(NuggetsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 24));

        HeaderLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/rsz_istockphoto-918978530-612x612.png"))); // NOI18N
        HeaderLabel.setText("CheckOut Our Food Section");
        jPanel1.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 355, 47));

        PizzaTxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        PizzaTxt.setForeground(new java.awt.Color(0, 102, 102));
        PizzaTxt.setText("Pizza");
        jPanel1.add(PizzaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 40, 30));

        BurgersTxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BurgersTxt.setForeground(new java.awt.Color(0, 102, 102));
        BurgersTxt.setText("Burgers");
        jPanel1.add(BurgersTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 71, 31));

        LogoutLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogoutLabel.setForeground(new java.awt.Color(0, 102, 102));
        LogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CART.png"))); // NOI18N
        LogoutLabel.setText("Logout");
        LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabelMouseClicked(evt);
            }
        });
        jPanel1.add(LogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, -1));

        BackLabel.setText("jLabel7");
        BackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabelMouseClicked(evt);
            }
        });
        jPanel1.add(BackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        CrossLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        CrossLabel.setForeground(new java.awt.Color(255, 255, 255));
        CrossLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrossLabel.setText("x");
        CrossLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossLabelMouseClicked(evt);
            }
        });
        jPanel1.add(CrossLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 2, 33, 30));

        Cake.setText("jButton1");
        Cake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CakeMouseClicked(evt);
            }
        });
        jPanel1.add(Cake, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 90));

        Nuggets.setText("jButton1");
        Nuggets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuggetsMouseClicked(evt);
            }
        });
        jPanel1.add(Nuggets, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 110, 90));

        Pizza.setText("jButton1");
        Pizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PizzaMouseClicked(evt);
            }
        });
        jPanel1.add(Pizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, 90));

        Foods5.setText("jButton1");
        Foods5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Foods5MouseClicked(evt);
            }
        });
        jPanel1.add(Foods5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, 100));

        Burgers.setText("jButton1");
        Burgers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BurgersMouseClicked(evt);
            }
        });
        jPanel1.add(Burgers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 100));

        Foods5Txt.setText("jLabel8");
        jPanel1.add(Foods5Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLabelMouseClicked

        int a = JOptionPane.showConfirmDialog(this, "Do You Want To Logout Now?", "Logout", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutLabelMouseClicked

    private void BackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelMouseClicked
        CheckoutCategory chckoutCate = new CheckoutCategory();
        chckoutCate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackLabelMouseClicked

    private void CrossLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossLabelMouseClicked
        setVisible(false);
        MainView.jPanel12.setBackground(primaryColor);
        MainView.jPanel13.setBackground(primaryColor);
        MainView.ChckoutCate.setForeground(textPrimaryColor);
        MainView.jLabel23.setVisible(true);
        MainView.jLabel24.setVisible(false);
    }//GEN-LAST:event_CrossLabelMouseClicked

    private void CakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CakeMouseClicked

        NavigationTracker.previousFrame = Foods.this;
        Purchase purchase = new Purchase();
        purchase.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CakeMouseClicked

    private void NuggetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuggetsMouseClicked

        NavigationTracker.previousFrame = Foods.this;
        Purchase purchase = new Purchase();
        purchase.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NuggetsMouseClicked

    private void PizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PizzaMouseClicked

        NavigationTracker.previousFrame = Foods.this;
        Purchase purchase = new Purchase();
        purchase.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PizzaMouseClicked

    private void Foods5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Foods5MouseClicked

        NavigationTracker.previousFrame = Foods.this;
        Purchase purchase = new Purchase();
        purchase.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Foods5MouseClicked

    private void BurgersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BurgersMouseClicked

        NavigationTracker.previousFrame = Foods.this;
        Purchase purchase = new Purchase();
        purchase.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BurgersMouseClicked

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
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Foods().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JButton Burgers;
    private javax.swing.JLabel BurgersTxt;
    private javax.swing.JButton Cake;
    private javax.swing.JLabel CakeTxt;
    private javax.swing.JLabel CrossLabel;
    private javax.swing.JButton Foods5;
    private javax.swing.JLabel Foods5Txt;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JButton Nuggets;
    private javax.swing.JLabel NuggetsTxt;
    private javax.swing.JButton Pizza;
    private javax.swing.JLabel PizzaTxt;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
