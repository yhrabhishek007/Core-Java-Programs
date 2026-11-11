package com.oops.polymorphism;

public class TestPolyDemo1 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		TestPolyDemo1 t1 = new TestPolyDemo1();

		byte b1 = 127;
		System.out.println(b1);

		char[] ch = { 'A', 'P', 'P' };
		System.out.println(System.identityHashCode(ch));
		
		System.out.println();
		System.out.println(true);
		System.out.println('M');

		System.out.println(ch);
		System.out.println(87665444455.345543222);
		System.out.println(884737.09297387837F);

		System.out.println(987665545);
		System.out.println(989898999779797L);

		System.out.println(t1);

		System.out.println("Main method ended");

	}

}
