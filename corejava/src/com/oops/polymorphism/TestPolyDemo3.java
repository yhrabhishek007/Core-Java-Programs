package com.oops.polymorphism;

public class TestPolyDemo3 {

	void main() {

		System.out.println("Main method started");

		// Calls String method because variable type is String
		String s = "Abhishek";
		getName(s);

		// Calls String method because object created is String
		String s2 = new String("Hemanth");
		getName(s2);

		// null can be assigned to String
		// String method is called because String is more specific than Object
		String s3 = null;
		getName(s3);

		// Error: Ambiguous call
		// null can go to String and Integer
		// String and Integer are unrelated, so Java cannot choose one
		getName(null);

		System.out.println("Main method ended");
	}

	// Called when Integer value is passed
//	void getName(Integer i) {
//		System.out.println("Integer method called");
//	}  if i remove comment it will show error

	// Object is the parent class of String and Integer
	void getName(Object obj) {
		System.out.println("Object method called");
		System.out.println(obj);
	}

	// String is more specific than Object
	void getName(String str) {
		System.out.println("String method called");
		System.out.println(str);
	}
}