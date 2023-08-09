/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagement;
import java.util.*;

/**
 *
 * @author VINOD KUMAR
 */
public class Prime_number_class 
{
    static Scanner sc=new Scanner(System.in);
 static void Prime_no_menu()
 {
     System.out.println("****************PRIME NUMBER MENU************** ");
     System.out.println("1. Print prime number between  two values ");
     System.out.println("2. Check Whether a number is prime or not");
     System.out.println("3. Exit from prime number menu");
 }
 
 static void twoPrime_no()
{
    
    System.out.println("Enter the lower limit number");
    int P_ll_no=sc.nextInt();
    System.out.println("Enter the upper limit number");
    int P_ul_no=sc.nextInt();
    for(int i=P_ll_no;i<=P_ul_no;i++)
    {
       if(isPrime(i))
       {
           System.out.println(i+"");
       }
    }
    
}   
 public static boolean isPrime(int num)
 {
     if(num<=1)
     {
         return false;
     }
     for(int i=2;i<=Math.sqrt(num);i++)
     {
         if(num%i==0){
             return false;
         }
     }
     return true;
 }
   static void singlePrime_no()
   {
        int j=0;
     
        System.out.println("Enter your number");
        int number=sc.nextInt();
        if((number==0)||(number==1))
        {
            System.out.println("Your string is not prime");
        }
        else
        {
            for(int i=1;i<=number;i++)
            {
                j=number%i;
            }
            if(j==0)
            {
                System.out.println("The number is not prime");
            }
            else
            {
                System.out.println("The number is prime");
            }
    
} }}

