package com.collectionsframework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Hashtable;

public class TestCollectionExceptions {

	public static void main(String[] args) {

		/*
		 * IMPORTANT COLLECTIONS EXCEPTIONS
		 *
		 * 1. NoSuchElementException 2. IllegalStateException 3.
		 * ConcurrentModificationException 4. UnsupportedOperationException 5.
		 * NullPointerException 6. ClassCastException 7. IndexOutOfBoundsException 8.
		 * IllegalArgumentException 9. EmptyStackException
		 *
		 *
		 * Each method below demonstrates one exception.
		 */

		noSuchElementException();

		illegalStateException();

		concurrentModificationException();

		unsupportedOperationException();

		nullPointerException();

		classCastException();

		indexOutOfBoundsException();

		illegalArgumentException();

		emptyStackException();
	}

	// =========================================================
	// 1. NoSuchElementException
	// =========================================================

	static void noSuchElementException() {

		System.out.println("\n1. NoSuchElementException");

		Queue<Integer> q = new ArrayDeque<>();

		/*
		 * Queue is empty.
		 *
		 * remove() tries to remove the head. Since there is no element, it throws
		 * NoSuchElementException.
		 */

		try {
			q.remove();
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException occurred");
		}

		/*
		 * element() also throws NoSuchElementException when the Queue is empty.
		 */

		try {
			q.element();
		} catch (NoSuchElementException e) {
			System.out.println("element() also caused NoSuchElementException");
		}

		/*
		 * Compare with poll() and peek():
		 *
		 * poll() -> null when empty peek() -> null when empty
		 */
	}

	// =========================================================
	// 2. IllegalStateException
	// =========================================================

	static void illegalStateException() {

		System.out.println("\n2. IllegalStateException");

		/*
		 * ArrayBlockingQueue has a fixed capacity.
		 *
		 * Capacity = 2
		 */

		Queue<Integer> q = new ArrayBlockingQueue<>(2);

		q.add(10);
		q.add(20);

		/*
		 * Queue is already full.
		 *
		 * add() cannot insert another element, so it throws IllegalStateException.
		 */

		try {
			q.add(30);
		} catch (IllegalStateException e) {
			System.out.println("IllegalStateException occurred");
		}

		/*
		 * offer() behaves differently.
		 *
		 * Instead of throwing an exception, offer() returns false when the queue is
		 * full.
		 */

		boolean result = q.offer(30);

		System.out.println("offer() result: " + result);
	}

	// =========================================================
	// 3. ConcurrentModificationException
	// =========================================================

	static void concurrentModificationException() {

		System.out.println("\n3. ConcurrentModificationException");

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);

		/*
		 * We are iterating through the list.
		 *
		 * At the same time, we structurally modify the list using list.remove().
		 *
		 * ArrayList iterator is fail-fast.
		 *
		 * Therefore, ConcurrentModificationException may be thrown.
		 */

		try {

			for (Integer value : list) {

				System.out.println(value);

				if (value == 20) {
					list.remove(value);
				}
			}

		} catch (ConcurrentModificationException e) {
			System.out.println("ConcurrentModificationException occurred");
		}

		/*
		 * IMPORTANT:
		 *
		 * ConcurrentModificationException does NOT necessarily mean that multiple
		 * threads are involved.
		 *
		 * It can also happen when a collection is structurally modified while using a
		 * fail-fast iterator.
		 */
	}

	// =========================================================
	// 4. UnsupportedOperationException
	// =========================================================

	static void unsupportedOperationException() {

		System.out.println("\n4. UnsupportedOperationException");

		/*
		 * Arrays.asList() creates a fixed-size List.
		 *
		 * We cannot add or remove elements.
		 */

		List<Integer> list = Arrays.asList(10, 20, 30);

		try {

			list.add(40);

		} catch (UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException occurred");
		}

		/*
		 * The list supports set() because set() does not change the size of the list.
		 */

		list.set(0, 100);

		System.out.println("After set(): " + list);
	}

	// =========================================================
	// 5. NullPointerException
	// =========================================================

	static void nullPointerException() {

		System.out.println("\n5. NullPointerException");

		/*
		 * Hashtable does NOT allow null keys or null values.
		 */

		Map<String, Integer> map = new Hashtable<>();

		try {

			map.put(null, 100);

		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred");
		}

		/*
		 * ConcurrentHashMap also does NOT allow null keys or null values.
		 */

		Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

		try {

			concurrentMap.put("A", null);

		} catch (NullPointerException e) {
			System.out.println("ConcurrentHashMap also caused NullPointerException");
		}
	}

	// =========================================================
	// 6. ClassCastException
	// =========================================================

	static void classCastException() {

		System.out.println("\n6. ClassCastException");

		/*
		 * Using a raw List allows different types of objects to be inserted.
		 */

		List list = new ArrayList();

		list.add(100);
		list.add("Java");

		try {

			/*
			 * The second element is String, but we are trying to cast it to Integer.
			 */

			Integer number = (Integer) list.get(1);

		} catch (ClassCastException e) {
			System.out.println("ClassCastException occurred");
		}

		/*
		 * IMPORTANT:
		 *
		 * Generics help prevent this problem at compile time.
		 *
		 * Example:
		 *
		 * List<Integer> list = new ArrayList<>(); list.add("Java"); // Compile-time
		 * error
		 */
	}

	// =========================================================
	// 7. IndexOutOfBoundsException
	// =========================================================

	static void indexOutOfBoundsException() {

		System.out.println("\n7. IndexOutOfBoundsException");

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);

		try {

			/*
			 * Valid indexes are:
			 *
			 * 0 -> 10 1 -> 20 2 -> 30
			 *
			 * Index 5 does not exist.
			 */

			System.out.println(list.get(5));

		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException occurred");
		}
	}

	// =========================================================
	// 8. IllegalArgumentException
	// =========================================================

	static void illegalArgumentException() {

		System.out.println("\n8. IllegalArgumentException");

		try {

			/*
			 * ArrayList capacity cannot be negative.
			 *
			 * -1 is an invalid argument.
			 */

			List<Integer> list = new ArrayList<>(-1);

		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException occurred");
		}
	}

	// =========================================================
	// 9. EmptyStackException
	// =========================================================

	static void emptyStackException() {

		System.out.println("\n9. EmptyStackException");

		/*
		 * Stack is empty.
		 */

		Stack<Integer> stack = new Stack<>();

		try {

			/*
			 * pop() tries to remove the top element.
			 *
			 * Since Stack is empty, EmptyStackException is thrown.
			 */

			stack.pop();

		} catch (java.util.EmptyStackException e) {
			System.out.println("EmptyStackException occurred");
		}

		/*
		 * IMPORTANT:
		 *
		 * Stack is a legacy class.
		 *
		 * In modern Java, ArrayDeque is generally preferred for stack behavior.
		 */
	}
}
