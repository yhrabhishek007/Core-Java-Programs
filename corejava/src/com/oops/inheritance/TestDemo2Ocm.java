package com.oops.inheritance;

public class TestDemo2Ocm {

	public static void main(String[] args) {

		Student s1 = new Student(102, "Ram", new Address("Banglore"));

		// Object class is the parent class of all Java classes.

		// getClass()
		// - Used to get the class information of an object.
		// - Returns the runtime class of the object.

		// toString()
		// - Used to represent object data in String format.
		// - By default, it prints class name + hashcode.
		// - We can override it to display meaningful object details.
		System.out.println(s1.getClass());
		System.out.println(s1.toString());
	}

}
