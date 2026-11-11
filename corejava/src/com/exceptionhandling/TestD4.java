package com.exceptionhandling;

public class TestD4 {
//StringIndexOutOfBoundsExceptionDemo
	public static void main(String[] args) {
		System.out.println("Main method started");

		String str = "Abhishek"; // 8
		System.out.println(str.length());
		System.out.println(str.charAt(6));
//		Index 10 out of bounds for length 8
		try {
			System.out.println(str.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.err.println("STOE");
		}

	}

}
