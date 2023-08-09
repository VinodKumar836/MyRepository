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
public class Palindrome_func {
   static Scanner sc=new Scanner(System.in);
    public static void Palindrome_menu()
    {
        System.out.println("*****************PALINDROME NUMBER MENU ***********************");
        System.out.println("1. Check whether the number is palindrome or not");
        System.out.println("2. Find palindrome numbers between two values");
        System.out.println("3. Exit from palindrome number menu");
    }
    public static void one_Pali()
    {
        System.out.println("Enter the number ");
        int pali_number=sc.nextInt();
        if(isPalindrome(pali_number))
        {
            System.out.println(pali_number+" is palindrome");
        }
        else
        {
            System.out.println(pali_number+" is not palindrome");
        }
    }
    public static boolean isPalindrome(int number)
    {
        int original_number=number;
        int reversed_number=0;
        while(number>0)
        {
            int digit=number%10;
            reversed_number=reversed_number*10+digit;
            number/=10;
        }
    
    return original_number==reversed_number;
    }
    static public void two_pali_number()
    {
        System.out.println("Enter lower limit number");
        int l_pali_number=sc.nextInt();
        System.out.println("Enter upper limit number");
        int u_pali_number=sc.nextInt();
        System.out.println("The palindrome between "+l_pali_number+"and "+u_pali_number+" are as");
        for(int i=l_pali_number;i<=u_pali_number;i++)
        {   
        if(isPalindrome(i))
        System.out.println(i);
        }  
    }
}
