package com.arrays;

import java.util.Scanner;

public class SecondMaxElement {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int sz = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[sz];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int maxnum = arr[0];
		int secmax = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maxnum) { // array>max all
				maxnum = arr[i]; // max
			} else if (arr[i] > secmax && arr[i] != maxnum) {
				secmax = arr[i];

			}

		}
		System.out.println(secmax);
		System.out.println(maxnum);
		sc.close();

	}

}

//
//Read the array size.
//Read all array elements.
//Start checking from the last element (rightmost).
//Why? Because the last element is always a leader.
//Store the last element as the current maximum.
//Move from right to left through the array.
//For each element:
//Compare it with the current maximum.
//If the current element is greater than the current maximum:
//It is a leader.
//Update the current maximum to this element.
//Continue until you reach the first element.
//Since you found leaders from right to left, print them:
//either by storing them first and printing in reverse order,
//or by another method that gives the original left-to-right order.





















