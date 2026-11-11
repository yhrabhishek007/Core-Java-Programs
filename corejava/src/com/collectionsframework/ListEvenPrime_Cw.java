package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a Java program using the List interface to store 10 integers and display the even numbers and 
//prime numbers from the list.
public class ListEvenPrime_Cw {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(7);
		l.add(11);
		l.add(33);
		l.add(88);
		l.add(56);
		l.add(24);
		l.add(91);
		l.add(57);
		l.add(90);

		Iterator<Integer> itr = l.iterator();

		while (itr.hasNext()) {
			int n = itr.next();
			if (n % 2 == 0) {

				System.out.println("Even Number: " + n);

			}
//			Prime Numbers

			boolean prime = true;

			if (n < 2) {
				prime = false;
			}

			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				System.out.println("Prime Number:" + n);
			}
		}

	}

}
