package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestListD1 {

	public static void main(String[] args) {

		// Creating a List of Integer type
		// ArrayList is the implementation class of List
		List<Integer> l1 = new ArrayList<>();

		// Adding elements to the List
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(35);
		l1.add(40);

		// add(index, element)
		// Adds 36 at index 0
		// Existing elements are shifted to the right
		l1.add(0, 36);

		// Adds 80 at index 7
		// IMPORTANT: The index must be valid for insertion
		// After adding 36, the List has 6 elements (indexes 0 to 5)
		// So index 7 is invalid and will cause IndexOutOfBoundsException
//		l1.add(7, 80);

		// Printing the List
		System.out.println(l1);
		
//		ListDemo2
		List<Integer> l2 = new ArrayList<>();
		
		// List is empty
		// Current list: []
		// Size = 0

		l2.add(10);  //it will work 
		// ❌ ERROR
		// Index 1 does not exist.
		// For an empty List, only index 0 can be used for insertion.
		l2.add(1, 100);

		// This line is never reached because the previous line throws an exception.
		l2.add(500);

		l2.add(2, 200);
		l2.add(3, 300);
		l2.add(4, 400);

		// ❌ This prints l2
		
		System.out.println(l2);
		

	}
}
