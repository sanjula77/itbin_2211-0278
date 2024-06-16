package View;


import Model.tableLoad;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class ViewProducts extends javax.swing.JFrame {

    public ViewProducts() {
        initComponents();
        loadTableData();
    }
    
    public void search(){
        String srch = searchFLD.getText();
        tableLoad tableLoader = new tableLoad();
        ResultSet resultSet = tableLoader.searchData(srch);
        tableSearch(resultSet);
    }
    
    public void tableSearch(ResultSet result) {
        table1.setModel(DbUtils.resultSetToTableModel(result));
    }
  
 public void table(ResultSet result) {
        table1.setModel(DbUtils.resultSetToTableModel(result));
    }
private void loadTableData() {
        // Create an instance of tableLoad and fetch data
        tableLoad tableLoader = new tableLoad();
        ResultSet resultSet = tableLoader.fetchTableData();
        // Call the table method to populate the JTable
        table(resultSet);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new GradientPanel(204, 204, 255, 204, 204, 255);
        ;
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchFLD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Quntity", "Category", "Description"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 18, 746, 370));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Search products ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 150, 30));

        searchFLD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFLDKeyReleased(evt);
            }
        });
        jPanel1.add(searchFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 436, 310, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Products obj  = new Products();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFLDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFLDKeyReleased
        search();
    }//GEN-LAST:event_searchFLDKeyReleased

    public static void main(String args[]) {
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchFLD;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
