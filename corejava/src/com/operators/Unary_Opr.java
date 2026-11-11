package com.operators;

public class Unary_Opr {
//unary operators: +	-	++  --	!
	public static void main(String[] args) {
		System.out.println("Unary Operators");

		int a = 12;
		int b = 14;

		// Unary plus (does nothing special, keeps value same)
		System.out.println("Unary plus operator: " + (+a));

		// Unary minus (changes sign)
		System.out.println("Unary minus operator: " + (-a));

		// Pre-increment (first increment, then use)
		System.out.println("Increment operator (pre): " + (++a));  // a becomes 13

		// Post-increment (first use, then increment)
		System.out.println("Increment operator of b (post): " + (b++));  // prints 14, then b becomes 15

		System.out.println(b);  // now b is 15

		// Pre-decrement (first decrement, then use)
		System.out.println("Decrement operator (pre): " + (--a));  // a becomes 12

		// Post-decrement (first use, then decrement)
		System.out.println("Decrement operator (post): " + (b--));  // prints 15, then b becomes 14

		System.out.println(b);  // now b is 14

		// Logical NOT (reverses condition)
		System.out.println(!(a > 88));  // true, because (12 > 88) is false
	}

}
