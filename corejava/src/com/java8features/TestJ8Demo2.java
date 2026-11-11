package com.java8features;

// This is a Functional Interface because it has only one abstract method
interface In2 {

    // Abstract method
    void addition(int a, int b);

    // Default method
    // Default methods can have a method body
    default void welcome() {
        System.out.println("Welcome method called from In2");
    }
}

public class TestJ8Demo2 {

    public static void main(String[] args) {

        System.out.println("main method started");

        // Lambda Expression
        // Lambda provides the implementation for the abstract method addition()
        In2 t = (int a, int b) ->

            System.out.println("Sum is : " + (a + b));

        // Anonymous Inner Class
        // Here we provide implementations for the interface methods
        In2 t3 = new In2() {

            // Overriding the default method
            @Override
            public void welcome() {
                System.out.println("Welcome method called from Inner class");
            }

            // Implementing the abstract method
            @Override
            public void addition(int a, int b) {

            }
        };

        // Calling addition() implemented using Lambda
        t.addition(40, 100);

        // Calling welcome() overridden by the Inner Class
        t3.welcome();

        System.out.println("main method ended");
    }
}
