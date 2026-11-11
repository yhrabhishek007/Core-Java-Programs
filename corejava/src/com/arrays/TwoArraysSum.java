package com.arrays;

public class TwoArraysSum {

	public static void main(String[] args) {
		System.out.println("Main method started");

		int[] a = { 10, 20, 54, 63, 3, 22, 54 };
		int[] b = { 55, 85, 22, 2, 25 };
		int[] c = new int[a.length];

		System.out.println("Two Arrays sum is:");
		for (int i = 0; i < a.length; i++) {
			if (i < b.length) {
				c[i] = a[i] + b[i];

			} else {
				c[i] = a[i];
			}
			System.out.print(c[i] + "|");
		}

	}

}
