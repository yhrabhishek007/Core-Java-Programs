package com.java8features.predefinedfuncinterfaces;

import java.util.function.Function;

public class TestFunctionDemo1 {

	public static void main(String[] args) {

		// Function is a predefined Functional Interface in Java 8.
		// It takes one input and returns one output.
		//
		// Function<InputType, ReturnType>

		// Input -> Integer
		// Output -> Integer
		// Multiplies the given number by 5.
		Function<Integer, Integer> f1 = (i) -> i * 5;

		// apply() is used to execute the Function.
		System.out.println(f1.apply(85)); // 425

		// Input -> String
		// Output -> Integer
		// Returns the length of the given String.
		Function<String, Integer> f2 = (s) -> s.length();

		System.out.println(f2.apply("Java is simple")); // 14

		// Input -> String
		// Output -> String
		// substring(5) returns the String starting from index 5.
		Function<String, String> f3 = (s) -> s.toString().substring(5);

		System.out.println(f3.apply("Good Morning guys, Have a nice day!!"));

		// Input -> Integer
		// Output -> String
		// Converts Integer into String.
		Function<Integer, String> f4 = (i) -> Integer.toString(i);

		System.out.println(f4.apply(455676) + " Java");
	}
}
