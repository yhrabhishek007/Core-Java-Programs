package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Lambda Expressions vs Collections
public class TestJ8Demo9 {

	public static void main(String[] args) {

		// Create an ArrayList to store Integer values
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Add numbers to the list
		al.add(20);
		al.add(10);
		al.add(50);
		al.add(60);
		al.add(90);
		al.add(40);
		al.add(80);
		al.add(70);

		// Create a Comparator using a lambda expression
		// If o1 is smaller, return 1
		// If o1 is greater, return -1
		// This sorts the numbers in descending order
		Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? 1 : (o1 > o2) ? -1 : 0;

		// Sort the list using the Comparator
		Collections.sort(al, c);

		// Print the sorted list
		System.out.println(al);
	}
}
