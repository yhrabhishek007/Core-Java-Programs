package com.java8features.optional;

import java.util.Optional;

public class TestOptionalDemo1 {
	
//	
//	Optional is a container object introduced in Java 8 to represent a value that may or may not be present and helps reduce null-related problems such as NullPointerException.”
//
//	And the most important distinction:
//
//	Use Optional.of() when the value is definitely not null. Use Optional.ofNullable() when the value may be null.

    // Optional.of()
    //     ↓
    // null is NOT allowed
    //
    // Optional.ofNullable()
    //     ↓
    // null is allowed
    //
    // Optional.empty()
    //     ↓
    // Creates an empty Optional

    public static void main(String[] args) {

        // Without Optional:
        // If name is null, calling a method on it causes NullPointerException.

        // String name = null;
        // System.out.println(name.toUpperCase()); // ❌ NullPointerException


        System.out.println("************* Creating Optional ************");


        // 1. Optional.of()
        String name1 = "Srikanth";

        // of() is used when we are sure the value is NOT null.
        // If we pass null to Optional.of(), it throws NullPointerException.
        Optional<String> opt = Optional.of(name1);

        System.out.println(opt);


        System.out.println("*********************************");


        // 2. Optional.ofNullable()
        String name2 = null;

        // ofNullable() can accept both null and non-null values.
        // If the value is null, it creates an empty Optional.
        Optional<String> opt1 = Optional.ofNullable(name2);

        System.out.println(opt1);


        System.out.println("*********************************");


        // 3. Optional.empty()
        // Creates an empty Optional without any value.
        Optional<String> opt2 = Optional.empty();

        System.out.println(opt2);
    }
}


//Optional.of(value)
//↓
//null NOT allowed
//null → NullPointerException
//
//
//Optional.ofNullable(value)
//↓
//null allowed
//null → Optional.empty()
//
//
//Optional.empty()
//↓
//Creates an empty Optional
