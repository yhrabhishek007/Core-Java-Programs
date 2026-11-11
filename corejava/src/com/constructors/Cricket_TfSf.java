package com.constructors;

public class Cricket_TfSf {
	String name;
	int jerseyno;
	String country;
	String role;
	
	public Cricket_TfSf() {
		this("Jadeja");
		System.out.println("1 parameter called in No-Arg Constructor");
		System.out.println(name);
	}
	Cricket_TfSf(String name){
		this(name,18);
		System.out.println("2 parameters called in 1-Arg Constructor");
		
	}
	Cricket_TfSf(String name,int jerseyno){
		this(name,jerseyno,"India");
		System.out.println("3 parameters called in 2-Arg Constructor");

		
	}
	
	Cricket_TfSf(String name,int jerseyno,String country){
		this(name,jerseyno,country,"All Rounder");
		System.out.println("4 parameters called in 3-Arg Constructor");

		
	}
	

	public Cricket_TfSf(String name, int jerseyno, String country, String role) {
//		super();
		this.name = name;
		this.jerseyno = jerseyno;
		this.country = country;
		this.role = role;
		System.out.println("Assigning values to instance data ^");
	}
	
	void cricketInfo() {
		System.out.println("Cricketer Name:" +name);
		System.out.println("Cricketet Jersey No:" +jerseyno);
		System.out.println("Cricketer Country:" +country);
		System.out.println("Cricketer Role:" +role);
		System.out.println("--------------------------------->");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Cricket_TfSf c = new Cricket_TfSf();
		c.cricketInfo();
		Cricket_TfSf c1 = new Cricket_TfSf("Hardik");
		c1.cricketInfo();
		Cricket_TfSf c2 = new Cricket_TfSf("Axar Patel",7);
		c2.cricketInfo();
		Cricket_TfSf c3 = new Cricket_TfSf("Shivam Dube",10,"India");
		c3.cricketInfo();
		Cricket_TfSf c4 = new Cricket_TfSf("Nitish Kumar Reddy",16,"India","All Rounder");
		c4.cricketInfo();
		
	}

}
//The constructor Cricket_TfSf(String, String) is undefined
//when we give parameters wrongly example
//ex: In 2 -arg i had passed Cricket_SfTf(String name,int jerseyno) 
//but when i'm calling the 2 arg ,i should return the same data types i have used in 2-arg if i give
//like this super child(String name,String country) it will throw error
class Player extends Cricket_TfSf{
	public Player() {   //why it is not printing the outputs doubt
        super();
        System.out.println("Child No-Arg Constructor");
    }

    public Player(String name, int jerseyno) {
        super(name, jerseyno);
        System.out.println("Child 2-Arg Constructor");
    }

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.cricketInfo();

        Player p2 = new Player("Dwayne Bravo", 10);
        p2.cricketInfo();
    }
}