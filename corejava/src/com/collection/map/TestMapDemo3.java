package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo3 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("IN", "India");
		map.put("UK", "United Kinkdom");
		map.put("US", "United States");
		map.put("AUS", "Australia");
		map.put("JP", "Japan");

//		the previous value associated with key ,
//		or null if there was no mapping for key .
//		In Map , If we add any duplicate key then the old value is replaced with new value
		System.out.println(map.put("SL", "Sri Lanka"));
		System.out.println(map.put("US", "USA"));
//		System.out.println(map);

		Set<Entry<String, String>> entries = map.entrySet();

		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

}
