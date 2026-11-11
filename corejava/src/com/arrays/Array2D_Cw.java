package com.arrays;

import java.util.Scanner;

public class Array2D_Cw {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		// Taking number of rows from user (number of arrays inside the main array)
		System.out.println("Enter number of rows:");
		int n = sc.nextInt();

		// Taking number of columns from user (number of elements in each row)
		System.out.println("Enter number of columns:");
		int n1 = sc.nextInt();

		// Creating a 2D array: n represents rows and n1 represents columns
		int arr[][] = new int[n][n1];

		// Outer loop moves row by row
		for (int i = 0; i < arr.length; i++) {

			// Inner loop moves through each column of the current row
			for (int j = 0; j < arr[i].length; j++) {

				// Taking input and storing value at specific row and column position
				arr[i][j] = sc.nextInt();
			}
		}

		// Traversing the array row by row to display stored values
		for (int i = 0; i < arr.length; i++) {

			// Accessing each element of the current row
			for (int j = 0; j < arr[i].length; j++) {

				// Printing value stored at row i and column j
				System.out.print(arr[i][j] + " ");
			}
		}

		sc.close();

	}

}
