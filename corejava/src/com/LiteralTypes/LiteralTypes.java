package com.LiteralTypes;

//A literal is a fixed value written directly in a Java program.
//
//Example:
//
//int age = 20;
//
//Here:
//
//age → identifier
//int → data type
//20 → literal
//
//👉 In simple words:
//Literal = a constant value written directly in the source code.

public class LiteralTypes {
	public static void main(String[] args) {

		// 1. Integer literals
		int decimal = 100; // Decimal
		int binary = 0b1010; // Binary
		int octal = 012; // Octal
		int hexadecimal = 0x64; // Hexadecimal
		long bigNumber = 100000L;

		// 2. Floating-point literals
		double decimalValue = 10.5;
		float floatValue = 10.5f;

		// 3. Character literals
		char letter = 'A';
		char digit = '7';
		char newline = '\n';

		// 4. String literals
		String message = "Hello Java";

		// 5. Boolean literals
		boolean isJavaEasy = true;
		boolean isPython = false;

		// 6. Null literal
		String name = null;

		// Displaying the values
		System.out.println("Integer literals:");
		System.out.println(decimal);
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexadecimal);
		System.out.println(bigNumber);

		System.out.println("\nFloating-point literals:");
		System.out.println(decimalValue);
		System.out.println(floatValue);

		System.out.println("\nCharacter literals:");
		System.out.println(letter);
		System.out.println(digit);

		System.out.println("\nString literal:");
		System.out.println(message);

		System.out.println("\nBoolean literals:");
		System.out.println(isJavaEasy);
		System.out.println(isPython);

		System.out.println("\nNull literal:");
		System.out.println(name);
	}
}
