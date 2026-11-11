package com.arrays;

import java.util.Scanner;

//1. Write a Java program to find and print all the leaders in an array?
//Input: Enter the size of the array: 6
//Enter the array elements: 16 17 4 3 5 2
//Output: 17 ,5 ,2
//******Imp Note**********
//A leader is an element that is greater than or equal to all the elements on its right side.

public class FindLeaders_Cw {

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

		int[] leaders = new int[arr.length]; // stores leader elements
		int leader = arr[arr.length - 1]; // stores current maximum value
		int count = 0;

		for (int i = arr.length - 1; i > 0; i--) {

			if (arr[i] >= leader) {
				leaders[count] = arr[i];
				count++;
				leader = arr[i];

			}
			

		}
		for (int j = count - 1; j >= 0; j--) {

			System.out.println(leaders[j]);
//			System.out.println(arr[j]);

		}
		sc.close();

	}

}
//
//package com.arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//// Program to find and print all leaders in an array
//// A leader is an element which is greater than or equal to all elements on its right side
//// Input: 16 17 4 3 5 2
//// Output: 17 5 2
//
//public class FindLeadrer_Cw {
//
//	public static void main(String[] args) {
//
//		System.out.println("Main method started");
//
//		// Creating Scanner object to take input from user
//		Scanner sc = new Scanner(System.in);
//
//		// Taking array size from user
//		System.out.println("Enter size:");
//		int sz = sc.nextInt();
//
//		// Creating an array with given size
//		int arr[] = new int[sz];
//
//		// Taking array elements from user
//		System.out.println("Enter array elements:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		// Array to store the leader elements
//		int[] leaders = new int[arr.length];
//
//		// Assuming the last element as the current leader
//		// because the last element always has no element to its right
//		int leader = arr[arr.length - 1];
//
//		// Count variable to keep track of how many leaders are stored
//		int count = 0;
//
//		// Traversing the array from right side to left side
//		for (int i = arr.length - 1; i > 0; i--) {
//
//			// Checking whether current element is greater than or equal to leader
//			if (arr[i] >= leader) {
//
//				// Storing the leader element into leaders array
//				leaders[count] = arr[i];
//
//				// Increasing count after storing a leader
//				count++;
//
//				// Updating leader with the current maximum value
//				leader = arr[i];
//			}
//		}
//
//		// Printing leaders in reverse order because they are stored from right to left
//		for (int j = count - 1; j >= 0; j--) {
//
//			System.out.println(leaders[j]);
//		}
//	}
//}

//public class Leader {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of the array:");
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		System.out.println("Enter the array elements:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int []res=findLeader(arr);
//		System.out.println(Arrays.toString(res));
//
//	}
//
//	static int[] findLeader(int[] arr) {
//		int n=arr.length;
//		 int[] leader=new int[n];
//		 leader[n-1]=arr[n-1];
//		 for(int i=n-2;i>=0;i--) {
//			 for(int j=i+1;j<n;j++) {
//				 if(arr[i]<=arr[j]) {
//					 leader[i]=arr[j];
//				 }
//				 
//			 }
//			 if(leader[i]==0) {
//				 leader[i]=-1;
//			 }
//		 }
//		 return leader;
//		
//	}
//
//}