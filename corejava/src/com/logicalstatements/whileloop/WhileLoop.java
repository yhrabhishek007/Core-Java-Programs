package com.logicalstatements.whileloop;

import java.util.Scanner;


public class WhileLoop {

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int i = 0;

        // Check the condition: Is i less than or equal to n?
        // Example: if n = 4
        // First: 0 <= 4 -> true, so enter the loop.
        // Print 0, then i becomes 1.
        //
        // Next: 1 <= 4 -> true
        // Print 1, then i becomes 2.
        //
        // Next: 2 <= 4 -> true
        // Print 2, then i becomes 3.
        //
        // Next: 3 <= 4 -> true
        // Print 3, then i becomes 4.
        //
        // Next: 4 <= 4 -> true
        // Print 4, then i becomes 5.
        //
        // Next: 5 <= 4 -> false
        // Condition is false, so the loop stops.
        while (i <= n) {
            System.out.println(i); // Print the current value of i.
            i++;                   // Increase i by 1.
        }
    }
}

//A good way to think about it is:
//
//Before every iteration, Java asks: "Is i still less than or equal to n?" If yes, execute the loop. 
//If no, exit the loop. This question is asked every single time the loop is about to run.