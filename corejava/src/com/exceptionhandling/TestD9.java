package com.exceptionhandling;

public class TestD9 {
//trycatchfinally with return 
	
//	A return statement in finally overrides the return value from try or catch.
	static int hello() {

		try {
			System.out.println("In try!!");
			System.out.println(10 / 0);
			return 10;

		} catch (Exception e) {
			System.out.println("In catch!!");
			return 20;
		} finally {
			System.out.println("In finally!!");
//			return 30;  if we return here then it will overrides try and catch return 
		}

	}

	public static void main(String[] args) {

		System.out.println("Main method started");

		System.out.println(hello());

		System.out.println("Main method ended");
	}

}
