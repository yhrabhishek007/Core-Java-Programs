package com.identifiers;

public class PrimitiveDatatype {
//	byte age = 21;
	//byte age =(byte)128;    //it checks from -128 to 127 so initially it takes from -128 
	short year = 2005;
//	short year =6575;   //or short year=(byte)age;// implicit type casting storing small data type value in bigger data type
	
	double salary;
	
	float pi = 3.14F;
	double price = 27500.500;
//	long d=76686666686;
	public static void main(String[] args) {
		PrimitiveDatatype p  = new PrimitiveDatatype();
  
//		byte age = 21;
//		short year = 2005;
//		int salary = 40000;
//		float pi = 3.14F;
//		double price = 27500.500;
		
		
		
//		System.out.println(p.age);
//		System.out.println(p.year);
		System.out.println(p.salary);
		System.out.println(p.pi);
		System.out.println(p.price);
		
//		byte age =(byte)1000;

		
		
	}

}
