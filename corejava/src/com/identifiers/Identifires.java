package com.identifiers;

public class Identifires {
	int i = 20;
	String s = "java";
	float f = 0.20f;
	char c = 'a';
	void identifiers(){
		System.out.println(i);
		System.out.println(s);
		System.out.println(f);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Identifires I = new Identifires();
		I.identifiers();
//		Primitive data types we have 8 keywords 
//		For numbers: byte b,int,short s,long l
//		For floating point decimal: float f,double d 
//		For chararters : char and boolean for true or false
		
		byte b = 20;
		int i1 = 25;
		short s1 = 2345;
		long l = 2345654l;
		
		float f1 = 0.45f;
		double d = 0.334324d;
		
		char c1 = 'a';
		boolean b2 = false;
		boolean isJavaEasy = true;
		
		System.out.println(b);
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(l);
		System.out.println(f1);
		System.out.println(d);
		System.out.println(c1);

		System.out.println(i1+s1);
		
		
		System.out.println(isJavaEasy ? "True" : "False");
		
		
		

		
	}

}
