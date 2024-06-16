/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ASUS
 */
public class orderController {
    
    public void orders(String name, int number, String email, String product, int quantity){
        new Model.addOrder().order(name, number, email, product, quantity);
    }   
}
