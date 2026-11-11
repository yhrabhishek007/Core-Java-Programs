package com.logicalstatements.whileloop;

import java.util.Scanner;

//1. Write a Java program to print all Perfect Numbers between 1 and N?
//Input: Enter the value of N: 30
//Ouput: Perfect Numbers between 1 and 30 are:
//6 28
public class PerfectNumberRange {

	public static void main(String[] args) {

		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();

		// Starting number to check from 1
		int i = 1;

		// Loop to check every number between 1 and n
		while (i <= n) {

			// Send the current number to check whether it is perfect
			isPerfectNum(i);

			// Move to the next number
			i++;
		}

		sc.close();
	}

	// Method to check whether a single number is a perfect number
	static void isPerfectNum(int n) {

		// Variable to find divisors of n
		int i = 1;

		// Stores the sum of proper divisors
		int sum = 0;

		// Check all numbers from 1 to n-1
		while (i < n) {

			// If i divides n completely, it is a divisor
			if (n % i == 0) {

				// Add the divisor to sum
				sum += i;
			}

			// Check the next number
			i++;
		}

		// If sum of divisors is equal to the original number,
		// then it is a perfect number
		if (sum == n) {

			System.out.println(n);
		}
	}
}