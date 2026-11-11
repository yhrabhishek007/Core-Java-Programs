package com.java8features.optional;

import java.util.Optional;

public class TestOptionalDemo3 {

	public static void main(String[] args) throws Exception {

		// A String variable containing null.
		String name = null;

		/*
		 * Optional.ofNullable()
		 *
		 * What does it expect? -> It expects a value of any type.
		 *
		 * Method: Optional.ofNullable(T value)
		 *
		 * T = Type of the value
		 *
		 * If the value is NOT null: -> Optional contains the value.
		 *
		 * If the value IS null: -> Optional becomes empty.
		 */
		String result = Optional.ofNullable(name)

				/*
				 * orElseThrow()
				 *
				 * What does it expect? -> It expects a Supplier that creates/returns an
				 * exception.
				 *
				 * Method: <X extends Throwable> T orElseThrow( Supplier<? extends X>
				 * exceptionSupplier )
				 *
				 * Supplier means: -> "Give me something later when I need it."
				 *
				 * Here: () -> new Exception("Value is not there")
				 *
				 * is a Supplier.
				 *
				 * It means: "If the Optional is empty, create and return this Exception."
				 */
				.orElseThrow(() -> new Exception("Value is not there"));

		// If a value exists, orElseThrow() returns that value.
		// If no value exists, it throws the supplied exception.
		System.out.println(result);
	}

}
