package com.operators;
//Increment & Decrement operators
public class Unary1_IncDec {

	public static void main(String[] args) {
		int a=30;
		int b=26;
		System.out.println(++a + b++ + --b + a++ + a++ + ++b + ++a); // 31 + 26 + 26 + 31 + 32 + 27 + 34=207
		System.out.println(++a + b++ - ++a + ++b + b++ + b-- + b-- + a++); //31 + 26  - 32  + 28  + 28  + 29  + 28  + 32
		          
		int x=10;
		int y=9;
		System.out.println(x++); //10
		System.out.println(y++); //9
		System.out.println(y++);//10
		System.out.println(++x); //12
		System.out.println(++y); //12
		System.out.println(y--); //12
		System.out.println(--y); //10
		System.out.println(x++); //12
		
		System.out.println(x); //13
		
		
//		Important
//		Narrowing = type conversion from larger → smaller type.
//		Implicit casting = conversion done automatically by Java.
//
//		Java usually does not allow implicit narrowing because data may be lost.
		
	//Assignment Operator:	
		
		short s = 10;

		// Error: result is int
		// s = s + 1;

		s += 1;   // No error (implicit casting)

		char c = 'A';

		// Error: result is int
		// c = c + 1;

		c += 1;   // No error (implicit casting)

		float f = 10.5f;

		// Error: result is double
		// f = f + 1.0;

		f += 1.0; // No error (implicit casting)
		

	}

}
