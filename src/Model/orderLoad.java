/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class orderLoad {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public orderLoad() {
        this.con = DBconnector.conn(); // Ensure this method returns a valid connection
    }

    public ResultSet fetchTableData() {
        try {
            String sql = "SELECT " +
                         "    o.orderID, " +
                         "    o.customerName, " +
                         "    o.contactNumber, " +
                         "    p.name AS product, " +
                         "    o.quantity, " +
                         "    p.price, " +
                         "    (o.quantity * p.price) AS totalPrice " +
                         "FROM " +
                         "    orderdetails o " +
                         "JOIN " +
                         "    products p ON o.product = p.name";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet searchData(String customerName) {
        try {
            String sql = "SELECT " +
                         "    o.orderID, " +
                         "    o.customerName, " +
                         "    o.contactNumber, " +
                         "    p.name AS product, " +
                         "    o.quantity, " +
                         "    p.price, " +
                         "    (o.quantity * p.price) AS totalPrice " +
                         "FROM " +
                         "    orderdetails o " +
                         "JOIN " +
                         "    products p ON o.product = p.name " +
                         "WHERE " +
                         "    o.customerName LIKE ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + customerName + "%");
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}
