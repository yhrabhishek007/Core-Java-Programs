package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

//1.Write a Java program to insert "Java" immediately after "Python" in an ArrayList.
//
//Input:JavaScript Python SQL HTML
//
//Output:JavaScript Python Java SQL HTML
public class InsertElementAfterTarget {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("JavaScript");
		li.add("Python");
		li.add("SQL");
		li.add("HTML");

		for (int i = 0; i < li.size(); i++) {

			if (li.get(i).equals("Python")) {
				li.add(i + 1, "Java");
			}

		}

		System.out.println(li);
	}

}
