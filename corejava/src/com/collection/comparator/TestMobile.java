package com.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {

		/*
		 * Creating Mobile objects.
		 */
		Mobile m1 = new Mobile("9R", "One Plus", 40000.00);
		Mobile m2 = new Mobile("S24", "Samsung", 75000.00);
		Mobile m3 = new Mobile("15", "IPhone", 95000.00);
		Mobile m4 = new Mobile("13 Pro", "Xiaomi", 35000.00);
		Mobile m5 = new Mobile("Edge 50", "Motorola", 45000.00);

		/*
		 * Creating a List of Mobile objects.
		 */
		List<Mobile> mobileList = new ArrayList<>();

		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);

		/*
		 * ===================================================== Comparator
		 * =====================================================
		 *
		 * Comparator is used when we want to define CUSTOM sorting logic outside the
		 * Mobile class.
		 *
		 * Here, we want to sort Mobile objects based on BRAND.
		 *
		 * Mobile does NOT implement Comparable.
		 *
		 * Therefore, we provide a Comparator to Collections.sort().
		 *
		 *
		 * Comparator<Mobile> ↓ compare(Mobile o1, Mobile o2) ↓ Decides the order of two
		 * Mobile objects.
		 */

//		Anonymous Inner class implements Comparator
//		To fullfil temporary requirements we use Inner Classes
		Comparator<Mobile> c = new Comparator<Mobile>() {

			/*
			 * compare() compares two Mobile objects.
			 *
			 * o1 = first Mobile object o2 = second Mobile object
			 *
			 * Return:
			 *
			 * Negative → o1 comes BEFORE o2 Zero → o1 and o2 are equal for sorting Positive
			 * → o1 comes AFTER o2
			 */
			@Override
			public int compare(Mobile o1, Mobile o2) {

//            	--> Comparision using price
//    			if (o1.price < o2.price) {
//    				return -1;
//    			} else if (o1.price > o2.price) {
//    				return 1;
//    			} else {
//    				return 0;
//    			}

				/*
				 * ================================================= OPTION 1: Sort by PRICE in
				 * ASCENDING order =================================================
				 *
				 * 35000 40000 45000 75000 95000
				 *
				 * Recommended way:
				 *
				 * return Double.compare(o1.price, o2.price);
				 */

				// return Double.compare(o1.price, o2.price);

				/*
				 * ================================================= OPTION 2: Sort by PRICE in
				 * DESCENDING order =================================================
				 *
				 * return Double.compare(o2.price, o1.price);
				 */

				/*
				 * ================================================= OPTION 3: Sort by BRAND
				 * =================================================
				 *
				 * String already implements Comparable.
				 *
				 * Therefore String has compareTo().
				 *
				 * Example:
				 *
				 * "IPhone".compareTo("Samsung")
				 *
				 * returns a negative value because IPhone comes before Samsung alphabetically.
				 *
				 * So this gives BRAND ascending order.
				 */
				return o1.brand.compareTo(o2.brand);
			}
		};

		/*
		 * ===================================================== Sorting
		 * =====================================================
		 *
		 * Collections.sort() receives TWO arguments:
		 *
		 * 1. mobileList → List that needs to be sorted 2. c → Comparator containing
		 * sorting logic
		 *
		 * Collections.sort() uses:
		 *
		 * c.compare(o1, o2)
		 *
		 * to decide the order.
		 */
		Collections.sort(mobileList, c);

		/*
		 * Printing the sorted list.
		 */
		for (Mobile m : mobileList) {
			System.out.println(m);
		}
	}
}
