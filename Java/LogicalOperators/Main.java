package LogicalOperators;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// logical operators = used to connect two or more expressions
		//
		//			&& = (AND) both conditions must be true
		//			|| = (OR) either conditions must be true
		//			! = (Not) reverses boolean value of condition
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! press q or Q to quit");
		String response = scanner.next();
		
		if(response.equals("q")||response.equals("q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game *pew pew*");
		}

		scanner.close();

	}

}

