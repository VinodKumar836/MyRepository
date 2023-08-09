/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagement;

/**
 *
 * @author VINOD KUMAR
 */
public class User {
    
    String pwd;
    String email;
     
    
  
    public User( String pwd, String email) {
       
        this.pwd = pwd;
        this.email = email;
        
        
    }
    

    @Override
    public String toString() {
        return "" + "email=" + email + ",pwd=" + pwd + ")";
    }
   
}
