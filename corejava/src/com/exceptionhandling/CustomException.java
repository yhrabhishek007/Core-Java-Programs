package com.exceptionhandling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:");
		int age = sc.nextInt();

		// Check if the age is greater than 18.
		if (age > 18) {

			System.out.println("You are Eligible for Voting & Driving");

		} else {

			// Throw the custom exception with a message.
			throw new AgeException("You have lots of time for voting & Driving, focus on studies.");
		}

//		Contructor chaining Example --> Interview POV
//		"Constructor chaining means calling one constructor from another constructor. 
//		It can happen within the same class using this() or between parent and child classes using super().
//		In my custom exception example, super(s) calls the parameterized constructor of the parent class RuntimeException, 
//		so this is an example of constructor chaining."

		sc.close();
	}
}