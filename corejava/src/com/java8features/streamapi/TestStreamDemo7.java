package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Def--> flatMap() is used when we have a nested collection or multiple streams and want to combine them into a single stream.

public class TestStreamDemo7 {

    public static void main(String[] args) {

        // Creating a simple list
//        List<String> list = Arrays.asList("a", "b");

        // Creating a list containing multiple lists
        // This is called a nested list
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        // Printing the nested list
        System.out.println(nestedList);

        // flatMap() is used to convert a nested list into a single list
        // List::stream converts each inner List into a Stream
        // flatMap() combines all the individual streams into one stream
        // collect() collects the elements into a single List
        List<String> falttenList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        // Printing the flattened list
        System.out.println(falttenList);
    }
}
