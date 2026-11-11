package com.oops.abstraction;

public class Cat implements Animal {

	
	
	@Override
	public void eat() {
		System.out.println("Cat can eat fish");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat can sleep at anytime !!");
	}
	
	@Override
	public void sound() {
		System.out.println("Meow meow !!");
	}
	
	
}
