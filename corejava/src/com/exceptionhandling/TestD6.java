package com.exceptionhandling;

public class TestD6 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			System.out.println("In try!!");
			System.out.println("Bhanu");
			System.out.println("Rakesh");

			System.out.println(10 / 0);
			String str3 = "Abhishek";
			System.out.println("This statement will come, when we try to get exception of SIOE");
			System.out.println(str3.charAt(9));
//		|	Pipe symbol or  bitwise OR
//			Handle either ArithmeticException OR StringIndexOutOfBoundsException using the same catch block.
		} catch (ArithmeticException | StringIndexOutOfBoundsException e) {
			System.err.println("In catch of AIE!");
		}
//		 catch (StringIndexOutOfBoundsException e) {
//			System.err.println("In catch of SIOE!");
//		} 
		catch (Exception e) {
			System.err.println("In catch of E!");
		}

		System.out.println("Main method ended");
	}

}
//You cannot use parent-child exceptions together:
//
//catch (Exception | RuntimeException e) // ❌
//
//because RuntimeException is already a child of Exception.
