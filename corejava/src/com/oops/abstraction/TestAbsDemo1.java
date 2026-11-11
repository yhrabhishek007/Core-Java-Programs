package com.oops.abstraction;

public class TestAbsDemo1 {

	public static void main(String[] args) {
		
//		Cannot instantiate the type TestAbs , Because TestAbs is abstract
//		TestAbs ta = new TestAbs();
		
//		what is possible
		
//		Interf1 ti = new TestA();
//		TestAbs ta = new TestA();
		
		
		TestA t = new TestA();
		t.method1();
		t.method2();
//		by using child object child reference we can call parent class functionalities of hello method
		t.hello();
		
		
		
		System.out.println("---------------------");
		
		TestB t1 = new TestB();
		t1.method4();
		t1.method5();
		System.out.println("---------------------");

		TestC t2 = new TestC();
		t2.method3();

	}

}
