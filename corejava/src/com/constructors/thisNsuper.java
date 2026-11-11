package com.constructors;

public class thisNsuper {

	String name;
	int players;
	String type;
	String hardness;
	
	thisNsuper(){
		name="Basketball";
		players=5;
		type="outdoor";
		hardness="Tough";
	}

	public static void main(String[] args) {
//		thisNsuper t = new thisNsuper();

		
	}

}

class sports extends thisNsuper {
	String name;
	int players;
	String type;
	String hardness;

	sports() {
		System.out.println("No-Arg constructor");
		name = "football";
		players=11;
		type="outdoor";
		hardness="Tough";

	}
	

	void sportsInfoThis() {
		// i can call current class with the help of this keyword but if i had not declared
//    	the values in the class then it will take from the main first class with out using super 
		System.out.println("Sport name :"+this.name);
		System.out.println("Players required :"+this.players);
		System.out.println("Game type :"+this.type);
		System.out.println("Game hardness :"+this.hardness);
		System.out.println(super.name);  //it will print default values if we had not initialized values in 
//		main (or) super (or) parent class 
		System.out.println("--------------------------------->");

	}
	
	void sportsInfoSuper() {
		System.out.println("Invoking parent class using super keyword");
		System.out.println("Sport name :"+super.name);
		System.out.println("Players required :"+super.players);
		System.out.println("Game type : "+super.type);
		System.out.println("Game hardness :"+super.hardness);
		System.out.println("Sport name :"+super.name);  
		System.out.println("--------------------------------->");


	}

	public static void main(String[] args) {

		sports s = new sports();
		System.out.println("2nd class printed");

		s.sportsInfoThis();
		s.sportsInfoSuper();
		

	}

}
