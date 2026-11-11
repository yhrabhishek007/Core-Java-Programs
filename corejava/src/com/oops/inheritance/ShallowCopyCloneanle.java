package com.oops.inheritance;

//Student class implements Cloneable to use clone() method
class Student implements Cloneable {

	int sid;
	String sname;
	Address address; // Reference variable

	// Constructor
	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	// clone() method
	// super.clone() creates shallow copy
	//
	// sid -> copied value
	// sname -> copied value
	// address -> same reference is shared
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

//Address class
class Address {

	String city;

	// Constructor
	public Address(String city) {
		this.city = city;
	}
}

public class ShallowCopyCloneanle {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("Main method started");

		// Creating Address object
		Address ad = new Address("Chennai");

		// Original Student object
		Student s1 = new Student(101, "Rakesh", ad);

		System.out.println("Original Student");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		System.out.println("--------------------");

		// Creating shallow copy
		Student s2 = (Student) s1.clone();

		System.out.println("Cloned Student");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);

		System.out.println("--------------------");

		// Changing cloned object's address
		// Because of shallow copy, same Address object is shared
		s2.address.city = "Bangalore";

		System.out.println("After changing clone address");

		System.out.println("Original Student Address : " + s1.address.city);

		System.out.println("Cloned Student Address   : " + s2.address.city);

		System.out.println("--------------------");

		System.out.println("Main method ended");
	}
}