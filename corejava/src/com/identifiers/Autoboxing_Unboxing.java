package com.identifiers;

public class Autoboxing_Unboxing {
// Auto Boxing-->
//	converting primitive data types to objects data types will consider as auto boxing
//	ex:  Integer i =10;
	
//	Auto Unboxing-->
//	converting wrapper object to primitive type will consider as auto unboxing 
//	ex:  int i1 = 1;
//	These are introduced from java 5 version 
	public static void main(String[] args) {
//1)Auto boxing :Autoboxing is the automatic conversion 
//	of a primitive data type into its corresponding wrapper class object by the Java compiler.
		int i =100;
		Integer obj =i;
		System.out.println("Auto boxing:"+ obj);
		
		byte b = 127;
		Byte b1=b;
		System.out.println(b1);
		
//2)Auto Unboxing :Auto-unboxing is the automatic conversion of a wrapper class object
//into its corresponding primitive data type.		
		
		Integer i1 =1033;
		int obj1=i1;
		System.out.println("Auto Unboxing:"+ obj1);
		
	    Long l= 2989898293333l;
	    long l1=l;
	    System.out.println(l1);
	    
//	    Wrapper Caching --> Wrapper caching is a feature where Java stores and reuses 
//	    certain wrapper class objects instead of creating new objects every time.
	    
//      This improves memory usage and performance.
	    Integer i2 =100;
	    Integer i3 = 100;
	    
	    Integer i4=200;
	    System.out.println(i2==i3); //True : Because with in the range 127 to -128 , it will not create new object
//	    it will refer to the existing object if it is in range
	    System.out.println(i2==i4); //False : Because it is exceeding the range so one more object is created 
//	    without referring to the existing one

	    
	    
//	    Is the cache range -128 to 127 for every wrapper class?
//
//	    		No. Different wrapper classes have different caching behavior.
//	    		Wrapper Class	Cached Range
//	    		Byte	            All values (-128 to 127)
//	    		Short	        -128 to 127
//	    		Integer	        -128 to 127
//	    		Long	            -128 to 127
//	    		Character	     0 to 127 (ASCII characters)
//	    		Boolean	         true and false
//	    		Float	         No cache
//	    		Double	         No cache
	    
//	    Integer, Short, Long → cache -128 to 127
//	    Character → cache 0 to 127
//	    Boolean → cache both values
//	    Float, Double → no caching
		
	}

}
