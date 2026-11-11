package com.collectionsframework;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ProductManager pm = new ProductManager();

		// Creating some products
		Product p1 = new Product(101, "Laptop", "Electronics", 55000);
		Product p2 = new Product(102, "Mobile", "Electronics", 25000);
		Product p3 = new Product(103, "Headphones", "Accessories", 3000);
		Product p4 = new Product(104, "Tablet", "Electronics", 35000);
		Product p5 = new Product(105, "Keyboard", "Accessories", 1500);

		// Adding products
		pm.addProduct(p1);
		pm.addProduct(p2);
		pm.addProduct(p3);
		pm.addProduct(p4);
		pm.addProduct(p5);

		int choice;

		do {

			System.out.println("\n===== PRODUCT MANAGEMENT SYSTEM =====");
			System.out.println("1. Display All Products");
			System.out.println("2. Find Product by ID");
			System.out.println("3. Remove Product by ID");
			System.out.println("4. Display Products Above Price");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				pm.displayAllProducts();
				break;

			case 2:
				System.out.print("Enter Product ID: ");
				int searchID = sc.nextInt();

				pm.findProductByID(searchID);
				break;

			case 3:
				System.out.print("Enter Product ID to remove: ");
				int removeID = sc.nextInt();

				pm.removeProduct(removeID);
				break;

			case 4:
				System.out.print("Enter price: ");
				double price = sc.nextDouble();

				pm.displayProductByPrice(price);
				break;

			case 5:
				System.out.println("Thank you!");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		sc.close();
	}
}