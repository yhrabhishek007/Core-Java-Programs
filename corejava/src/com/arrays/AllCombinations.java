package com.arrays;

//provide 1. Write a Java program to generate all possible combinations from an integer array, 
//including combinations of different sizes?
//Input:  [1, 2, 3]
//Output:
//[]
//[1]
//[2]
//[3]
//[1, 2]
//[1, 3]
//[2, 3]
//[1, 2, 3]
public class AllCombinations {

	static void generate(int[] arr, int[] current, int start, int index) {

		// Print current combination
		if (index > 0) {
			System.out.print("[");
			for (int i = 0; i < index; i++) {
				System.out.print(current[i]);
				if (i < index - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}

		// Generate next combinations
		for (int i = start; i < arr.length; i++) {
			current[index] = arr[i];

			generate(arr, current, i + 1, index + 1);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

		System.out.println("[]");

		int[] current = new int[arr.length];

		generate(arr, current, 0, 0);
	}
}
