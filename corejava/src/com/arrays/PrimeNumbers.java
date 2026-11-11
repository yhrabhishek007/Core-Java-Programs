package com.arrays;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];

		int num = 0;
		int index = 0;


		while (index < size) {
			if (primeNum(num)) {
				arr[index] = num;
				index++;
			}
			num++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

	static boolean primeNum(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
