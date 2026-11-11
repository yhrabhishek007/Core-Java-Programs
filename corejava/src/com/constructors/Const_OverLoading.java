package com.constructors;


//Constructor Overloading
//
//Write a Java program to create a class called "Book" with instance variables title, author, and price.
//Implement a default constructor and two parameterized constructors:
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.
public class Const_OverLoading {
	String title;
	String author;
	double price;
	
	public Const_OverLoading() {
		this("Rich Dad Poor Dad","Robert Kiyosaki, Sharon Lechter");
//		this.title="The Secret";
//		this.author="Rhonda Byrne";	
//		this.price=200.90;
		
		System.out.println("No-Arg constructor");
	}
	Const_OverLoading(String title ,String author){
		this(title,author,509.90);
//		this.title=title;
//		this.author=author;
//		this.price=200.90;
		
		
	}

	public Const_OverLoading(String title, String author, double price) {
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	void bookInfo() {
		System.out.println("Book Title:" +title);
		System.out.println("Book Author:" +author);
		System.out.println("Book Price:" +price);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method called");
		System.out.println("Constructor Overloading");
		Const_OverLoading b = new Const_OverLoading();
		b.bookInfo();

	}

}
