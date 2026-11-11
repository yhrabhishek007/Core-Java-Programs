package com.conditionalstatements;

import java.util.Scanner;

public class Market_Nsc {

	public static void main(String[] args) {

		System.out.println("Welcome to Rythu Bazar");

		Scanner sc = new Scanner(System.in);
		int total=0;
		String billItems = "";
		double discount = 0;

		String yn = "";
		do {
			System.out.println("Enter Category (Vegetables / Leafy Vegetable / Fruits):");
			String category = sc.nextLine();

			switch (category.toLowerCase()) {

			case "vegetables" -> {
				String yn1 = "";
				do {
					System.out.println("Enter Vegetable Name:");
					String item = sc.nextLine();

					switch (item.toLowerCase()) {

					case "tomato" ->{
						System.out.println("Tomato, 1kg Price: 50");
						total+=50;
						billItems+= "Tomato - Rs.50\n";
					}
					case "potato" ->{
						System.out.println("Potato, 1kg Price: 60");
						total+=60;
						billItems+= "Potato - Rs.60\n";


					}
					case "green chilli" -> {
						System.out.println("Green Chilli, 1/2kg Price: 30");
						total+=30;
						billItems+= "Green Chilli - Rs.30\n";


					}
					case "onions" ->{
						System.out.println("Onions, 1kg Price: 60");
						total+=60;
						billItems+= "Onions - Rs.60\n";


					}
					case "green peas" ->{
						System.out.println("Green Peas, 1kg Price: 80");
						total+=80;
						billItems+= "Green Peas - Rs.80\n";


					}
					case "brinjal" ->{
						System.out.println("Brinjal, 1kg Price: 45");
						total+=45;
						billItems+= "Brinjal - Rs.45\n";


					}
					case "lady finger" -> {
						System.out.println("Lady Finger, 1kg Price: 40");
						total+=40;
						billItems+= "Lady Finger - Rs.40\n";


					}
					case "bottle gourd" ->{
						System.out.println("Bottle Gourd, 1kg Price: 60");
						total+=60;
						billItems+= "Bottle gourd - Rs.60\n";


					}
					case "cucumber" ->{
						System.out.println("Cucumber, 1kg Price: 35");
						total+=35;
						billItems+= "Cucumber - Rs.35\n";


					}
					case "carrot" ->{
						System.out.println("Carrot, 1kg Price: 50");
						total+=50;
						billItems+= "Carrot - Rs.50\n";


					}
					case "cabbage" -> {
						System.out.println("Cabbage, 1kg Price: 30");
						total+=30;
						billItems+= "Cabbage - Rs.30\n";


					}
					case "cauliflower" ->{
						System.out.println("Cauliflower, 1kg Price: 40");
						total+=40;
						billItems+= "Cauliflower - Rs.40\n";


					}

					default -> System.out.println("Vegetable not in stock");
					}
					System.out.println("Do you want to continue:(yes/no)");
					yn1 = sc.nextLine();

				} while (yn1.equalsIgnoreCase("yes"));

			}

			case "leafy vegetable" -> {
				String yn1 = "";
				do {

					System.out.println("Enter Fresh Leafy Vegetable Name:");
					String item = sc.nextLine();

					switch (item.toLowerCase()) {

					case "coriander" ->{
						System.out.println("Coriander, 1 Bunch Price: 10");
						total+=10;
						billItems+= "Coriander - Rs.10\n";

					}
					case "spinach" ->{
						System.out.println("Spinach, 1 Bunch Price: 20");
						total+=20;
						billItems+= "Spinach - Rs.20\n";

					}
					case "mint" ->{
						System.out.println("Mint, 1 Bunch Price: 10");
						total+=10;
						billItems+= "Mint - Rs.10\n";

					}
					case "Methi" -> {
						System.out.println("Fenugreek (Methi), 1 Bunch Price: 20");
						total+=20;
						billItems+= "Methi - Rs.20\n";

					}
					case "curry leaves" ->{
						System.out.println("Curry Leaves, 1 Bunch Price: 10");
						total+=10;
						billItems+= "Curry leaves - Rs.10\n";

					}

					default -> System.out.println("Leafy Vegetable not in stock");
					}
					System.out.println("Do you want to continue:(y/n)");
					yn1 = sc.nextLine();

				} while (yn1.equalsIgnoreCase("yes"));
			}

			case "fruits" -> {
				String yn1 = "";
				do {

					System.out.println("Enter Fruit Name:");
					String item = sc.nextLine();

					switch (item.toLowerCase()) {

					case "apple" -> {
						System.out.println("Apple, 1kg Price: 120");
						total+=120;
						billItems+= "Apple - Rs.120\n";

					}
					case "banana" ->{
						System.out.println("Banana, 1 Dozen Price: 60");
						total+=60;
						billItems+= "Banana - Rs.60\n";

					}
					case "mango" ->{
						System.out.println("Mango, 1kg Price: 120");
						total+=120;
						billItems+= "Mango - Rs.120\n";

					}
					case "orange" -> {
						System.out.println("Orange, 1kg Price: 50");
						total+=50;
						billItems+= "Orange - Rs.50\n";

					}
					case "grapes" ->{
						System.out.println("Grapes, 1kg Price: 100");
						total+=100;
						billItems+= "Grapes - Rs.100\n";

					}
					case "pomegranate" -> {
						System.out.println("Pomegranate, 1kg Price: 150");
						total+=150;
						billItems+= "Pomegranate - Rs.150\n";

					}
					case "papaya" ->{
						System.out.println("Papaya, 1kg Price: 40");
						total+=40;
						billItems+= "Papaya - Rs.40\n";

					}
					case "watermelon" ->{
						System.out.println("Watermelon, 1kg Price: 30");
						total+=30;
						billItems+= "Watermelon - Rs.30\n";

					}
					case "pineapple" ->{
						System.out.println("Pineapple, 1kg Price: 60");
						total+=60;
						billItems+= "Pineapple - Rs.60\n";

					}
					case "guava" -> {
						System.out.println("Guava, 1kg Price: 50");
						total+=50;
						billItems+= "Guava - Rs.50\n";

					}
					case "strawberry" ->{
						System.out.println("Strawberry, 1kg Price: 200");
						total+=200;
						billItems+= "Strawberry - Rs.200\n";

					}
					case "dragon fruit" -> {
						System.out.println("Dragon Fruit, 2 Pieces Price: 120");
						total+=120;
						billItems+= "Dragon fruit - Rs.120\n";

					}

					default -> System.out.println("Fruit not in stock");
					}
					System.out.println("Do you want to continue:(y/n)");
					yn1 = sc.nextLine();
				} while (yn1.equalsIgnoreCase("yes"));
			}

			default -> System.out.println("Invalid Category");
			}
			System.out.println("Do you want to change category and continue:(yes/no)");

			yn = sc.nextLine();

		} while (yn.equalsIgnoreCase("yes"));
		if(total>=300) {
			discount = total * 0.10;
		
		}
		else if(total>=500) {
			discount=total * 0.20;
		}
		double finalAmount = total - discount;
		sc.close();
		System.out.println("==============================");
		System.out.println("Total Items Purchased:");
		System.out.println(billItems);
		System.out.println("Total Amount: "+total );
		System.out.println("Discount Applied:"+discount);
		System.out.println("Final Price:" +finalAmount);
		System.out.println("Thank You for purchasing , visit again");
	}
}
