package com.operators;
//instanceof operator

//⚠️ Important rule
//Child object → can be checked with Parent type (true)
//Parent object → cannot be child type (false)

class A{
	
}
class B extends A{
	
}

public class InstanceOf_Opr {

	public static void main(String[] args) {
		System.out.println("instanceof Operator");
		A  a = new A();
		A b = new A();	
		B b1 = new B();
		System.out.println(a instanceof A);   // true (a is A)
		System.out.println(b instanceof A);   // true (b is A)
		System.out.println(b1 instanceof A);  // true (B is subclass of A)
		System.out.println(a instanceof B);   // false (A is not B)
		

		
	}

}
