package com.collection.comparator;

/*
 * Mobile is a simple POJO class.
 *
 * Notice:
 * We are NOT implementing Comparable here.
 *
 * Why?
 * Because we don't want Mobile itself to define a
 * default/natural sorting order.
 *
 * We will use Comparator externally whenever we need
 * a particular sorting requirement.
 */
public class Mobile {

	String model;
	String brand;
	double price;

	/*
	 * Constructor is used to initialize Mobile objects.
	 */
	public Mobile(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	/*
	 * toString() is overridden so that when we print a Mobile object, we get
	 * meaningful information.
	 */
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
}
