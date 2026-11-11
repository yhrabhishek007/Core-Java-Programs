package com.constructors;

public class Laptop_cc {
	String brand;
	String model;
	String processor;
	double price;
	
	Laptop_cc(String brand){
		this.brand=brand;
		
	}
	public Laptop_cc(Laptop_cc l,String model) {
		this.brand=l.brand;
		this.model=model;
	}
	public Laptop_cc(Laptop_cc l,String processor,double price) {
		this.brand=l.brand;
		this.model=l.model;
		this.processor=processor;
		this.price=price;
		
		
	}
	
	void laptopInfo() {
		System.out.println("Laptop Brand:" +brand);
		System.out.println("Laptop Model:"+model);
		System.out.println("Laptop Processor:"+processor);
		System.out.println("Laptop Price:"+price);
		System.out.println("------------------------------>");
		
	}
	

	public static void main(String[] args) {
		Laptop_cc l = new Laptop_cc("HP");
		l.laptopInfo();
		Laptop_cc l1 = new Laptop_cc(l,"Victus");
		l1.laptopInfo();
		Laptop_cc l2 = new Laptop_cc(l1,"i5",75000.00);
		l2.laptopInfo();
		

	}

}
