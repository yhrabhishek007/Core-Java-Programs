package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurences {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");

		String str = sc.next();

		for (char c : str.toCharArray()) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println("Occurrences: " + map);

		// Find maximum occurrence
		char maxChar = 0;
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		System.out.println("Maximum occurring character: " + maxChar);
		System.out.println("Maximum occurrence: " + maxCount);

		sc.close();
	}
}
