
package View;

import javax.swing.JOptionPane;
import Controller.addProductController;

public class AddProducts extends javax.swing.JFrame {

    
    public AddProducts() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = 
        new GradientPanel(204, 204, 255, 204, 255, 153);
        ;
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameFLD = new javax.swing.JTextField();
        priceFLD = new javax.swing.JTextField();
        quantityFLD = new javax.swing.JTextField();
        descriptionFLD = new javax.swing.JTextField();
        clearBTN = new javax.swing.JButton();
        insertBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        categoryBOX = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Price    ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 203, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Description ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 110, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Name  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Category  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 110, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Quantity  ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, 33));

        nameFLD.setBackground(new java.awt.Color(176, 196, 222));
        jPanel1.add(nameFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 380, 30));

        priceFLD.setBackground(new java.awt.Color(176, 196, 222));
        jPanel1.add(priceFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 380, 30));

        quantityFLD.setBackground(new java.awt.Color(176, 196, 222));
        jPanel1.add(quantityFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 380, 30));

        descriptionFLD.setBackground(new java.awt.Color(176, 196, 222));
        jPanel1.add(descriptionFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 380, 30));

        clearBTN.setText("Clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        jPanel1.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        insertBTN.setText("Insert");
        insertBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBTNActionPerformed(evt);
            }
        });
        jPanel1.add(insertBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        categoryBOX.setBackground(new java.awt.Color(176, 196, 222));
        categoryBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Vegetables", "Meat", "Seafood", "Bakery", "Dairy", "Beverages" }));
        jPanel1.add(categoryBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Products obj  = new Products();
        obj.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
     
      //  String idText = idFLD.getText();
        String name = nameFLD.getText();
        String priceText = priceFLD.getText();
        String quantityText = quantityFLD.getText();
        String category = (String) categoryBOX.getSelectedItem();
        String description = descriptionFLD.getText();

        if (/*idText.isEmpty() || */name.isEmpty() || priceText.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
           // int id = Integer.parseInt(idText);
            float price = Float.parseFloat(priceText);
            int quantity = Integer.parseInt(quantityText);

            addProductController controller = new addProductController();
            controller.products(/*id,*/ name, price, quantity, category, description);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_insertBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed

        nameFLD.setText("");
        priceFLD.setText("");
        quantityFLD.setText("");
        categoryBOX.setSelectedIndex(-1);
        descriptionFLD.setText("");
        


        // TODO add your handling code here:
    }//GEN-LAST:event_clearBTNActionPerformed

    
    public static void main(String args[]) {
              
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducts().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryBOX;
    private javax.swing.JButton clearBTN;
    private javax.swing.JTextField descriptionFLD;
    private javax.swing.JButton insertBTN;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameFLD;
    private javax.swing.JTextField priceFLD;
    private javax.swing.JTextField quantityFLD;
    // End of variables declaration//GEN-END:variables

    
}

