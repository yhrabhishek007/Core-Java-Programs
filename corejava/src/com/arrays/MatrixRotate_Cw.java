package com.arrays;

import java.util.Scanner;

public class MatrixRotate_Cw {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns:");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		System.out.println("Enter array elements:");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Transpose
		int transpose[][] = new int[cols][rows];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				transpose[j][i] = arr[i][j];
			}
		}

		// Reverse each row
		for (int i = 0; i < transpose.length; i++) {

			int start = 0;
			int end = transpose[i].length - 1;

			while (start < end) {

				int temp = transpose[i][start];
				transpose[i][start] = transpose[i][end];
				transpose[i][end] = temp;

				start++;
				end--;
			}
		}

		System.out.println("90 Degree Clockwise Rotation:");

		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}
}