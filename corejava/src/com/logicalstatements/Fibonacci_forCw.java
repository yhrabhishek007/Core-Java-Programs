package com.logicalstatements;
//Whenever you forget the program, just remember these four lines:
//
//	// Step 1: Start with 0 and 1
//	int firstNum = 0;
//	int secondNum = 1;
//
//	// Step 2: Find the next number
//	nextNum = firstNum + secondNum;
//
//	// Step 3: Shift the numbers
//	firstNum = secondNum;
//	secondNum = nextNum;
//
//	// Step 4: Repeat
import java.util.Scanner;

public class Fibonacci_forCw {

	public static void main(String[] args) {

		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();

		// First two numbers of the Fibonacci series
		int firstNum = 0;
		int secondNum = 1;

		// Print the first two numbers
		System.out.print(firstNum + " " + secondNum + " ");

		
		// Repeat 'n' times to generate the remaining numbers
		for (int i = 1; i <= n; i++) {

			// Next number = Sum of previous two numbers
			int nextNum = firstNum + secondNum;

			// Move the numbers one step forward
			// firstNum becomes secondNum
			firstNum = secondNum;

			// secondNum becomes nextNum
			secondNum = nextNum;

			// Print the newly generated Fibonacci number
			System.out.print(nextNum + " ");
		}

		sc.close();
	}
}
//Memory Trick
//
//Think of it like three boxes:
//
//Initially
//
//firstNum     secondNum
//    0            1
//
//nextNum = 0 + 1 = 1
//
//Now shift the boxes:
//
//firstNum     secondNum
//    1            1
//
//Again:
//
//nextNum = 1 + 1 = 2
//
//Shift
//
//firstNum     secondNum
//    1            2
//
//Again:
//
//nextNum = 1 + 2 = 3
//
//Shift
//
//firstNum     secondNum
//    2            3
//
//Just keep repeating:
//
//Add → Shift → Print → Repeat