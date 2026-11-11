package com.constructors;

public class Super_of {
	int id;
	String name;
	
	Super_of(){
		System.out.println("no arg constructor parent class");
	}
	
	Super_of(int id){
		this.id=id;
		
		
	}
	Super_of(int id , String name){
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {

		System.out.println("main method of super of");
	}

}

class child extends Super_of {
	
	child(){
		System.out.println("no arg child class");
		
	}
	child(int id){
		super(id);
//		System.out.println(id);
		
	}
	
	
	public child(int id, String name) {
		super(id,name);
//		System.out.println();
//		System.out.println(id);
//		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method of child");
		child c = new child(5);
		System.out.println(c.id);
		
		
		child c1 = new child(101,"ravi");
		System.out.println(c1.id);   // it will print same 
		System.out.println(c1.name);
//		
		
		
	}
	
}
