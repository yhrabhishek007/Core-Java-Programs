package com.operators;

import java.util.Scanner;

//Write a Java program to demonstrate all bitwise operators (&, |, ^, ~, <<, >>, >>>) using two integers
public class Bitwise_Opr {
Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main method started");
		Bitwise_Opr b = new Bitwise_Opr();
		b.bitwiseAnd();
		b.bitwiseOr(1, 1);
		b.bitwiseXor(0, 1);
		b.bitwiseTilt(14);
		
		System.out.println("Left shift:");
		System.out.println(12<<2);
		System.out.println(56<<3);
		System.out.println("------------------------>");
		
		System.out.println("Right shift:");
		System.out.println(12>>2);
		System.out.println(56>>3);
		
		System.out.println("------------------------------>");
		System.out.println("Unsigned Right shift:");
		System.out.println(12>>>2);
		System.out.println(56>>>3);
		
		
	}
	 void bitwiseAnd() {
		System.out.println("Biitwise AND operator");
		System.out.println("Enter a:");
		int a =sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		int c=a&b;
		System.out.println("After bitwise & operation: "+c);
	}
	 void bitwiseOr(long a,long b) {
		 System.out.println("Bitwise OR operator");
		 System.out.println("Enter a:"+a);
		 System.out.println("Enter b:"+b);
		 long c=a|b;
		 System.out.println("After bitwise OR operation: "+c);
	
	 }
	 
	 int bitwiseXor(int a,int b) {
		 System.out.println("Bitwise XOR operator");
		 System.out.println("Enter a:"+a);
		 System.out.println("Enter b:"+b);
		 int c=a^b;
		 System.out.println("After bitwise OR operation:"+c);
		 return c;
	 }
	 int bitwiseTilt(int a) {
		 System.out.println("Bitwise Tilt operator");
		 System.out.println("Enter a number:"+a);
		 int b=~a;
		 System.out.println("After bitwise Tilt operation: "+b);
		 System.out.println();
		 return b;
	 }
	 

}
