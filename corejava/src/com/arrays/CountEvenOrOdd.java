package com.arrays;
import java.util.Scanner;
//1. Write a Java program to count even and odd elements in an array?
//Input: Enter the size of the array: 6
//Enter the array elements: 10 15 22 33 40 51
//Ouput : Number of Even Elements: 3
//Number of Odd Elements: 3
public class CountEvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size =sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		int Evencount=0;
		int Oddcount=0;

		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				Evencount++;
			}else {
				Oddcount++;
			}
		}
		System.out.println("Number of Even Elements:"+Evencount);
		System.out.println("Number of Odd Elements:"+Oddcount);
		sc.close();

	}

}
