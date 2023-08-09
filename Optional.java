/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Optional {
    static void optional_menu() throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r);
   AllOperations obj=new AllOperations();
       int choice;
       while(true){
       Main_menu.Main_menu_method();
       System.out.println("Enter your choice");
       choice=Integer.parseInt(br.readLine());
       switch(choice)
       {
           case 1: if(choice==1)
       {
           obj.registerUser();
       }
           case 2: if(choice==2)
           {
               obj.login();
               if(AllOperations.check1)
               {
               while(true)
               {   OperationWindow.OperationWindow_method();
                   System.out.println("Enter your choice");
                   int opwchoice=Integer.parseInt(br.readLine());
                   switch(opwchoice)
                   {
                       case 1: if(opwchoice==1)
                       {
                           while(true){
                           EvenOddOPW.evenOddOPW();
                           System.out.println("Enter your choice");
                           int EvenOddOPW_choice=Integer.parseInt(br.readLine());
                           switch(EvenOddOPW_choice)
                           {
                               case 1: if(EvenOddOPW_choice==1)
                               {
                               EvenOddOPW.forrange();
                               }
                               case 2: if(EvenOddOPW_choice==2)
                               {
                                   EvenOddOPW.forsingle();
                               }
                               
                               case 3:
                            { 
                               
                              OperationWindow.OperationWindow_method();
                              System.out.println("Enter your choice");
                              opwchoice=Integer.parseInt(br.readLine());
                           }
                         }
                           
                           
                  }
                   }
                       case 2: if(opwchoice==2)
                       {
                        while(true)
                        {
                            Prime_number_class.Prime_no_menu();
                            System.out.println("Enter your choice");
                           int Prime_no_OPW_choice=Integer.parseInt(br.readLine());
                           switch(Prime_no_OPW_choice)
                           {
                               case 1: if(Prime_no_OPW_choice==1)
                               {
                                  Prime_number_class.twoPrime_no();
                               }
                               case 2: if(Prime_no_OPW_choice==2)
                               {
                                   Prime_number_class.singlePrime_no();
                               }
                               case 3: if(Prime_no_OPW_choice==3)
                               {
                               OperationWindow.OperationWindow_method();
                              System.out.println("Enter your choice");
                              opwchoice=Integer.parseInt(br.readLine());
                                   
                               }
                           }
                        }
                       }
                       case 3: if(opwchoice==3)
                       {
                           while(true){
                           Armstrong_no_class.Arm_menu();
                           System.out.println("Enter your choice");
                           int Arm_choice=Integer.parseInt(br.readLine());
                           switch(Arm_choice){
                               case 1: if(Arm_choice==1)
                               {
                                   Armstrong_no_class.check_Armstrong();
                               }
                               case 2: if(Arm_choice==2)
                               {
                                   Armstrong_no_class.two_Arm_number();
                               }
                               case 3: if(Arm_choice==3)
                               {
                              OperationWindow.OperationWindow_method();
                              System.out.println("Enter your choice");
                              opwchoice=Integer.parseInt(br.readLine());
                               }
                           }
                           }
                       }
                       case 4: if(opwchoice==4)
                       {
                           while(true)
                           {
                            Factorial_func.fact_menu();
                            System.out.println("Enter your choice");
                           int fact_choice=Integer.parseInt(br.readLine());
                           switch(fact_choice)
                           {
                               case 1: if(fact_choice==1) 
                               {
                                   Factorial_func.one_fact();
                               }
                                case 2: if(fact_choice==2) 
                               {
                                   Factorial_func.two_fact_number();
                               }
                                 case 3: if(fact_choice==3) 
                               {
                               OperationWindow.OperationWindow_method();
                              System.out.println("Enter your choice");
                              opwchoice=Integer.parseInt(br.readLine());
                              }
                           }
                           }
                       }
                       case 5: if(opwchoice==5)
                       {
                           while(true)
                           {
                               Palindrome_func.Palindrome_menu();
                               System.out.println("Enter your choice");
                           int pali_choice=Integer.parseInt(br.readLine());
                           switch(pali_choice)
                           {
                               case 1: if(pali_choice==1)
                               {
                                   Palindrome_func.one_Pali();
                               }
                               case 2: if(pali_choice==2)
                               {
                                   Palindrome_func.two_pali_number();
                               }
                               case 3: if(pali_choice==3) 
                               {
                               OperationWindow.OperationWindow_method();
                              System.out.println("Enter your choice");
                              opwchoice=Integer.parseInt(br.readLine());
                              }
                           }
                        }
                    }
                   
                      case 6: if(opwchoice==6)
                      {
                          System.out.println("Exited from operation window ");
                          System.exit(0);
                         
                       }  
                   }
               }
            }
         }  
       
           case 3: if (choice==3)
           
               System.exit(0);
        }}
}
    }
    

