/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Controller;

/**
 *
 * @author ASUS
 */
//public class loginController {
    
//}
package Controller;

import Model.loginDetails;

public class loginController {
    
    public boolean validateLogin(String userName, String password) {
        loginDetails details = new loginDetails();
        return details.check(userName, password);
    }
}
