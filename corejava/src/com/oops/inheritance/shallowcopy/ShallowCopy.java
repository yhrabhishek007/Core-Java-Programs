package com.oops.inheritance.shallowcopy;

// Student class implements Cloneable so that clone() can be used
class Student implements Cloneable {

	int sid;
	String sname;
	Address address; // Reference variable (contains Address object)

	// clone() creates a shallow copy by calling Object's clone() method
	// Primitive data is copied, but object references are shared
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// Parameterized constructor
	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
}

// Address class
class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("Main method started");

		// Create Address object
		Address address = new Address("Hyderabad");

		// Create original Student object
		Student s1 = new Student(101, "Rakesh", address);

		// Display original object details
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-----------------------------");

		// Create cloned object (Shallow Copy)
		// s1 and s2 are different Student objects,
		// but both point to the SAME Address object.

		// ----------------------------------------

		// Using clone() method
		// Creates a copy of the existing Student object (s1)
		// Does not call the Student constructor
		// Performs shallow copy by default
		Student s2 = (Student) s1.clone();

		// Using constructor
		// Creates a new Student object by calling the constructor
		// Values are manually passed while creating the object
		// Copying behavior depends on constructor logic

//		Student s2 = new Student(101, "Rajesh", address);

		// ------------------------------------------------------

		// Display cloned object details
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("-----------------------------");

		// Change city using cloned object
		// Since Address object is shared,
		// this change is reflected in both s1 and s2.
		s2.address.city = "Rajasthan";

		// Original object also shows updated city
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-----------------------------");

		// Cloned object
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("-----------------------------");

		System.out.println("Main method ended");

	}
}