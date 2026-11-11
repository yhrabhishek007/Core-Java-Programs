package com.constructors;

public class Product_Sf {
	
	String brand;
	int id;
	String name;
	double price;
	
	public Product_Sf() {
		System.out.println("No-arg constructor parent class called");
	}
	
	public Product_Sf(String brand){
		this.brand=brand;
		System.out.println("1-Arg constructor calling");
		
	}
	public Product_Sf(String brand,int id){
		this.brand=brand;
		this.id=id;
		System.out.println("2-Arg constructor calling");
		
	}
	public Product_Sf(String brand, int id, String name) {
		super();
		this.brand=brand;
		this.id=id;
		this.name=name;
		System.out.println("3-Arg constructor calling");
	}
	
	

	public Product_Sf(String brand, int id, String name, double price) {
		super();
		this.brand = brand;
		this.id = id;
		this.name = name;
		this.price = price;
		System.out.println("4-Arg consrtructor called");
	}

	public static void main(String[] args) {
		System.out.println("Main method parent class");
		
		
	}

	

}

class child1 extends Product_Sf {

	
	public child1() {
		System.out.println("NO-arg constructor child class called");
		
	}
	
	public child1(String brand) {
		super(brand);
//		System.out.println(brand);
		
	}
	public child1(String brand,int id){
		super(brand,id);
		
	}
	public child1(String brand, int id, String name) {
		super(brand,id,name);
		
	}
	public child1(String brand, int id, String name, double price) {
		super(brand,id,name,price);
	
	}
	

	
	void productInfo() {
		System.out.println("Product Brand:"+brand);
		System.out.println("Product ID:"+id);
		System.out.println("Product Name:"+name);
		System.out.println("Product Price:"+price);
		System.out.println("--------------------------------->");

	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Main method child class");
		child1 c = new child1();
		child1 c1 = new child1("Nestle");
		c1.productInfo();
		child1 c2 = new child1("Nestle",1022);
		c2.productInfo();
		child1 c3 = new child1("Nestle",1022,"Kit Kat");
		c3.productInfo();
		child1 c4 = new child1("Nestle",1022,"Kit Kat",20);
		c4.productInfo();

		
	}
	
}
