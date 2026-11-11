package com.java8features;

// Functional interface: an interface with only one abstract method
@FunctionalInterface
interface In1 {

	// Abstract method that will be implemented using a lambda expression
	public abstract void hello();
}

public class TestJ8Demo1 {

	public static void main(String[] args) {

		// Starting point of the main method
		System.out.println("main method started");

		// Lambda expression used to implement the hello() method
		In1 t = () -> {

			// This message will be printed when hello() is called
			System.out.println("Hello Guys, Good Morning !!");
		};

		// Calling the hello() method using the lambda expression
		t.hello();

		// End of the main method
		System.out.println("main method ended");
	}
}



//What is a Lambda Expression?
//A lambda expression is a short way of writing the implementation of a method.
//
//In simple words:
//
//Lambda expression = a shorter way to write code for a functional interface method.




//In1       → Functional interface
//t         → Reference variable
//()        → No parameters
//->        → Lambda operator
//{ ... }   → Implementation of hello()


//Question	Answer
//What?	   Anonymous function introduced in Java 8
//Why?	   Less code, cleaner and more readable
//How?		(parameters) -> { implementation }
//Works with?	Functional interfaces
//Main requirement?	Exactly one abstract method
//Commonly used with?	Collections, Streams, functional programming


//Most Important Interview Questions
//Remember these 7 points:
//
//What is Lambda?
//→ Anonymous function introduced in Java 8.
//
//Why Lambda?
//→ Reduces boilerplate code and improves readability.
//
//Lambda works with what?
//→ Functional interfaces.
//
//What is a Functional Interface?
//→ Interface with exactly one abstract method.
//
//Is @FunctionalInterface mandatory?
//→ No, it's optional but recommended.
//
//Can a Functional Interface have default/static methods?
//→ Yes, multiple default/static methods are allowed.
//
//Where are Lambdas commonly used?
//→ Collections, Streams, and functional programming.