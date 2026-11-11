package com.operators;

import java.util.Scanner;

//Write a Java program to demonstrate the conditional (ternary) operator (?:) 
//by finding the greater of three integers?
public class Ternary_Opr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Comapring with two numbers:");
		System.out.println("Enter 2 values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int max=(a>b)?a:b;
		System.out.println("Maximum value from two numbers is: "+max);
		System.out.println("---------------------------------->");
		
		System.out.println("Comapring with three numbers:");
		System.out.println("Enter 3 numbers:");
		
		int c = sc.nextInt();
		int d= sc.nextInt();
		int e=sc.nextInt();
		
//		Think of it as:
//			Find the larger between c and d.
//			Compare that larger value with e.
//			Return the largest of all three.
		
		int max1=(c>d)?
				(c>e?c:e):(d>e?d:e);
		
		System.out.println("Maximum value from two numbers is: "+max1);

		

		
		
	}

}
