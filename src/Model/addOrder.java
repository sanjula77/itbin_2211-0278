/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class addOrder {

    Connection con = null;
    PreparedStatement pst = null;

    public void order(String name, int number, String email, String product, int quantity) {
        con = DBconnector.conn();

        try {
            // Start a transaction
            con.setAutoCommit(false);

            // Insert the new order
            String sqlInsertOrder = "INSERT INTO orderDetails(customerName, contactNumber, email, product, quantity) VALUES (?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlInsertOrder);
            pst.setString(1, name);
            pst.setInt(2, number);
            pst.setString(3, email);
            pst.setString(4, product);
            pst.setInt(5, quantity);
            pst.executeUpdate();

            // Update the product quantity
            String sqlUpdateProduct = "UPDATE products SET quantity = quantity - ? WHERE name = ?";
            pst = con.prepareStatement(sqlUpdateProduct);
            pst.setInt(1, quantity);
            pst.setString(2, product);
            pst.executeUpdate();

            // Commit the transaction
            con.commit();
            JOptionPane.showMessageDialog(null, "Order placed successfully");

            // Check for low stock after placing the order
            checkLowStock();

        } catch (SQLException e) {
            try {
                // Rollback transaction if there is an error
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                // Close the resources
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void checkLowStock() {
        try {
            con = DBconnector.conn();
            String sql = "SELECT name, quantity FROM products WHERE quantity < 20";
            pst = con.prepareStatement(sql);
            ResultSet lowStockRs = pst.executeQuery();
            while (lowStockRs.next()) {
                String productName = lowStockRs.getString("name");
                int quantity = lowStockRs.getInt("quantity");
                JOptionPane.showMessageDialog(null, "Stock is low for " + productName + " (" + quantity + " units). Please contact suppliers.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                // Close the resources
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
