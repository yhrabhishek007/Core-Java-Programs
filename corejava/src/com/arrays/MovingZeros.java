package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//1. Write a Java program to move all the 0 elements in an integer array to the end while maintaining the 
//relative order of the non-zero elements? 
//Input: [10, 0, 20, 0, 30, 40] 
//Output: [10, 20, 30, 40, 0, 0]
public class MovingZeros {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int sz = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[sz];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				arr[index] = arr[i];
				index++;
			}

		}

		for (int i = index; i < arr.length; i++) {
			arr[index++] = 0;

		}
		System.out.println("Moving Zeros to end:" + Arrays.toString(arr));

		System.out.println();

		System.out.println("Using while loop:------->");
		int[] arr1 = { 10, 0, 20, 0, 30, 40 };

		int index1 = 0;

		// Move all non-zero elements to the front
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				arr1[index1] = arr1[i];
				index1++;
			}
		}

		// Fill the remaining positions with 0
		while (index1 < arr1.length) {
			arr1[index1] = 0;
			index1++;
		}

		System.out.println("Output: " + Arrays.toString(arr1));
		sc.close();

	}

}
