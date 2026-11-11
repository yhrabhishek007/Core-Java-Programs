package com.collection.arraylist;

//Def: ArrayList is a non-synchronized, resizable-array implementation of the List interface. It maintains insertion order, allows duplicates and null values, 
//and provides fast index-based access.


//Q1) When we create new ArrayList<>(), what is the initial capacity?
//Ans: Initially, capacity is 0.
//   When we add the first element, the capacity becomes 10
//   in the commonly used OpenJDK implementation.

//Q2) When we add the 11th element, what is the next capacity?
//Ans: The current capacity is 10.
//   When the 11th element is added, ArrayList grows the capacity
//   by approximately 50%.
//   New capacity = 10 + (10 / 2) = 15
import java.util.ArrayList;
import java.util.List;

public class TestArrayListD1 {

	public static void main(String[] args) {

//		constructs an empty list with an initial capacity of ten.
//		ArrayList --> Re-Sizable Array(DS) underlying Data Structure
//		Q1) while Object is creating how much capacity it is creating internally..?
//	-->	ans: 0
		
//	-->	Whenever we are adding first element then only , its creating capacity with 10.


//		so it is internally creating size 10 ,so why i can't add directly into  8 or 9 positions ?
//	-->	"Even if ArrayList has a capacity of 10, I cannot directly add an element at index 8 when the size is 0. "
//		 "Capacity represents available storage, while size represents the actual number of elements. An index can be used only when it is within the current size."

//		Q2) When we added 11th element what is the next capacity..?
//	-->	ans: (Current capacity * 3/2) or Current capacity + Half of the Current capacity.

		
		
//	-->	Common ArrayList constructors
		
		// 1. Default constructor
//		ArrayList<Integer> l1 = new ArrayList<>();

		// 2. Constructor with initial capacity
//		ArrayList<Integer> l2 = new ArrayList<>(10);

		// 3. Constructor with another collection
//		ArrayList<Integer> l3 = new ArrayList<>(l1);
		
		
//		If the number of elements exceeds the initial capacity, ArrayList automatically resizes its internal array.
//		It creates a larger array, copies the existing elements into it, and then adds the new element.
		List<Integer> l1 = new ArrayList<>(15);

		l1.add(7);
		l1.add(18);
		l1.add(1);
		l1.add(45);
		l1.add(33);
		l1.add(77);
		l1.add(9);
		l1.add(10);
		l1.add(33);

		l1.add(8);
		l1.add(99);
		l1.add(77);
		l1.add(45);
		l1.add(32);
		l1.add(23);
		l1.add(54);

		System.out.println(l1);

	}

}

//1. ArrayList is a resizable/dynamic array.
//→ Internally uses an array.
//
//2. ArrayList is NOT synchronized.
//→ It is not thread-safe by default.
//
//3. ArrayList allows duplicate elements.
//→ [10, 20, 10] is valid.
//
//4. ArrayList allows null values.
//→ [10, null, 20] is valid.
//
//5. ArrayList maintains insertion order.
//→ Elements remain in the order they were added.
//
//6. ArrayList allows index-based access.
//→ get(0), get(1), get(2), etc.
//
//7. ArrayList provides fast access using index.
//→ get(index) is generally O(1).
//
//8. Adding at the end is generally fast.
//→ add(element) is amortized O(1).
//
//9. Adding/removing in the middle is slower.
//→ Existing elements may need to be shifted.
//
//10. ArrayList automatically increases its capacity
// when the internal array becomes full.
//
//11. ArrayList has two important concepts:
// → Capacity = space available internally
// → Size = number of elements currently present
//
//12. ArrayList can be created with initial capacity.
//
// ArrayList<Integer> list = new ArrayList<>(10);
//
// Capacity = 10
// Size = 0
//
//13. ArrayList can be traversed using:
// → Iterator
// → ListIterator
// → for loop
// → enhanced for loop
//
//14. ArrayList is a class that implements List.
//
// ArrayList
//     ↓
//   List
