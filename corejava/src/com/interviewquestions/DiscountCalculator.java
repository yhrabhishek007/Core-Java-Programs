package com.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

//input 8 4 6 2 3
//output 4 2 4 2 3

//input 10 5 7 2 1 3
//output 5 3 5 1 1 3

public class DiscountCalculator {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int sz = sc.nextInt();

		System.out.println("Enter array elements:");
		int arr[] = new int[sz];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
//		int arr1[] = new int[sz];
		for (int i = 0; i < arr.length; i++) {
//			arr1[i]=arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] <= arr[i]) { //
					arr[i] = arr[i] - arr[j];

					break;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
sc.close();
	}

}

