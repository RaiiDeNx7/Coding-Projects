package HigherLower;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		
		if (number > 0)
			System.out.println("The entered number is greater than zero");
		if (number < 0)
			System.out.println("The entered number is less than zero");
		else
			System.out.println("The entered number is zero");
		
        input.close();

	}

}
