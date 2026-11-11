package com.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

//* 1. What is NavigableSet?
//*
//* NavigableSet is an interface in Java Collection Framework that extends
//* SortedSet and provides methods to navigate through elements based on
//* their closest/relative values.
//*
//*
//* 2. What is the main purpose of NavigableSet?
//*
//* Its main purpose is to find elements that are immediately smaller,
//* greater than, or closest to a given element.
//*
//* Important methods:
//*
//* lower()    -> strictly less than
//* floor()    -> less than or equal to
//* ceiling()  -> greater than or equal to
//* higher()   -> strictly greater than
//*
//*
//* 3. Which class implements NavigableSet?
//*
//* TreeSet is the commonly used implementation of NavigableSet.
//*
//* Example:
//*
//* NavigableSet<Integer> ns = new TreeSet<>();
//*
//*
//* 4. Difference between SortedSet and NavigableSet?
//*
//* SortedSet provides elements in sorted order and basic range operations.
//*
//* NavigableSet extends SortedSet and additionally provides navigation
//* operations like lower(), floor(), ceiling(), and higher().

public class TestSetD4 {

	public static void main(String[] args) {

		NavigableSet<Integer> ns = new TreeSet<>();

		ns.add(1000);
		ns.add(1500);
		ns.add(2000);
		ns.add(2500);
		ns.add(650);
		ns.add(1200);
		ns.add(500);

//		Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
		System.out.println(ns.floor(700));

//		Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
		System.out.println(ns.ceiling(1200));

//		Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
		System.out.println(ns.lower(650));

//		Retrieves and removes the first (lowest) element, or returns null if this set is empty (optional operation).
		System.out.println(ns.pollFirst());

//	    Retrieves and removes the last (highest) element, or returns null if this set is empty (optional operation).	
		System.out.println(ns.pollLast());

//		Returns the last (highest) element currently in this set.
		System.out.println(ns.last());

//		Returns the first (lowest) element currently in this set.
		System.out.println(ns.first());

		System.out.println(ns);
	}

}

/*
 * ===================== NavigableSet - Important Notes =====================
 *
 * 1. NavigableSet is an interface introduced in Java 6.
 *
 * 2. NavigableSet extends SortedSet.
 *
 * Collection | Set | SortedSet | NavigableSet
 *
 * 3. TreeSet is the most commonly used implementation of NavigableSet.
 *
 * NavigableSet<Integer> ns = new TreeSet<>();
 *
 * 4. TreeSet stores elements in sorted order by default.
 *
 * 5. NavigableSet does NOT allow duplicate elements because it extends Set.
 *
 *
 * ===================== Important Navigation Methods =====================
 *
 * lower(x) -> Returns the greatest element that is STRICTLY LESS THAN x. ->
 * Symbol: <
 *
 * floor(x) -> Returns the greatest element that is LESS THAN OR EQUAL TO x. ->
 * Symbol: <=
 *
 * ceiling(x) -> Returns the smallest element that is GREATER THAN OR EQUAL TO
 * x. -> Symbol: >=
 *
 * higher(x) -> Returns the smallest element that is STRICTLY GREATER THAN x. ->
 * Symbol: >
 *
 *
 * Easy way to remember:
 *
 * lower floor ceiling higher < <= >= >
 *
 *
 * Example:
 *
 * Set = [500, 650, 1000, 1200, 1500]
 *
 * lower(1000) -> 650 floor(1000) -> 1000 ceiling(1000) -> 1000 higher(1000) ->
 * 1200
 *
 *
 * ===================== First / Last Methods =====================
 *
 * first() -> Returns the smallest element. -> Does NOT remove the element.
 *
 * last() -> Returns the largest element. -> Does NOT remove the element.
 *
 * pollFirst() -> Returns AND removes the smallest element.
 *
 * pollLast() -> Returns AND removes the largest element.
 *
 *
 * ===================== Reverse Order =====================
 *
 * descendingSet() -> Returns a view of the set in descending/reverse order.
 *
 * Example:
 *
 * [500, 650, 1000, 1200]
 *
 * descendingSet() -> [1200, 1000, 650, 500]
 *
 *
 * ===================== Range Methods =====================
 *
 * headSet(x) -> Returns elements before x.
 *
 * tailSet(x) -> Returns elements from x onwards.
 *
 * subSet(from, to) -> Returns elements within the specified range.
 *
 * NavigableSet also allows us to specify whether the boundary elements should
 * be included or excluded.
 *
 *
 * ===================== Important Interview Points =====================
 *
 * 1. NavigableSet is an interface.
 *
 * 2. We cannot directly create its object:
 *
 * new NavigableSet<>(); // Invalid
 *
 * 3. We can use TreeSet:
 *
 * NavigableSet<Integer> ns = new TreeSet<>();
 *
 * 4. TreeSet internally uses a Red-Black Tree.
 *
 * 5. Common TreeSet operations like add(), remove(), contains(), lower(),
 * floor(), ceiling(), and higher() generally take O(log n).
 *
 * 6. NavigableSet does not allow duplicate elements.
 *
 * 7. Elements are maintained in sorted order.
 *
 * 8. If no suitable element is found, lower(), floor(), ceiling(), and higher()
 * return null.
 *
 *
 * ===================== Most Asked Interview Difference =====================
 *
 * lower(x) -> < x floor(x) -> <= x ceiling(x) -> >= x higher(x) -> > x
 *
 * Example:
 *
 * Set = [10, 20, 30]
 *
 * lower(20) -> 10 floor(20) -> 20 ceiling(20) -> 20 higher(20) -> 30
 *
 *
 * ===================== SortedSet vs NavigableSet =====================
 *
 * SortedSet provides:
 *
 * first() last() headSet() tailSet() subSet()
 *
 * NavigableSet provides all SortedSet features PLUS:
 *
 * lower() floor() ceiling() higher() pollFirst() pollLast() descendingSet()
 *
 *
 * ===================== Interview Definition =====================
 *
 * NavigableSet is an interface that extends SortedSet and provides methods to
 * navigate through elements based on their relative position, such as lower(),
 * floor(), ceiling(), and higher().
 *
 */

//* 10. What happens if lower(), floor(), ceiling(), or higher()
//*     cannot find a matching element?
//*
//* They return null.
