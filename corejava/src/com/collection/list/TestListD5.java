package com.collection.list;

import java.util.Arrays;
import java.util.List;

public class TestListD5 {

	public static void main(String[] args) {
// java.lang.UnsupportedOperationException
		
		// Arrays.asList() creates a fixed-size List backed by an array.
		List<Integer> li = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);

		// ❌ Not allowed because the size of the List cannot be changed.
		// add() tries to increase the size of the List.
		li.add(0, 100);

		System.out.println(li);
	}
}
