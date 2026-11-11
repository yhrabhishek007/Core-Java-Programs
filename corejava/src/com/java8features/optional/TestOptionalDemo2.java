package com.java8features.optional;

import java.util.Optional;

public class TestOptionalDemo2 {
	
//	Method	                        What it expects	          What it does	                              Return type
//	ofNullable(value)	                 Value	       Creates Optional containing value, or empty if null	Optional<T>
//	empty()	                            Nothing	       Creates an empty Optional	                             Optional<T>
//	ifPresent(Consumer)	                Consumer	    Executes Consumer if value exists	                       void
//	isPresent()	                        Nothing	     Checks whether value exists	                               boolean
//	get()	                            Nothing	           Gets the value	                                      T

	public static void main(String[] args) {

		// Optional.ofNullable() creates an Optional that can contain
		// a non-null value or can be empty if the value is null.
		Optional<String> opt = Optional.ofNullable("Java");

		// ifPresent() executes the lambda only when a value is present.
		// Here, "Java" is present, so it will print: Java
		opt.ifPresent(value -> System.out.println(value));


		// Here, we are passing null to ofNullable().
		// So, opt1 will be an empty Optional.
		Optional<String> opt1 = Optional.ofNullable(null);

		// Since opt1 is empty, the lambda will NOT execute.
		// Therefore, nothing will be printed.
		opt1.ifPresent(value -> System.out.println(value));


		System.out.println("***********************");


		// Optional.empty() creates an Optional with no value.
		Optional<String> opt2 = Optional.empty();

		// get() tries to retrieve the value from Optional.
		// Since opt2 is empty, calling get() would throw:
		// NoSuchElementException
		// System.out.println(opt2.get());


		System.out.println("************************");


		// This array contains some String values and one null value.
		String[] names = { "Java", "React", "Servlets", null, "Jsp" };


		// Loop through each name in the array.
		for (String name : names) {

			// Calling a method directly on a null value causes
			// NullPointerException.
			// System.out.println(name.toUpperCase());


			// Convert the name into an Optional.
			// If name is not null -> Optional contains the value.
			// If name is null -> Optional will be empty.
			Optional<String> opt3 = Optional.ofNullable(name);


			// isPresent() checks whether the Optional contains a value.
			if (opt3.isPresent()) {

				// get() returns the value stored inside Optional.
				// This is safe here because isPresent() confirmed
				// that a value exists.
				System.out.println(opt3.get());
			}
		}
//		What this example demonstrates
//		Optional.ofNullable(value) → creates an Optional that may contain a value or may be empty.
//
//		Optional.empty() → creates an empty Optional.
//
//		isPresent() → checks whether a value exists.
//
//		get() → retrieves the value, but can throw NoSuchElementException if the Optional is empty.
//
//		ifPresent() → executes code only when a value exists.
//
//		Optional helps avoid direct null checks and reduces the chance of a NullPointerException.
//
//		One important point: In modern Java, ifPresent() is generally preferable to isPresent() followed by get(), because it avoids the possibility of calling get() on an empty Optional.

	}
}
