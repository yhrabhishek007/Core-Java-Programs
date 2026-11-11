package com.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

//HashMap vs IdentityHashMap
//String Literals
//String Objects

// --> When we work with HashMap internally it checks equals method then s1 and s2 both values are same.
// --> When we work with IdentityHashMap internally it checks == operator , so s1 and s2 both values are not same when we use new String.

//---------------------------------------------------

// HashMap vs IdentityHashMap
//
// HashMap      -> compares keys using equals()
// IdentityHashMap -> compares keys using ==
//
// String Literals:
// String s1 = "Java";
// String s2 = "Java";
//
// Both refer to the same String object from the String Pool,
// so: s1 == s2  --> true
//
// String Objects:
// String s1 = new String("Java");
// String s2 = new String("Java");
//
// Two different String objects are created in memory,
// so: s1 == s2  --> false
//
// IMPORTANT:
// s1.equals(s2) --> true
// because both strings contain the same value: "Java"

public class TestMapDemo5 {

	public static void main(String[] args) {

		// IdentityHashMap uses == to compare keys.
		// It checks whether both keys refer to the SAME object.
		Map<String, String> map = new IdentityHashMap<>();

		// String literals are stored in the String Pool.
		// Both s1 and s2 point to the same object.
		//
		// String s1 = "Java";
		// String s2 = "Java";
		// s1 == s2 -> true

		// Using new String() creates two different objects.
		// Even though their values are the same,
		// their references are different.
		String s1 = new String("Java"); // Object 1
		String s2 = new String("Java"); // Object 2

		// Check references and values
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

		// First key = s1
		map.put(s1, "is Tough");

		// Second key = s2
		// IdentityHashMap considers s1 and s2 as different keys
		// because s1 == s2 is false.
		map.put(s2, "is Simple");

		// s2 is the exact same object used as the second key,
		// so it returns "is Simple".
		System.out.println(map.get(s2));

		// Both entries are present because s1 and s2
		// are different objects.
		System.out.println(map);
	}
}

//⭐ Interview notes to remember
//HashMap → equals() + hashCode()
//
//Logically equal keys are treated as the same key.
//
//IdentityHashMap → ==
//
//Only the same object reference is considered the same key.
//
//Two objects can have:
//
//s1.equals(s2) == true
//
//while:
//
//s1 == s2
//
//is false.
//
//IdentityHashMap can therefore contain two keys that are equal according to equals() but are different objects.
//
//Don't confuse String Pool behavior with IdentityHashMap.
//
//String literals may share the same pooled object.
//
//new String("Java") creates separate String objects.
//
//A very easy way to memorize it:
//
//HashMap → "Do the keys have the same value?" → equals()
//IdentityHashMap → "Are the keys the exact same object?" → ==

//Feature	                     HashMap	            IdentityHashMap
//Key comparison	                equals()	               ==
//Checks	                   Same value/content	Same object/reference
//new String("Java") twice	   Same key	           Different keys
//Main use	             Normal key-value mapping	Identity/reference-based mapping
