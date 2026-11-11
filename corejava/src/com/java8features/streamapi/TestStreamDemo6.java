package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Def -->reduce() is a terminal operation in the Java Stream API that combines multiple stream elements into a single result, 
//such as a sum, maximum, minimum, or product.

public class TestStreamDemo6 {

	public static void main(String[] args) {
		
		
		List<Integer> numbers1 = Arrays.asList(10,20,30,40,50);
		numbers1.stream()
		.filter(n-> n>25)
		.limit(2)
		.forEach(System.out::println);
		
		
		System.out.println("*******************************");
	long count =	 Stream.of("apple","banana","cherry")
			.filter(s->s.contains("e"))
//			count() is a terminal operation in the Java Stream API that returns the number of elements present in the stream
			.count();
	
	System.out.println(count);

		 System.out.println("***************************");
		// Creating a list of numbers from 1 to 12
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		// stream() processes the elements one by one
		int sum = numbers.stream()

				// filter() selects only even numbers
				// i % 2 == 0 means the number is divisible by 2
				.filter(i -> i % 2 == 0)

				// map() squares each even number
				// Example: 2 -> 4, 4 -> 16, 6 -> 36
				.map(n -> n * n)

//		-->reduce() is a terminal operation used to combine all stream elements into a single result. Here, we use it to calculate the sum of all squared even numbers
				
				// reduce() combines all values into one result
				// 0 is the initial value
				// Integer::sum adds the values together
				.reduce(10, Integer::sum);

		
		// Printing the final sum
		System.out.println("Sum of the Total elements : " + sum);
		
//		can also give --> .reduce(10, Integer::min);

		 int min = numbers.stream()
	                .reduce(Integer.MAX_VALUE, Integer::min);  

	        // Find maximum value
	        int max = numbers.stream()
	                .reduce(Integer.MIN_VALUE, Integer::max);

	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
	}
}
