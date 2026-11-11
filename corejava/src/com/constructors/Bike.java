package com.constructors;

public class Bike {
	String brand;
	String model;
	int cc;
	int milage;
	String color;

	Bike(String brand, String model, int cc, int milage, String color) {
//		System.out.println("Bike 2 Details:------->");
//		System.out.println("2nd Bike brand:" + brand);
//		System.out.println("2nd Bike model:" + model);
//		System.out.println("2nd Bike cc:" + cc);
//		System.out.println("2nd Bike milage:" + milage);
//		System.out.println("2nd Bike color:" + color);
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.cc=cc;
		this.milage=milage;
		


	}
	
	Bike(String brand,String model,int cc ){
		this.brand=brand;     // this keyword is used to invoke parent class
		this.model=model;
		this.cc=cc;
//		
//		System.out.println("Bike 3 Details:------->");
//
//		
//		System.out.println("3rd Bike brand:" + brand);
//		System.out.println("3rd Bike model:" + model);
//		System.out.println("3rd Bike cc:" + cc);

		
	}

	Bike() {

		brand = "HERO";
		model = "X-Pulse 200 Rally Pro";
		cc = 200;
		milage = 38;
		color = "Red and Black";

//		System.out.println(brand);  // it will print default values when we create object , if we had not initialized 
//		System.out.println(model);
//		System.out.println(cc);
//		System.out.println(milage);
//		System.out.println(color);

	}

	void display() {
		
		System.out.println("Bike brand:" + brand);
		System.out.println("Bike model:" + model);
		System.out.println("Bike cc:" + cc);
		System.out.println("Bike milage:" + milage);
		System.out.println("Bike color:" + color);
		System.out.println("------------------------>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.display();
		
		Bike b1 = new Bike("Bajaj","Pulsar",150,45,"Red & Black");
		b1.display();
		Bike b2 = new Bike("Yamaha","R15",155);
		b2.display();

	}

}
