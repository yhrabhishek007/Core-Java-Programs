package com.arrays;

//1. Write a Java program to find two elements in an integer array whose absolute difference is minimum?
//Input: [1, 5, 3, 19, 18, 25]
//Output: [18, 19]
public class MinimumAbsoluteDifference {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 19, 18, 25 };

		int minDifference = Integer.MAX_VALUE;
		int element1 = 0;
		int element2 = 0;

		// Compare every pair of elements
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int difference;

				// Calculate absolute difference without Math.abs()
				if (arr[i] > arr[j]) {
					difference = arr[i] - arr[j];
				} else {
					difference = arr[j] - arr[i];
				}

				// Check if this is the minimum difference
				if (difference < minDifference) {

					minDifference = difference;

					// Store smaller element first
					if (arr[i] < arr[j]) {
						element1 = arr[i];
						element2 = arr[j];
					} else {
						element1 = arr[j];
						element2 = arr[i];
					}
				}
			}
		}

		System.out.println("Two elements with minimum absolute difference:");
		System.out.println("[" + element1 + ", " + element2 + "]");
	}
}