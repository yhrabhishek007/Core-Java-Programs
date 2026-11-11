package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//1. Given an array of integers, move all negative numbers to the beginning while preserving the 
//relative order of both negative and positive numbers.
//Input: [1,-2,3,-4,5,-6]
//Output: [-2,-4,-6,1, 3,5]
public class MoveNegNumBeggining {
//b neg k pos 
	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int sz = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[sz];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int pos[] = new int[sz]; 
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				pos[index++] = arr[i];

			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos[index++] = arr[i];

			}

		}
		System.out.println(Arrays.toString(pos));
		sc.close();
	}

}
