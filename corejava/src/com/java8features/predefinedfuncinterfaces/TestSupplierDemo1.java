package com.java8features.predefinedfuncinterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplierDemo1 {

	public static void main(String[] args) {

		// Supplier is a predefined Functional Interface in Java 8.
		// It does NOT take any input.
		// It returns/supplies one value.
		// Main method: get()

		// Supplier<String> means:
		// No input
		// Return type is String
		Supplier<String> s1 = () -> "Abhishek";

		// get() is used to get the value from Supplier
		System.out.println(s1.get());

		// Supplier can also contain multiple statements.
		Supplier<String> s2 = () -> {

			String fname = "Abhishek";
			String lname = "Y";

			// Create full name
			String fullName = fname + lname;

			// Return the value
			return fullName;
		};

		System.out.println(s2.get());

		// Supplier<Date> means:
		// No input
		// Return type is Date
		//
		// new Date() creates the current date/time
		Supplier<Date> s3 = () -> new Date();

		System.out.println(s3.get());
	}
}
