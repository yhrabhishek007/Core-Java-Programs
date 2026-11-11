package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo2 {

	public static void main(String[] args) {

		// Creating a List using Arrays.asList()
		List<Integer> l1 = Arrays.asList(10, 11, 11, 33, 14, 14, 15, 16, 45, 18, 7, 13, 33, 3);

		/*
		 * STREAM PIPELINE:
		 *
		 * List ↓ stream() ↓ filter() ↓ sorted() ↓ distinct() ↓ limit() ↓ collect()
		 *
		 * filter(), sorted(), distinct(), limit() are INTERMEDIATE OPERATIONS.
		 *
		 * collect() is a TERMINAL OPERATION.
		 */

		List<Integer> l2 = l1.stream()

				// filter() -> selects only EVEN numbers
				// 10, 14, 14, 16, 18
				.filter(i -> i % 2 == 0)

				// sorted() -> sorts the elements in ascending order
				// 10, 14, 14, 16, 18
				.sorted()

				// distinct() -> removes duplicate values
				// 10, 14, 16, 18
				.distinct()

				// limit(2) -> takes only the first 2 elements
				// 10, 14
				.limit(2)

				// collect() -> converts the Stream into a List
				.collect(Collectors.toList());

		// Printing the final result
		System.out.println(l2);
	}
}
