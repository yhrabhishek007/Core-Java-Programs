package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorVsListIterator {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();

        l1.add(6);
        l1.add(3);
        l1.add(5);
        l1.add(4);
        l1.add(8);
        l1.add(9);
        l1.add(1);

        // iterator() - creates an Iterator to traverse the list in forward direction
        Iterator<Integer> itr = l1.iterator();

        // hasNext() - checks whether the next element is available
        // next() - returns the next element and moves the cursor forward
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("------------------");

        // listIterator() - creates a ListIterator
        // ListIterator can move in both forward and backward directions
        ListIterator<Integer> litr = l1.listIterator();

        // hasNext() - checks whether the next element is available
        // next() - returns the next element and moves the cursor forward
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("*********************");

        // Now the cursor is at the END of the list
        // Therefore, hasPrevious() returns true
        // previous() - returns the previous element and moves the cursor backward
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
//    ListIterator starts at the beginning, so hasPrevious() initially returns false. 
//    After next() moves the cursor to the end, hasPrevious() returns true, allowing backward traversal.
}