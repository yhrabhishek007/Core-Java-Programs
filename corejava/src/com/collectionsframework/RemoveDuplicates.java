package com.collectionsframework;
//Write a Java program to remove duplicate elements from a List while maintaining the original order.
//Input: [10, 20, 10, 30, 20, 40]
//Output: [10, 20, 30, 40]
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);

        // LinkedHashSet removes duplicates and maintains original order
        Set<Integer> unique = new LinkedHashSet<>(list);

        // Convert back to List
        List<Integer> result = new ArrayList<>(unique);

        System.out.println(result);
    }
}