package VariableScope;

public class Main {

	//local = declared inside a mthod
	//			visible only to that method
	
	//global = declared outside a method, but within a class
	//			visible to all parts of a class
	public static void main(String [] args) {
	
	DiceRoller diceRoller = new DiceRoller(); //first roll

	diceRoller.roll(); //second roll
	}
}