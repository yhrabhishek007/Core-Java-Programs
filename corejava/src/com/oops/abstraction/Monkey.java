package com.oops.abstraction;

public class Monkey implements Animal {
	
	
//	can not override if it is private
//	@Override
//	public void hello() {
//		System.out.println("Hii Animal");
//		System.out.println("Hii Animal");
//		System.out.println("Hii Animal");
//		System.out.println("Hii Animal");
//		System.out.println("Hii Animal");
//
//	}

	@Override
	public void eat() {
		System.out.println("Monkey eat banana's !!");
		
	}

	@Override
	public void sleep() {
		System.out.println("Monkey sleeps as usual");
	}

	@Override
	public void sound() {
		System.out.println("khcc khcccch");
	}

//	if we want specifically we can override that default method here in the child class
//	and change the behavior as we want 
//	(but we should not give like default method)
	
	
//	yes we can override default methods in classes without default keyword
//	by mistake if we give it will throw an error like below
//	Default methods are allowed only in interfaces.
	
	@Override
	public  void walk() {
		System.err.println("Monkey can walk and also can jump");

	}
	
	

}
