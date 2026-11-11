package com.logicalstatements;

import java.util.Scanner;

public class FactorialRec_forCw {

	 void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int fact =factorialRec(n);
		System.out.println("Factorial of "+n+ " is:" +fact);
		
		sc.close();
	}

	  int factorialRec(int n) {
		  
		  if(n==0 || n==1)
			  return 1;
		  
		 return factorialRec(n-1)*n;

		  
	}
}
