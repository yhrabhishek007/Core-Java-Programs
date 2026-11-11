package com.java8features.dateapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExecutionTimeDemo {

	public static void main(String[] args) {

		// Record the start time in milliseconds
		long startTimeMillis = System.currentTimeMillis();

		// Code whose execution time you want to measure

		List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);

		Optional<Integer> max = numbers.stream().max(Integer::compareTo);

		System.out.println(max.get());

		// Record the end time in milliseconds
		long endTimeMillis = System.currentTimeMillis();

		// Calculate execution time
		long executionTimeMillis = endTimeMillis - startTimeMillis;

		System.out.println("Execution time: " + executionTimeMillis + " ms");
	}
}
