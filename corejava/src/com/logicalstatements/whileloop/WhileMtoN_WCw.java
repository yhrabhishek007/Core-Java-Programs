package com.logicalstatements.whileloop;

import java.util.Scanner;

public class WhileMtoN_WCw {

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
		
		while(n1<n2) {
			System.out.println(n1 + " ");
			n1++;

		}
	}

}
