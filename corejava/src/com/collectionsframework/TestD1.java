package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestD1 {

	public static void main(String[] args) {

		Object[] arr = { "Java", 10, 22.2f, 55.5d, 'S' };

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		Collection c = new ArrayList<>();

		c.add("Java");
		c.add(10);
		c.add(22.544d);
		c.add(34.5f);
		c.add('A');

		System.out.println(c);

		Collection<String> Team1 = new ArrayList<>();

		Team1.add("Bhanu");
		Team1.add("Rakesh");
		Team1.add("Sudheer");
		Team1.add("Bhargav");

		Collection<String> Team2 = new ArrayList<>();

		Team2.add("Jagadeesh");
		Team2.add("Uady");
		Team2.add("Ranjith");
		Team2.add("Vijay");

		Collection<String> BestTeam = new ArrayList<String>();
		
		BestTeam.addAll(Team1);
		BestTeam.addAll(Team2);
		System.out.println(BestTeam);
		
//		Write a Java program using the Collection Framework to add 10 integers and demonstrate add(),
//		contains(), size(), remove(), isEmpty(), and clear() methods. Display the collection after each
//		operation.
		Collection<Integer>  int1= new ArrayList<>();
		
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		int1.add(5);
		int1.add(6);
		int1.add(7);
		int1.add(8);
		int1.add(9);
		int1.add(10);
		
		System.out.println(int1.contains(3));
		System.out.println(int1.size());
		System.out.println(int1.remove(3));
		System.out.println(int1.isEmpty());
		int1.clear();
		System.out.println(int1);


		
	}

}
