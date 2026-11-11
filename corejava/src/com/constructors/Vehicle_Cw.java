package com.constructors;
//Create a Java program with a parent class and a child class to demonstrate all uses of the this and super keywords.
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

  class Parent {

    String brand = "Tata";

    Parent() {
        System.out.println("Parent Constructor Called");
    }

    void display() {
        System.out.println("Parent Method Called");
    }
}

 class Helper {

    Helper(Vehicle_Cw v) {      // Task 5
        System.out.println("Object passed to constructor");
    }
}

class Vehicle_Cw extends Parent {

    String brand;
    String model;
    int mileage;
    int cc;

    // Task 2
    Vehicle_Cw() {
        this("Volvo", "V7", 15, 1500);
        System.out.println("No-Arg Constructor");
    }

    Vehicle_Cw(String brand, String model, int mileage, int cc) {

        super(); // Task 9

        // Task 1
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.cc = cc;

        System.out.println("Parameterized Constructor");

        // Task 3
        this.vehicleInfo();

        // Task 4
        show(this);

        // Task 5
        new Helper(this);
    }

    void vehicleInfo() {
        System.out.println("Vehicle Information");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Mileage : " + mileage);
        System.out.println("CC : " + cc);
    }

    // Task 4
    void show(Vehicle_Cw v) {
        System.out.println("Current object passed to method");
    }

    // Task 6
    Vehicle_Cw getObject() {
        return this;
    }

    void demonstrateSuper() {

        // Task 7
        System.out.println("Parent Brand : " + super.brand);

        // Task 8
        super.display();
    }

    public static void main(String[] args) {

        Vehicle_Cw v = new Vehicle_Cw();

        // Task 6
        Vehicle_Cw obj = v.getObject();

        // Task 7 & 8
        obj.demonstrateSuper();
    }
}