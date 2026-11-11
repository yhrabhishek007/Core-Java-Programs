package com.arrays;

//Read array
//↓
//Read digit to search (2)
//↓
//totalCount = 0
//↓
//For every element in array
//    ↓
//    Check each digit of that number
//    ↓
//    If extracted digit == 2
//        totalCount++
//↓
//Print totalCount
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Read the size of the array
		System.out.println("Enter the array size:");
		int size = sc.nextInt();

		// Create an integer array with given size
		int[] arr = new int[size];

		// Read elements and store them in the array
		System.out.println("Enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Read the digit that needs to be searched
		System.out.println("Enter digit to search:");
		int digit = sc.nextInt();

		// Variable to store total occurrence count of the digit
		int totalCount = 0;

		// Traverse each element of the array
		for (int i = 0; i < arr.length; i++) {

			// Call method to count the digit occurrences in each number
			// Add returned count to totalCount
			totalCount += findDigitCount(arr[i], digit);
		}

		// Display the final count
		System.out.println("Total count of digit " + digit + " = " + totalCount);

		// Close Scanner object
		sc.close();
	}

	// Method to count how many times a digit appears in a number
	static int findDigitCount(int number, int digit) {

		// Local variable to store count for a single number
		int count = 0;

		// Extract digits until the number becomes 0
		while (number > 0) {

			// Extract the last digit of the number
			// Example: 123 % 10 = 3
			int extractedDigit = number % 10;

			// Compare extracted digit with the digit we want to search
			if (extractedDigit == digit) {
				count++; // Increase count if digit matches
			}

			// Remove the last digit from the number
			// Example: 123 / 10 = 12
			number = number / 10;
		}

		// Return the count of matching digits
		return count;
	}
}