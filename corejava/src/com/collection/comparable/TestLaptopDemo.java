package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLaptopDemo {

	public static void main(String[] args) {

		/*
		 * ========================================================= PART 1: Sorting
		 * Integer objects =========================================================
		 */

		List<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(60);
		list.add(80);
		list.add(150);
		list.add(70);
		list.add(70);

		/*
		 * Integer already implements Comparable<Integer>.
		 *
		 * Therefore Java already knows the natural ordering of Integer:
		 *
		 * 60, 70, 70, 80, 100, 150
		 */
		Collections.sort(list);

		System.out.println(list);

		System.out.println("-------------------------");

		/*
		 * ========================================================= PART 2: Sorting
		 * Laptop objects =========================================================
		 */

		Laptop l1 = new Laptop("Intel Graphics", "Dell", 100000.00);
		Laptop l2 = new Laptop("Thinkpad", "Lenovo", 80000.00);
		Laptop l3 = new Laptop("Pavillian", "HP", 60000.00);
		Laptop l4 = new Laptop("MacBook", "Mac", 150000.00);
		Laptop l5 = new Laptop("Vivo-Book", "Asus", 70000.00);

		List<Laptop> laptopList = new ArrayList<>();

		laptopList.add(l1);
		laptopList.add(l2);
		laptopList.add(l3);
		laptopList.add(l4);
		laptopList.add(l5);

		/*
		 * Collections.sort() needs to know:
		 *
		 * "How should two Laptop objects be compared?"
		 *
		 * Laptop implements Comparable<Laptop>, so Collections.sort() internally uses:
		 *
		 * laptop1.compareTo(laptop2)
		 *
		 * Our compareTo() currently compares BRAND in DESCENDING order.
		 */
		Collections.sort(laptopList);

		/*
		 * Print the sorted Laptop objects.
		 */
		for (Laptop l : laptopList) {
			System.out.println(l);
		}
	}
}
