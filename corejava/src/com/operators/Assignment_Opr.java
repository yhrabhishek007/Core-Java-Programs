package com.operators;

//Assignment Operators------> +=, -= , *= ,/= ,%=
public class Assignment_Opr {

	public static void main(String[] args) {
//		Widening (int → long) → usually implicit.
//		Narrowing (long → int) → usually explicit.
//		Compound assignment (+=) can perform an implicit narrowing cast.
		
//	Rule
//	x = x + y; → Java checks the result type strictly. If narrowing is needed, it throws a compile-time error.
//	x += y; → Java automatically casts the result back to the type of x.


		int a = 15;
		int b = 20;

		a += b; // a = a + b = 35
		System.out.println(a);

		b *= 2; // b = b * 2 = 40
		System.out.println(b);

		a -= 10; // a = 35 - 10 = 25
		System.out.println(a);

		b /= 5; // b = 40 / 5 = 8
		System.out.println(b);

		a %= 7; // a = 25 % 7 = 4
		System.out.println(a);

		b += a; // b = 8 + 4 = 12
		System.out.println(b);

		a *= b; // a = 4 * 12 = 48
		System.out.println(a);

	}

}
