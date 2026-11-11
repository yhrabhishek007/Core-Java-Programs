package com.oops.polymorphism;

public class TestolyDemo2 {
// byte short int long float double char
	
//	addition(1, 2)
//    │
//    ├── addition(float, int)   // 1 is widened from int → float
//    │
//    └── addition(int, float)   // 2 is widened from int → float
	void main(String[] args) {

        System.out.println("Main method started");

        // Calls the method with no arguments
        addition();

        // Calls the byte version because of explicit casting
        addition((byte) 10);

        // Calls the int version because 10 is an int by default
        addition(10);

        // ERROR: Ambiguous method call
        // Java can call either:
        // addition(float, int)
        // OR
        // addition(int, float)
        // Since both require one widening conversion,
        // the compiler cannot decide which one to use.
        addition(1, 2);

    }

    // Called when a byte value is passed
    void addition(byte i) {
        System.out.println("Addition byte arg called");
    }

    // Called when no arguments are passed
    void addition() {
        System.out.println("Addition no arg called");
    }

    // Called when an int value is passed
    void addition(int i) {
        System.out.println("Addition int arg called");
    }

    // Called when a float value is passed
    void addition(float i) {
        System.out.println("Addition float arg called");
    }

    // Called when a double value is passed
    void addition(double i) {
        System.out.println("Addition double arg called");
    }

    // Called when a long value is passed
    void addition(long i) {
        System.out.println("Addition long arg called");
    }

    // This method is commented out.
    // If this method existed, addition(1,2) would call it directly.
    
    void addition(int i, int j) {
        System.out.println("Addition int i and j arg called");
    }
    

    // Called when first argument is float and second is int
    void addition(float i, int j) {
        System.out.println("Addition float i and int j arg called");
    }

    // Called when first argument is int and second is float
    void addition(int i, float j) {
        System.out.println("Addition int i and float j arg called");
    }

    // This method is also commented out.
    /*
    void addition(float i, float j) {
        System.out.println("Addition float i and j arg called");
    }
    */
}