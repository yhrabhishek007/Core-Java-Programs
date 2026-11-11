package com.oops.inheritance;

import java.util.ArrayList;

// Customer class
class Customer {

	int cid;
	String cname;

	// Constructor to initialize customer details
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	// finalize() method is called by Garbage Collector
	// before destroying an object from memory
	// Note: finalize() is deprecated in modern Java versions,
	// but it is used here only for learning purpose.
	@Override
	protected void finalize() throws Throwable {

		System.out.println("finalize method called");

//		super.finalize();
	}
	

}

public class TestDemo1Ocm {

	public static void main(String[] args) {

		// Creating first ArrayList object
		ArrayList<Integer> al = new ArrayList<>();

		// Adding values into ArrayList
		al.add(100);
		al.add(200);

		System.out.println(al);

		// hashCode() is generated based on ArrayList contents
		System.out.println(al.hashCode());

		// Creating second ArrayList object
		ArrayList<Integer> al1 = new ArrayList<>();

		al1.add(100);
		al1.add(200);

		System.out.println(al1);

		// Both lists have same values, so hashCode will be same
		System.out.println(al1.hashCode());

		// ArrayList overrides equals()
		// It compares the values inside the list
		// Since both lists contain 100 and 200, result is true
		System.out.println(al.equals(al1));

		System.out.println("-------------------------");

		// Creating first Customer object
		Customer c1 = new Customer(101, "Abhishek");

		System.out.println(c1.cid);
		System.out.println(c1.cname);

		// Printing object directly calls toString()
		// Since Customer class does not override toString(),
		// Object class toString() will execute
		System.out.println(c1);

		// Creating second Customer object
		Customer c2 = new Customer(101, "Abhishek");

		System.out.println(c2.cid);
		System.out.println(c2.cname);

		System.out.println(c2);

		// == checks whether both references point to the SAME object
		// c1 and c2 are different objects in memory
		// Therefore result is false
		System.out.println(c1 == c2);

		// equals() from Object class is used because
		// we did not override equals() in Customer class
		// Object class equals() internally checks ==
		// Therefore result is false
		System.out.println(c1.equals(c2));

		// hashCode() from Object class is used
		// Different objects usually have different hash codes
		System.out.println(c1.hashCode());

		// Creating a new Customer object temporarily
		// c3 is pointing to this object initially
		Customer c3 = new Customer(0, null);

		// Now c3 reference is changed
		// c3 no longer points to Customer(0,null)
		// c3 now points to the same object as c2
		//
		// The old Customer(0,null) object has no reference
		// It becomes eligible for Garbage Collection
		c3 = c2;

		// Reference copy
		// c3 does not create a new Customer object
		// c3 points to the same object as c2
//		Customer c3 = c2;

		// Both c3 and c2 refer to the SAME object
		// Therefore == returns true
		System.out.println(c3 == c2);

		// Since both references point to the same object,
		// equals() also returns true
		System.out.println(c3.equals(c2));

		// Same object means same hashCode
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		

	}

}