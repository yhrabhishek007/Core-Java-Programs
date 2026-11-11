package com.collectionsframework;

//Create a Java Product Management System using the List interface.
//1 Create a Product class with the following fields:ProductID,Product Name,Category,Price
//2.Create a ProductManager class.
//3.Use an appropriate implementation of the List interface to store products.
//4.Implement the following operations as separate methods:
//Add a product,Display all products,Find a product by Product ID,Remove a product by Product ID
//Display products whose price is greater than a given amount. Create multiple product objects 
//and test all the operations in the main() method.
import java.util.List;

import java.util.ArrayList;

public class ProductManager {

	List<Product> products = new ArrayList<>();

	// Add Product
	public void addProduct(Product p) {
		products.add(p);
		System.out.println("Product added successfully");
	}

	// Find Product by ID
	public void findProductByID(int id) {

		boolean found = false;

		for (Product product : products) {

			if (product.productID == id) {
				product.display();
				System.out.println("Product found successfully");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Product not found");
		}
	}

	// Remove Product by ID
	public void removeProduct(int id) {

		boolean removed = false;

		for (int i = 0; i < products.size(); i++) {

			Product product = products.get(i);

			if (product.productID == id) {

				product.display();
				products.remove(i);

				System.out.println("Product removed successfully");
				removed = true;
				break;
			}
		}

		if (!removed) {
			System.out.println("Product not found");
		}
	}

	// Display products whose price is greater than given price
	public void displayProductByPrice(double price) {

		boolean found = false;

		for (Product product : products) {

			if (product.price > price) {
				product.display();
				found = true;
			}
		}

		if (!found) {
			System.out.println("Product not found");
		}
	}

	// Display all products
	public void displayAllProducts() {

		if (products.isEmpty()) {
			System.out.println("Products not found");
		} else {

			for (Product p : products) {
				p.display();
			}
		}
	}
}