package com.accessmodifiers;

//import com.accessmodifiers.Student_TestingAM;

public class TestStudent_Am {

	public static void main(String[] args) {

		Student_TestingAM s = new Student_TestingAM();

		// private variable cannot be accessed outside its own class,
		// even though this class is in the same package.

		// System.out.println(s.privateVar); // ❌ Compilation Error

		// Default variable is accessible because both classes
		// are in the same package.
		System.out.println(s.defaultVar); // ✔ Works

		// Protected variable is also accessible because
		// both classes belong to the same package.
		System.out.println(s.protectedVar); // ✔ Works

		// Public variable can always be accessed.
		System.out.println(s.publicVar); // ✔ Works
	}
}