/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JPanel;
/**
 *
 * @author ASUS
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
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

        jPanel1 = new GradientPanel(255, 255, 255, 255, 255, 255);//102, 153, 255, 204, 153, 255);
    jPanel4 = new RoundedPanel();
    jLabel3 = new javax.swing.JLabel();
    jPanel5 = new RoundedPanel();
    jLabel4 = new javax.swing.JLabel();
    jPanel6 = new RoundedPanel();
    jLabel5 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jPanel7 = new RoundedPanel();
    jLabel2 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel4.setBackground(new java.awt.Color(176, 196, 222));
    jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jPanel4MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jPanel4MouseExited(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jPanel4MousePressed(evt);
        }
    });
    jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(51, 51, 51));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("View Product");
    jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

    jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 210, 40));

    jPanel5.setBackground(new java.awt.Color(176, 196, 222));
    jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jPanel5MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jPanel5MouseExited(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jPanel5MousePressed(evt);
        }
    });
    jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(51, 51, 51));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("Update  Product");
    jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 210, 40));

    jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 40));

    jPanel6.setBackground(new java.awt.Color(176, 196, 222));
    jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jPanel6MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jPanel6MouseExited(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jPanel6MousePressed(evt);
        }
    });
    jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(51, 51, 51));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("Delete Product");
    jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

    jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 210, 40));

    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jButton1.setForeground(new java.awt.Color(51, 51, 51));
    jButton1.setText("Back");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

    jPanel7.setBackground(new java.awt.Color(176, 196, 222));
    jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jPanel7MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jPanel7MouseExited(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jPanel7MousePressed(evt);
        }
    });
    jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(51, 51, 51));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Add products");
    jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

    jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 210, 40));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 490));

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pictures/woman-wearing-face-mask.jpg"))); // NOI18N
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 490));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 550, 490));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        resetColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
         new ViewProducts().show();
        this.dispose();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        setColor(jPanel5);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
       resetColor(jPanel5);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        new UpdateProduct().show();
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        setColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
         resetColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        new DeleteProducts().show();
        this.dispose();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomePage obj = new HomePage();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        setColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        resetColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        new AddProducts().show();
        this.dispose();
    }//GEN-LAST:event_jPanel7MousePressed

    
    
    
     public void setColor(JPanel panel) {
        if (panel instanceof RoundedPanel) {
            ((RoundedPanel) panel).setGradientColors(new java.awt.Color(211, 211, 211), new java.awt.Color(211, 211, 211));
        } else {
            panel.setBackground(new java.awt.Color(211, 211, 211));
        }
    }

   public void resetColor(JPanel panel) {
        if (panel instanceof RoundedPanel) {
            ((RoundedPanel) panel).setGradientColors(new java.awt.Color(176,196,222), new java.awt.Color(176,196,222)); // Default gradient colors
        } else {
            panel.setBackground(new java.awt.Color(176,196,222));
        }
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
