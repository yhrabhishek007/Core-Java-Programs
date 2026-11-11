package com.identifiers;
import java.math.*;
//1.Write a Java program to add two very large numbers using BigInteger.
//2.Write a Java program to multiply two large numbers using BigInteger.
public class Big_Integer {
//	BigInteger b = new BigInteger("8779773797979797");
	BigInteger b = new BigInteger("8779773797979797"); //it is mandatory to give or assign in strings (" ")
	BigInteger b1 = new BigInteger("8779773797979797"); //BigInteger(String val)	
//	Translates the decimal String representation of a BigInteger into a BigInteger.
	
	BigDecimal d = new BigDecimal(83779397973.98398739789);
	BigDecimal d1 = new BigDecimal(837793935533.98398739789);  //we can give within string  (" ") 
//	or else without for bigdecimal
	
//	static BigInteger	valueOf(long val)	
//	Returns a BigInteger whose value is equal to that of the specified long.
	
//	 BigInteger b3 = BigInteger.valueof(89898997977979797);
	

	 BigInteger b3 = BigInteger.valueOf(666767667676767676l);


	public static void main(String[] args) {
		
		Big_Integer i = new Big_Integer();
//		BigInteger b = new BigInteger("8779773797979797");  // also i can declare and initialize in main method
		
//		BigInteger b = new BigInteger("8779773797979797");
//		BigInteger b1 = new BigInteger("8779773797979797");
		
		
		System.out.println("Adding BigIntegers: " +i.b.add(i.b1));
		
		System.out.println("Multiplication of BigInteger:" +i.b.multiply(i.b1));
		
		System.out.println("Adding BigDecimal Values:" + i.d.add(i.d1) );
		
		System.out.println("Multiplication of decimal:" + i.d.multiply(i.d1));
		
		
		 BigInteger b3 = BigInteger.valueOf(666767667676767676l);

		System.out.println("By using valueof  "+ b3);
//	**	Important   **
//		valueOf() accepts only a long.
//		✔ Valid:
		
//		BigInteger a = BigInteger.valueOf(123456789L);
//		❌ Invalid:
		
//		BigInteger a = BigInteger.valueOf(123456789123456789123456789);
//		The number is too large for a long.
		
//		For very large numbers, use a String:
//		BigInteger a = new BigInteger("123456789123456789123456789");
//		Interview Point
		
//		new BigInteger("123") → accepts any size number as a String.
//		BigInteger.valueOf(123) → accepts only long values and returns a BigInteger object.
//		BigInteger b3 = new BigInteger("87877977979779");
		
		




		
	}

}
