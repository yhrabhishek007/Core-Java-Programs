package com.collection.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo3 {

	public static void main(String[] args) {

		/*
		 * ===================================================== PriorityQueue
		 * =====================================================
		 *
		 * PriorityQueue is a Queue implementation.
		 *
		 * Unlike a normal FIFO Queue, PriorityQueue processes elements according to
		 * their priority.
		 *
		 * By default:
		 *
		 * PriorityQueue<Integer> -> smallest element has highest priority
		 *
		 * Here we are using:
		 *
		 * Collections.reverseOrder()
		 *
		 * Therefore:
		 *
		 * -> largest element has highest priority
		 *
		 * So this is a MAX-HEAP style PriorityQueue.
		 */

		// Creating PriorityQueue with descending priority.
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

		// =====================================================
		// 1. offer()
		// =====================================================

		/*
		 * Adds elements to the PriorityQueue.
		 *
		 * PriorityQueue will internally arrange elements according to their priority.
		 */

		q.offer(1);
		q.offer(3);
		q.offer(2);
		q.offer(4);

		/*
		 * IMPORTANT:
		 *
		 * Do NOT expect println(q) to show:
		 *
		 * [4, 3, 2, 1]
		 *
		 * PriorityQueue's iterator / toString() does NOT guarantee sorted order.
		 *
		 * It only guarantees that the HEAD has the highest priority.
		 */

		System.out.println("PriorityQueue: " + q);

		// =====================================================
		// 2. peek()
		// =====================================================

		/*
		 * Returns the HEAD (highest-priority element) without removing it.
		 *
		 * Since we used reverseOrder():
		 *
		 * Highest value = highest priority
		 */

		System.out.println("peek(): " + q.peek());

		// Output:
		// 4

		// =====================================================
		// 3. poll()
		// =====================================================

		/*
		 * Retrieves AND removes the highest-priority element.
		 */

		System.out.println("poll(): " + q.poll());

		// Output:
		// 4

		/*
		 * Now 3 becomes the highest-priority element.
		 */

		System.out.println("peek(): " + q.peek());

		// Output:
		// 3

		// =====================================================
		// Remove all elements according to priority
		// =====================================================

		/*
		 * poll() repeatedly gives elements according to their priority.
		 *
		 * Therefore:
		 *
		 * 4 -> 3 -> 2 -> 1
		 */

		System.out.println("Elements according to priority:");

		while (!q.isEmpty()) {

			System.out.println(q.poll());
		}

		/*
		 * Output:
		 *
		 * 4 3 2 1
		 */

		// =====================================================
		// IMPORTANT METHODS
		// =====================================================

		/*
		 * add() ----- Adds an element.
		 *
		 * Similar to offer().
		 *
		 * q.add(10);
		 *
		 *
		 * offer() -------- Adds an element.
		 *
		 * q.offer(10);
		 *
		 *
		 * peek() ------- Retrieves the highest-priority element WITHOUT removing it.
		 *
		 * Empty Queue -> null
		 *
		 *
		 * poll() ------ Retrieves AND removes the highest-priority element.
		 *
		 * Empty Queue -> null
		 *
		 *
		 * element() ---------- Retrieves the highest-priority element WITHOUT removing
		 * it.
		 *
		 * Empty Queue -> NoSuchElementException
		 *
		 *
		 * remove() -------- Retrieves AND removes the highest-priority element.
		 *
		 * Empty Queue -> NoSuchElementException
		 *
		 *
		 * isEmpty() ---------- Checks whether the PriorityQueue is empty.
		 *
		 *
		 * size() ------ Returns the number of elements.
		 *
		 *
		 * contains() ----------- Checks whether an element exists.
		 *
		 *
		 * clear() ------- Removes all elements.
		 */

		/*
		 * ===================================================== DEFAULT PRIORITY
		 * =====================================================
		 *
		 * If we create:
		 *
		 * Queue<Integer> q = new PriorityQueue<>();
		 *
		 * Then the smallest element has highest priority.
		 *
		 * Example:
		 *
		 * q.offer(1); q.offer(3); q.offer(2);
		 *
		 * q.poll() -> 1 q.poll() -> 2 q.poll() -> 3
		 */

		/*
		 * ===================================================== REVERSE ORDER
		 * =====================================================
		 *
		 * Here:
		 *
		 * Collections.reverseOrder()
		 *
		 * changes the ordering.
		 *
		 * Largest element gets highest priority.
		 *
		 * q.poll():
		 *
		 * 4 -> 3 -> 2 -> 1
		 */

		/*
		 * ===================================================== VERY IMPORTANT
		 * =====================================================
		 *
		 * PriorityQueue does NOT mean:
		 *
		 * "The entire Queue is always sorted."
		 *
		 * It means:
		 *
		 * "The HEAD is always the highest-priority element."
		 *
		 * Therefore:
		 *
		 * peek() / poll()
		 *
		 * are the important methods for observing priority order.
		 *
		 * Do NOT depend on:
		 *
		 * System.out.println(q);
		 *
		 * to display sorted order.
		 */

		/*
		 * ===================================================== NULL
		 * =====================================================
		 *
		 * PriorityQueue does NOT allow null elements.
		 *
		 * q.offer(null);
		 *
		 * -> NullPointerException
		 */

		/*
		 * ===================================================== DUPLICATES
		 * =====================================================
		 *
		 * PriorityQueue DOES allow duplicate elements.
		 *
		 * Example:
		 *
		 * q.offer(5); q.offer(5); q.offer(3);
		 *
		 * Both 5 values can exist.
		 */

		/*
		 * ===================================================== THREAD SAFETY
		 * =====================================================
		 *
		 * PriorityQueue is NOT thread-safe.
		 *
		 * If concurrent access is required, other concurrent queue implementations may
		 * be appropriate.
		 */
	}
}
