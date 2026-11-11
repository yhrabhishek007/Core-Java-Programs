package com.constructors;

public class cars {
	String brand;
	String model;
	int milage;
	String type;
	String color;
	double price;
	String comfort;

	cars(String brand, String model, int milage, String type, String color, double price) {
		System.out.println("Constructor Called--------------->");
		this.brand=brand;
		this.color=color;
		this.model=model;
		this.milage=milage;
		this.type=type;
		this.price=price;

	}
	
	cars(String brand, String model, int milage, String color){
		System.out.println("Constructor called----------------->");

		this.brand=brand;
		this.color=color;
		this.model=model;
		this.milage=milage;
		this.type=type; //printing default values when we are not taking parameters and calling
		this.price=price;		
	}
	

	cars(String brand, String model, int milage, String type, String color, double price,String comfort) {
		System.out.println("Constructor Called--------------->");
		this.brand=brand;
		this.color=color;
		this.model=model;
		this.milage=milage;
		this.type=type;
		this.price=price;
		this.comfort=comfort;
		

	}
	cars(String brand, String model, int milage) { //i had taken 3 parameters but when creating object
//		returning more than 3 values 
		System.out.println("Constructor Called--------------->");
		this.brand=brand;
		this.color=color;
		this.model=model;
		this.milage=milage;
		this.type=type;
		this.price=price;
	}
	void display() {
		System.out.println("Car brand:" +brand);
		System.out.println("Car model:" +model);
		System.out.println("Car milage:"+milage);
		System.out.println("Car type:" +type);
		System.out.println("Car color:" +color);
		System.out.println("Car price:" +price);
	}

	public static void main(String[] args) {
		cars c= new cars("Mahindra","Thar",18,"Petrol","Red",1400000);
		c.display();
		cars c1 = new cars("Volkswagen","Virtus",15,"Red");
		c1.display();
		cars c2 = new cars("Hyundai","i20 Sportz",20,"Black","Petrol",1000000,"good");
		c2.display();
		cars c3 = new cars("Honda","city",19,"petrol"); // here it's not checking the parameters ,
//		if we are giving more values then it is taking the values not 
		c3.display();

	}

}
