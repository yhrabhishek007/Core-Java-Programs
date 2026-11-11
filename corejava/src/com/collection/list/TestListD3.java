package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListD3 {

	public static void main(String[] args) {
//		“Collections use Integer, but how are you able to add an int value?”

//		You can answer:

//Collections cannot store primitive data types. They store objects. So, for int, we use its wrapper class Integer. When we add an int value to a collection, 
//Java automatically converts the primitive int into an Integer object. This is called autoboxing. Similarly, when an Integer object is assigned to an int,
//Java automatically converts it back to int, which is called unboxing.
		List<Integer> l1 = new ArrayList<>();

// Autoboxing: int values are automatically converted to Integer objects
		l1.add(6);
		l1.add(9);
		l1.add(10);
		l1.add(11);
		l1.add(15);
		// Iterator starts at the beginning of the list.
		Iterator<Integer> itr = l1.iterator();
		// hasNext() checks if the next element is available.
		// next() gets the element and moves forward.
		while (itr.hasNext()) {
			System.out.println(itr.next() + " hasN");
		}
		System.out.println("--------------------");
		// ListIterator can move forward and backward.
		// listIterator() starts at the beginning.
		ListIterator<Integer> litr = l1.listIterator();

		// hasPrevious() checks if an element is available before the iterator.
		// Iterator is already at the beginning, so there is no element before it.
		// Therefore, hasPrevious() returns false. So this loop will NOT execute.

		while (litr.hasPrevious()) {
			System.out.println(litr.previous() + " has");
		}
		System.out.println("--------------------");

		// To move backward, first start the iterator at the end.
		ListIterator<Integer> reverseItr = l1.listIterator(l1.size());
		// hasPrevious() checks if an element is available before the iterator.
		// previous() gets that element and moves backward.
		while (reverseItr.hasPrevious()) {
			System.out.println(reverseItr.previous() + " rev");
		}

// indexOf(4) returns -1 because 4 is not present in the list
// remove(-1) tries to remove an element at index -1
// Therefore, it throws IndexOutOfBoundsException

//l1.remove(l1.indexOf(4));

//l1.remove(l1.indexOf(15));    //<---
//indexOf() searches for the given value and returns its index. That returned index is passed as an argument to remove(), 
//which then removes the element at that index.
		System.out.println(l1);
	}
}