/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class updateData {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int id, float price, int quntity, String description){
        
        con = DBconnector.conn();
        
        try {
            String sqlquery = "UPDATE products SET price = '"+price+"', quantity = '"+quntity+"', description = '"+description+"' WHERE id = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPDATE UNSUCCESSFULY");
        }
    }
}
