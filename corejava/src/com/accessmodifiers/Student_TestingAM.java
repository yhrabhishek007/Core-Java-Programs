package com.accessmodifiers;

public class Student_TestingAM {

	// Accessible ONLY inside this class.
	private int privateVar = 10;

	// Default (package-private)
	// Accessible only by classes in the same package.
	int defaultVar = 20;

	// Protected
	// Accessible in the same package and in subclasses
	// even if they are in a different package.
	protected int protectedVar = 30;

	// Public
	// Accessible from anywhere in the project.
	public int publicVar = 40;

	public void display() {

		System.out.println("Inside Student_TestingAM class");

		// All variables are accessible here because
		// we are inside the same class.

		System.out.println(privateVar); // ✔ Works
		System.out.println(defaultVar); // ✔ Works
		System.out.println(protectedVar); // ✔ Works
		System.out.println(publicVar); // ✔ Works
	}
}