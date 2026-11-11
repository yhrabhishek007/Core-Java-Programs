package com.collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Write a Java program using HashMap to group all the words that are anagrams of each other.
// Input:
// words = {"eat", "tea", "tan", "ate", "nat", "bat"}
//
// Output:
// [[eat, tea, ate], [tan, nat], [bat]]

public class AnagramHashMap {

	public static void main(String[] args) {

		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (String word : words) {

			// Convert word into character array
			char[] chars = word.toCharArray();

			// Sort the characters
			Arrays.sort(chars);

			// Convert sorted characters back to String
			String key = new String(chars);

			// Check if key already exists
			if (map.containsKey(key)) {

				map.get(key).add(word);

			} else {

				ArrayList<String> list = new ArrayList<>();

				list.add(word);

				map.put(key, list);
			}
		}

		// Display the anagram groups
		System.out.println(map.values());
	}
}