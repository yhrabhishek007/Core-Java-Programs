package com.collectionsframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your String : ");
		String str = sc.next();

		Map<Character, Integer> map = new LinkedHashMap<>();

		// Count frequency
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		// Find highest frequency
		char maxChar = ' ';
		int max = 0;

		for (char ch : map.keySet()) {
			if (map.get(ch) > max) {
				max = map.get(ch);
				maxChar = ch;
			}
		}

		System.out.println("Highest Frequency Character : " + maxChar);
		System.out.println("Frequency : " + max);

		sc.close();
	}
}
