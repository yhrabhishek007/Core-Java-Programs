package com.arrays;

import java.util.Scanner;

public class NumberExistsOrNot {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int sz = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[sz];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter number:");
		int num = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				found = true;
				break;

			}
		}
		if (found) {
			System.out.println("Yes Number is found");
		} else {
			System.out.println("Number not found");
		}
		sc.close();

	}

}
