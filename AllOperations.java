/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author VINOD KUMAR
 */
public class AllOperations {
    int n;
    static Boolean check1;
    User[] user;
    User user1;
    String email,pwd;
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r);
  public void registerUser() throws IOException
 {
    
    System.out.println("Enter the number of user you want to register");
    n=Integer.parseInt(br.readLine());
    user=new User[n]; 
 
    for(int i=0;i<user.length;i++)
    
    {
       System.out.println("Enter email");
         email=br.readLine();
       
       
        System.out.println("Enter password");
        pwd=br.readLine();   
         user1=new User(pwd,email);
        System.out.println("User registered successfully");
        user[i]=user1;
      }
  for(int j=0;j<user.length;j++)
    {
        System.out.println(user[j]);
    }
   }
 public void login() throws IOException
 {
     System.out.println("Enter email");
     email=br.readLine();
     System.out.println("Enter password");
     pwd=br.readLine();
     for(int p=0;p<user.length;p++)
     if((email.equals(user[p].email))&&(pwd.equals(user[p].pwd)))
     {
        System.out.println("Logged in successfully");
        check1=true;
     }
     else
     {
         System.out.println("Enter valid login credentials ");
         check1=false;
         
     }
 }
}
    
 

