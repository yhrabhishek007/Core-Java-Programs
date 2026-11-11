package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Method Reference Example: 
//String::toUpperCase
// :: --> Double colon Operator will consider as Method Reference 
public class TestStreamDemo5 {

    public static void main(String[] args) {

        // Creating a list of String values
        List<String> names = Arrays.asList("j2se", "j2ee", "frameworks","dsa");

        // stream() processes each element of the list
        // map(String::toUpperCase) converts each String into uppercase
        // String::toUpperCase is a method reference
        // collect() collects the processed elements into a new List
        

//        Yes, toUpperCase() is an instance method. In String::toUpperCase, we are not calling the method without an object.
//        The stream provides each String object to the method reference automatically. So String::toUpperCase is equivalent 
//        to s -> s.toUpperCase(), where s is each String object from the stream.

        List<String> names1 = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        // forEach() processes each element one by one
        // System.out::println is a method reference used to print each element
        names1.forEach(System.out::println);
    }
}
