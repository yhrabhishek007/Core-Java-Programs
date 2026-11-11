package com.logicalstatements.whileloop;

import java.util.Scanner;

//Program to find the Nth Prime Number
//Given an integer N. The task is to find the Nth prime number.
//Examples:  
//Input : 5 
//Output : 11
//
//Input : 16 
//Output : 53
public class NthPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count = 0;
		int num = 2;

		while (true) {
			if (nthPrime(num)) {
				count++;
				if (count == n) {
					System.out.println("The " + n + " prime number :" + num);
					break;
				}
			}
			num++;
		}

	}

	static boolean nthPrime(int n) {
		if (n <= 1)
			return false;
		int i = 2;
		while (i < n) {

			if (n % i == 0)
				return false;
			i++;
		}

		return true;

	}

}