package com.arrays;

import java.util.Scanner;

//1. Find the Equilibrium Index of an Array.
//
//An equilibrium index is an index where the sum of all elements on the left is equal 
//to the sum of all elements on the right.
//
//Input:
//
//arr = {-7, 1, 5, 2, -4, 3, 0}
//
//Output:
//
//3
//
//Explanation:
//
//Left sum  = -7 + 1 + 5 = -1
//Right sum = -4 + 3 + 0 = -1
//
//Therefore, "3" is the equilibrium index.
//
//Requirement:
//Do not use any built-in method to directly find the answer.
public class EquilibriumIndexFinder {

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

		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j < i; j++) { // -7, 1, 5, 2, -4, 3, 0
				leftSum = leftSum + arr[j];// -7

			}
			for (int k = i + 1; k < arr.length; k++) {
				rightSum = rightSum + arr[k];// 7

			}
			if (leftSum == rightSum) {
				System.out.println("Equilibrium index: " + i + " " + arr[i]);
				found = true;
				break;

			}

		}
		if (!found) {
			System.out.println("Equilibrium not found.");
		}
		sc.close();
	}

}
