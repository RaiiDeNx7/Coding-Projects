package WeeklyNetPay;

import java.util.Scanner;
/*
Programmer: Hunter Smith
Class: CSC 201 R01B
Assignment: Project 1
Date: 2/14/2022
Description: Design a program to displays an employee’s weekly net pay. The user will enter 
the employee’s pay rate and hours worked. The program will first calculate the 
weekly gross pay. Please note that the employee might have worked overtime. 
You can assume that overtime is calculated using time and a half and that a 
normal work week is 40 hours. From the gross pay, the program will then need 
to subtract the appropriate taxes: FWT, FICA and state. For testing and design 
purposes, you can use 20% as the FWT tax rate for Federal Withholding Tax, 8% 
as the FICA tax rate for the Social Security and Medicare taxes, and 4% for the 
state taxes. Please note that these rates could change in the future and you want 
the program to be easy to maintain.
*/

public class Main {
   public static void main(String [] args) {
      
      Scanner input = new Scanner(System.in);

      System.out.print("Please enter the amount of hours worked in a week:");
      int weeklyHours = input.nextInt();

      System.out.print("Please enter your hourly pay rate:");
      float payRate = input.nextFloat();
      float grossPay;
     
        if (weeklyHours > 40)  {
        grossPay = (payRate * 40)+ ((weeklyHours - 40) * (payRate * 1.5F));
        }
        else {
        grossPay = (weeklyHours * payRate);
        }
           float FWT = (grossPay * .2F);
           float FICA = (grossPay * .08F);
           float stateTax = (grossPay * .04F);
           
           float netPay = (grossPay - FWT - FICA - stateTax);

           System.out.print("Your weekly net pay is:" + netPay);

        input.close();
    }
}
