package com.java8features;

interface In6 {

	String welcome(String fname, String lname);
}

public class TestJ8Demo6 {

	public static void main(String[] args) {

		System.out.println("main method started");

		
		In6 t6 = (fname, lname) ->fname + lname;
		
//		is equivalent to:
//
//			In6 t6 = (fname, lname) -> {
//			    return fname + lname;
//			};
		
//		Easy rule to remember:
//
//			-> expression → implicit return
//			-> { statements } → explicit return when a value must be returned.

		System.out.println("Welcome Mr/Mrs : " + t6.welcome("Virat", "Kohli"));

		System.out.println("main method ended");

	}

}
