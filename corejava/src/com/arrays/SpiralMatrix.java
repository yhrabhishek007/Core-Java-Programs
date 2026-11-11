package com.arrays;


import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter size:");
		        int n = sc.nextInt();
		        System.out.println("Enter array elements:");
		        int[][] a = new int[n][n];
		        // Input matrix
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                a[i][j] = sc.nextInt();
		            }
		        }
		        int top = 0;
		        int bottom = n - 1;
		        int left = 0;
		        int right = n - 1;
		       

		        // Spiral traversal
		        while (top <= bottom && left <= right) {

		            // Left to right
		            for (int j = left; j <= right; j++) {
		                System.out.print(a[top][j] + " ");
		            }
		            top++;

		            // Top to bottom
		            for (int i = top; i <= bottom; i++) {
		                System.out.print(a[i][right] + " ");
		            }
		            right--;

		            // Right to left
		            if (top <= bottom) {
		                for (int j = right; j >= left; j--) {
		                    System.out.print(a[bottom][j] + " ");
		                }
		                bottom--;
		            }

		            // Bottom to top
		            if (left <= right) {
		                for (int i = bottom; i >= top; i--) {
		                    System.out.print(a[i][left] + " ");
		                }
		                left++;
		            }
		        }

		        sc.close();
		    

	}

}