package com.java8features.predefinedfuncinterfaces;

import java.util.function.Consumer;

public class TestConsumerDemo1 {

	public static void main(String[] args) {

		// Consumer is a predefined Functional Interface in Java 8.
		// It takes one input but does NOT return any value.
		// Main method: accept()

		// Consumer<String> means input type is String.
		Consumer<String> c1 = (s) -> {

			// Perform some operation using the input
			System.out.println("Welcome Mr/Mrs " + s);
		};

		// accept() is used to execute the Consumer
		c1.accept("Abhishek");

		// Consumer<Integer> means input type is Integer.
		Consumer<Integer> c2 = (a) -> {

			// Perform calculation
			int sum = a + 150;

			// Print the result
			System.out.println("Sum :" + sum);
		};

		// Passing 10 as input
		c2.accept(10);
	}
}
