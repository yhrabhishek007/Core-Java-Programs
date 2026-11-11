package com.logicalstatements.whileloop;

import java.util.Scanner;

//Write a Java program to read integers until five even numbers have been entered, then stop?
//input--> num
public class FiveEvenNumbers_WCw {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		int n = 0;

		int count = 0;

		while (n <= 5) {
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				count++;
				n++;
				if (count == 5) {
					System.out.println( "Even Number count: " + count);
					break;
				}

			}
		}
	}
}
