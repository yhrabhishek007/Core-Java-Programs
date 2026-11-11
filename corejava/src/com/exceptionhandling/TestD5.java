package com.exceptionhandling;

public class TestD5 {
// NumberFormatExceptionDemo
	
//	NumberFormatException is an unchecked runtime exception.
//	It occurs when we try to convert a String into a number, 
//	but the String does not contain a valid numeric value.
	public static void main(String[] args) {

		System.out.println("Main method started");

		try {
//		conversion of String to int
			String str = "123";
			int n1 = Integer.parseInt(str); // 123 int

			long n2 = Long.parseLong(str);
			System.out.println(n1 * 10); // 1230
			System.out.println(n2);
		} catch (IllegalArgumentException e) {  //IllegalArgumentException parent exception
			System.out.println("NFE");
			System.out.println(e.getLocalizedMessage());
		}
		try {
//			
			String str1 = "ten";
			int n3 = Integer.parseInt(str1);
			System.out.println(n3 * 10);
		} catch (NumberFormatException e) {
			System.err.println("NFE");

			e.printStackTrace();
		}

	}

}
