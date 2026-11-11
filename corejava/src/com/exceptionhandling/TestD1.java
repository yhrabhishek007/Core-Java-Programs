package com.exceptionhandling;

import java.util.Scanner;
//printStackTrace() → full stack trace
//e                → java.lang.ArithmeticException: / by zero
//getMessage()     → / by zero
//toString()       → java.lang.ArithmeticException: / by zero
public class TestD1 {

	public static void main(String[] args) {
//https://chatgpt.com/s/t_6a805424386481918d51393596b3f8dc
//		https://chatgpt.com/s/t_6a80544a0f2c8191a65b42cad7840653
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a:");
			int a = sc.nextInt();
			System.out.println("Enter b:");
			int b = sc.nextInt();

			// Dividing a by b
			// If b = 0, ArithmeticException will occur
			System.out.println(a / b);
		}
		// This block handles the exception
		// Exception is the parent class of many exceptions
		catch (Exception e) {

			// Prints complete exception information
			// including exception type, message and line number
			e.printStackTrace();

			// Prints exception type + exception message
			// Internally uses e.toString()
			System.out.println(e);

			// Prints only the exception message
			// Example: / by zero
			System.out.println(e.getMessage());

			// Prints exception type + exception message
			// Example: java.lang.ArithmeticException: / by zero
			System.out.println(e.toString());
		}
		System.out.println("Main method ended");
		System.out.println("Main method ended");
		sc.close();
	}

}


