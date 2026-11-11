package com.collection.list;

public class Employee {

	int eid;
	String ename;
	double esal;
	int age;

	public String toString() {

		return "[Employee Info : Employee Id:" + eid + " Employee Name: " + ename + " Employee Salary: " + esal
				+ " Employee Age: " + age + "]";
	}

	public Employee(int eid, String ename, double esal, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.age = age;
	}

}
