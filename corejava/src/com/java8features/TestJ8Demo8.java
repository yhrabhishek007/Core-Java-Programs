package com.java8features;

//Functional interface WRT inhertance

@FunctionalInterface
interface In8 {
	void method1();
}

@FunctionalInterface // --> it is not a functional interface bacause it inherits the other interface
						// method so , at last it contains only 1 abstract method
//Invalid '@FunctionalInterface' annotation; In9 is not a functional interface
interface In9 extends In8 {
//	void method2();
}

public class TestJ8Demo8 {

	public static void main(String[] args) {

		System.out.println("main method started");

		In9 t = () -> {
			System.out.println("Hello method1");
		};
		
		t.method1();
		
		System.out.println("main method ended");

	}

}
