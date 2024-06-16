/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class tableLoadController {
   
    public void tableDataControl(ResultSet result){
        new View.ViewProducts().table(result);
    }
  
    public void tableSearchControl(ResultSet result){
        new View.ViewProducts().tableSearch(result);
    }
}
