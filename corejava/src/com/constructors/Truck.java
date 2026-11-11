package com.constructors;

//Java- Create a Java program with a parent class and a child class to demonstrate all uses of the this and super keywords.
//tasks-
//1.Use this to refer to the current class instance variable.
//2.Use this() to invoke another constructor in the same class.
//3.Use this to invoke a current class method.
//4.Pass this as an argument to a method.
//5.Pass this as an argument to a constructor.
//6.Return the current class object using this.
//7.Use super to access a parent class variable.
//8.Use super to invoke a parent class method.
//9.Use super() to invoke a parent class constructor.
 class vehicles0 {
	String brand;
	String Model;
	int mileage;
	int cc;
	
	public vehicles0() {
		this("Volvo","V7",10,1500);
		
	}
	

	public vehicles0(String brand, String Model, int mileage, int cc) {
		//1.Use this to refer to the current class instance variable.

		//2.Use this() to invoke another constructor in the same class.
		this.brand=brand;
		this.Model=Model;
		this.mileage=mileage;
		this.cc=cc;
		System.out.println("Calling another constructor");
		
		//3.Use this to invoke a current class method.
		
		this.vehicleInfo2();
		
		
	}
	void vehicleInfo(String brand,String Model,int mileage,int cc) {
		System.out.println("Method calling");
		System.out.println("Truck Brand:"+brand);
		System.out.println("Truck Model:"+Model);
		System.out.println("Truck Mileage:"+mileage);
		System.out.println("Truck CC:"+cc);
	}
	void vehicleInfo2() {
		this.vehicleInfo("Volvo", "V7", 10, 1500);
//		Think of it like this:
//			vehicleInfo() = Room A
//			vehicleInfo2() = Room B
//			main() only opens the constructor room.
//			Since nobody enters Room B (vehicleInfo2()), the call to Room A (vehicleInfo()) never occurs.

	}
	
	

		
	}
	
class Bus extends vehicles0{
	
	public Bus(String brand, String Model, int mileage, int cc) {
		super(brand,Model,mileage,cc);
		
		
	}
	 void truck2() {
	        System.out.println("Calling method from parent class");
	    }

}
	


public class Truck extends Bus{
	

	public Truck(String brand, String Model, int mileage, int cc) {
		super(brand, Model, mileage, cc);
		
	}
	public void truck2() {
		System.out.println("Method calling");
		super.truck2();
	}
	
	

	public static void main(String[] args) {
		Truck t = new Truck("Volvo","V7",15,1500);
		
	}
}


