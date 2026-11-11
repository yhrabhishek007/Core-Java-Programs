package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//1. Write a Java program to generate all possible permutations of an integer array?
//Input:  [1, 2, 3]
//Output:
//[1, 2, 3]
//[1, 3, 2]
//[2, 1, 3]
//[2, 3, 1]
//[3, 1, 2]
//[3, 2, 1]
public class ArrayPermutationGenerator {

	static void generate(int[] arr, int index) {

		// 1. What is my stopping condition?
		// All positions are filled
		if (index == arr.length) {
			// permutation is complete
			System.out.println(Arrays.toString(arr));
			return;
		}

		// 2. Try every possible element from index onward
		// Try every element from the current index
		for (int i = index; i < arr.length; i++) {

			// Choose
			swap(arr, index, i);

			// Explore
			generate(arr, index + 1);

			// Undo the choice
			swap(arr, index, i);
		}
	}

	static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {

		System.out.println("Enter any random 3 digits:");
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The all possible permutations of the digits are: ");

		generate(arr, 0);
		
		sc.close();
	}
}
