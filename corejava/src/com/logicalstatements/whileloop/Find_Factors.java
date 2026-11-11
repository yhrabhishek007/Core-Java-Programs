package com.logicalstatements.whileloop;

import java.util.Scanner;

//21. print all factors of a number.
//Example:
//Input: 12
//Output: 1 2 3  4 6 12
//Find the sum of all factors.

public class Find_Factors {

	public static void main(String[] args) {
		System.out.println("Main methos started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		findFactors(n);

		sc.close();
	}

	static void findFactors(int n) {

		// Store original number (not used later, but can be useful for reference)
		int n1 = n;
		System.out.println("Factors of " + n1 + " are:");

		// Start checking from smallest possible factor
		int i = 1;
		int count = 0;
		int sum = 0;

		// Loop runs until i reaches n
		// Because a number's factors are always between 1 and n
		while (i <= n) { // 1<24 true , 2<24 true until 25<24 false then it returns
//			because condition is false

			// Check: if i divides n completely (remainder is 0)
			// This means i is a factor of n
			if (n % i == 0) {
//				sum of factors
				sum = sum + i;
				// Print the factor
				System.out.println(i);
			}

			// Move to next number to test
			i++;

		}
		System.out.println("Sum of factors of " +n1+ " are:"+sum);

	}
}