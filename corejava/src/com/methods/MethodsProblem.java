package com.methods;
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//
//The smallest value is 25.0
public class MethodsProblem {

	public static void main(String[] args) {
		MethodsProblem m = new MethodsProblem();
		m.num(38,7,9);
//		m.num1(37);
//		m.num2(29);
		
	}
	void num(int a ,int b , int c) {
//		System.out.println("Number 1:" +a);
		if (a<b & a<c ) {
			System.out.println("a is smaller:"+a);
		}
		else if (b<c & b<a) {
			
			System.out.println("b is smaller:"+b);
		}
		else {
			System.out.println("c is smaller" +c);
		}
		
	}
//	void num1(int b) {
//		System.out.println("NUmber 2:" +b);
//	}
//	void num2(int c) {
//		System.out.println("Number 3:" +c);
//	}
	
}