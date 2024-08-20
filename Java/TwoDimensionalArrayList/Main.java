package TwoDimensionalArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//2D ArrayList = a dynamic list of lists
		//You can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		ArrayList<String> bakeryList = new ArrayList<>();
		
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Donuts");
		
		ArrayList<String> produceList = new ArrayList<>();
		
		produceList.add("Tomatoes");
		produceList.add("Zucchini");
		produceList.add("Peppers");
		
		ArrayList<String> drinksList = new ArrayList<>();
		
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(2).get(1));

	}

}
