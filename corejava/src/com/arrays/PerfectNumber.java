package com.arrays;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		int num=0;
		int index=0;
		
		while(index<size) {
			if(perfectNumber(num)) {
				arr[index]=num;
				index++;
			}
			num++;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		sc.close();

	}
	

	static boolean perfectNumber(int n) {

		int sum = 0;
		int i=1;

		while(i<n) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
			
		}
		return sum==n;
		
	}

}
