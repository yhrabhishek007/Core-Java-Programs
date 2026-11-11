package com.oops.abstraction;

interface In1 {

	void method1();

	void method2();

	void method3();
}

// TestA implements In1
// Java checks TestA at this point.
//
// method1() → implemented ✅
// method2() → not implemented ❌
// method3() → not implemented ❌
//
// Since TestA is abstract, this is allowed.
abstract class TesA implements In1 {

	@Override
	public void method1() {
		System.out.println("method1");
	}

	// method2() and method3() are not implemented here.
	// That's okay because TestA is abstract.
}

// B extends TestA
// B inherits method1() from TestA.
//
// Now B must make sure all remaining interface methods
// are implemented.
//
// method1() → inherited from TestA ✅
// method2() → implemented here ✅
// method3() → implemented here ✅
class B extends TesA {

	@Override
	public void method2() {
		System.out.println("method2");
	}

	@Override
	public void method3() {
		System.out.println("method3");
	}
}