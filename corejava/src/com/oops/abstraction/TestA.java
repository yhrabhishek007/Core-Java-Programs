package com.oops.abstraction;

// if we extends without implements the abstract class then we can create partial abstraction
//without implementing all the methods
//extending the abstract class (class) instead of implementing interface class

public class TestA extends TestAbs {
	
	public TestA() {
//		by default it is super();
		super();
		System.out.println("Constructor called from TestA");
	}

	@Override
	public void method1() {
		System.out.println("method 1 called from TestA");

	}

	@Override
	public void method2() {
		System.out.println("method 2 called from TestA");
		
	}

	@Override
	void methodx() {
		// TODO Auto-generated method stub
		
	}



}
