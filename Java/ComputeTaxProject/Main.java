package ComputeTaxProject;

import java.util.Scanner;
/*
Programmer: Hunter Smith
Date: 4/26/2022

Program: Write a program that allows a tax accountant to compute personal income tax.  
 Your program will ask for a filing status (0 for single, 1 for married filing jointly, 2 for married filing 
separately, 3 Head of household) and a taxable income.  The program will compute the tax.  The program should run and allow for as many entries as the tax accountant wants to enter.  It will 
process the personal income tax for each person as well as calculate the average income tax for all the 
individuals entered.  The program will stop when a user enters -1. Use methods for each of the tax status 
calculations. 
 */
public class Main {
	public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
		double taxSum = 0;
                double taxCount = 0; 
                int personNumber = 0;
		
		System.out.print("Enter a Filing Status:  (-1 to quit, 0 for Single Status, 1 for Married/Joint & Widow(er), 2 for Married/Seperate, or 3 for Head of Household)");
		int status = input.nextInt();
                    while (status != -1) {
                        System.out.print("Please enter your taxable income");
                        double income = input.nextDouble();
                        double tax = 0;
                            if (status == 0)              //Single Tax Bracket//
                              tax = calcStatus0(income);
                            else if (status == 1)
                              tax = calcStatus1(income);                  //Married/Joint & Widow(er) Tax Bracket//
                            else if (status == 2)                   //Married/Seperate Tax Bracket//
                              tax = calcStatus2(income);
                            else if (status == 3)                          //Head of Household Tax Bracket//
                              tax = calcStatus3(income);
                     
                          personNumber++;
                          taxSum += tax;  //Add tax to a sum to be displayed and used in calculations//
                          taxCount += 1;
                          System.out.println("Person #" + personNumber + "'s personal income is: " + tax);

                        System.out.println("Please Enter a Filing Status:  (-1 to quit, 0 for Single Status, 1 for Married/Joint & Widow(er), 2 for Married/Seperate, or 3 for Head of Household)");
                        status = input.nextInt();
                    }

                double average = averageIncomeTax(taxSum, taxCount);

                System.out.println("A total of " + personNumber + " people were entered");
                System.out.println("The total amount of tax is: " + taxSum);
                System.out.println("The average income tax is: " + average);
                System.out.println("Have a nice day!");

                input.close();

	}
	
      
		
	public static double calcStatus0(double income){                    //Single Tax Bracket//
                double tax = 0;
                    if (income <= 9950)
                        tax = income * .10;
                    else if (income <= 40525)
                        tax = 9950 * .10 + (income - 9950) * .12;
                    else if (income <= 86375)
			tax = 9950 * .10 + (40525 - 9950) * .12 + (income - 40525) *.22;
                    else if (income <= 164925)
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (income - 86375) * .24;
                    else if (income <=209425)
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (164925 - 86375) * .24 + (income - 164925) * .32;
                    else if (income <= 523600)
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (164925 - 86375) * .24 + (209425 - 164925) * .32 + (income - 209425) * .35;
                    else
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (164925 - 86375) * .24 + (209425 - 164925) * .32 + (523600 - 209425) * .35 + (income - 523600) * .37;
                  return tax;
	}	


        public static double calcStatus1(double income){        //Married/Joint & Widow(er) Tax Bracket//
		double tax = 0;     
                    if (income <= 19900)
                        tax = income * .10;
                    else if (income <=  81050)
                        tax = 19900 * .10 + (income - 19900) * .12;
                    else if (income <= 172750)
			tax = 19900 * .10 + (81050 - 19900) * .12 + (income - 81050) * .22;
                    else if (income <= 329850)
                        tax = 19900 * .10 + (81050 - 19900) * .12 + (172750 - 81050) * .22 + (income - 172750) * .24;
                    else if (income <= 418850)
                        tax = 19900 * .10 + (81050 - 19900) * .12 + (172750 - 81050) * .22 + (329850 - 172750) * .24 + (income - 329850) * .32;
                    else if (income <= 628300)
                        tax = 19900 * .10 + (81050 - 19900) * .12 + (172750 - 81050) * .22 + (329850 - 172750) * .24 + (418850 - 329850) * .32 + (income - 418850) * .35;
                    else 
                        tax = 19900 * .10 + (81050 - 19900) * .12 + (172750 - 81050) * .22 + (329850 - 172750) * .24 + (418850 - 329850) * .32 + (628300 - 418850) * .35 + (income - 628300) * .37;
                  return tax;
	}	
        public static double calcStatus2(double income){      //Married/Seperate Tax Bracket//
		double tax = 0;
                    if (income <= 9950)
			tax = income * .10;
                    else if (income <= 40525)
			tax = 9950 * .10 + (income - 9950) * .12;
                    else if (income <= 86375)
			tax = 9950 * .10 + (40525 - 9950) * .12 + (income - 40525) * .22;
                    else if (income <= 164925)
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (income - 86375) * .24;
                    else if (income <= 209425)
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (164925 - 86375) * .24 + (income - 164925) * .32;
                    else if (income <= 314150)
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (164925 - 86375) * .24 + (209425 - 164925) * .32 + (income - 209425) * .35;
                    else 
                        tax = 9950 * .10 + (40525 - 9950) * .12 + (86375 - 40525) * .22 + (164925 - 86375) * .24 + (209425 - 164925) * .32 + (523600 - 209425) * .35 + (income - 314150) * .37;
                  return tax;
	}	
        public static double calcStatus3(double income){     //Head of Household Tax Bracket//
		double tax = 0;
                    if (income <= 14200)
                        tax = income * .10;
                    else if (income <= 54200)
			tax = 14200 * .10 + (income - 14200) * .12;
                    else if (income <= 86350)
                        tax = 14200 * .10 + (54200 - 14200) * .12 + (income - 54200) * .22;
                    else if (income <= 164900)
                        tax = 14200 * .10 + (54200 - 14200) * .12 + (86350 - 54200) * .22 + (income - 86350) * .24;
                    else if (income <= 209400)
                        tax = 14200 * .10 + (54200 - 14200) * .12 + (86350 - 54200) * .22 + (164900 - 86350) * .24 + (income - 164900) * .32;
                    else if (income <= 523600)
                        tax = 14200 * .10 + (54200 - 14200) * .12 + (86350 - 54200) * .22 + (164900 - 86350) * .24 + (209400 - 164900) * .32 + (income - 209400) * .35;
                    else 
                        tax = 14200 * .10 + (54200 - 14200) * .12 + (86350 - 54200) * .22 + (164900 - 86350) * .24 + (209400 - 164900) * .32 + (523600 - 209425) * .35 + (income - 523600) * .37;	
	    return tax;
	}		 
  
        public static double averageIncomeTax (double taxSum, double taxCount) {
            double average;
            average = (taxSum / taxCount);
            return average;
}   		
}
