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
public class EvenOddOPW
{ 
    static Scanner sc=new Scanner(System.in);
    static void evenOddOPW()
    {
        System.out.println("************EVEN-ODD MENU******************");
        System.out.println("1. Find even odd number within a range");
        System.out.println("2. Find whether a number is even or odd");
        System.out.println("3. Exit from even-odd menu");
    }
    static void forrange()
    {
        System.out.println("1. Enter the lower limit number");
        int  ll_no=sc.nextInt();
        System.out.println("1. Enter the upper limit number");
        int  ul_no=sc.nextInt();
        String even_no="";
        String odd_no="";
        String sx=" ";
        for(int i=ll_no;i<=ul_no;i++)
        {
            if(i%2==0)
            {
                even_no=even_no+sx+i;
            }
            else
            {
                odd_no=odd_no+sx+i;
            }
         }
        System.out.println("Even numbers are as: "+even_no);
        System.out.println("Odd numbers are as: "+odd_no);
    }
    static void forsingle()
    {
        System.out.println("Enter the number to be checked");
        int OPW_no=sc.nextInt();
        if(OPW_no%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is oddv");
        }
    }
}
