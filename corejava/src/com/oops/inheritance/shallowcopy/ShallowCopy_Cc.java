package com.oops.inheritance.shallowcopy;

//using copy constructor
class Address1 {
	String city;

	Address1(String city) {
		this.city = city;
	}
}

class Student1 {

	int sid;
	String sname;
	Address1 address;

	// Parameterized Constructor
	Student1(int sid, String sname, Address1 address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	// Shallow Copy Constructor
	// Copies the reference of Address object.
	// Both objects share the same Address.
	Student1(Student1 s) {
		this.sid = s.sid;
		this.sname = s.sname;
		this.address = s.address;
	}
}

public class ShallowCopy_Cc {

	public static void main(String[] args) {

		// Create original object
		Address1 address = new Address1("Hyderabad");
		Student1 s1 = new Student1(101, "Rakesh", address);

		// Create copied object
		Student1 s2 = new Student1(s1);

		// Change copied object's city
		s2.address.city = "Bangalore";

		// Both objects display Bangalore
//		System.out.println(s1.sid);
		System.out.println(s1.address.city);
		System.out.println(s2.address.city);
	}
}