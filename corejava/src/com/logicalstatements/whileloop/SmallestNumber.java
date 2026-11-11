package com.logicalstatements.whileloop;

import java.util.Scanner;

//19. Find the smallest digit in a number.

public class SmallestNumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		minDigit(n);

	}

	static void minDigit(int n) {

		int min = 9;
		while (n != 0) {

			int digit = n % 10;

			if (digit < min) {
				min = digit;

			}
			n = n / 10;

		}
		System.out.println("Smallest digit = " + min);

	}
}
