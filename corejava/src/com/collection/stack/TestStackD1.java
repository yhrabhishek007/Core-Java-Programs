package com.collection.stack;

//Def: Stack is a legacy, synchronized collection that extends Vector and follows LIFO (Last In, First Out). 
//Its main methods are push(), pop(), peek(), empty(), and search().

import java.util.Stack;

public class TestStackD1 {

	public static void main(String[] args) {

		System.out.println("main method started");

		// Stack follows LIFO:
		// Last In → First Out
		//
		// The last element added will be removed first.

		Stack<String> s = new Stack<>();

		s.push("J2SE");
		s.push("J2EE");
		s.push("J2ME");
		s.push("Spring");
		s.push("Spring Boot");
		s.push("Micro services");
		s.push("Servlet");
		s.push("React");
		s.push("Angular");

		// empty() checks whether the Stack is empty.
		// false means the Stack contains elements.

		System.out.println(s.empty());

		/*
		 * indexOf("J2SE") finds the index of J2SE.
		 *
		 * J2SE is at index 0.
		 *
		 * remove(0) removes the element at index 0.
		 *
		 * IMPORTANT: remove() is removing by INDEX here, not following Stack LIFO
		 * behavior.
		 */

		System.out.println(s.remove(s.indexOf("J2SE")));

		/*
		 * pop() removes the TOP element of the Stack.
		 *
		 * Before pop():
		 *
		 * Angular ← TOP React Servlet Micro services Spring Boot Spring J2ME J2EE
		 *
		 * So pop() removes Angular.
		 */

		s.pop();

		/*
		 * peek() returns the TOP element without removing it.
		 *
		 * After Angular is removed, React is now the TOP element.
		 *
		 * So peek() returns React.
		 */

		System.out.println(s.peek()); // React

		// Prints all elements currently present in the Stack.
		System.out.println(s);

		/*
		 * search() returns the position of an element from the TOP of the Stack.
		 *
		 * IMPORTANT: search() uses 1-based position, NOT index.
		 *
		 * TOP:
		 *
		 * React → position 1 Servlet → position 2 Micro services → position 3 Spring
		 * Boot → position 4
		 *
		 * Therefore search("Spring Boot") returns 4.
		 */

		System.out.println(s.search("Spring Boot"));
	}
}

//1. Stack follows LIFO.
//→ Last In, First Out.
//
//2. Stack is a legacy class.
//→ It is an old Java collection class.
//
//3. Stack extends Vector.
//→ Stack is a subclass of Vector.
//
//4. Stack is synchronized.
//→ Its methods are synchronized.
//
//5. Stack allows duplicates.
//→ [10, 20, 10] is valid.
//
//6. Stack allows null values.
//
//7. Stack uses these important methods:
//
//push()   → adds element to TOP
//pop()    → removes TOP element
//peek()   → returns TOP element without removing
//empty()  → checks whether stack is empty
//search() → returns position from TOP