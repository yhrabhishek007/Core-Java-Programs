package com.constructors;

public class Constructor_thisOf {
	String name;
    int jerseyNumber;
    String position;   // striker, midfielder, defender, goalkeeper
    int goals;
    int assists;
    int stamina;
	
	 Constructor_thisOf(){
		 System.out.println("No-Arg constructor");
		 this("Ronaldo",7);
		 
		 
	 }
	 Constructor_thisOf(String name,int jerseyNumber){
		 this.name=name;
		 this.jerseyNumber=jerseyNumber;
		 System.out.println("2-Arg constructor");   //statement must be at second after this()

	
		 System.out.println(name);
		 System.out.println(jerseyNumber);
		 
		 
	 }
	 
	public  Constructor_thisOf(String name,int jerseyNumber,String position){
//		 this(name,jerseyNumber,position,555);
		 
//		 this.name=name;
//		 this.jerseyNumber=jerseyNumber;
//		 this.position=position;
		 
		 
		 
	 }
	 

	 public Constructor_thisOf(String name, int jerseyNumber, int goals, int assists) {
		this(name,jerseyNumber,"Striker",goals,assists,9);
	}
	 Constructor_thisOf(String name,int jerseyNumber,String position,int goals,int assists,int stamina){
		 this.name=name;
		 this.jerseyNumber=jerseyNumber;
		 this.position=position;
		 this.goals=goals;
		 this.assists=assists;
		 this.stamina=stamina;	 
	 }

	 void footballInfo() {
		 System.out.println("Player name:"+name);
		 System.out.println("Player jersey number:" +jerseyNumber);
		 System.out.println("Player position:"+position);
		 System.out.println("Career goals:" +goals);
		 System.out.println("Career assists:" +assists);
		 System.out.println("Player stamina:" +stamina);
		 System.out.println("--------------------------->");
		 
	 }

	public static void main(String[] args) {
		Constructor_thisOf t = new Constructor_thisOf("Messi",10,"Winger");
		
		Constructor_thisOf   t1 = new Constructor_thisOf("Neymar",10,"Winger",720,400,7);
		t1.footballInfo();
		
		Constructor_thisOf t2= new Constructor_thisOf("Haaland",9,450,150);
		t2.footballInfo();
		
		

		
	}

}
