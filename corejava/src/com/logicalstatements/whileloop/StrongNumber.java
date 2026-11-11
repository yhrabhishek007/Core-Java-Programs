package com.logicalstatements.whileloop;

import java.util.Scanner;

//A Strong Number (also called a factorion or Krishnamurthy number) is a special number 
//whose digits' factorial sum equals the original number. 
//For example, 145 is a strong number because its digits yield 1! + 4! + 5! = 1 + 24 + 120 = 145.
public class StrongNumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		checkStrongNumber(n);

	}

	static void checkStrongNumber(int n) {
	    int temp = n; // store original number for final comparison
	    int sum = 0;  // to store sum of factorials of each digit

	    // loop through each digit of the number
	    while (n != 0) {
	        int i = 1;              // loop counter for factorial
	        int factorial = 1;      // stores factorial of current digit
	        int digit = n % 10;     // extract last digit

	        // calculate factorial of the digit
	        while (i <= digit) {
	            factorial = factorial * i; // multiply factorial step by step
	            i++;                       // move to next number
	        }

	        // add factorial of current digit to sum
	        sum = sum + factorial;

	        // remove last digit from number
	        n = n / 10;
	    }

	    // compare sum of factorials with original number
	    if (temp == sum) {
	        System.out.println("Strong number");
	    } else {
	        System.out.println("Not a strong number");
	    }
	}
}