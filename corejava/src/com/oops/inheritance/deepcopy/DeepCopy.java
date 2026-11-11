package com.oops.inheritance.deepcopy;

// Deep Copy using Copy Constructor

class Employee {

	int eid;
	String ename;

	// Employee HAS-A Address object (Composition/Aggregation)
	Address2 address2;

	// Parameterized Constructor
	public Employee(int eid, String ename, Address2 address2) {
		this.eid = eid;
		this.ename = ename;
		this.address2 = address2;
	}

	// Copy Constructor
	Employee(Employee emp) {

		// Primitive types are copied by value
		this.eid = emp.eid;

		// String is immutable, so direct assignment is safe
		this.ename = emp.ename;

		// **************** IMPORTANT ****************
		// Shallow Copy (DO NOT USE for mutable objects)
		// Both Employee objects will share the same Address object.
		//
		// this.address2 = emp.address2;
		//
		// *******************************************

		// **************** IMPORTANT ****************
		// Deep Copy
		// Creates a completely new Address object.
		// Changes made in one employee's address
		// will NOT affect the other employee.
		this.address2 = new Address2(emp.address2);
		// *******************************************
	}
}

class Address2 {

	String city;

	// Parameterized Constructor
	public Address2(String city) {
		this.city = city;
	}

	// Copy Constructor
	Address2(Address2 add) {

		// Copy the data into a NEW object
		this.city = add.city;
	}
}

public class DeepCopy {

	public static void main(String[] args) {

		System.out.println("Main method started");

		// Creating Address object
		Address2 ad = new Address2("Chennai");

		// Creating Employee object
		Employee emp1 = new Employee(1, "Rakesh", ad);

		System.out.println(emp1.eid);
		System.out.println(emp1.ename);
		System.out.println(emp1.address2.city);

		System.out.println("------------------------");

		// Copy Constructor is called
		Employee emp2 = new Employee(emp1);

		System.out.println(emp2.eid);
		System.out.println(emp2.ename);
		System.out.println(emp2.address2.city);

		System.out.println("------------------------");

		// Modifying copied object's address
		emp2.address2.city = "Bangalore";

		// Since Deep Copy is used,
		// emp1's address remains unchanged.
		System.out.println("emp1 Address : " + emp1.address2.city);

		System.out.println("------------------------");

		System.out.println("emp2 Address : " + emp2.address2.city);
	}
}