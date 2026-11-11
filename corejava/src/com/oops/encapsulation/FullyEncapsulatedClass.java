package com.oops.encapsulation;
//FullyEncapsulatedClass inherits properties and methods from Object class
public class FullyEncapsulatedClass extends Object{

	// Private variables (data hiding)
	private int sid;
	private String sname;
	private int age;

	// toString() method is used to display object details
	@Override
	public String toString() {
		return "StudentInfo :[ StudentId: " + sid + 
			   " StudentName: " + sname + 
			   " StudentAge: " + age + " ]";
	}

	// Parameterized constructor to initialize all variables
	public FullyEncapsulatedClass(int sid, String sname, int age) {
		super();

		// this keyword refers to current class variables
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

	// No-argument constructor
	public FullyEncapsulatedClass() {
		System.out.println("No-arg constructor");
	}

	// Getter method to access student id
	public int getSid() {
		return sid;
	}

	// Setter method to update student id
	public void setSid(int sid) {
		this.sid = sid;
	}

	// Getter method to access student name
	public String getSname() {
		return sname;
	}

	// Setter method to update student name
	public void setSname(String sname) {
		this.sname = sname;
	}

	// Getter method to access student age
	public int getAge() {
		return age;
	}

	// Setter method to update student age
	public void setAge(int age) {
		this.age = age;
	}

}
//What do we get from Object class?
//
//Object provides some predefined methods, such as:
//
//// Converts object data into String format
//toString()
//
//// Compares two objects
//equals()
//
//// Returns hash value of object
//hashCode()