package com.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

// HashMap vs ConcurrentHashMap
//
// HashMap:
// - Not thread-safe.
// - Iterator is generally fail-fast.
// - If the map is structurally modified while iterating,
//   ConcurrentModificationException may be thrown.
//
// ConcurrentHashMap:
// - Designed for concurrent access from multiple threads.
// - Thread-safe for its supported operations.
// - Its iterators are NOT fail-fast.
// - Its iterators are weakly consistent.
// - Modification during iteration does not throw
//   ConcurrentModificationException.
//
// IMPORTANT:
// ConcurrentHashMap does NOT allow null keys or null values.

public class TestMapDemo8 {

	public static void main(String[] args) {

		// ConcurrentHashMap is designed for concurrent access.
		Map<String, String> map = new ConcurrentHashMap<>();

		// Adding key-value pairs
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Cherry");
		map.put("D", "Dragon-Fruit");

		System.out.println(map);

		// Iterating through the map
		for (Entry<String, String> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " - " + entry.getValue());

			// Modifying the map while iterating.
			//
			// With a normal HashMap, this kind of structural
			// modification during iteration can cause:
			//
			// ConcurrentModificationException
			//
			// With ConcurrentHashMap, the iterator does not
			// throw ConcurrentModificationException.
			//
			// However, the iterator does NOT guarantee exactly
			// when or whether the newly added entry will be seen.
			map.put("O", "Orange");
		}
	}
}
