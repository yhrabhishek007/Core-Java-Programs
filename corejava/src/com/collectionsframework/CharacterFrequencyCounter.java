package com.collectionsframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Core Java 
//Write a Java program to accept a string from the user and count the frequency of each character using a Map.
//Input:
//Enter a string: programming
//Output:
//p : 1,r : 2,o : 1,g : 2,a : 1,m : 2,i : 1,n : 1
public class CharacterFrequencyCounter {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();// {}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : "); // javaaa
		String str = sc.next();

		char[] ch = str.toCharArray(); // String to character Arrays

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1); // {J=1,a=1,v=1}
			}

		}
		System.out.println(map);

//		using LinkedHashMap

//	public static void main(String[] args) {
//		Map<Character, Integer> map = new HashMap<>();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your String : ");
//		String str = sc.next();
//		char[] ch = str.toCharArray();
//		for (char c : ch) {
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);
//		sc.close();
//	}
//}
		sc.close();
	}

}
