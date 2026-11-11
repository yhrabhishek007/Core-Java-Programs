package com.arrays;

import java.util.Scanner;

//Maximum Consecutive Ones
public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size:");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int Count = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				Count++;
				if (Count > maxCount) {
					maxCount = Count;
				}
			} else {
				Count = 0;

			}
		}
		System.out.println("Maximum count of 1's is:" + maxCount);
		sc.close();
	}

}
