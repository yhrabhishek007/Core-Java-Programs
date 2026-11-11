package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo1 {

    public static void main(String[] args) {

//    	IllegalStateException --> If the element cannot be added at this time 
//    	due to capacity restrictions
    	
        /*
         * Queue:
         * -------------------------------
         * Queue generally follows FIFO.
         *
         * FIFO = First In, First Out
         *
         * The element inserted first will
         * generally be removed first.
         *
         * Example:
         *
         * Insert: 10 -> 20 -> 30
         * Remove: 10 -> 20 -> 30
         *
         *
         * Queue is an interface.
         * We need a class which implements Queue.
         *
         * LinkedList is one implementation of Queue.
         */

        Queue<Integer> q = new LinkedList<>();


        // =====================================================
        // 1. add()
        // =====================================================

        /*
         * Adds an element to the Queue.
         *
         * If the element cannot be added,
         * it throws an exception.
         */

        q.add(10);
        q.add(15);
        q.add(12);
        q.add(11);
        q.add(9);
        q.add(5);
        q.add(8);
        
//Note --> If queue is empty then we try to access using element() and remove() then we get NoSuchElementException
        System.out.println("Queue: " + q);


        // =====================================================
        // 2. offer()
        // =====================================================

        /*
         * Also adds an element to the Queue.
         *
         * Difference:
         *
         * add()   -> throws exception if insertion fails
         * offer() -> returns false if insertion fails
         *
         * For LinkedList, both normally succeed.
         */

        q.offer(20);

        System.out.println("After offer(): " + q);


        // =====================================================
        // 3. peek()
        // =====================================================

        /*
         * Retrieves the HEAD of the Queue
         * but DOES NOT remove it.
         *
         * If Queue is empty:
         * returns null.
         */

        System.out.println("peek(): " + q.peek());

        // Queue remains unchanged.


        // =====================================================
        // 4. element()
        // =====================================================

        /*
         * Retrieves the HEAD of the Queue
         * but DOES NOT remove it.
         *
         * Difference from peek():
         *
         * peek()    -> returns null if Queue is empty
         * element() -> throws NoSuchElementException
         */

        System.out.println("element(): " + q.element());

        // Queue remains unchanged.


        // =====================================================
        // 5. poll()
        // =====================================================

        /*
         * Retrieves AND REMOVES the HEAD
         * of the Queue.
         *
         * If Queue is empty:
         * returns null.
         */

        System.out.println("poll(): " + q.poll());

        // First element (10) is removed.


        // =====================================================
        // 6. remove()
        // =====================================================

        /*
         * Retrieves AND REMOVES the HEAD
         * of the Queue.
         *
         * Difference from poll():
         *
         * poll()   -> returns null if Queue is empty
         * remove() -> throws NoSuchElementException
         */

        System.out.println("remove(): " + q.remove());

        // Next element (15) is removed.


        System.out.println("Final Queue: " + q);


        /*
         * =====================================================
         * IMPORTANT QUEUE METHODS
         * =====================================================
         *
         *                INSERT
         *                  |
         *          +-------+-------+
         *          |               |
         *        add()           offer()
         *       Exception         false
         *
         *
         *                REMOVE
         *                  |
         *          +-------+-------+
         *          |               |
         *       remove()          poll()
         *       Exception          null
         *
         *
         *                 READ
         *                  |
         *          +-------+-------+
         *          |               |
         *       element()        peek()
         *       Exception          null
         *
         *
         * =====================================================
         *
         * add()      -> Insert
         * offer()    -> Insert
         *
         * remove()   -> Remove
         * poll()     -> Remove
         *
         * element() -> Read/Check Head
         * peek()    -> Read/Check Head
         *
         *
         * =====================================================
         * EASY MEMORY TRICK
         * =====================================================
         *
         * add()    <-> offer()
         * remove() <-> poll()
         * element() <-> peek()
         *
         *
         * Exception methods:
         *
         * add()
         * remove()
         * element()
         *
         *
         * Special-value methods:
         *
         * offer()
         * poll()
         * peek()
         *
         *
         * =====================================================
         * EMPTY QUEUE BEHAVIOUR
         * =====================================================
         *
         * peek()    -> null
         * poll()    -> null
         *
         * element() -> NoSuchElementException
         * remove()  -> NoSuchElementException
         *
         *
         * =====================================================
         * OTHER IMPORTANT POINTS
         * =====================================================
         *
         * 1. Queue generally follows FIFO.
         *
         * 2. Queue is an interface.
         *
         * 3. LinkedList, PriorityQueue and other classes
         *    can implement Queue.
         *
         * 4. PriorityQueue does NOT follow normal FIFO.
         *    It processes elements according to priority.
         *
         * 5. ArrayDeque can also be used as a Queue.
         *
         * 6. Queue and Deque are different:
         *
         *    Queue -> normally works from one end for insertion
         *             and the other end for removal.
         *
         *    Deque  -> Double Ended Queue.
         *             Insertion and removal can happen
         *             from both ends.
         */
    }
}

//One important correction to your original comments
//
//Your original comment said:
//
//// Retrieves and removes the head of this queue.
//// This method differs from poll() only in that it throws an exception
//// if this queue is empty.
//System.out.println(q.remove());
//
//
//That's correct.
//
//But remember the complete pair:
//
//add()      → insert → exception on failure
//offer()    → insert → false on failure
//
//remove()   → remove → NoSuchElementException if empty
//poll()     → remove → null if empty
//
//element()  → read   → NoSuchElementException if empty
//peek()     → read   → null if empty
//
//
//This 6-method table is the main thing to memorize for Queue.