package com.exceptionhandling;

//Create a custom unchecked exception.
public class AgeException extends RuntimeException {

	// Constructor to pass the exception message.
	public AgeException(String s) {

		// Pass the message to the parent class.
		super(s);

	}

}
