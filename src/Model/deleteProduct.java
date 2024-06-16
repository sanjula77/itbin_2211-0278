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
public class deleteProduct {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void delete(int id){
        
        con = DBconnector.conn();
        
        try{
            String sqlquery = "DELETE FROM products WHERE id = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (Exception e){
          //  JOptionPane.showMessageDialog(null, "DELETED");
        }
    }
    
      public void deleteOrder(int id){
        
        con = DBconnector.conn();
        
        try{
            String sqlquery = "DELETE FROM orderdetails WHERE orderID = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (Exception e){
          //  JOptionPane.showMessageDialog(null, "DELETED");
        }
    }
}
