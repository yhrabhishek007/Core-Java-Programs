package com.collection.linkedlist;

//Def: LinkedList is a doubly linked-list implementation of the List and Deque interfaces. 
//It maintains insertion order, allows duplicates and null values, is not synchronized, and can be used as a List, Queue, or Deque.
import java.util.LinkedList;

public class TestLinkedListD1 {

    public static void main(String[] args) {

        /*
         * LinkedList is a List implementation.
         *
         * Internally, LinkedList uses nodes.
         *
         * Each node contains:
         * 1. Data
         * 2. Reference to the next node
         * 3. Reference to the previous node
         */

        LinkedList<Integer> l1 = new LinkedList<>();


        // add() adds elements to the list.
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        System.out.println(l1);


        /*
         * addFirst() adds an element at the beginning.
         */

        l1.addFirst(5);

        System.out.println(l1);
        // [5, 10, 20, 30, 40, 50]


        /*
         * addLast() adds an element at the end.
         */

        l1.addLast(60);

        System.out.println(l1);
        // [5, 10, 20, 30, 40, 50, 60]


        /*
         * getFirst() returns the first element.
         * It does not remove the element.
         */

        System.out.println(l1.getFirst());


        /*
         * getLast() returns the last element.
         * It does not remove the element.
         */

        System.out.println(l1.getLast());


        /*
         * removeFirst() removes the first element.
         */

        l1.removeFirst();

        System.out.println(l1);


        /*
         * removeLast() removes the last element.
         */

        l1.removeLast();

        System.out.println(l1);


        /*
         * add(index, element) adds an element at a particular index.
         */

        l1.add(2, 100);

        System.out.println(l1);


        /*
         * remove(index) removes the element at the given index.
         */

        l1.remove(2);

        System.out.println(l1);


        /*
         * LinkedList allows duplicate values.
         */

        l1.add(20);

        System.out.println(l1);


        /*
         * LinkedList allows null values.
         */

        l1.add(null);

        System.out.println(l1);
    }
}

//1. LinkedList is a class that implements List and Deque.
//
//2. Internally, LinkedList uses a doubly linked list.
//   → Each node has:
//      data
//      previous reference
//      next reference
//
//3. It maintains insertion order.
//
//4. It allows duplicate elements.
//
//5. It allows null values.
//
//6. It is NOT synchronized.
//
//7. It does NOT use a continuous array like ArrayList.
//
//8. Accessing an element by index is slower than ArrayList.
//   → get(index) requires traversing nodes.
//
//9. Adding/removing elements is efficient when the
//   required node position is already known.
//
//10. LinkedList can be used as:
//    → List
//    → Queue
//    → Deque
//
//11. Important methods:
//
//    add()
//    addFirst()
//    addLast()
//
//    getFirst()
//    getLast()
//
//    removeFirst()
//    removeLast()
//
//    peek()
//    poll()
//    offer()