//HashMap vs WeakHashMap
//HashMap is dominating Garbage Collector.
//Whereas Garbage Collector dominates WeakHashMap because it's weak.
package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Student {

	@Override
	public String toString() {
		return "Student";
	}

	// Called by the JVM before an object is garbage collected.
	//
	// IMPORTANT:
	// finalize() is deprecated in modern Java and should NOT be used
	// in new applications. It is used here only to demonstrate
	// the concept of Garbage Collection.
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
}

// HashMap vs WeakHashMap
//
// HashMap:
// - Maintains a strong reference to its keys.
// - As long as the key is present in the HashMap,
//   the key object normally cannot be garbage collected.
//
// WeakHashMap:
// - Maintains weak references to its keys.
// - If there is no strong reference to a key from somewhere else,
//   the Garbage Collector can remove that key and its mapping.
//
// Simple way to remember:
//
// HashMap      -> Key is strongly referenced -> GC cannot collect the key
// WeakHashMap  -> Key is weakly referenced  -> GC can collect the key

public class TestMapDemo6 {

	public static void main(String[] args) throws InterruptedException {

		// Using WeakHashMap
		Map<Object, String> map = new WeakHashMap<>();

		// Creating a Student object.
		Student s = new Student();

		// 's' is a strong reference to the Student object.
		//
		// WeakHashMap stores the key weakly.
		// The value "Abhishek" is associated with the key.
		map.put(s, "Abhishek");

		System.out.println(map);
		// Output:
		// {Student=Abhishek}

		// Remove the strong reference.
		//
		// Now there is no strong reference from the variable 's'
		// to the Student object.
		//
		// WeakHashMap does NOT keep a strong reference to the key.
		s = null;

		// Request the JVM to run Garbage Collector.
		//
		// IMPORTANT:
		// System.gc() is only a REQUEST.
		// It does NOT guarantee that GC will run immediately.
		System.gc();

		// Give the JVM some time for Garbage Collection.
		Thread.sleep(2000);

		// If the Student object was garbage collected,
		// WeakHashMap automatically removes its corresponding entry.
		System.out.println(map);

		// Possible output:
		//
		// finalize method called
		// {}
	}
}
