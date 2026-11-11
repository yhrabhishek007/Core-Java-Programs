package com.java8features.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestStreamOptionalDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(50, 10, 40, 0, 30);

		Optional<Integer> max = numbers.stream().max(Integer::compareTo);

		System.out.println(max.get());

	}

}
