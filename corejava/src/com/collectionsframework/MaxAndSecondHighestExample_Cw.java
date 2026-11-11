package com.collectionsframework;
//Write a Java program to find the maximum and second-highest numbers from a List<Integer>.
//
//Input: [10, 40, 20, 50, 30]
//Output: Maximum: 50, Second Highest: 40
import java.util.Arrays;
import java.util.List;

public class MaxAndSecondHighestExample_Cw {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 40, 20, 50, 30);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : input) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Maximum: " + max + ", Second Highest: " + secondMax);
    }
}