package com.operators;

public class Tricky_Que {

	public static void main(String[] args) {
//1. Increment operator
		int a = 5;
		int b = a++ + ++a;

		System.out.println(a);
		System.out.println(b);

//		2. Compound assignment + casting
		byte x = 10;

		x += 5;
		System.out.println(x);

		// x = x + 5; // what happens if you uncomment? Error TypeMismatch
//		3. Division and modulus
		int a1 = 10;
		int b1 = 3;

		System.out.println(a1 / b1);
		System.out.println(a1 % b1);
//		4. Short-circuit operator
		int x1 = 5;

		if (x1 > 10 && ++x1 > 5) {
			System.out.println(x1);
		}

		System.out.println(x1); // 5 will print

//		5. Difference between & and &&
		int x2 = 5;

		if (x2 > 10 & ++x2 > 5) {
			System.out.println(x2);
		}

		System.out.println(x2); // it will check both conditions ,even if first condition is false then also

//		6. Precedence
		int a2 = 10;

		int result = a2 + 5 * 2; // 20 using BODMAS rule

		System.out.println(result);

//		7. Assignment operator
		int a3 = 10;

		System.out.println(a3 += 5); // 15
		System.out.println(a3); // 15

//		8. Multiple increment
		int a4 = 5;

		a4 = a4++ + ++a4; // 5 + 7

		System.out.println(a4); // 12

//		9. Ternary operator
		int a5 = 10;
		int b5 = 20;

		int max = a5 > b5 ? a5 : b5;

		System.out.println(max); // 20

//		10. String + operator
		int a6 = 10;
		int b6 = 20;

		System.out.println(a6 + b6 + "Java");
		System.out.println("Java" + a6 + b6);

//		11. Relational + logical
		int x3 = 10;

		System.out.println(x3 > 5 || x3++ > 20); // true
		System.out.println(x3); // 10 dead code so it will not check second condition

//		12. Bitwise operator
		int a7 = 5;
		int b7 = 3;
	// &   101        |  101      ^ 101
//	       011           011        011
		// -----------------------------------
		// 001=1         111=7      110=6
		System.out.println(a7 & b7); //
		System.out.println(a7 | b7); //
		System.out.println(a7 ^ b7); //

//		13. Floating-point tricky one
		double d = 0.1 + 0.2;
//The Comparison: When evaluating d == 0.3,Java compares 0.30000000000000004 to 
//		the literal representation of 0.3, which evaluates to false.
		System.out.println(d == 0.3); // false
		int u = 6 + 3;
		System.out.println(u == 9); // true

//		14. Character arithmetic
		char c = 'A'; // in number situation also it prints alphabet
//		ex char c=97; c+=2; 
//		it prints C

		c += 2;

		System.out.println(c); // C
		
//		15. Final tricky one
		int a8 = 5;

		System.out.println(a8++ + a8++ + ++a8);  // 5+6+8=19
		
//		15. Bitwise vs logical
		int x4 = 10;

		if((x4++ > 5) | (++x4 > 20))
		{
		    System.out.println(x4); //12
		}

		System.out.println(x4); //12
		
//		16. Tricky arithmetic
		int a9 = 20;

		System.out.println(a9++ + ++a9 - a9-- + --a9); //20 + 22 - 22 +20=40
		
//		17. String + operator
		int a10 = 10;
		int b10 = 20;

		System.out.println(a10 + b10 + " = " + a10 + b10); //30 = 1020
		
//		18. Ternary with different types
		int a11 = 10;
//		Conclusion: In a ternary operator, 
//		Java checks the types of both possible results first, then decides the final type.
//		means:
//
//			if true → take a11
//			if false → take 20.5
//
//			Since condition is true, value chosen is a11.
		double d2 = true ? a11 : 20.5;

		System.out.println(d2);
		
//		19. Modulus with negative numbers
		int a12 = -10;
		int b12 = 3;

		System.out.println(a % b);
		
	}

}
