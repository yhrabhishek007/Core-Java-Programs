package com.arrays;

import java.util.Scanner;

//1. Write a Java program to find distinct elements in an array?
//Input: {1,2,3,1,2,4}
//Output: {1,2,3,4}
public class FindDistinctElements_Cw {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int sz = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[sz];
//		int arr[]= {1,2,3,1,2,4};

		// Storing user entered values into array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Checking each element to find whether it appeared before or not
		for (int i = 0; i < arr.length; i++) {

			// Assume current element is not duplicate
			boolean isDuplicate = false;

			// Comparing current element with previous elements only
			for (int j = 0; j < i; j++) {

				// If current element matches any previous element, it is duplicate
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break; // Stop checking once duplicate is found
				}
			}

			// Printing only elements that are appearing for the first time
			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();

	}

}
