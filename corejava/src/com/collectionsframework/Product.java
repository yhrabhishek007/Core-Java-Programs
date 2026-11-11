package com.collectionsframework;
//Create a Java Product Management System using the List interface.

//1 Create a Product class with the following fields:ProductID,Product Name,Category,Price
//2.Create a ProductManager class.
//3.Use an appropriate implementation of the List interface to store products.
//4.Implement the following operations as separate methods:
//Add a product,Display all products,Find a product by Product ID,Remove a product by Product ID
//Display products whose price is greater than a given amount. Create multiple product objects 
//and test all the operations in the main() method.

public class Product {

	 int productID;
	 String pName;
	 String category;
	 double price;

	public Product(int productID, String pName, String category, double price) {
		super();
		this.productID = productID;
		this.pName = pName;
		this.category = category;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Product ID:"+productID);
		System.out.println("Product Name:"+pName);
		System.out.println("Product Category:"+category);
		System.out.println("Product Price:"+price);
	}

	
}
