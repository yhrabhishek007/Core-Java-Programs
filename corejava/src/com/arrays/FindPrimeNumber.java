package com.arrays;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt(); // creation

		int arr[] = new int[size]; // declaration
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) { // initialization
			arr[i] = sc.nextInt();

		}
		System.out.println("Prime Numbers are:");
		int count = 0;
		int sum=0;

		for (int i = 0; i < arr.length; i++) {

			if (isPrime(arr[i])) {
				System.out.print(arr[i] + " ");
				
				count++;
				sum=sum+arr[i];
			}

		}
		System.out.println();
		System.out.println("Total Prime Numbers count:" + count);
		System.out.println("Total Prime Numbers sum:" + sum);
		sc.close();

	}

	static boolean isPrime(int n) {

		boolean flag = true;
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;

		}
		return flag;
		

	}
}