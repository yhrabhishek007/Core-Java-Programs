package com.collection.map;

import java.util.Hashtable;
import java.util.Map;

// HashMap vs Hashtable
//
// HashMap:
// - Allows one null key.
// - Allows multiple null values.
// - Allows duplicate values.
// - Does NOT allow duplicate keys.
// - Not synchronized.
// - Introduced as part of the Collections Framework.
//
// Hashtable:
// - Does NOT allow null keys.
// - Does NOT allow null values.
// - Does NOT allow duplicate keys.
// - Allows duplicate values.
// - Synchronized.
// - Legacy class.
//
// IMPORTANT:
// If we try to put null as a key or value in Hashtable,
// it throws NullPointerException.
//
// Simple way to remember:
//
// HashMap   -> allows null + not synchronized
// Hashtable -> does not allow null + synchronized

public class TestMapDemo7 {

	public static void main(String[] args) {

		// Hashtable is synchronized.
		// It does NOT allow null keys or null values.
		Map<String, Float> map = new Hashtable<>();

		// Adding normal key-value pairs.
		map.put("Prabhas", 6.3F);
		map.put("Jr NTR", 5.9F);
		map.put("Ram Charan", 6.0F);
		map.put("Mahesh", 6.1F);

		// ------------------------------------------------
		// NULL KEY
		// ------------------------------------------------

		// Hashtable does NOT allow null as a key.
		// This will throw NullPointerException.
		//
		// map.put(null, 6.2F);

		// Even though a Map can have only one null key,
		// this is still NOT allowed in Hashtable.
		//
		// map.put(null, 6.1F);

		// ------------------------------------------------
		// NULL VALUE
		// ------------------------------------------------

		// Hashtable does NOT allow null as a value.
		// This will throw NullPointerException.
		//
		// map.put("Ram", null);
		// map.put("Sri", null);

		System.out.println(map);
	}
}
