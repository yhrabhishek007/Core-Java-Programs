package com.logicalstatements;

import java.util.Scanner;

//write a program to find factors or divisors of a given number ..? 
public class FindFactors_for {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		findFactor(n);

		sc.close();

	}

	static void findFactor(int n) { // factors 6 -->1 2 3 6
		System.out.println("Factors of " + n + " are:");
		for (int i = 1; i <= n / 2; i++) { // Why does this work?
//Because no proper factor of a number is greater than num / 2.
//			 Example: 15
//			 Factors:
//			 1 3 5 15
//			 15 / 2 = 7
//			 You only need to check from 1 to 7.
//			 Then print 15 separately.
			if (n % i == 0) { // ex: 6%1 => REMAINDER=0 , 6%2=0 , 6%3=0 , 6%4=> R=2 , 6%5=>R=1,6%6=0
				System.out.println(i);
			}
		}
		System.out.println(n);  //Print separately if we put n/2

	}

}
