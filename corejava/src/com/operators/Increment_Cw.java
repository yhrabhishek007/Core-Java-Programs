package com.operators;
//1. Find the following expressions outputs?
//int m = 7;
//int n = m++ + --m + ++m;

//2. int x = 3;
//int y = x++ + ++x + x-- + --x;
public class Increment_Cw {

	public static void main(String[] args) {

		int m=7;
		int n = m++ + --m + ++m; //7+7+8=22
		System.out.println(n);
		
		int x = 3;
		int y = x++ + ++x + x-- + --x; //  3+5+5+3=16
		System.out.println(y);
		
	}

}
