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
public class Armstrong_no_class 
{
   static  Scanner sc=new Scanner(System.in);
    static public void Arm_menu()
    {
        System.out.println("**************ARMSTRONG NUMBER MENU***************");
        System.out.println("1. Find whether a number is armstrong or not ");
        System.out.println("2. Find armstrong number between two numbers");
        System.out.println("3. Exit from armstrong number menu");
    }
    static public boolean isArmstrong(int number)
    {
        int original_number=number;
        int numDigits=(int)Math.log10(number)+1;
        int total=0;
        while(number>0)
        {
            int digit=number%10;
            total+=Math.pow(digit,numDigits);
            number/=10;
        }
        return total==original_number;
    }
    static public void check_Armstrong()
    {
        System.out.println("Enter a number to check whether armstrong or not");
        int arm_number=sc.nextInt();
        if(isArmstrong(arm_number))
        {
            System.out.println(arm_number+" is an armstrong number");
        }
        else
        {
            System.out.println(arm_number+" is not an armstrong number");
        }
    }
    static public void two_Arm_number()
    {
        System.out.println("Enter lower limit number");
        int l_arm_number=sc.nextInt();
        System.out.println("Enter upper limit number");
        int u_arm_number=sc.nextInt();
        for(int i=l_arm_number;i<=u_arm_number;i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i+"");
            }
            
        }
        
    }
    
}
