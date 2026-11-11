package com.collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetD1 {

	public static void main(String[] args) {

		/*
		 * HashMap stores data in the form of:
		 *
		 *     key   -> value
		 *
		 * Here:
		 * Integer = key
		 * String  = value
		 */
		Map<Integer, String> m = new HashMap<>();

		m.put(7, "Dhoni");
		m.put(18, "Virat");
		m.put(45, "Rohit");
		m.put(33, "Pandya");
		m.put(35, "Pandya");

		System.out.println(m);

		/*
		 * HashSet stores only UNIQUE elements.
		 *
		 * Internally, HashSet is implemented using HashMap.
		 *
		 * When we create:
		 *
		 *     Set<Integer> s = new HashSet<>();
		 *
		 * internally HashSet creates a HashMap.
		 *
		 * When we add:
		 *
		 *     s.add(18);
		 *
		 * HashSet internally stores something similar to:
		 *
		 *     map.put(18, PRESENT);
		 *
		 * The actual value is just a dummy object.
		 *
		 * HashSet is interested only in the KEY.
		 */

		/*
		 * Default initial capacity of HashMap = 16
		 *
		 * Default load factor = 0.75
		 *
		 * So initially HashMap can have 16 buckets.
		 */
		Set<Integer> s = new HashSet<>();

		// s.add("A");  // ❌ Not allowed because Set is Set<Integer>

		/*
		 * HashSet uses hashCode() and hashing internally
		 * to decide where an element should be stored.
		 *
		 * IMPORTANT:
		 * We should not think of it simply as:
		 *
		 *     value % 16
		 *
		 * Modern HashMap uses a hash calculation and then
		 * determines the bucket/index.
		 */

		s.add(18);
		s.add(45);
		s.add(34);
		s.add(9);
		s.add(2);
		s.add(68);
		s.add(38);
		s.add(16);
		s.add(32);

		System.out.println(s);

		/*
		 * IMPORTANT:
		 *
		 * HashSet does NOT guarantee insertion order.
		 *
		 * Therefore, the output order may be different
		 * from the order in which we added the elements.
		 */
	}
	
	
//	Capacity = 16
//	Load Factor = 0.75
//			
//	Threshold = 16 × 0.75
//	          = 12


}

//1. Set is an interface that does NOT allow duplicate elements.
//
//2. Main implementations of Set:
// → HashSet
// → LinkedHashSet
// → TreeSet
//
//3. HashSet:
// → Does not maintain any guaranteed order.
// → Uses HashMap internally.
// → Stores elements as keys in the internal HashMap.
// → Allows one null value.
// → Generally provides O(1) average time for add(), remove(), contains().
//
//4. LinkedHashSet:
// → Maintains insertion order.
// → Uses hash-based storage with linked ordering information.
// → Allows one null value.
// → Generally provides O(1) average time for add(), remove(), contains().
//
//5. TreeSet:
// → Maintains elements in sorted order.
// → Uses a tree-based data structure.
// → Generally provides O(log n) for add(), remove(), contains().
// → Does not generally allow null with natural ordering.
//
//6. All Set implementations:
// → Do NOT allow duplicate elements.
//
//7. Set does NOT support index-based access.
//
// Example:
// s.get(0);   // ❌ Not available
//
//8. Set maintains uniqueness using equality/hash-based or
// comparison-based rules depending on the implementation.
//
//9. HashSet and LinkedHashSet use hashCode() and equals()
// to identify duplicate elements.
//
//10. TreeSet uses natural ordering or a Comparator
//  to maintain sorted order.
//
//11. HashSet internally uses HashMap.
//
//  HashSet:
//      element → key
//      PRESENT → dummy value
//
//12. HashSet default concepts:
//  → Capacity = 16
//  → Load Factor = 0.75
//  → Threshold = Capacity × Load Factor
//  → 16 × 0.75 = 12
//
//13. Set is NOT synchronized by default.
//
//14. Important methods:
//
//  add()
//  remove()
//  contains()
//  size()
//  isEmpty()
//  clear()
//
//15. Important difference:
//
//  HashSet
//  → No guaranteed order
//
//  LinkedHashSet
//  → Insertion order
//
//  TreeSet
//  → Sorted order

//Feature	          HashSet	               LinkedHashSet	            TreeSet
//Duplicates	       ❌	                       ❌	                      ❌
//Ordering	    No guaranteed order	      Insertion order	         Sorted order
//null	        One allowed	              One allowed	            Generally not with natural ordering
//Basic operation	O(1) average	         O(1) average	             O(log n)
//Main structure	Hash table	        Hash table + linked ordering	   Tree
//Use when	     Uniqueness	       Uniqueness + insertion order	  Uniqueness + sorting
