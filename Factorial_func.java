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
public class Factorial_func 
{
    static Scanner sc=new Scanner(System.in);
    public static void fact_menu()
    {
        System.out.println("************FACTORIAL NUMBER MENU***************");
        System.out.println("1. Find factorial of a number");
        System.out.println("2. Find factorial of all numbers between two values");
        System.out.println("3. Exit from factorial number menu");
    }
    public static void one_fact()
    {
    System.out.println("Enter the number ");
    int fact_number=sc.nextInt();
    
    if(fact_number<0)
    {
        System.out.println("Negative number has no factorial");
    }
    else
    {
        long result=calc_fact(fact_number);
        System.out.println("The factorial of "+fact_number+" is"+result);
    }
    } 
    public static long calc_fact(int number)
    {
        if((number==0)||(number==1))
        { return 1;
        }
        else
        {
            return number*calc_fact(number-1);
        }
        }
     static public void two_fact_number()
    {
        System.out.println("Enter lower limit number");
        int l_fact_number=sc.nextInt();
        System.out.println("Enter upper limit number");
        int u_fact_number=sc.nextInt();
        for(int i=l_fact_number;i<=u_fact_number;i++)
        {   
        long a=calc_fact(i);
        System.out.println("Factotial of "+ i+" is "+a);
        }  
    }
}
