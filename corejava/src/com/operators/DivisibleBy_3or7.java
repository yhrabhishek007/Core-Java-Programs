package com.operators;

import java.util.Scanner;

//Write a Java program to check whether a number is divisible by 3 or 7 using logical operators?
public class DivisibleBy_3or7 {

	public static void main(String[] args) {
		System.out.println("Checking whether the number is divisible by 3 or 7");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if (a%3==0 && a%7==0) {
			System.out.println("The number  "+ +a +" is  divisible by both 3 and 7");
		}
		else if(a%3==0 || a%7==0) {
			System.out.println("The number  "+ +a +" is  divisible by 3 or 7 ");
			
		}
		else {
			System.out.println("The number is not divisible by both 3 and 7");
		}

		
	}

}
