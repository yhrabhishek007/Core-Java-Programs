package com.java8features;

// Abstract class
abstract class Test1 {

	// Abstract method
	abstract void method1();
}

public class TestJ8Demo10 {

	public static void main(String[] args) {

		// Anonymous Inner Class
		// We are creating an object of Test1
		// and providing the implementation of method1()
		Test1 t1 = new Test1() {

			@Override
			void method1() {
				System.out.println("method1 called");
			}
		};

		// Calling the implemented method
		t1.method1();
	}
}

//Anonymous Inner Class	        Functional Interface + Lambda
//Can extend a class	          -->  Works with an interface
//Can implement an interface	  --> Interface must have exactly one abstract method
//Introduced before Java 8     -->Lambda introduced in Java 8
//More code	                   -->Less code
//Uses new keyword	           -->Lambda does not use new
//Can have multiple methods     -->Lambda implements only the single abstract method
//More suitable when implementation is complex	-->Good for short/simple implementations
