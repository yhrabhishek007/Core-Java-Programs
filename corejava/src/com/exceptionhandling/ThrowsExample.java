package com.exceptionhandling;

import java.io.IOException;

public class ThrowsExample {

	// Declare that this method may throw IOException.
	static void show() throws IOException {

		System.out.println("Show method called.");

	}

	public static void main(String[] args) throws IOException {

		// Calling a method that declares IOException.
		show();

		// If we don't handle the exception using try-catch
		// or declare it using throws, a compile-time error occurs.
	}

}