package com.oops.abstraction;

public interface Animal {
//	from java 1.8 version we can also run interfaces to check only static behaviors
	public static void main(String[] args) {

		System.out.println("welcome to interface static methods");
//		we can execute constant methods (static methods)
		breath();
	}

	void eat();

	void sleep();

	void sound();

//	we can call default methods in other default methods

//	default methods is to avoid backward Compatibility
//	&& to provide generic behavior for all the classes.
//	if aby class want to change the behavior can override the default methods.
	public default void walk() {
		System.out.println("Every animal can walk");
		hello();

	}

//	yes we can create any number of default methods
	public default void run() {
		System.out.println("Animals can also run!!");
		hello();

	}

//	static methods : To provide constant behavior for all the classes 
//	and static methods should not override or we cannot override.
	public static void breath() {
		System.out.println("Every animal must breath to survive");
	}

//	private methods introduced to provide code re-usability for default methods
//	we cannot Override private methods from parent to child
	private void hello() {
		System.out.println("Hello Animal ");
		System.out.println("Hello Animal ");
		System.out.println("Hello Animal ");
		System.out.println("Hello Animal ");
		System.out.println("Hello Animal ");
	}

}
