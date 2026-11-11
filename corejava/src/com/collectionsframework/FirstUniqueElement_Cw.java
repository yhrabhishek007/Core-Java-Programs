package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

//Write a Java program using the List interface to find the first element that occurs only once in the list.
//Input:
//List = [4, 5, 1, 2, 1, 4, 5, 6, 2]
//Expected Output:
//6
public class FirstUniqueElement_Cw {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		li.add(4);
		li.add(5);
		li.add(1);
		li.add(2);
		li.add(1);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(2);

		for (int i = 0; i < li.size(); i++) {
			if (li.indexOf(li.get(i)) == li.lastIndexOf(li.get(i))) {
				System.out.println(li.get(i));
				break;
			}

		}

	}

}
