/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class updateController {
    
    public void update(int id, float price, int quntity, String description){
       
        new Model.updateData().update(id, price, quntity, description);
    }
    
}
