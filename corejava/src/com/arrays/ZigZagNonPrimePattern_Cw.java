package com.arrays;

//1.Write a Java program to print a zig-zag pattern of non-prime numbers 
//(including 1 and composite numbers) for a given number of rows \(N\). 
//Alternating rows must print in forward (left-to-right) and reverse (right-to-left) order.
//Input: N = 5
//Output:
//1
//6 4
//8 9 10
//16 15 14 12
//18 20 21 22 24
import java.util.Scanner;

public class ZigZagNonPrimePattern_Cw {

	static boolean isPrime(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();

		int num = 1;

		for (int i = 1; i <= n; i++) {

			int arr[] = new int[i];
			int k = 0;

			while (k < i) {
				if (!isPrime(num)) {
					arr[k] = num;
					k++;
				}
				num++;
			}

			if (i % 2 == 1) {
				for (int j = 0; j < i; j++)
					System.out.print(arr[j] + " ");
			} else {
				for (int j = i - 1; j >= 0; j--)
					System.out.print(arr[j] + " ");
			}

			System.out.println();
		}

		sc.close();
	}
}