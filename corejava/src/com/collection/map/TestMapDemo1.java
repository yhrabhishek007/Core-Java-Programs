package com.collection.map;

import java.util.HashMap;
import java.util.Map;

//Def -> Map is an interface in Java that stores data in the form of key-value pairs, 
//where each key must be unique, while values can be duplicated.

public class TestMapDemo1 {

	public static void main(String[] args) {

		/*
		 * ========================================================= MAP
		 * =========================================================
		 *
		 * Map is an interface in Java.
		 *
		 * It stores data in KEY-VALUE pairs.
		 *
		 * Example:
		 *
		 * Key -> Value 7 -> Dhoni 18 -> Kohli
		 *
		 * IMPORTANT: 1. Keys must be UNIQUE. 2. Duplicate values are allowed. 3. Each
		 * key can map to only one value.
		 *
		 * Syntax:
		 *
		 * Map<KeyType, ValueType> map = new HashMap<>();
		 *
		 * Here: Integer -> Key type String -> Value type
		 */

		/*
		 * ========================================================= HASHMAP
		 * =========================================================
		 *
		 * HashMap is an implementation of Map.
		 *
		 * Important properties of HashMap:
		 *
		 * 1. Stores data as key-value pairs. 2. Does NOT guarantee insertion order. 3.
		 * Allows ONE null key. 4. Allows MULTIPLE null values. 5. Duplicate keys are
		 * not allowed. 6. Duplicate values are allowed. 7. It is not synchronized.
		 *
		 * HashMap is commonly used when we want fast average-case insertion and lookup
		 * by key.
		 */
		Map<Integer, String> map = new HashMap<>();

		/*
		 * ========================================================= put(key, value)
		 * =========================================================
		 *
		 * Adds a key-value pair to the Map.
		 *
		 * Example:
		 *
		 * 7 -> Dhoni 18 -> Kohli
		 */
		map.put(7, "Dhoni");
		map.put(18, "Kohli");
		map.put(45, "Rohit");
		map.put(33, "Hardik");
		map.put(1, "K L Rahul");
		map.put(8, "Jadeja");
		map.put(3, "Suryavanshi");

		/*
		 * ========================================================= containsKey(key)
		 * =========================================================
		 *
		 * Checks whether the specified KEY exists.
		 *
		 * Returns: true -> key exists false -> key does not exist
		 */
		System.out.println(map.containsKey(7));

		/*
		 * ========================================================= get(key)
		 * =========================================================
		 *
		 * Returns the VALUE associated with the specified KEY.
		 *
		 * 45 -> Rohit
		 *
		 * So map.get(45) returns "Rohit".
		 *
		 * If the key does not exist, get() returns null.
		 */
		System.out.println(map.get(45));

		/*
		 * =========================================================
		 * containsValue(value)
		 * =========================================================
		 *
		 * Checks whether the specified VALUE exists.
		 *
		 * Returns true or false.
		 */
		System.out.println(map.containsValue("Hardik"));

		/*
		 * ========================================================= remove(key)
		 * =========================================================
		 *
		 * Removes the key-value pair associated with the key.
		 *
		 * Here:
		 *
		 * 1 -> K L Rahul
		 *
		 * will be removed.
		 *
		 * IMPORTANT: remove(key) returns the VALUE that was removed.
		 *
		 * Therefore, this prints:
		 *
		 * K L Rahul
		 */
		System.out.println(map.remove(1));

		/*
		 * ========================================================= size()
		 * =========================================================
		 *
		 * Returns the number of key-value pairs in the Map.
		 */
		System.out.println("Size = " + map.size());

		/*
		 * ========================================================= isEmpty()
		 * =========================================================
		 *
		 * Checks whether the Map contains zero elements.
		 *
		 * Returns: true -> Map is empty false -> Map is not empty
		 */
		System.out.println("Is Empty = " + map.isEmpty());

		/*
		 * ========================================================= putIfAbsent(key,
		 * value) =========================================================
		 *
		 * Adds the key-value pair ONLY if the key is not already present.
		 *
		 * If the key already exists, the old value is NOT replaced.
		 */
		map.putIfAbsent(10, "Gill");

		System.out.println(map);

		/*
		 * ========================================================= getOrDefault(key,
		 * defaultValue) =========================================================
		 *
		 * If the key exists: returns its value.
		 *
		 * If the key does NOT exist: returns the default value.
		 *
		 * Very useful to avoid getting null.
		 */
		System.out.println(map.getOrDefault(100, "Player Not Found"));

		/*
		 * ========================================================= replace(key, value)
		 * =========================================================
		 *
		 * Replaces the value of an EXISTING key.
		 *
		 * If the key does not exist, nothing is replaced.
		 */
		map.replace(7, "MS Dhoni");

		System.out.println(map.get(7));

		/*
		 * ========================================================= keySet()
		 * =========================================================
		 *
		 * Returns all KEYS as a Set.
		 *
		 * Useful when we want to iterate through keys.
		 */
		System.out.println("Keys = " + map.keySet());

		/*
		 * ========================================================= values()
		 * =========================================================
		 *
		 * Returns all VALUES as a Collection.
		 *
		 * Duplicate values can exist.
		 */
		System.out.println("Values = " + map.values());

		/*
		 * ========================================================= entrySet()
		 * =========================================================
		 *
		 * Returns all KEY-VALUE pairs as Set<Entry<K,V>>.
		 *
		 * This is one of the most commonly used methods when iterating over a Map.
		 */
		System.out.println("Entries = " + map.entrySet());

		/*
		 * ========================================================= ITERATING THROUGH
		 * MAP =========================================================
		 *
		 * Map does not directly implement Iterable.
		 *
		 * Therefore, we commonly use entrySet() to iterate through both key and value.
		 */
		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		/*
		 * ========================================================= clear()
		 * =========================================================
		 *
		 * Removes ALL key-value pairs from the Map.
		 *
		 * After clear():
		 *
		 * map.size() -> 0
		 */
		// map.clear();

		/*
		 * ========================================================= PRINT MAP
		 * =========================================================
		 *
		 * IMPORTANT:
		 *
		 * HashMap does NOT guarantee insertion order.
		 *
		 * Therefore, do NOT expect the output to always be in the same order in which
		 * elements were inserted.
		 */
		System.out.println(map);
	}
}

