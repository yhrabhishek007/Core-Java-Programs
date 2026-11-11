package com.oops.encapsulation;

public class TestFullyEncapsulatedClass {

	public static void main(String[] args) {

		// Creating object using no-argument constructor
		FullyEncapsulatedClass f = new FullyEncapsulatedClass();

		// Setting values using setter methods
		f.setSid(101);
		f.setSname("Abhishek");
		f.setAge(21);

		// Getting values using getter methods
		System.out.println(f.getSid());
		System.out.println(f.getSname());
		System.out.println(f.getAge());

		// Creating object using parameterized constructor
		FullyEncapsulatedClass f1 = new FullyEncapsulatedClass(102, "Raghavendra", 22);

		// Printing object details using toString() method
		System.out.println(f1);

	}

}