package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {

		System.out.println("Main method started");

//		List<Integer> al = new ArrayList<>();
//		al.add(10);

		System.out.println("Cat info !!!!");
		Animal c = new Cat(); //Abstraction with upcasting
		c.eat();
		c.sleep();
		c.sound();
		c.walk();
		c.run();
		Animal.breath();
		
//		Generally static methods from classes can access through object reference variables 
//		& class names but static methods from interface , 
//		we cannot access through object reference variables
		
//		This static method of interface Animal can only be accessed as Animal.breath
//		c.breath(); CE 

		
		
		System.out.println("********************");

		System.out.println("Dog info !!!!");
		Animal d = new Dog();
		d.eat();
		d.sleep();
		d.sound();
		d.walk();
		d.run();
		Animal.breath();

		System.out.println("********************");

		System.out.println("Monkey info !!!!");
		Animal m = new Monkey();
		m.eat();
		m.sleep();
		m.sound();
		m.walk();
		m.run();
		Animal.breath();
		System.out.println("********************");
	}

}
