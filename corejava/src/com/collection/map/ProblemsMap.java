package com.collection.map;

public class ProblemsMap {

	public static void main(String[] args) {

	}

}

//
//Yes. This is a very common **Java Collections / Map interview pattern**. Your program follows the general logic:
//
//```
//Input
//  ↓
//Convert/process each element
//  ↓
//Check whether it already exists in Map
//  ↓
//If exists → update count
//If not    → put initial count
//  ↓
//Print result
//```
//
// Here are similar problems you should practice, roughly from easier to harder.
//
// ## 1\. Count occurrence of each word
//
// **Input:**
//
//```
//Java is easy and Java is powerful
//```
//
// **Output:**
//
//```
//Java=2
//is=2
//easy=1
//and=1
//powerful=1
//```
//
// Hint:
//
//```
//Map<String, Integer> map = new HashMap<>();
//```
//
//---
//
// ## 2\. Find duplicate characters
//
// **Input:**
//
//```
//programming
//```
//
// **Output:**
//
//```
//r
//g
//m
//```
//
// Hint: Count each character first, then print characters whose count is greater than `1`.
//
//---
//
// ## 3\. Find unique characters
//
// **Input:**
//
//```
//programming
//```
//
// **Output:**
//
//```
//p
//o
//a
//i
//n
//```
//
// Logic:
//
//```
//count == 1
//```
//
//---
//
// ## 4\. Find the first non-repeated character
//
// **Input:**
//
//```
//programming
//```
//
// **Output:**
//
//```
//p
//```
//
// This is a very common interview problem.
//
// Logic:
//
//```
//First occurrence whose count == 1
//```
//
//---
//
// ## 5\. Find the first repeated character
//
// **Input:**
//
//```
//programming
//```
//
// **Output:**
//
//```
//r
//```
//
// You can solve this using a `Set` as well.
//
//---
//
// ## 6\. Count vowels and consonants
//
// **Input:**
//
//```
//education
//```
//
// **Output:**
//
//```
//Vowels = 5
//Consonants = 4
//```
//
// You can use a `Map`:
//
//```
//Map<String, Integer> map = new HashMap<>();
//```
//
// Or solve it using simple counters.
//
//---
//
// ## 7\. Count occurrence of numbers
//
// **Input:**
//
//```
//10 20 10 30 20 10
//```
//
// **Output:**
//
//```
//10=3
//20=2
//30=1
//```
//
// Use:
//
//```
//Map<Integer, Integer> map = new HashMap<>();
//```
//
// This is basically the same pattern as your character-counting program.
//
//---
//
// ## 8\. Find duplicate numbers
//
// **Input:**
//
//```
//10 20 30 20 40 10 50
//```
//
// **Output:**
//
//```
//10
//20
//```
//
//---
//
// ## 9\. Find unique numbers
//
// **Input:**
//
//```
//10 20 30 20 40 10 50
//```
//
// **Output:**
//
//```
//30
//40
//50
//```
//
//---
//
// ## 10\. Find the most frequently occurring character
//
// **Input:**
//
//```
//javaaa
//```
//
// **Output:**
//
//```
//a = 3
//```
//
// First create the frequency map:
//
//```
//j=1
//a=3
//v=1
//```
//
// Then find the maximum value.
//
//---
//
// ## 11\. Find the least frequently occurring character
//
// **Input:**
//
//```
//javaaa
//```
//
// **Output:**
//
//```
//j=1
//v=1
//```
//
// If the question expects only one result, you'll need to decide how ties should be handled.
//
//---
//
// ## 12\. Remove duplicate characters
//
// **Input:**
//
//```
//programming
//```
//
// **Output:**
//
//```
//progamin
//```
//
// The exact output depends on whether you want to **preserve the original order**.
//
// For preserving insertion order, consider:
//
//```
//LinkedHashSet<Character>
//```
//
//---
//
// ## 13\. Check whether two strings are anagrams
//
// **Input:**
//
//```
//listen
//silent
//```
//
// **Output:**
//
//```
//Anagram
//```
//
// One Map-based approach is to count characters in both strings.
//
// For example:
//
//```
//listen
//l=1
//i=1
//s=1
//t=1
//e=1
//n=1
//
//silent
//s=1
//i=1
//l=1
//e=1
//n=1
//t=1
//```
//
// Both frequency maps are equivalent.
//
//---
//
// ## 14\. Find common characters between two strings
//
// **Input:**
//
//```
//String 1: java
//String 2: javascript
//```
//
// **Output:**
//
//```
//j
//a
//v
//```
//
// You can use a `Map` or `Set`.
//
//---
//
// ## 15\. Count uppercase and lowercase characters
//
// **Input:**
//
//```
//JaVa ProGram
//```
//
// **Output:**
//
//```
//Uppercase = 5
//Lowercase = 6
//```
//
//---
//
// ## 16\. Count occurrence of each word ignoring case
//
// **Input:**
//
//```
//Java java JAVA Python python
//```
//
// **Output:**
//
//```
//java=3
//python=2
//```
//
// Hint:
//
//```
//str.toLowerCase()
//```
//
// before processing.
//
//---
//
// ## 17\. Find the most frequent word
//
// **Input:**
//
//```
//Java is easy Java is powerful Java
//```
//
// **Output:**
//
//```
//Java=3
//```
//
// This is the same frequency-counting concept you're learning.
//
//---
//
// ## 18\. Find the second most frequent character
//
// **Input:**
//
//```
//programming
//```
//
// **Output:**
//
//```
//r
//```
//
// This is a little harder because you need to:
//
// 1. Count frequencies.
//2. Find the highest frequency.
//3. Find the second-highest frequency.
//4. Identify the character.
//
//---
//
// ## 19\. Character frequency without `containsKey()`
//
// Your current solution is:
//
//```
//if (map.containsKey(c)) {
//    map.put(c, map.get(c) + 1);
//} else {
//    map.put(c, 1);
//}
//```
//
// Practice writing the same program using `getOrDefault()`:
//
//```
//map.put(c, map.getOrDefault(c, 0) + 1);
//```
//
// This is a very useful modern Java approach.
//
//---
//
// ## 20\. Count duplicate words in a sentence
//
// **Input:**
//
//```
//Java is easy Java is simple Java
//```
//
// **Output:**
//
//```
//Java=3
//is=2
//```
//
// Only print words whose count is greater than `1`.
//
//---
//
// # ⭐ Practice order I'd recommend
//
// Since you're currently learning `HashMap`, don't jump directly into the difficult ones. Practice in this order:
//
//```
//1. Character occurrence
//       ↓
//2. Word occurrence
//       ↓
//3. Number occurrence
//       ↓
//4. Duplicate characters
//       ↓
//5. Unique characters
//       ↓
//6. First non-repeated character
//       ↓
//7. First repeated character
//       ↓
//8. Most frequent character
//       ↓
//9. Duplicate numbers
//       ↓
//10. Anagram
//       ↓
//11. Second most frequent character
//```
//
// The important thing is that **most of these are variations of the same Map pattern**:
//
//```
//if (map.containsKey(value)) {
//    map.put(value, map.get(value) + 1);
//} else {
//    map.put(value, 1);
//}
//```
//
// Once you understand this pattern properly, a lot of Map-based interview questions become much easier.