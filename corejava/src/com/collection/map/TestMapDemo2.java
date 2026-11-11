package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; // Entry is a nested interface inside Map
import java.util.Set;

public class TestMapDemo2 {

	public static void main(String[] args) {

		// Creating a Map where:
		// Key = String
		// Value = String
		//
		// HashMap stores data in key-value pairs.
		// Example: "TG" -> "Telangana"
		Map<String, String> map = new HashMap<>();

		// put() is used to add key-value pairs to the Map
		map.put("TG", "Telangana");
		map.put("AP", "Andhra Pradesh");
		map.put("MP", "Madhya Pradesh");
		map.put("KL", "Kerala");
		map.put("RJ", "Rajasthan");
		map.put("GJ", "Gujarat");

		// Adding the same key again.
		// HashMap does NOT allow duplicate keys.
		// Since "TG" already exists, this does not create
		// another entry.
		map.put("TG", "Telangana");

		map.put("MH", "Maharashtra");

		// containsKey() checks whether the specified key
		// exists in the Map.
		// Returns true or false.
		System.out.println(map.containsKey("MH"));

		// get() returns the value associated with the given key.
		// "KL" -> "Kerala"
		System.out.println(map.get("KL"));

		// keySet() returns all the keys as a Set.
		// Since keys cannot be duplicated, Set is used.
		System.out.println(map.keySet());

		// values() returns all the values.
		// Values can be duplicated, so it returns a Collection.
		System.out.println(map.values());

		/*
		 * Iterating through a Map
		 *
		 * KL = Kerala
		 *
		 * The complete key-value pair is called an "Entry".
		 *
		 * Example: Key = KL Value = Kerala
		 *
		 * Entry = KL=Kerala
		 */

		// entrySet() returns all key-value pairs as a Set of Entries.
		//
		// Entry is a nested interface inside the Map interface.
		//
		// Set<Entry<String, String>>
		// ↑
		// Each Entry contains one key and one value.
		Set<Entry<String, String>> entries = map.entrySet();

		// Iterate through each Entry
		for (Entry<String, String> entry : entries) {

			// getKey() returns the key
			// getValue() returns the value
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}

//Java Map — Interview Questions
//Based on the code you're practicing, these are the questions I'd prepare first.
//
//Basic questions
//What is a Map in Java?
//
//A Map is an interface that stores data in key-value pairs. Each key maps to a value.
//
//Does Map extend Collection?
//
//No. Map is a separate interface in the Java Collections Framework.
//
//Can a Map contain duplicate keys?
//
//No. Keys must be unique. If you insert the same key again, its value is replaced.
//
//map.put("TG", "Telangana");
//map.put("TG", "Telangana 2");
//
//The result is:
//
//TG -> Telangana 2
//
//Can a Map contain duplicate values?
//
//Yes. Multiple keys can have the same value.
//
//map.put("TG", "South India");
//map.put("AP", "South India");
//
//Can a Map contain null keys and values?
//
//It depends on the implementation. For example, HashMap allows one null key and multiple null values.
//
//HashMap Questions
//What is HashMap?
//
//HashMap is an implementation of the Map interface that stores key-value pairs using hashing.
//
//Does HashMap maintain insertion order?
//
//No. HashMap does not guarantee insertion order.
//
//What happens when we put the same key twice?
//
//map.put("TG", "Telangana");
//map.put("TG", "Hyderabad");
//
//The second value replaces the first value.
//
//Can HashMap have a null key?
//
//Yes. HashMap allows one null key and multiple null values.
//
//Is HashMap synchronized?
//
//No. HashMap is not synchronized.
//
//Important Map Methods
//What does put() do?
//
//map.put("TG", "Telangana");
//
//Adds a key-value pair to the Map. If the key already exists, its value is replaced.
//
//What does get() do?
//
//map.get("KL");
//
//Returns the value associated with the specified key.
//
//What does containsKey() do?
//
//map.containsKey("MH");
//
//Checks whether the specified key exists in the Map.
//
//What does containsValue() do?
//
//map.containsValue("Kerala");
//
//Checks whether the specified value exists in the Map.
//
//What does keySet() return?
//
//map.keySet();
//
//Returns all keys as a Set.
//
//Set<String>
//
//What does values() return?
//
//map.values();
//
//Returns all values as a Collection.
//
//Collection<String>
//
//What does entrySet() return?
//
//map.entrySet();
//
//Returns all key-value pairs as a Set of Map.Entry objects.
//
//Map.Entry — Very Important
//What is Map.Entry?
//
//Map.Entry is a nested interface inside Map that represents a single key-value pair.
//
//For example:
//
//KL = Kerala
//
//is one Entry.
//
//How do you get the key from an Entry?
//
//entry.getKey();
//
//How do you get the value from an Entry?
//
//entry.getValue();
//
//How do you iterate through a Map using entrySet()?
//
//for (Map.Entry<String, String> entry : map.entrySet()) {
//    System.out.println(entry.getKey() + " -> " + entry.getValue());
//}
//
//This is a very common interview question.
//
//keySet() vs values() vs entrySet()
//This is worth remembering:
//
//Method	Returns	Contains
//keySet()	Set	Keys
//values()	Collection	Values
//entrySet()	Set	Key + Value
//
//Think:
//
//keySet()   → Keys only
//values()   → Values only
//entrySet() → Both
//
//Frequently Asked Comparison Questions
//HashMap vs Hashtable?
//
//Key points:
//
//HashMap is not synchronized.
//
//Hashtable is synchronized.
//
//HashMap allows null key/value.
//
//Hashtable does not allow null keys or values.
//
//HashMap is generally preferred when synchronization isn't required.
//
//HashMap vs LinkedHashMap?
//
//HashMap doesn't guarantee insertion order, while LinkedHashMap maintains insertion order.
//
//HashMap vs TreeMap?
//
//HashMap provides hash-based storage without guaranteed sorted order, while TreeMap maintains keys in sorted order.
//
//Why does HashMap use hashing?
//
//Hashing helps HashMap efficiently locate the bucket where a key-value pair should be stored, providing average O(1) lookup, insertion, and removal under normal conditions.
