package com.oops.abstraction;
// The difference between abstract class and normal class 
//is abstract class contains abstract methods 
//but normal class can not contain abstract methods

public abstract class TestAbs implements Interf1 {
	
 //	if we leave 
//	void demo() {  normal method
//		
//	}
//	void demo1();  abstrac method
	
abstract void methodx();

//	instance variable
	int a = 101;
	String name = "Abhishek";

//	static variable
	static String orgName = "Vcube";

//	constructor
	TestAbs() {
		System.out.println("no arg constructor called");
	}

//	using child class object we can call this instance method in abstract class
//	 concrete method
	
//	we can call using child class object references.
	void hello() {
		System.out.println("hello method called");
	}
	
//	static methods
	static void welcome() {
		System.out.println("Welcome method called");
	}
	
//	Default methods are allowed only in interfaces.
//	default void hi() {
//		
//	}

//	override methods from interface
	@Override
	public void method1() {
		System.out.println("method1 called from TestAbs");
	}

	@Override
	public void method2() {
		System.out.println("method2 called from TestAbs");

	}

	@Override
	public void method3() {
		System.out.println("method3 called from TestAbs");

	}

	@Override
	public void method4() {
		System.out.println("method4 called from TestAbs");

	}

	@Override
	public void method5() {
		System.out.println("method5 called from TestAbs");

	}

}


//when i want the methods should implement in all the classes then go for abstract methods like important methofds
// if in abstract class , abstract methods are present then also we should implement all the methods
// if in interface  we have abstract methods , also we should implement all methods





//
//interface In1{
//	void method1();
//	void method2();
//
//	void method3();
//
//}
//class A implements In1() {
//	void method1() {
//		
//	}
//
//}
//
//class B extends In1() {
//	
//void method2() {
//		
//	}
//void method3() {
//	
//}
//}