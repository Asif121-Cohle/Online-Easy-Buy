/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author HP
 */
public class PurchaseDetails extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseDetails
     */
    public PurchaseDetails() {
        initComponents();
        adjustTableProperties();
    
    }
   private void adjustTableProperties()
   {
        //jTable2.setRowHeight(30);
        int[] columnWidths ={100,150,120,80,80,100,120,120,150,100};
        for(int i=0;i< columnWidths.length;i++)
        {
            TableColumn column = jTable2.getColumnModel().getColumn(i);
            column.setPreferredWidth(columnWidths[i]);
        }
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CrossLabel = new javax.swing.JLabel();
        SearchProductTextField = new javax.swing.JTextField();
        PurchaseIdTextField = new javax.swing.JTextField();
        ReceivedDateTextField = new javax.swing.JTextField();
        CurrentDateTextField = new javax.swing.JTextField();
        BtnRefund = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BackLabel = new javax.swing.JLabel();
        LogoutLabel = new javax.swing.JLabel();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Purchase ID", "Quantity", "Price", "Total", "Purchase Date", "Received Date", "Supplier Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 530, 360));

        CrossLabel.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        CrossLabel.setForeground(new java.awt.Color(255, 255, 255));
        CrossLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrossLabel.setText("x");
        CrossLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossLabelMouseClicked(evt);
            }
        });
        jPanel1.add(CrossLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 30));

        SearchProductTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchProductTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(SearchProductTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 315, 28));
        jPanel1.add(PurchaseIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 28));
        jPanel1.add(ReceivedDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 28));
        jPanel1.add(CurrentDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 28));

        BtnRefund.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnRefund.setForeground(new java.awt.Color(0, 102, 102));
        BtnRefund.setText("Refund");
        jPanel1.add(BtnRefund, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 37));

        BtnClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnClear.setForeground(new java.awt.Color(0, 102, 102));
        BtnClear.setText("CLEAR");
        jPanel1.add(BtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 34));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchase ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Received Date:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current Date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search Product");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 114, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 160, 40));

        BackLabel.setText("jLabel7");
        BackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabelMouseClicked(evt);
            }
        });
        jPanel1.add(BackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        LogoutLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LogoutLabel.setForeground(new java.awt.Color(0, 102, 102));
        LogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CART.png"))); // NOI18N
        LogoutLabel.setText("Logout");
        LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabelMouseClicked(evt);
            }
        });
        jPanel1.add(LogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CrossLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossLabelMouseClicked
        setVisible(false);
        MainView.jPanel7.setBackground(primaryColor);
        MainView.jPanel11.setBackground(primaryColor);
        MainView.PurchaseDetails.setForeground(textPrimaryColor);
        MainView.jLabel8.setVisible(true);
        MainView.jLabel20.setVisible(false);
    }//GEN-LAST:event_CrossLabelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i=0;i<=1;i+=0.1)
        {
            String s = ""+ i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try{
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(PurchaseDetails.class.getName()).log(Level.SEVERE, null, ex);
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


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchProductTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchProductTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnRefund;
    private javax.swing.JLabel CrossLabel;
    private javax.swing.JTextField CurrentDateTextField;
    private javax.swing.JLabel LogoutLabel;
    private javax.swing.JTextField PurchaseIdTextField;
    private javax.swing.JTextField ReceivedDateTextField;
    private javax.swing.JTextField SearchProductTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
