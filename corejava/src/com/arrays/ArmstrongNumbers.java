package com.arrays;

import java.util.Scanner;

//Print all armstrong numbers
//153= 1+125+27 powers = num
public class ArmstrongNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println("Armstrong Numbers are:");
		for (int i = 0; i < arr.length; i++) {

			if (findArmstrong(arr[i])) {
				System.out.println("ArmstrongNumber:" + arr[i]);
			}
		}
		sc.close();
	}

	static boolean findArmstrong(int n) {
		int rem = 0;
		int n1 = n;
		int count = 0;
		int sump = 0;
		int temp = n;

		while (temp > 0) {
			rem = temp % 10;
			temp = temp / 10;
			count++;

		}
		while (n1 > 0) {

			rem = n1 % 10;
			n1 = n1 / 10;

			sump += Math.pow(rem, count);

		}
		return n == sump;

	}

}
