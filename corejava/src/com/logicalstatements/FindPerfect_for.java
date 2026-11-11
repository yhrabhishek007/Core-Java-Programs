package com.logicalstatements;

import java.util.Scanner;

//Write a program to find whether the given number is a Perfect Number or not.
public class FindPerfect_for {

 public static void main(String[] args) {

     System.out.println("Main method started");

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter a number: ");
     int n = sc.nextInt();

     int sum = 0;

     // Find the sum of proper divisors
     for (int i = 1; i <= n / 2; i++) {

         if (n % i == 0) {
             sum = sum + i;
         }
     }

     // Check whether the sum is equal to the number
     if (sum == n) {
         System.out.println(n + " is a Perfect Number.");
     } else {
         System.out.println(n + " is Not a Perfect Number.");
     }

     sc.close();
 }
}