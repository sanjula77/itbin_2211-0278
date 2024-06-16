/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
/**
 *
 * @author ASUS
 */
public class deleteControl {
    
    public void delete(int id){
        
        new Model.deleteProduct().delete(id);
        
    }
    
     public void deleteOrder(int id){
        
        new Model.deleteProduct().deleteOrder(id);
        
    }
}
