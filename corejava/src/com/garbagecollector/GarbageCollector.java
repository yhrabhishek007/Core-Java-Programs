package com.garbagecollector;

//create a student class with required student fields
//finalize with print object destroyed
//main method
//object create , object nullify , reassignment , anonymous object, island of isolation , scope
public class GarbageCollector {
	
	String college_name;
	String name;
	int rollno;
	
//	This is created for island of isolation
	GarbageCollector i;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed");
	}

	void display() {
		System.out.println(college_name);
		System.out.println(name);
		System.out.println(rollno);
	}

//	Method inside object : creating method 
		void show() {
			GarbageCollector g7 = new GarbageCollector();
			System.out.println("Call Method");

			
	
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		GarbageCollector g = new GarbageCollector();
		g.college_name = "VIIT";
		g.name = "Raj";
		g.rollno = 01;
		g.display();
//1)		nullifying the object
		g = null;
//		System.out.println(g);
//		System.gc();
		// g.display(); //Exception in thread "main" Object Destroyed
		// java.lang.NullPointerException: Cannot invoke
		// "com.practice.GarbageCollector.display()" because "g" is null
		// at com.practice.GarbageCollector.main(GarbageCollector.java:34)

//2)    Re-assigning the object
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();
		GarbageCollector g3 = new GarbageCollector();

		g1 = g2;
		g3 = g2;
		System.out.println(g1);
		System.out.println(g3);
//		System.out.println(g2);      
//		System.gc();

//3)    Anonymous Object

//		new GarbageCollector();
		System.out.println(new GarbageCollector().name);  //it is ok if we give name or not it will print null
//		if we give name otherwise print address and finalize 
		
		
		
//		System.gc();

//4)      Island of isolation	
//		 i;
		GarbageCollector g4 = new GarbageCollector();
		GarbageCollector g5 = new GarbageCollector();
		GarbageCollector g6 = new GarbageCollector();

		g4.i = g5;
		g5.i = g6;
//		g6.i = g4;
		g4 = null;
		g5 = null;
//		g6 = null;
		System.out.println(g4);   // also prints null
//		System.out.println(g5);
//		System.out.println(g6);

//		System.gc();
		
//5)    Method inside object
		g6.show();
		
		System.gc();


	}

}
