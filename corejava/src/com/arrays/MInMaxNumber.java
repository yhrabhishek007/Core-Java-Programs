package com.arrays;

import java.util.Scanner;

public class MInMaxNumber {

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		Scanner sc = new Scanner(System.in);

		// Taking array size from user
		System.out.println("Enter size of array:");
		int size = sc.nextInt();

		// Creating array

		int arr[] = new int[size];
		System.out.println("Enter elements in array:");
		// Reading and storing array elements
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Assume first element is both minimum and maximum initially
		int minarr = arr[0];
		int maxarr = arr[0];

		// Compare remaining elements with min and max values
		for (int i = 0; i < arr.length; i++) {

			// If current element is smaller, update minimum
			if (arr[i] < minarr) {
				minarr = arr[i];
			}

			// If current element is greater, update maximum
			if (arr[i] > maxarr) {
				maxarr = arr[i];
			}
		}

		// Print final minimum and maximum values
		System.out.println("Minimum value: " + minarr);
		System.out.println("Maximum value: " + maxarr);

		sc.close();
	}
}