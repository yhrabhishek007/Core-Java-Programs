package com.logicalstatements;

import java.util.Scanner;

//Write a Java program to find the sum of the first N natural numbers?
public class SumOfNumbers_Cw {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;

		}
		System.out.println("Sum of " + n + " natural numbers is:" + sum);
		sc.close();

	}			

}
