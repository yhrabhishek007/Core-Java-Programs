package com.oops.inheritance;

// Parent class
class Animal {

	void eat() {
		System.out.println("Animal is eating");
	}
}

//Child class
class Dog extends Animal {

	void bark() {
		System.out.println("Dog is barking");
	}
}

//Main class
public class Upcasting {

	public static void main(String[] args) {

		// ==============================
		// NORMAL OBJECT CREATION
		// ==============================

		Dog d = new Dog();

		// Reference = Dog
		// Object = Dog
		//
		// This is NOT upcasting.
		d.bark();

		System.out.println("----------------");

		// ==============================
		// UPCASTING - SUCCESSFUL ✅
		// ==============================

		Animal a = new Dog();

		// Reference = Animal (Parent)
		// Object = Dog (Child)
		//
		// Dog → Animal
		//
		// This is UPCASTING.
		// It works because Dog IS-A Animal.

		a.eat();

		System.out.println("----------------");

		// ==============================
		// DOWNCASTING - SUCCESSFUL ✅
		// ==============================

		Dog d2 = (Dog) a;

		// Reference before = Animal
		// Reference after = Dog
		//
		// Animal → Dog
		//
		// This is DOWNCASTING.
		// It works because the actual object
		// stored in 'a' is a Dog.

		d2.bark();
	}
}
