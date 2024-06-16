/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DBconnector {
    
     public static Connection conn(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/SuperMarketDb";
            String user = "admin";
            String passworld = "Sanjula@4858";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, passworld);
            return conn;
            
        }catch(SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
       return null; 
    }
}
