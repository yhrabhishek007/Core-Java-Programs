package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo8 {

    public static void main(String[] args) {

        // Creating a list containing two sentences
        List<String> sentences = Arrays.asList(
                "hello world",
                "java stream flatmap"
        );

        // Printing the original sentences
        System.out.println(sentences);

        // flatMap() is used to convert each sentence into individual words
        // split(" ") separates the sentence wherever there is a space
        // Arrays.stream() converts the resulting array into a Stream
        // flatMap() combines all the words into one single stream
        // collect() stores the words in a List
        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());

        // Counting the total number of words
        // flatMap() first separates all sentences into individual words
        // count() then counts the total number of words
        long count = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .count();

        System.out.println("Total words: " + count);

        // Printing the flattened list
        // Output: [hello, world, java, stream, flatmap]
       
        
        System.out.println(words);
    
//        Take each sentence → split it into words → convert those words into a stream.



    
    }
    
}
