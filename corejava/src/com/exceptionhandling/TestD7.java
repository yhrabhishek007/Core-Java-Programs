package com.exceptionhandling;

import java.util.Scanner;
// try catch finally demo
public class TestD7 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a = sc.nextInt();

		// System.exit(0);//Initializes the Runtime##shutdown shutdown sequence

		try {
			System.out.println("In try!!");
			System.out.println(10 / a);
//			finally does not execute when System.exit() terminates the JVM.
			System.exit(0);

		} catch (Exception e) {
			System.out.println("In catch!!");
			System.out.println(10 / 0);

		}
// finally block is only for closing the connections not for business logic.
		finally {
			System.out.println("In finally!!");
			sc.close();
		}
		System.out.println("Main method ended");

	}

}
