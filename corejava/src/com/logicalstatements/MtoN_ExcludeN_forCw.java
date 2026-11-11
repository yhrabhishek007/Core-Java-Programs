package com.logicalstatements;

import java.util.Scanner;

//1. Write a Java program to print numbers from M to N(exclude N)?
//Input : Enter a starting range value: 5
//Enter a ending range value: 10
//Output: 5 6 7 8 9
public class MtoN_ExcludeN_forCw {

	  void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number:");
		int start=sc.nextInt();
		System.out.println("Enter ending number:");
		int end = sc.nextInt();
		
		doughEven(start,end);
		sc.close();
	}
	
	void doughEven(int n1,int n2){
		
		for(int i=n1;i<n2;i++) {
			System.out.print(i + " ");
		}
		
	
	}

}
