package com.oops.polymorphism;

//Method Overloading is not dependent on Return types
//It is Depending on only
//Parameter count should be different
//parameter order should be different
//parameter Type should be different

public class TestPolyDemo4 {

	
	void main() {

		System.out.println("Main method started");

		method1();//calling method1 provide inside data
		
		int returnPrint=method1();
		System.out.println(returnPrint); //will print data and return value both

		System.out.println("Main method ended");

	}

//	void method1() {
//		System.out.println("method called with void");
//		
//	}

	int method1() {
		System.out.println("method called with int");
		return 10;
	}

}
