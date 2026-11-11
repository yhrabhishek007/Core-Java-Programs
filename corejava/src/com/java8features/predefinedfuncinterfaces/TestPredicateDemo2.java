package com.java8features.predefinedfuncinterfaces;

import java.util.function.Predicate;

public class TestPredicateDemo2 {

	public static void main(String[] args) {

		Predicate<String> p1 = (s) -> s.length() > 5;
		Predicate<String> p2 = (s) -> s.contains("h");
		Predicate<String> p3 = p1.and(p2);
		Predicate<String> p4=p1.or(p2);

		String[] names = { "Sachun" ,"Shubman Gill", "Dhoni", "Rohit Sharma", "K L Rahul", "Virat Kohli", "Jadeja" };

		for (String name : names) {
			if (p4.test(name)) {
				System.out.println(name);
			}

		}

	}
}
