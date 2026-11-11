
package com.collectionsframework;

import java.util.ArrayList;

//Autoboxing and auto-unboxing work with individual elements of a collection, but they cannot be applied to the entire collection.
//
//Autoboxing: int → Integer
//
//Auto-unboxing: Integer → int
//
//A collection like ArrayList<Integer> contains objects, so Java can automatically convert each int to Integer when adding it. But Java cannot convert the entire ArrayList into an int.

//--> Autoboxing and auto-unboxing are supported for collection elements, not for the collection itself.

public class AutoBoxingUnboxingDemo {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		int a = 10;

		// Autoboxing is possible for individual elements.
		// int is automatically converted into Integer.
		list.add(a);

		// Auto-unboxing is also possible for individual elements.
		// Integer is automatically converted into int.
		int b = list.get(0);

		System.out.println("Value in collection: " + list.get(0));
		System.out.println("Unboxed value: " + b);

		// ----------------------------------------------------
		// Autoboxing / Auto-unboxing is NOT possible for
		// the entire collection.
		// ----------------------------------------------------

		// int x = list;
		// ❌ Not possible because 'list' is an ArrayList<Integer>,
		// not an Integer object.
		// Auto-unboxing works only from Integer -> int,
		// not from ArrayList<Integer> -> int.

		// ArrayList<Integer> list2 = 10;
		// ❌ Not possible because autoboxing converts
		// int -> Integer, NOT int -> ArrayList<Integer>.

		// int y = list.get(0);
		// ✅ This IS possible because list.get(0) returns
		// an Integer object, which can be auto-unboxed to int.
	}
}
