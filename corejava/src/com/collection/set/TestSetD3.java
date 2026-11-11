package com.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSetD3 {

//	Interview point
//	So your statement is partially correct:
//
//	TreeSet/SortedSet cannot practically maintain heterogeneous elements when natural ordering is used, because elements must be mutually comparable.

	public static void main(String[] args) {

		/*
		 * SortedSet is an interface.
		 *
		 * TreeSet is one implementation of SortedSet.
		 *
		 * TreeSet automatically stores elements in ascending/natural sorting order.
		 */
		SortedSet<Integer> ss = new TreeSet<>();

		/*
		 * Since we declared SortedSet<Integer>, only Integer values can be added.
		 *
		 * ss.add("Ab"); // Compile-time error
		 *
		 * If a TreeSet contains objects that cannot be compared with each other,
		 * ClassCastException can occur while adding/sorting elements.
		 */

		ss.add(10);
		ss.add(7);
		ss.add(9);
		ss.add(16);
		ss.add(33);
		ss.add(18);
		ss.add(45);
		ss.add(73);
		ss.add(4);

		/*
		 * TreeSet automatically sorts the elements in ascending order.
		 *
		 * [4, 7, 9, 10, 16, 18, 33, 45, 73]
		 */
		System.out.println("TreeSet: " + ss);

		/*
		 * first()
		 *
		 * Returns the smallest/first element.
		 */
		System.out.println("First element: " + ss.first());

		/*
		 * last()
		 *
		 * Returns the largest/last element.
		 */
		System.out.println("Last element: " + ss.last());

		/*
		 * tailSet(33)
		 *
		 * Returns elements greater than or equal to 33.
		 *
		 * Output: [33, 45, 73]
		 */
		System.out.println("tailSet(33): " + ss.tailSet(33));

		/*
		 * headSet(33)
		 *
		 * Returns elements strictly less than 33.
		 *
		 * Output: [4, 7, 9, 10, 16, 18]
		 */
		System.out.println("headSet(33): " + ss.headSet(33));

		/*
		 * subSet(16, 73)
		 *
		 * Returns elements from 16 (inclusive) to 73 (exclusive).
		 *
		 * Output: [16, 18, 33, 45]
		 */
		System.out.println("subSet(16, 73): " + ss.subSet(16, 73));

		/*
		 * contains()
		 *
		 * Checks whether an element exists.
		 *
		 * Returns true or false.
		 */
		System.out.println("Contains 33: " + ss.contains(33));

		/*
		 * size()
		 *
		 * Returns the number of elements.
		 */
		System.out.println("Size: " + ss.size());

		/*
		 * isEmpty()
		 *
		 * Checks whether the set contains any elements.
		 */
		System.out.println("Is empty: " + ss.isEmpty());

		/*
		 * remove()
		 *
		 * Removes the specified element.
		 */
		ss.remove(10);

		System.out.println("After removing 10: " + ss);

		/*
		 * add()
		 *
		 * Adds an element.
		 *
		 * Duplicate elements are not allowed.
		 */
		ss.add(10);

		System.out.println("After adding 10 again: " + ss);

		/*
		 * pollFirst() and pollLast()
		 *
		 * These methods are available in NavigableSet/TreeSet, but NOT in SortedSet
		 * reference.
		 *
		 * Therefore, they cannot be called directly using the SortedSet reference.
		 *
		 * Example:
		 *
		 * TreeSet<Integer> ts = new TreeSet<>(); ts.pollFirst(); ts.pollLast();
		 */

	}
}
