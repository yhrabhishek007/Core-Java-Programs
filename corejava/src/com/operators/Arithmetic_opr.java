package com.operators;

import java.util.Scanner;


//1. Write a Java program to perform addition, subtraction, multiplication, division, and modulus operations on two numbers and display the results?
//
//2. Write a Java program to calculate the area and perimeter of a rectangle using arithmetic operators?
//
//3. Write a Java program to swap two numbers with using a third variable using arithmetic operators?
public class Arithmetic_opr {
static Scanner sc = new Scanner(System.in); // if we keep sacnner class as static then we can access 
//anywhere inside static or instance methods
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Arithmetic Operators:");
		System.out.println("Enter a:");
		int a= sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
	
		
		System.out.println("Addition of two numbers: "+(a+b));
		System.out.println("Subtraction of two numbers: "+(a-b));
		System.out.println("MUltiplication of two numnbers: " +a*b);
		System.out.println("Division of two numbers:"+ a/b);
		System.out.println("Modulus of two numbers:"+a%b);
		
		System.out.println("----------------------------------->");
		
		System.out.println("Perimeter of Rectangle:");
		System.out.println("Enter Length:");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth:");
		double br = sc.nextDouble();
		System.out.println("Perimeter of Rectangle is:" + (2*(l+br)));

	    System.out.println("-------------------------------->");
	    System.out.println("Java program to swap two numbers with using a third variable using arithmetic operators");

	    
	    System.out.println("Enter 1st number:");
	    int d=sc.nextInt();
	    System.out.println("Enter 2nd number:");
	    int e=sc.nextInt();
	    int f;
	    
	    
	    f=d;
	    d=e;
	    e=f;
	    
	    System.out.println("After swapping:"+d);
	    System.out.println("After swapping:"+e);
		
		Arithmetic_opr o = new Arithmetic_opr();
		
		o.addition(4,4);
		o.subtraction(8,4);
		o.multiplication();
		o.division();
		o.modulus(0, 0);  // if we are taking values like parameters then we should return them 
	    
	    
	}
	void addition(int a,int b) {
		System.out.println("Addition of two numbers:"+(a+b));
		
	}
	int subtraction(int a,int b) {
		int c=a-b;
		System.out.println("Subtraction of two numbers:"+(c));
		return c;
		
	}
	int multiplication() {
		System.out.println("Multiplication of two numbers");
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("Multiplication of two numbers is:"+c);
		return c;  // don't return method name just return the value
//	Note **	ex: return multiplication(); wrong   give like this return c; correct

	}
	void division() {
		System.out.println("Division of two numbers");
		System.out.println("Enter a value:");
		double a=sc.nextDouble();
		System.out.println("Enter b value:");
		double b=sc.nextDouble();
		double c=a/b;
		System.out.println("Division of two numbers is:"+c);
		
	}
	double modulus(double a,double b) {
		System.out.println("Modulus of two numbers");
		
		System.out.println("Enter a value:");
		double a1=sc.nextDouble();
		System.out.println("Enter b value:");
		double b1=sc.nextDouble();
		double c=a1%b1;
		System.out.println("Modulus of two numbers is:"+c);
		return c;
		
	}
	

}
