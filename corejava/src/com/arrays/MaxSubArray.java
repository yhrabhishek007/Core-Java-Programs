package com.arrays;

//1. Given an integer array containing both positive and negative numbers, 
//find the maximum sum of any contiguous subarray.
//Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Ouput: Maximum Sum = 6
//Explanation:
//The contiguous subarray with the maximum sum is: [4, -1, 2, 1]
//Sum = 4 + (-1) + 2 + 1 = 6
public class MaxSubArray {

	public static void main(String[] args) {

		System.out.println("Main method started");

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) { // i=0 i<5 i++
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) { // j=i j<5 j++
					System.out.print(arr[k] + " ");

					sum += arr[j];
				}

				count++;

				if (maxSum < sum) {

					maxSum = sum;

				}

				System.out.println("SubArray sum:" + sum);
			}
			System.out.println();

		}
		System.out.println("Maximum sum subarray:" + maxSum);
		System.out.println("Total Count:" + count);

	}

}