//# ⭐ Important Interview Notes
//
//### 1\. What is `Map`?
//
//> **Map is an interface that stores data in key-value pairs.**
//
//Example:
//
//```
//Map<Integer, String> map = new HashMap<>();
//```
//
//Here:
//
//```
//Integer → Key
//String  → Value
//```
//
//---
//
//### 2\. Can Map contain duplicate keys?
//
//**No.** ❌
//
//Keys must be unique.
//
//```
//map.put(7, "Dhoni");
//map.put(7, "Something Else");
//```
//
//The second `put()` **replaces** the previous value.
//
//After this:
//
//```
//7 → Something Else
//```
//
//This is an extremely common interview question.
//
//---
//
//### 3\. Can Map contain duplicate values?
//
//**Yes.** ✅
//
//```
//map.put(7, "Dhoni");
//map.put(10, "Dhoni");
//```
//
//This is allowed:
//
//```
//7  → Dhoni
//10 → Dhoni
//```
//
//So remember:
//
//```
//Duplicate Key   → Not allowed
//Duplicate Value → Allowed
//```
//
//---
//
//### 4\. Can HashMap contain `null`?
//
//Yes.
//
//`HashMap` allows:
//
//- **One `null` key**
//- **Multiple `null` values**
//
//Example:
//
//```
//map.put(null, "Test");
//map.put(10, null);
//map.put(20, null);
//```
//
//All are allowed.
//
//---
//
//### 5\. Does HashMap maintain insertion order?
//
//**No.** ❌
//
//If you insert:
//
//```
//7
//18
//45
//33
//1
//8
//3
//```
//
//you should **not assume** that `map` will print in that same order.
//
//If you specifically need insertion order, use:
//
//```
//LinkedHashMap
//```
//
//If you need sorted keys, use:
//
//```
//TreeMap
//```
//
//Think:
//
//```
//HashMap       → No guaranteed order
//LinkedHashMap → Insertion order
//TreeMap       → Sorted key order
//```
//
//---
//
//### 6\. Is HashMap synchronized?
//
//**No.** ❌
//
//`HashMap` is not synchronized by default.
//
//For concurrent access, other map implementations/concurrency mechanisms may be appropriate depending on the requirement.
//
//---
//
//### 7\. How does `get()` find the value?
//
//When you do:
//
//```
//map.get(45);
//```
//
//`HashMap` uses the key's **`hashCode()`** and **`equals()`** as part of locating the corresponding entry.
//
//Interview keywords:
//
//```
//HashMap
//  ↓
//hashCode()
//  ↓
//Bucket
//  ↓
//equals()
//  ↓
//Find matching key
//  ↓
//Return value
//```
//
//This becomes especially important when using **custom objects as HashMap keys**.
//
//---
//
//## ⭐ `put()` has an important behavior
//
//Consider:
//
//```
//map.put(7, "Dhoni");
//```
//
//Then:
//
//```
//map.put(7, "MS Dhoni");
//```
//
//The size does **not** become 2.
//
//Instead:
//
//```
//7 → MS Dhoni
//```
//
//The old value is replaced because the key `7` already exists.
//
//You can also check the old value:
//
//```
//String oldValue = map.put(7, "MS Dhoni");
//
//System.out.println(oldValue);
//```
//
//It returns:
//
//```
//Dhoni
//```
//
//---
//
//## `get()` when key doesn't exist
//
//```
//System.out.println(map.get(100));
//```
//
//If `100` doesn't exist, `get()` returns:
//
//```
//null
//```
//
//That's why sometimes we check:
//
//```
//if (map.containsKey(100)) {
//   System.out.println(map.get(100));
//}
//```
//
//---
//
//# 🔥 Interview Memory Trick
//
//Remember these three:
//
//```
//Map
//↓
//Key → Value
//```
//
//```
//Key   → Unique
//Value → Can be duplicate
//```
//
//And:
//
//```
//HashMap
//  → No guaranteed order
//  → One null key
//  → Multiple null values
//  → Not synchronized
//  → Fast average lookup/insert/delete
//```
//
//### Most important Map implementations
//
//```
//               Map
//                |
//      ---------------------
//      |         |         |
//  HashMap   LinkedHashMap  TreeMap
//      |         |           |
// No order   Insertion     Sorted
//            order         keys
//```
//
//One correction to keep in mind from your code: `System.out.println(map);` **should not be used to demonstrate a specific ordering for `HashMap`**, because its iteration order is not guaranteed.
