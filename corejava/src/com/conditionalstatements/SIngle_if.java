package com.conditionalstatements;

import java.util.Scanner;

//Check whether a year is a leap year (using only one if condition).
public class SIngle_if {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int num = sc.nextInt();
		
		if ((num%400==0) || num%100!=0 && num%4==0) {
			System.out.println("It is a Leap Year");
		}
		
	}

}
