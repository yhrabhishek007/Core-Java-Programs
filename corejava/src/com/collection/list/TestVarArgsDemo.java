package com.collection.list;

public class TestVarArgsDemo {

	void main(String[] args) {

		System.out.println("main method started");

		// The addition() method can accept any number of int values.
		addition(10);

		addition(10, 20);
      //With varargs, you can pass the same value or the same set of values any number of times, as long as you are within practical limits like memory.
		addition(10, 20, 30);

		addition(10, 20, 30);

		addition(10, 20, 30, 40);

		addition(10, 20, 30, 40, 50);

		addition(10, 20, 30, 40, 50, 60);

		addition(10, 20, 30, 40, 50, 70);
	}
	
//	Varargs uses three dots ...
//	The syntax is:
//
//	dataType... variableName

	/*
	 * int... numbers is called a variable argument (varargs).
	 *
	 * It allows us to pass any number of int values to the method.
	 *
	 * For example: addition(10); addition(10, 20); addition(10, 20, 30);
	 *
	 * Internally, Java treats the varargs as an int array.
	 *
	 * So, int... numbers is similar to: int[] numbers
	 *
	 * The difference is that while calling the method, we don't need to create an
	 * array manually.
	 *
	 * Important: A variable argument (varargs) must be the last parameter in a
	 * method's parameter list.
	 */
	void addition(int... numbers) {

		// Variable used to store the total of all numbers.
		int sum = 0;

		/*
		 * Enhanced for loop is used to read each number from the numbers array one by
		 * one.
		 */
		for (int n : numbers) {

			// Add the current number to sum.
			sum = sum + n;
		}

		// Print the final sum.
		System.out.println(sum);
	}
}


//Absolutely. For **Java Varargs**, these are the important points worth remembering for interviews, exams, and coding.
//
//## Important Notes on Varargs
//
//### 1\. Varargs allows multiple arguments
//
//void addition(int... numbers)
//
//This method can accept **zero, one, or many** integer values.
//
//addition();
//addition(10);
//addition(10, 20);
//addition(10, 20, 30);
//
//So varargs provides flexibility in the number of arguments.
//
//
//### 2. Varargs is internally treated as an array
//
//void addition(int... numbers)
//
//is internally handled approximately like:
//
//void addition(int[] numbers)
//
//Therefore, you can use array operations:
//
//System.out.println(numbers.length);
//
//and loops:
//
//```
//for (int n : numbers) {
//   System.out.println(n);
//}
//```
//
//---
//
//### 3\. Varargs can accept zero arguments
//
//This is an important point.
//
//```
//addition();
//```
//
//is valid.
//
//In this case, `numbers` will be an empty array.
//
//```
//int... numbers
//```
//
//does **not** mean that at least one value must be passed.
//
//---
//
//### 4\. Varargs must be the last parameter
//
//Correct:
//
//```
//void test(int age, int... numbers)
//```
//
//Incorrect:
//
//```
//void test(int... numbers, int age)
//```
//
//The varargs parameter must always come **at the end**.
//
//---
//
//### 5\. Only one varargs parameter is allowed
//
//Correct:
//
//```
//void test(int a, int... numbers)
//```
//
//Incorrect:
//
//```
//void test(int... numbers, int... values)
//```
//
//You cannot have two varargs parameters in the same method.
//
//---
//
//### 6\. Varargs can be used with other parameters
//
//For example:
//
//```
//void addition(String name, int... numbers)
//```
//
//Calling:
//
//```
//addition("Rahul", 10, 20, 30);
//```
//
//Here:
//
//- `name` receives `"Rahul"`
//- `numbers` receives `10, 20, 30`
//
//---
//
//### 7\. Varargs was introduced in Java 5
//
//Varargs was introduced in **Java 5**.
//
//Before varargs, programmers commonly had to use arrays when they wanted to pass a variable number of arguments.
//
//---
//
//### 8\. Varargs uses three dots `...`
//
//The syntax is:
//
//```
//dataType... variableName
//```
//
//Example:
//
//```
//int... numbers
//```
//
//Other examples:
//
//```
//String... names
//double... values
//boolean... flags
//```
//
//---
//
//### 9\. Varargs improves readability
//
//Without varargs:
//
//```
//void addition(int[] numbers)
//```
//
//You would call it like:
//
//```
//addition(new int[]{10, 20, 30});
//```
//
//With varargs:
//
//```
//void addition(int... numbers)
//```
//
//You can simply write:
//
//```
//addition(10, 20, 30);
//```
//
//This makes the method easier to use.
//
//---
//
//### 10\. Varargs has lower priority than a fixed-argument method during method overloading
//
//Example:
//
//```
//void test(int a) {
//   System.out.println("Normal method");
//}
//
//void test(int... a) {
//   System.out.println("Varargs method");
//}
//```
//
//If you call:
//
//```
//test(10);
//```
//
//Java chooses:
//
//```
//test(int a)
//```
//
//because Java prefers the **more specific/fixed-argument match** over varargs.
//
//---
//
//### 11\. You can pass an array directly to a varargs method
//
//```
//int[] numbers = {10, 20, 30};
//
//addition(numbers);
//```
//
//This is valid because varargs is internally an array.
//
//---
//
//### 12\. Varargs can be used with enhanced for loop
//
//Your code:
//
//```
//for (int n : numbers) {
//   sum = sum + n;
//}
//```
//
//works because `numbers` is treated as an array.
//
//---
//
//## ⭐ Quick Revision Notes
//
//Remember these points:
//
//- `...` represents **varargs**.
//- Varargs allows **variable number of arguments**.
//- Varargs can accept **zero or more arguments**.
//- Internally, varargs is treated as an **array**.
//- Only **one varargs parameter** is allowed in a method.
//- Varargs must be the **last parameter**.
//- Varargs was introduced in **Java 5**.
//- You can pass an **array directly** to a varargs method.
//- Varargs makes method calls **simpler and more readable**.
//- Example syntax:
//
//```
//void addition(int... numbers)
//```
//
//- Calling examples:
//
//```
//addition();
//addition(10);
//addition(10, 20);
//addition(10, 20, 30);
//```
//
//**Interview one-liner:**
//
//> **Varargs allows a method to accept a variable number of arguments, and internally Java treats those arguments as an array.**
