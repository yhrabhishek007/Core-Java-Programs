package com.java8features;

interface In4 {
	int addition(int x, int y);
}

public class TestJ8Demo5 {

	public static void main(String[] args) {

		In4 i = (a, b) -> {
			return a + b;
		};
		System.out.println(i.addition(20, 20));

	}

}



//⭐ The complete rule
//Situation	                       Example	                         {}	            return
//One statement, no return	       () -> System.out.println("Hi")	❌ Not required	 ❌
//Multiple statements, no return   () -> { stmt1; stmt2; }	    ✅ Required	     ❌
//One expression returning value   (a,b) -> a+b	                ❌ Not required	 ❌
//Return value with block	        (a,b) -> { return a+b; }	    ✅ Required	     ✅