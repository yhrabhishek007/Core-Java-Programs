package com.arrays;

//1. Write a Java program to find the second smallest element in an array?
//Input: {10,20,30,5,4}
//Output: Second smallest element- 5
public class SecMinElement_Cw {

	public static void main(String[] args) {
		System.out.println("Main method started");

		int arr[] = { 10, 20, 30, 5, 4 };
		int min = arr[0];
		int secMin = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (/* current element is smaller than min */
			arr[i] < min) {

				// Before changing min,
				// save the old min as second min.
				secMin = min;
				min = arr[i];

			} else if (/* current element is greater than min and smaller than secMin */
			arr[i] > min && arr[i] < secMin) {

				secMin = arr[i];

			}

		}
		System.out.println("Second smallest element:" + secMin);

	}
}