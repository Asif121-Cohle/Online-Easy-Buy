/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import static User.MainView.ChckoutCate;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CheckoutCategory extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public CheckoutCategory() {
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
        ElectronicAppliances = new javax.swing.JLabel();
        MenAccessoriesTxt = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        WomenAccessoriesTxt = new javax.swing.JLabel();
        FoodsTxt = new javax.swing.JLabel();
        CrossLabel = new javax.swing.JLabel();
        BackLabel = new javax.swing.JLabel();
        LogoutLabel = new javax.swing.JLabel();
        Electronics = new javax.swing.JButton();
        MenAccessories = new javax.swing.JButton();
        WomenAccessories = new javax.swing.JButton();
        Foods = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        ElectronicAppliances.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ElectronicAppliances.setForeground(new java.awt.Color(0, 102, 102));
        ElectronicAppliances.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ElectronicAppliances.setText("Electronic Appliances");

        MenAccessoriesTxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        MenAccessoriesTxt.setForeground(new java.awt.Color(0, 102, 102));
        MenAccessoriesTxt.setText("Men Accessories");

        HeaderLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/rsz_istockphoto-918978530-612x612.png"))); // NOI18N
        HeaderLabel.setText("CheckOut Our Category Section");

        WomenAccessoriesTxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        WomenAccessoriesTxt.setForeground(new java.awt.Color(0, 102, 102));
        WomenAccessoriesTxt.setText("Women Accessories");

        FoodsTxt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        FoodsTxt.setForeground(new java.awt.Color(0, 102, 102));
        FoodsTxt.setText("Foods");

        CrossLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        CrossLabel.setForeground(new java.awt.Color(255, 255, 255));
        CrossLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrossLabel.setText("x");
        CrossLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossLabelMouseClicked(evt);
            }
        });

        BackLabel.setText("jLabel7");
        BackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabelMouseClicked(evt);
            }
        });

        LogoutLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogoutLabel.setForeground(new java.awt.Color(0, 102, 102));
        LogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CART.png"))); // NOI18N
        LogoutLabel.setText("Logout");
        LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabelMouseClicked(evt);
            }
        });

        Electronics.setText("jButton1");
        Electronics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectronicsMouseClicked(evt);
            }
        });

        MenAccessories.setText("jButton2");
        MenAccessories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenAccessoriesMouseClicked(evt);
            }
        });

        WomenAccessories.setText("jButton3");
        WomenAccessories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WomenAccessoriesMouseClicked(evt);
            }
        });

        Foods.setText("jButton4");
        Foods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FoodsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361)
                        .addComponent(LogoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CrossLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(FoodsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Electronics, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ElectronicAppliances)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MenAccessoriesTxt)
                                .addGap(44, 44, 44)
                                .addComponent(WomenAccessoriesTxt))
                            .addComponent(MenAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Foods, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WomenAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrossLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogoutLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Electronics, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WomenAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MenAccessoriesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ElectronicAppliances, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WomenAccessoriesTxt))
                .addGap(38, 38, 38)
                .addComponent(Foods, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FoodsTxt)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CrossLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossLabelMouseClicked
        setVisible(false);
        MainView.jPanel12.setBackground(primaryColor);
        MainView.jPanel13.setBackground(primaryColor);
        MainView.ChckoutCate.setForeground(textPrimaryColor);
        MainView.jLabel23.setVisible(true);
        MainView.jLabel24.setVisible(false);
    }//GEN-LAST:event_CrossLabelMouseClicked

    private void BackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelMouseClicked
        MainView mainView = new MainView();
        mainView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackLabelMouseClicked

    private void LogoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLabelMouseClicked

        int a = JOptionPane.showConfirmDialog(this, "Do You Want To Logout Now?", "Logout", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutLabelMouseClicked

    private void ElectronicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectronicsMouseClicked
        NavigationTracker.previousFrame = CheckoutCategory.this;
        ElectronicAppliances CateOne = new ElectronicAppliances();
        CateOne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ElectronicsMouseClicked

    private void MenAccessoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenAccessoriesMouseClicked
        NavigationTracker.previousFrame = CheckoutCategory.this;
        MenAccessories CateTwo = new MenAccessories();
        CateTwo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenAccessoriesMouseClicked

    private void WomenAccessoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WomenAccessoriesMouseClicked
         NavigationTracker.previousFrame = CheckoutCategory.this;
        WomenAccessories CateThree = new WomenAccessories();
        CateThree.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WomenAccessoriesMouseClicked

    private void FoodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodsMouseClicked
         NavigationTracker.previousFrame = CheckoutCategory.this;
        Foods CateFour = new Foods();
        CateFour.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FoodsMouseClicked

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
            java.util.logging.Logger.getLogger(CheckoutCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckoutCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckoutCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckoutCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CheckoutCategory().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JLabel CrossLabel;
    private javax.swing.JLabel ElectronicAppliances;
    private javax.swing.JButton Electronics;
    private javax.swing.JButton Foods;
    private javax.swing.JLabel FoodsTxt;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JButton MenAccessories;
    private javax.swing.JLabel MenAccessoriesTxt;
    private javax.swing.JButton WomenAccessories;
    private javax.swing.JLabel WomenAccessoriesTxt;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}