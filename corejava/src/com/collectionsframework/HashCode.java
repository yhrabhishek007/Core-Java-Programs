package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class HashCode {

    public static void main(String[] args) {

        Collection<Integer> c1 = new ArrayList<>();

        c1.add(10);
        c1.add(20);
        c1.add(30);

        // ArrayList calculates hashCode() using its elements.
        // Formula:
        // hash = 31 * hash + element.hashCode()
        //
        // Start with hash = 1
        //
        // 1st element:  31 * 1    + 10 = 41
        // 2nd element:  31 * 41   + 20 = 1291
        // 3rd element:  31 * 1291 + 30 = 40051
        //
        // Therefore c1.hashCode() = 40051

        System.out.println(c1.hashCode());  // 40051
        System.out.println(c1);             // [10, 20, 30]


        Collection<Integer> c2 = new ArrayList<>();

        c2.add(10);
        c2.add(30);
        c2.add(20);

        // Same elements, BUT different order.
        //
        // Calculate:
        //
        // hash = 1
        //
        // 31 * 1    + 10 = 41
        // 31 * 41   + 30 = 1301
        // 31 * 1301 + 20 = 40351
        //
        // Therefore c2.hashCode() = 40351

        System.out.println(c2.hashCode());  // 40351
        System.out.println(c2);             // [10, 30, 20]


        // ArrayList.equals() compares elements AND their order.
        //
        // c1 = [10, 20, 30]
        // c2 = [10, 30, 20]
        //
        // 10 == 10  -> same
        // 20 != 30  -> different
        //
        // Therefore false.

        System.out.println(c1.equals(c2));   // false
        
        
//        String hascode calculation --> based on ASCII values
        String s = "ABC";

     // hashCode() calculates a number based on each character
     // A = 65, B = 66, C = 67
     // Formula: hash = 31 * hash + character

     System.out.println(s.hashCode()); // 64678
    }
}