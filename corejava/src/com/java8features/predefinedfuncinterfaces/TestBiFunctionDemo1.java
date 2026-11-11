package com.java8features.predefinedfuncinterfaces;

import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

//Def-->  Function is a predefined functional interface introduced in Java 8 that accepts one input and returns one output.

//Function is used when we want to transform an input into an output,
//whereas Predicate is used when we only want to check a condition.

public class TestBiFunctionDemo1 {

    public static void main(String[] args) {

        // BiFunction takes TWO inputs and returns ONE result
        // Integer + Integer -> Integer
        BiFunction<Integer, Integer, Integer> bif = (i, j) -> i * j;

        System.out.println(bif.apply(10, 15));
        // 10 * 15 = 150


        // BiFunction can take different input types
        // String + String -> Integer
        // Here we return the total length of both Strings
        BiFunction<String, String, Integer> bif1 =
                (s, s1) -> s.length() + s1.length();

        System.out.println(bif1.apply("Java", "is Simple"));
        // 4 + 9 = 13


        // IntFunction takes one primitive int
        // and returns a result
        IntFunction<Integer> if3 = (i) -> i * 10;

        System.out.println(if3.apply(9));
        // 9 * 10 = 90


        // LongFunction takes one primitive long
        // and returns a result
        LongFunction<Long> lf4 = (i) -> i * 10;

        System.out.println(lf4.apply(944334444));
    }
}
