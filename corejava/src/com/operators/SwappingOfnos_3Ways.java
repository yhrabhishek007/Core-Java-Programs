package com.operators;

import java.util.Scanner;

public class SwappingOfnos_3Ways {

	public static void main(String[] args) {
//1.Java program to swap two numbers with using a third variable temp varibale
		System.out.println("Main method started");
		System.out.println("1.Java program to swap two numbers with using a third variable temp varibale");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number(a):");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number(b):");
		int b = sc.nextInt();
//   c is temp variable so it is empty at starting 
		int c = a; // a=c--> c=10 (10 is stored in c)
		a = b; // a=b --> b=20-->a so a=20
		b = c; // b=c --> c=10-->b so b=10

		System.out.println("After swapping a is:" + a);
		System.out.println("After swapping b is:" + b);
		System.out.println("--------------------------->");

		System.out.println("2.Java program to swap two numbers with using "
				+ "arithmetic operators with out using third varibale");

		System.out.println("Enter 1st number(a1):");
		int a1 = sc.nextInt();
		System.out.println("Enter 2nd number(b1):");
		int b1 = sc.nextInt();

		a1 = a1 + b1; // adding both 1st and 2nd number a1=some value ex a1=10 b1=20 now a1=30
		// a1=a1-b1; //now 30-20 =10 ❎ again repeating so we should store that in b
		b1 = a1 - b1; // now a1=30 and b1=20 so after a1-b1 the result will be 30-20=10 so b1 will
						// swapped ✅
		a1 = a1 - b1; // now the value of b1 is 10 and a1 value from starting is 30 ,30-10=20

		System.out.println("After swapping a1 is:" + a1);
		System.out.println("After swapping b1 is:" + b1);
		System.out.println("--------------------------->");

		System.out.println("3.Java program to swap two numbers using XOR operator");

		System.out.println("Enter 1st number(a2):");
		int a2 = sc.nextInt();
		System.out.println("Enter 2nd number(b2):");
		int b2 = sc.nextInt();

		a2 = a2 ^ b2;   // 10100 (20)
						// 01010 (10)
						// -----
						// 11110 (30)

		b2 = a2 ^ b2;   // 11110 (30)
						// 01010 (10)
						// -----
						// 10100 (20)

		a2 = a2 ^ b2;   // 11110 (30)
						// 10100 (20)
						// -----
						// 01010 (10)

		System.out.println("After swapping a2 is:" + a2);
		System.out.println("After swapping b2 is:" + b2);
		
		sc.close();

	}

}
