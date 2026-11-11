package com.oops.abstraction;

interface In4 {
	void method1();

	void method2();
	
	default void method5() {
		System.out.println("Method5 called from In4" );
	}
}

interface In5 {
	void method2();

	void method3();
	
	default void method5() {
		System.out.println("Method5 called from In4" );
	}
}

//Multiple Inheritance
interface In6 extends In4, In5 {

	@Override
	default void method5() {
		// TODO Auto-generated method stub
		In4.super.method5();  // if we keep In5 at the place of In4 then In5 will be called
	}

}

//Why java supports multiple inhertance? because
//java supports multiple inheritance for interfaces ,
//because of unique implementation inside the classes even though we have
//same methods in two interfaces
class TestImpl1 implements In6 {

	@Override
	public void method1() {
		System.out.println("Method1 called");
	}

	@Override
	public void method2() {
		System.out.println("Method2 called");

	}

	@Override
	public void method3() {
		System.out.println("Method3 called");

	}

}

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started");

//		TestImpl1 t1 = new TestImpl1();  --> it also works
		In6 t2 = new TestImpl1(); 
		t2.method1();
		t2.method2();
		t2.method3();
		t2.method5();
	}

}
