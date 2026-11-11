package com.exceptionhandling;

import java.util.Scanner;

public class TestD11 {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a = sc.nextInt();

		System.out.println("Enter another number:");
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println(a / b);
//			throw → throws an exception
//			new ArithmeticException() → creates an ArithmeticException object
//			"Please enter valid number." → detail message for the exception
//
//			Oracle specifically documents ArithmeticException(String s) as constructing an ArithmeticException with the specified detail message.
		} else {
			throw new ArithmeticException("Please enter valid number."); // Provides description because here in throw
																			// new we can pass paramaeters of String
//System.out.println(); Unreachable code (after throw new we can not write another line of code)
		}
		System.out.println("main method ended");

		sc.close();
	}

}
