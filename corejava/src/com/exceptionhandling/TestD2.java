package com.exceptionhandling;

public class TestD2 {
//NullPointerExceptionDemo
	public static void main(String[] args) {

		String str = "Java";

		System.out.println(str.length());

		String str1 = "null";

		System.out.println(str1.length());

		String str2 = "";

		System.out.println(str2.length());
		String str3 = null;

		try {

//			null dot any operation is null pointer exception
			System.out.println(str3.length());
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("NPE Exception");

		}
		System.out.println("Main method ended");

	}

}
//interview question:
//why try catch when we can handle these using if else?
//--> For better logging

//if-else is used to check a condition, while try-catch is used to handle exceptions that 
//occur during program execution.
//
//try-catch also helps us get exception details using printStackTrace(), 
//which is useful for debugging and logging.

//Q .Does the exception message in the console change every time we execute the program?

//Answer:

//The exception type remains the same, but the exception message can vary depending on the Java
//version and situation.
