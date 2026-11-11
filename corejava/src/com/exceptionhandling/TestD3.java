package com.exceptionhandling;

// Note:--> Rule: An exception can be caught using its own class or any parent class in its inheritance hierarchy.
public class TestD3 {
//	ArrayIndexOutOfBoundsExceptionDemo

//	Can we use these in catch?
//			ArrayIndexOutOfBoundsException ✅ — exact exception
//			IndexOutOfBoundsException ✅ — parent class
//			RuntimeException ✅ — parent class
//			Exception ✅ — parent class
//			Throwable ✅ — parent class
//			NullPointerException ❌ — different/sibling exception (sibling class, not a parent)
//			Object ❌ — not a subclass of Throwable
	public static void main(String[] args) {
		System.out.println("Main method started");
//		Integer i=null;
//		System.out.println(10/null); //The operator / is undefined for the argument type(s) int, null

		int[] arr = new int[5];
		try {

			arr[0] = 12;
			arr[1] = 13;
			arr[2] = 14;
			arr[3] = 15;
			arr[4] = 16;
			arr[5] = 17;
//If we give Object as Exception?
//No exception of type Object can be thrown; an exception type must be a subclass of Throwable
//			-->we can only give sub classes of throwable or throwable itself.
		} catch (NullPointerException e) {
//			Index 5 out of bounds for length 5
			e.printStackTrace();
			System.err.println("NPE");

		}

		catch (Exception e) {
			System.err.println("IN AIOE");
		}

//		If we give the exact exception after parent exception we get?  -->we can give at first after we can give Exception.
		// Unreachable catch block for ArithmeticException.
//		It is already handled by the catch block for Exception

//		catch (ArithmeticException e) {  
//			System.err.println("Exception");
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Main method ended");
	}

}
//Object -- Top(root class, but not an exception class)
//↓
//Throwable
//↓
//Exception
//↓
//RuntimeException
//↓
//IndexOutOfBoundsException
//↓
//ArrayIndexOutOfBoundsException
