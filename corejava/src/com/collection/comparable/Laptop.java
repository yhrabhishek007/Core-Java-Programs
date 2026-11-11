package com.collection.comparable;

//Comparable is a functional interface because it contains exactly one abstract method, compareTo().

/*
 * Comparable<Laptop> means:
 *
 * "Laptop objects know how to compare themselves with another Laptop object."
 *
 * By implementing Comparable, we are defining the NATURAL ORDERING
 * of Laptop objects.
 */
public class Laptop implements Comparable<Laptop> {

    String model;
    String brand;
    double price;

    public Laptop(String model, String brand, double price) {
        super();
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    /*
     * toString() is overridden so that when we print a Laptop object,
     * we get meaningful information instead of the default Object representation.
     */
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", brand=" + brand + ", price=" + price + "]";
    }

    /*
     * compareTo() defines the NATURAL SORTING ORDER of Laptop objects.
     *
     * compareTo() should return:
     *
     * Negative value -> this object comes BEFORE the other object
     * Zero           -> both objects are considered equal for sorting
     * Positive value -> this object comes AFTER the other object
     */

    @Override
    public int compareTo(Laptop o) {

//    	--> if we want to compare WRT price

//		if (this.price < o.price) {
//			return -1; // if we keep 1 here then it will turn to descending order
//		} else if (this.price > o.price) {
//			return 1;
//		} else {
//			return 0;
//
//		}
    	
    	
        /*
         * OPTION 1: Sort by price in ASCENDING order
         *
         * Example:
         * 60000 < 70000 < 80000
         *
         * We can write:
         *
         * return Double.compare(this.price, o.price);
         */

        // return Double.compare(this.price, o.price);


        /*
         * OPTION 2: Sort by price in DESCENDING order
         *
         * Simply reverse the arguments:
         *
         * return Double.compare(o.price, this.price);
         */


        /*
         * OPTION 3: Sort by brand in DESCENDING order
         *
         * String already implements Comparable.
         *
         * String.compareTo() compares strings lexicographically
         * (dictionary-like ordering).
         *
         * this.brand.compareTo(o.brand)
         *      -> ASCENDING order
         *
         * -(this.brand.compareTo(o.brand))
         *      -> DESCENDING order
         */

        return -this.brand.compareTo(o.brand);
    }
}

//Comparable is a Java interface used to define the natural/default sorting order of objects.
//
//It is present in:
//
//java.lang.Comparable
//
//It has one main method:
//
//int compareTo(T o);
//
//Simple definition for interview
//Comparable is an interface that allows objects of a class to be compared with each other and defines their natural ordering using the compareTo() method.
