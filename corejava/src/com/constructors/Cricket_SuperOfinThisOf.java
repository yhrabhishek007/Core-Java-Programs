package com.constructors;

public class Cricket_SuperOfinThisOf {
	String name;
	int jerseyno;
	String country;
	
	public Cricket_SuperOfinThisOf() {
		this("Raju");
		System.out.println("parent No-Arg constructor called ");

	}
	
	public Cricket_SuperOfinThisOf(String name) {
		this(name,8);
		System.out.println("parent 1-Arg constructor called");

	}
	
	
	public Cricket_SuperOfinThisOf(String name, int jerseyno) {
		this(name,jerseyno,"india");
	}
	

	public Cricket_SuperOfinThisOf(String name, int jerseyno, String country) {
//		super();
		this.name = name;
		this.jerseyno = jerseyno;
		this.country = country;
	}

	void cricInfo() {
		System.out.println("Student name:" +name);
		System.out.println("Student name:" +jerseyno);
		System.out.println("Student name:" +country);

	}


	public static void main(String[] args) {

	}

}

class player1 extends Cricket_SuperOfinThisOf{
	player1(){
		super();
		System.out.println("child No-Arg constructor called");
	}
//	player1(String ,int jerseyno){
//		super("Raj",8);
//		System.out.println("1-Arg constructor called");
//	}
//	
	public static void main(String[] args) {
		System.out.println("Main method started");
		player1 p = new player1();
		p.cricInfo();
		
	}
	
}


//Note***
//super() calls exactly ONE matching constructor in the parent class.
//When you use super(), does it execute all parent constructors?
//❌ NO — it does NOT execute all constructors
//✔ It executes ONLY ONE constructor in the parent class