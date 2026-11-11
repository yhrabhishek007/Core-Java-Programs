package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo4 {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("Abhishek", "Java", "Angular" , "MySql");
		
		List<String> names1=names.stream()
				.filter(s->s.toUpperCase().startsWith("A"))
				.map(s->s.concat("-Sql"))
				.sorted()
				.distinct()
				.limit(4)
				.collect(Collectors.toList());
		
//		We use forEach() when we need to perform an operation on each element of a collection or stream.
//		System.out::println is a method reference that we commonly use with forEach() when we want to print each element.
		
		// forEach() processes each element of the list.
		// System.out::println is a method reference used to print each element.
		names1.forEach(System.out::println);

//		The forEach() method iterates over each element of the names1 list, 
//		and System.out::println is a method reference that prints each element on a new line.

	}

}
