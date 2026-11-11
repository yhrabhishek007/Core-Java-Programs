package com.operators;

import java.util.Scanner;

public class Shift_Opr {

	public static void main(String[] args) {

		System.out.println("Left Shift Operator");

		// Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Input first number
		System.out.println("Enter a:");
		int a = sc.nextInt();

		// Input number of positions to shift
		System.out.println("Enter b:");
		int b = sc.nextInt();

		// Left shift operation
		int c = a << b;  
		// a << b means shifting binary bits of 'a' to the left by 'b' positions
		// Each left shift multiplies the number by 2

		System.out.println("After performing left shift operator: " + c);
		
		System.out.println("----------------------------------->");

		System.out.println("Right Shift Operator");

		// Input first number for right shift
		System.out.println("Enter a1:");
		int a1 = sc.nextInt();

		// Input number of positions to shift
		System.out.println("Enter b1:");
		int b1 = sc.nextInt();

		// Right shift operation
		int c1 = a1 >> b1;
		// a1 >> b1 means shifting binary bits of 'a1' to the right by 'b1' positions
		// Each right shift divides the number by 2 (ignoring remainder)

		System.out.println("After performing right shift operator: " + c1);
		System.out.println("-------------------------------->");
		
		System.out.println("Unsigned Right shift");

		// Input number
		System.out.println("Enter a2:");
		int a2 = sc.nextInt();

		// Input shift value
		System.out.println("Enter b2:");
		int b2 = sc.nextInt();

		// Unsigned right shift operation
		int c2 = a2 >>> b2;
		// >>> shifts bits to the right and fills LEFT side with 0s always
		// Unlike >>, it does NOT keep the sign bit (so it treats number as unsigned)

		System.out.println("After performing unsigned right shift operator: " + c2);
		
	}

}
