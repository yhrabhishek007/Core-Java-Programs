package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
//Array rotation -->Right Rotaion
public class ArrayRotation_Cw {

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

		System.out.println(Arrays.toString(arr));
		sc.close();

	}
	

	private static void rotateArray(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;

		reverseArray(start, end, arr);
		reverseArray(start, r - 1, arr);
		reverseArray(r, end, arr);

	}

	private static void reverseArray(int start, int end, int arr[]) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}
		

	}

}
