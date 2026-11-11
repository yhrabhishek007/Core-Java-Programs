package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListD2 {

	public static void main(String[] args) {

		List<String> teamA = new ArrayList<>();

		teamA.add("Vk");
		teamA.add("Msd");
		teamA.add("Hitman");
		teamA.add("Pandya");
		teamA.add("Miya Magic");

		List<String> teamB = new ArrayList<>();

		teamB.add("Ishan");
		teamB.add("Jaiswal");
		teamB.add("Gill");
		teamB.add("Bappu");
		teamB.add("Tilak");

		List<String> teamC = new ArrayList<>();

		teamC.add("Sooryavanshi");
		teamC.add("Dhruv Jurel");
		teamC.add("Harshith");

		List<String> teamD = new ArrayList<>();

		// addAll() - adds all elements of teamA to teamD
		teamD.addAll(teamA);

		// addAll() - adds all elements of teamB to teamD
		teamD.addAll(teamB);

		// addAll(index, collection) - adds teamC elements from the specified index
		teamD.addAll(1, teamC);

		System.out.println(teamD);

		// size() - returns the number of elements in the list
		// get(index) - returns the element at the specified index
		for (int i = 0; i < teamD.size(); i++) {
			System.out.println(teamD.get(i));
		}

		// indexOf() - returns the first occurrence index of the specified element
		System.out.println(teamD.indexOf("Miya Magic"));

		// lastIndexOf() - returns the last occurrence index of the specified element
		System.out.println(teamD.lastIndexOf("Miya Magic"));

//		“Collections use Integer, but how are you able to add an int value?”

//				You can answer:

//		Collections cannot store primitive data types. They store objects. So, for int, we use its wrapper class Integer. When we add an int value to a collection, 
//		Java automatically converts the primitive int into an Integer object. This is called autoboxing. Similarly, when an Integer object is assigned to an int,
//		Java automatically converts it back to int, which is called unboxing.
		List<Integer> l1 = new ArrayList<>();

		// Autoboxing: int values are automatically converted to Integer objects
		l1.add(6);
		l1.add(9);
		l1.add(10);
		l1.add(11);
		l1.add(15);
		
		
		Iterator<Integer> itr = l1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------");
		
		ListIterator<Integer> litr = l1.listIterator();
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		// indexOf(4) returns -1 because 4 is not present in the list
		// remove(-1) tries to remove an element at index -1
		// Therefore, it throws IndexOutOfBoundsException
//		l1.remove(l1.indexOf(4));
		
//		l1.remove(l1.indexOf(15));    //<---
//		indexOf() searches for the given value and returns its index. That returned index is passed as an argument to remove(), 
//		which then removes the element at that index.
		System.out.println(l1);
	}
}