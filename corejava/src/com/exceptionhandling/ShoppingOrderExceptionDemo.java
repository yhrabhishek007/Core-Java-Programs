package com.exceptionhandling;

import java.util.Scanner;

//1. Write a Java program for an online shopping order that:
//* Accepts the product price as a String and converts it to double.
//* Stores product names in an array and accepts a product index.
//* Accepts quantity and calculates price / quantity.
//* Use a finally block to display "Order processing completed" whether an exception occurs or not.
//* Handle multiple unchecked exceptions:
//NumberFormatException → invalid price
//ArrayIndexOutOfBoundsException → invalid product index
//ArithmeticException → quantity is 0

public class ShoppingOrderExceptionDemo {

	public static void main(String[] args) {
		String[] products = { "Laptop", "Mobile", "Headphones", "Keyboard" };

		Scanner sc = new Scanner(System.in);

		try {

			// Accept product price as String and convert to double
			System.out.print("Enter product price: ");
			String priceString = sc.nextLine();
			double price = Double.parseDouble(priceString);

			// Accept product index
			System.out.print("Enter product index (0-3): ");
			int index = sc.nextInt();

			// Access product using index
			String productName = products[index];

			// Accept quantity
			System.out.print("Enter quantity: ");
			int quantity = sc.nextInt();

			// Check for zero quantity
			if (quantity == 0) {
				throw new ArithmeticException("Quantity cannot be zero");
			}

			// Calculate price / quantity
			double pricePerQuantity = price / quantity;

			System.out.println("\nOrder Details:");
			System.out.println("Product: " + productName);
			System.out.println("Price: " + price);
			System.out.println("Quantity: " + quantity);
			System.out.println("Price per quantity: " + pricePerQuantity);

		} catch (NumberFormatException e) {
			System.err.println("Invalid price: Please enter a valid number.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid product index: Please select a valid index.");

		} catch (ArithmeticException e) {
			System.err.println("Invalid quantity: Quantity cannot be 0.");

		} finally {
			System.out.println("Order processing completed");
		}

		sc.close();
	}
}