/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

/*
package Controller;

import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class orderLoadController {

    public void order(ResultSet resultSet, JTable table, JLabel totalLabel) {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data

            float totalSum = 0;

            while (resultSet.next()) {
                String customerName = resultSet.getString("customerName");
                String contactNumber = resultSet.getString("contactNumber");
                String product = resultSet.getString("product");
                int quantity = resultSet.getInt("quantity");
                float pricePerUnit = resultSet.getFloat("price");
                float totalPrice = resultSet.getFloat("totalPrice");

                totalSum += totalPrice;

                model.addRow(new Object[]{customerName, contactNumber, product, quantity, pricePerUnit, totalPrice});
            }

            totalLabel.setText("Total Sum: " + totalSum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
/*
package Controller;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class orderLoadController {

    public void order(ResultSet resultSet, JTable table) {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data

            while (resultSet.next()) {
                String customerName = resultSet.getString("customerName");
                String contactNumber = resultSet.getString("contactNumber");
                String product = resultSet.getString("product");
                int quantity = resultSet.getInt("quantity");
                float pricePerUnit = resultSet.getFloat("price");
                float totalPrice = resultSet.getFloat("totalPrice");

                model.addRow(new Object[]{customerName, contactNumber, product, quantity, pricePerUnit, totalPrice});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
/*
package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class orderLoadController {

    public void order(ResultSet resultSet, JTable table) {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data

            while (resultSet.next()) {
                String customerName = resultSet.getString("customerName");
                String contactNumber = resultSet.getString("contactNumber");
                String product = resultSet.getString("product");
                int quantity = resultSet.getInt("quantity");
                float pricePerUnit = resultSet.getFloat("price");
                float totalPrice = resultSet.getFloat("totalPrice");

                model.addRow(new Object[]{customerName, contactNumber, product, quantity, pricePerUnit, totalPrice});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
}
*/
