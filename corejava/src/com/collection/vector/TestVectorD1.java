package com.collection.vector;

// Def: Vector is a legacy, synchronized, resizable-array class. 
//It maintains insertion order, allows duplicates and nulls, and can be traversed using Enumeration, Iterator, or ListIterator.

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Vector is a legacy class.
// It is similar to ArrayList, but Vector methods are synchronized.

//Why?
//
//It helps make operations on the Vector thread-safe when multiple threads access the same Vector.
//
//Interview answer
//
//Synchronized means only one thread can execute the synchronized code at a time. 
//Vector is synchronized, so its methods provide thread-safe access when multiple threads work with the same Vector.

public class TestVectorD1 {

	public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.addElement(10);
        v.addElement(20);
        v.addElement(40);
        v.addElement(30);
        v.addElement(50);
        v.addElement(10);
        v.addElement(20);
        v.addElement(40);
        v.addElement(500);
        v.addElement(60);

        // Vector allows null values.
        v.add(null);
        v.add(null);

        System.out.println("********************");


        /*
         * Enumeration is a cursor used to read elements
         * one by one.
         *
         * It is mainly used with legacy classes like
         * Vector and Hashtable.
         */

        Enumeration<Integer> enm = v.elements();

        // hasMoreElements() checks if another element is available.
        // nextElement() gets the next element.
        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }


        System.out.println("********************");


        /*
         * Iterator is a common cursor used to traverse
         * collections.
         *
         * Iterator can be used with modern collections
         * like ArrayList, LinkedList, HashSet, Vector, etc.
         */

        Iterator<Integer> itr = v.iterator();

        // hasNext() checks if the next element is available.
        // next() gets the next element.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println(v);
    }
}

//1. Vector is a legacy class.
//→ It has been available since early Java versions.
//
//2. Vector is a resizable array.
//→ Similar to ArrayList.
//
//3. Vector is synchronized.
//→ Its individual methods are synchronized.
//→ Generally thread-safe for individual operations.
//
//4. Vector allows duplicate elements.
//→ [10, 20, 10] is valid.
//
//5. Vector allows null values.
//→ [10, null, 20] is valid.
//
//6. Vector maintains insertion order.
//→ Elements come out in the order they were added.
//
//7. Vector supports index-based access.
//→ get(0), get(1), etc.
//
//8. Vector can be traversed using:
//→ Enumeration
//→ Iterator
//→ ListIterator
//
//9. Enumeration is a legacy cursor.
//→ hasMoreElements()
//→ nextElement()
//
//10. Iterator is the commonly used cursor.
// → hasNext()
// → next()
// → remove()
//
//11. Vector automatically increases its capacity
// when its current capacity is full.
//
//12. Vector is usually slower than ArrayList
// because Vector's individual methods are synchronized.