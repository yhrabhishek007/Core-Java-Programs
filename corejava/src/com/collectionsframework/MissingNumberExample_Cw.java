package com.collectionsframework;
//Write a Java program to find the missing number from a List containing numbers from 1 to 10.
//Input: [1, 2, 3, 5, 6, 7, 8, 9, 10]
//Output: Missing Number: 4
import java.util.Arrays;
import java.util.List;

public class MissingNumberExample_Cw {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);
        int n = 10; // Range is 1 to 10

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : input) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}