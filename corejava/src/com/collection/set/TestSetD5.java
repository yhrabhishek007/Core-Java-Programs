package com.collection.set;

import java.util.HashSet;
import java.util.Objects;

/*
 * Employee2 is a user-defined class.
 *
 * We are going to store Employee2 objects inside a HashSet.
 *
 * Important:
 * HashSet uses hashCode() and equals() to check whether
 * two objects are duplicates or not.
 */
class Employee2 {

	int id;
	String name;

	// Constructor used to initialize Employee2 object
	Employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	 * toString() is overridden to display object data instead of the default Object
	 * class representation.
	 *
	 * Without toString(): Employee2@5e2de80c
	 *
	 * With toString(): Employee2 [id=101, name=Rahul]
	 */
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}

	/*
	 * equals() is used to compare the CONTENT of two Employee2 objects.
	 *
	 * Here we are saying: Two Employee2 objects are equal only when:
	 *
	 * 1. Their id is the same 2. Their name is the same
	 */
	@Override
	public boolean equals(Object obj) {

		// If both references point to the same object,
		// they are obviously equal.
		if (this == obj)
			return true;

		/*
		 * If obj is null OR obj is not an Employee2 object, they cannot be equal.
		 */
		if (obj == null || getClass() != obj.getClass())
			return false;

		// Convert Object reference into Employee2 reference
		Employee2 e = (Employee2) obj;

		/*
		 * Compare the actual data of both objects.
		 */
		return id == e.id && name.equals(e.name);
	}

	/*
	 * hashCode() generates an integer/hash value for the object.
	 *
	 * HashSet uses hashCode() first to decide where the object should be placed
	 * internally.
	 *
	 * Important rule:
	 *
	 * If two objects are equal according to equals(), they MUST have the same
	 * hashCode().
	 */
	@Override
	public int hashCode() {

		return Objects.hash(id, name);
	}
}

public class TestSetD5 {

	public static void main(String[] args) {

		/*
		 * Creating first Employee2 object.
		 *
		 * e1 ---> Employee2(101, "Rahul")
		 */
		Employee2 e1 = new Employee2(101, "Rahul");

		/*
		 * Creating second Employee2 object.
		 *
		 * e2 ---> Employee2(101, "Rahul")
		 *
		 * e1 and e2 are TWO DIFFERENT objects, but their data is the same.
		 */
		Employee2 e2 = new Employee2(101, "Rahul");

		/*
		 * Creating HashSet.
		 *
		 * HashSet does NOT allow duplicate elements.
		 *
		 * To identify duplicates, HashSet uses:
		 *
		 * 1. hashCode() 2. equals()
		 */
		HashSet<Employee2> s = new HashSet<>();

		/*
		 * Adding e1 to HashSet.
		 *
		 * Process:
		 *
		 * 1. HashSet calls e1.hashCode() 2. HashSet calculates the bucket/location 3.
		 * e1 is stored there.
		 */
		s.add(e1);

		/*
		 * Adding e2 to HashSet.
		 *
		 * Process:
		 *
		 * 1. HashSet calls e2.hashCode().
		 *
		 * 2. Since e1 and e2 have the same id and name, their hashCode() values are the
		 * same.
		 *
		 * 3. HashSet finds that the same hash/bucket is involved.
		 *
		 * 4. HashSet then calls equals() to check whether e1 and e2 are actually equal.
		 *
		 * 5. e1.equals(e2) returns true.
		 *
		 * 6. Therefore, HashSet considers e2 a duplicate and DOES NOT add it.
		 */
		s.add(e2);

		/*
		 * HashSet contains only ONE object because e1 and e2 are considered duplicates.
		 */
		System.out.println(s);

		/*
		 * toString() is automatically called when we print e1.
		 *
		 * Output: Employee2 [id=101, name=Rahul]
		 */
		System.out.println(e1);

		// Same for e2
		System.out.println(e2);

		/*
		 * Only one object was added to the HashSet.
		 *
		 * Output: 1
		 */
		System.out.println(s.size());

		/*
		 * equals() compares the content of e1 and e2.
		 *
		 * id -> 101 == 101 -> true name -> Rahul.equals() -> true
		 *
		 * Therefore: true
		 */
		System.out.println(e1.equals(e2));

		/*
		 * Both objects have the same data, so their hashCode() values are also the
		 * same.
		 */
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}

//⭐ Most Important Interview Questions
//1. How does HashSet identify duplicate objects?
//Answer:
//
//HashSet uses hashCode() first and then equals() to identify duplicate objects.
//
//The basic process is:
//
//add(object)
//    ↓
//hashCode()
//    ↓
//Find bucket
//    ↓
//If matching object exists
//    ↓
//equals()
//    ↓
//true  → duplicate, don't add
//false → add object
//
//2. Why did HashSet store only one object when e1 and e2 are different objects?
//Employee2 e1 = new Employee2(101, "Rahul");
//Employee2 e2 = new Employee2(101, "Rahul");
//
//Answer:
//
//Although e1 and e2 are two different objects, their id and name are the same.
//
//Because we override:
//
//equals()
//hashCode()
//
//HashSet determines that they represent equal objects.
