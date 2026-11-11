package com.java8features.predefinedfuncinterfaces;

import java.util.function.Predicate;

public class TestPredicateDemo1 {

	public static void main(String[] args) {

		// Predicate is a predefined Functional Interface in Java 8.
		// It takes one input and returns boolean (true/false).

		// Predicate<Integer> means input type is Integer.
		// Checks whether the given number is even.

		double[] marks = { 65, 75, 82, 56, 84, 99 };
		// This Predicate checks whether marks are greater than or equal to 75.
		Predicate<Double> p5 = (d) -> d >= 75;

		// Enhanced for loop to check each mark
		for (double m : marks) {

			// test() executes the Predicate condition.
			// If condition is true, print the mark.
			if (p5.test(m)) {
				System.out.println(m);
			}
		}
		Predicate<Integer> p1 = (i) -> i % 2 == 0;

		System.out.println(p1.test(10)); // true
		System.out.println(p1.test(11)); // false

		// Checks whether the square of the number is greater than 100.
		Predicate<Integer> p2 = (a) -> a * a > 100;

		System.out.println(p2.test(10)); // false -> 10*10 is not greater than 100
		System.out.println(p2.test(100)); // true -> 100*100 is greater than 100

		System.out.println("*********************************");

		// Predicate can also work with String.
		// Checks whether String length is greater than 15.
		Predicate<String> p3 = (s) -> s.length() > 15;

		System.out.println(p3.test("Abhishek")); // false

		// Checks whether the String is equal to "Java@123".
		// equalsIgnoreCase() ignores uppercase/lowercase differences.
		Predicate<String> p4 = (s) -> s.equalsIgnoreCase("Java@123");

		System.out.println(p4.test("java@123")); // true

		System.out.println("*******************************");

		String s2 = "Abhishek";

		// == compares object references for String objects.
		// Here the lambda compares the reference of s with s2.
		Predicate<String> p6 = (s) -> s == s2;

		System.out.println(p6.test("Abhishek")); // true
	}
}
