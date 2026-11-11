package com.oops.inheritance;

// Parent class
class Vehicle {

	void start() {
		System.out.println("Vehicle is starting");
	}
}

// Child class
class Car extends Vehicle {

	void drive() {
		System.out.println("Car is driving");
	}
}

// Another child class
class Bike extends Vehicle {

	void ride() {
		System.out.println("Bike is riding");
	}
}

public class Downcasting {

	public static void main(String[] args) {

		// =================================================
		// CASE 1: DOWNCASTING SUCCESSFUL ✅
		// =================================================

		// Reference type = Vehicle    --- Parent Reference
		// Actual object = Car     
		Vehicle v1 = new Car();

		// We can convert Vehicle reference back to Car
		// because the actual object is REALLY a Car.
		Car c1 = (Car) v1;   //  Child Reference  with Parent Reference

		c1.start();
		c1.drive();

		System.out.println("--------------------------");

		// =================================================
		// CASE 2: DOWNCASTING FAILS ❌
		// =================================================

		// Reference type = Vehicle
		// Actual object = Bike
		Vehicle v2 = new Bike();

		// Trying to convert Vehicle reference to Car
		//
		// ❌ FAILS at runtime!
		//
		// Why?
		// Because the actual object is a Bike,
		// NOT a Car.
		//
		// A Bike cannot be converted into a Car.
		Car c2 = (Car) v2;

		c2.drive();
	}
}