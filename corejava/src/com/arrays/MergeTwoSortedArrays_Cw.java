package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//
//1. Write a Java program to merge two sorted arrays without using any extra array. 
//After merging, both arrays should remain sorted?
//Input:
//arr1 = [1, 4, 7, 8, 10]
//arr2 = [2, 3, 9]
//Output: [1,2,3,4,7,8,9,10]
public class MergeTwoSortedArrays_Cw {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arrays size:");
		int sz = sc.nextInt();
		System.out.println("Enter array 1 elements:");
		int arr1[] = new int[sz];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter array 2 elemsts:");
		int arr2[] = new int[sz];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		int third[] = new int[arr1.length + arr2.length];

//		int index=0;  using index
		for (int i = 0; i < arr1.length; i++) {

			third[i] = arr1[i];
//			third[index] = arr1[i];
//			index++;

		}
		for (int i = 0; i < arr2.length; i++) {

			third[arr1.length + i] = arr2[i]; //

//			third[index++]=arr2[i];

		}

		for (int i = 0; i < third.length - 1; i++) {
			for (int j = 0; j < third.length - 1; j++) {

				if (third[j] > third[j + 1]) {
					int temp = third[j];
					third[j] = third[j + 1];
					third[j + 1] = temp;
				}

			}
		}

		System.out.println("Array after sorting:" + Arrays.toString(third));
		sc.close();

	}

}
