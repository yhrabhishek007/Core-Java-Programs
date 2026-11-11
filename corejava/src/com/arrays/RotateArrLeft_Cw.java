package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Rotation left to right
//1. Write a Java program to rotate array left by k positions?
//Input:
//arr = [1, 2, 3, 4, 5]
//k = 2
//Output:[3, 4, 5, 1, 2]
public class RotateArrLeft_Cw {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Rotations:");
		int r = sc.nextInt();

		rotateArray(arr, r);

		System.out.println("After Rotation:" + Arrays.toString(arr));

		sc.close();
	}

	private static void rotateArray(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;
		reverse(arr, start, r - 1);
		reverse(arr, r, end);

	}

	private static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}
}
