package com.java8features.predefinedfuncinterfaces;

import java.util.function.Function;

public class TestFunctionDemo3 {

	public static void main(String[] args) {

		// Creating Function: f1 multiplies the input by 4
		Function<Integer, Integer> f1 = (i) -> i * 4;

		// Creating Function: f2 multiplies the input by itself
		Function<Integer, Integer> f2 = (i) -> i * i;

		// 1. apply() -> ABSTRACT method
		// It executes the function
		// 2 * 4 = 8
		System.out.println(f1.apply(2));

		// 2. andThen() -> DEFAULT method
		// First f1 is executed, then f2
		// f1: 2 * 4 = 8
		// f2: 8 * 8 = 64
		System.out.println(f1.andThen(f2).apply(2)); // 64

		// 3. compose() -> DEFAULT method
		// First f2 is executed, then f1
		// f2: 2 * 2 = 4
		// f1: 4 * 4 = 16
		System.out.println(f1.compose(f2).apply(2)); // 16

		System.out.println(f2.andThen(f1).apply(2));
	}
}
