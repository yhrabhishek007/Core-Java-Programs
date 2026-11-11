package com.java8features;

interface In7{
	int squareIt(int n);
}


public class TestJ8Demo7 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		In7 t =  (int n)->{
			return n*n;
		};
		
		System.out.println(t.squareIt(10));
		  
		
		System.out.println("main method ended");
		

	}

}
