package Model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class addProduct {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(/*int id,*/ String name, float price, int quantity, String category, String description){
   con = DBconnector.conn();
        
        try {
            String sqlquery = "INSERT INTO products(name, price, quantity, description, category) VALUES (?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
           // pst.setInt(1, id);
            pst.setString(1, name);
            pst.setFloat(2, price);
            pst.setInt(3, quantity);
            pst.setString(4, description);
            pst.setString(5, category);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

