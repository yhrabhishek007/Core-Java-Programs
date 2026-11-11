package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestSetD2 {

	public static void main(String[] args) {

		System.out.println("main method started");

		/*
		 * Set: - Does NOT allow duplicate elements. - Does NOT provide index-based
		 * access like List.
		 *
		 * HashSet: - Does NOT guarantee insertion order. - Internally uses hashing. -
		 * Allows one null element. - Average time complexity for add(), remove(),
		 * contains() is O(1).
		 */
		Set<Integer> s = new HashSet<>();

		/*
		 * LinkedHashSet: - Maintains insertion order. - Also does not allow duplicates.
		 * - Slightly more memory overhead than HashSet because it maintains a linked
		 * list internally.
		 *
		 * Example: Set<Integer> s = new LinkedHashSet<>();
		 */

		s.add(4);
		s.add(18);
		s.add(17);
		s.add(32);
		s.add(40);

		s.add(45);
		s.add(14);
		s.add(64);
		s.add(65);
		s.add(37);

		s.add(49);
		s.add(34);
		s.add(44);
		s.add(39);
		s.add(52);

		/*
		 * HashSet does not guarantee that elements will be printed in the same order in
		 * which they were inserted.
		 *
		 * The output order can depend on hashCode(), bucket calculation, capacity,
		 * resizing, and Java implementation.
		 */
		System.out.println(s);

		System.out.println("main method ended");
	}
}
