package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorVsForEach {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Chikku");
		fruits.add("Orange");

		if (!fruits.isEmpty()) {
			fruits.add("Apple");
			fruits.add("Pineapple");
			fruits.add("Grapes");
			fruits.add("Guava");
		}

		System.out.println(fruits);

		// Scenario 1: Using for-each loop
				// The for-each loop is used to read each element one by one
				for (String fruit : fruits) {
					System.out.println(fruit);
				}

				System.out.println("------------------");

				// Scenario 2: Using Iterator
				// Iterator is used to move through the collection one element at a time
				Iterator<String> itr = fruits.iterator();

				// hasNext() checks whether another element is available
				while (itr.hasNext()) {

					// next() gets the next element
					String fruit = itr.next();

					// Check if the current fruit is "Guava"
					if (fruit.equals("Guava")) {

						// remove() removes the current element safely
						itr.remove();
					}
				}

				// Guava is removed from the collection
				System.out.println(fruits);

				// Converting Collection into an Array
				// toArray() converts the collection into an Object array
				Object[] objArr = fruits.toArray();

				// Printing array elements using a normal for loop
				for (int i = 0; i < objArr.length; i++) {
					System.out.println(objArr[i]);
				}
				
				
//				Do Array to collections conversion

				// Array to Collection conversion can be done using Arrays.asList()
				// Example:
				// List<Object> list = Arrays.asList(objArr);
		}
	}
	
	


