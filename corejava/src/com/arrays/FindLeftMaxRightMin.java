package com.arrays;

import java.util.Scanner;

//1. Find an element that is greater than all elements on its left and smaller than all elements on its right.
//Input:
//arr = [5, 1, 4, 3, 6, 8, 10, 7]
//Output:
//6
//Explanation:
//For element 6:
//Left side: [5, 1, 4, 3]
//Right side: [8, 10, 7]
//6 is greater than every element on its left and smaller than every element on its right.
//Requirements:
//Do not use Arrays.sort()

public class FindLeftMaxRightMin {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int sz = sc.nextInt();

		System.out.println("Enter array elements:");
		int[] arr = new int[sz];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int lef = 0;
		int right = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > arr[lef] && arr[i] < arr[right]) {
				System.out.println(arr[i]);
			}

		}

	}

}
