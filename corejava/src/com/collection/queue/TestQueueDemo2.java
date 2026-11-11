package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo2 {

	public static void main(String[] args) {
//A collection designed for holding elements prior to processing.
		Queue<Integer> q = new LinkedList<>();

//		true if the element was added to this queue , else false
		q.offer(null); // false
		q.offer(12);  //false
		q.offer(13);
		q.offer(11);
		q.offer(34);
		q.offer(23);
		q.offer(67);
		q.offer(3);
		q.offer(null);

		System.out.println(q.peek()); // null
		System.out.println(q.poll());

		System.out.println(q);
		
//		Situation	Method	Result
//		Empty Queue	remove()	NoSuchElementException
//		Empty Queue	element()	NoSuchElementException
//		Empty Queue	poll()	null
//		Empty Queue	peek()	null
//		Full bounded Queue	add()	IllegalStateException
//		Full bounded Queue	offer()	false

	}

}
