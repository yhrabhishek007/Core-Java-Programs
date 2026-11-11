package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Scanner;

//1.Write a Java program to replace all elements at even indexes (0, 2, 4, ...) with 0 in an
//ArrayList<Integer> using an Iterator for traversal. Print the updated list after modification.

//input : [10, 20, 30, 40, 50, 60]
//Output:[0,20,0,40,0,60]
public class EvenIndexZeroReplacer {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);


		Iterator<Integer> itr = num.iterator();

		int i = 0;
		while (itr.hasNext()) {

			itr.next();
			if (i % 2 == 0) {
				num.set(i, 0);

			}
			i++;

		}
		System.out.println(num);

	}

}
