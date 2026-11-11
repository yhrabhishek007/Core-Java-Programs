package com.identifiers;

public class TypeCasting {
//	byte b =13;
//	short s = 23422;
//	int i = 229393939;
//	long l = 28289289808828L;
	

	public static void main(String[] args) {
		
//		int x='A';
//		System.err.println(x);
		
//		implicit typecasting --> which means converting smaller data type into larger data type
//		it is done automatically without 
//		ex:
//		byte b=10;
//		byte by=10;
		short s=176;
		int i=10000;
		long l=83839393l;
		float f=8.90f;
		double d=8277.2222;
		char a='A';
		boolean ai=true;
		
//		converting from smaller datatype to larger:
	//	s=b;   // storing byte into short data type
		//i=b;   // storing byte value into integer data type
	//	l=b;
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
//		explicit typecasting--> which means converting larger data type into smaller data type
//		it is done manually 
		byte by=(byte)s;
		byte by1=(byte)l;
		System.out.println(by);  //256 -128 0  127+
		System.out.println(by1);


		
		

		
	}

}
