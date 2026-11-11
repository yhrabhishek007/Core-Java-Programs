package com.java8features.predefinedfuncinterfaces;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

//Predicate is a predefined functional interface introduced in Java 8
//that is used to perform a condition check and returns a boolean value (true or false).

//Predicate      → 1 input  → boolean
//BiPredicate    → 2 inputs → boolean
//
//IntPredicate   → int  → boolean
//LongPredicate  → long → boolean
//DoublePredicate→ double → boolean

public class TestBiPredicateDemo1 {

	public static void main(String[] args) {

		// BiPredicate takes TWO input values
		// Here both inputs are Integer
		// Returns true if the product of two numbers is even
		BiPredicate<Integer, Integer> p1 = (i1, i2) -> i1 * i2 % 2 == 0;

		System.out.println(p1.test(9, 8)); // true
		// 9 * 8 = 72, and 72 is even

		// BiPredicate can also work with String objects
		// Here we concatenate two Strings
		// and check whether the combined length is greater than 15
		BiPredicate<String, String> p2 = (s1, s2) -> s1.concat(s2).length() > 15;

		System.out.println(p2.test("Java is simple", "in Vcube"));
		// "Java is simplein Vcube" -> length > 15 -> true

		// IntPredicate accepts one primitive int value
		// Returns true if the number is odd
		IntPredicate ip = (i2) -> i2 % 2 == 1;

		System.out.println(ip.test(10)); // false
		// 10 is not odd

		// LongPredicate accepts one primitive long value
		// Checks whether square of the number is 100
		LongPredicate lp = (i) -> i * i == 100;

		System.out.println(lp.test(9)); // false
		// 9 * 9 = 81, not 100
	}
}
