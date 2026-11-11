package com.constructors;

public class Super_Of_Constructor {

    String brand;
    String model;
    int mileage;

    // Parent No-Arg Constructor
    Super_Of_Constructor() {
        System.out.println("Parent No-Arg Constructor Called");
    }

    // Parent 2-Arg Constructor
    Super_Of_Constructor(String brand, String model) {
        this.brand = brand;
        this.model = model;

        System.out.println("Parent 2-Arg Constructor Called");
    }

    // Parent 3-Arg Constructor
    Super_Of_Constructor(String brand, String model, int mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;

        System.out.println("Parent 3-Arg Constructor Called");
    }

    void bikeInfo() {
        System.out.println("Brand   : " + brand);
        System.out.println("Model   : " + model);
        System.out.println("Mileage : " + mileage);
    }
}

class Child_ extends Super_Of_Constructor {

    // Calls Parent No-Arg Constructor
    Child_() {
        // super(); // Compiler inserts this automatically

        System.out.println("Child No-Arg Constructor Called");
    }

    // Calls Parent 2-Arg Constructor
    Child_(String brand, String model) {
        super(brand, model);

        System.out.println("Child 2-Arg Constructor Called");
    }

    // Calls Parent 3-Arg Constructor
    Child_(String brand, String model, int mileage) {
        super(brand, model, mileage);

        System.out.println("Child 3-Arg Constructor Called");
    }

    public static void main(String[] args) {

        System.out.println("===== Object 1 =====");
        Child_ c1 = new Child_();
        c1.bikeInfo();

        System.out.println();

        System.out.println("===== Object 2 =====");
        Child_ c2 = new Child_("Yamaha", "R15");
        c2.bikeInfo();

        System.out.println();

        System.out.println("===== Object 3 =====");
        Child_ c3 = new Child_("Hero", "Xpulse", 45);
        c3.bikeInfo();
    }
}