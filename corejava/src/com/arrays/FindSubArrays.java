package com.arrays;

import java.util.Scanner;

class FindSubArrays {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int sz = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[sz];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		Outer loop
//	    Pick Start
//
//	    Inner loop
//	        Pick End
//
//	        Third loop
//	            Go from Start to End
//	            Print/use each element

		for (int start = 0; start < arr.length; start++) { // i=0 i<5 i++
			for (int end = start; end < arr.length; end++) { // j=i j<5 j++
				for (int k = start; k <= end; k++) { // k=i k<=j k++ 1 1<=5 2 0 0<=0 1<=0 f
					System.out.print(arr[k] + " ");
				}
				System.out.println();
				sc.close();
			}
		}

	}

}
