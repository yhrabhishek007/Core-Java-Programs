package com.java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo1 {

    public static void main(String[] args) {

        /*
         * ============================================================
         * JAVA 8 STREAM API - IMPORTANT INTERVIEW NOTES
         * ============================================================
         *
         * 1. Stream API was introduced in Java 8.
         *
         * 2. Stream is used to process a collection of data
         *    in a declarative and functional-style manner.
         *
         * 3. Stream does NOT store data.
         *
         * 4. Stream does NOT modify the original collection by default.
         *
         * 5. Stream provides operations such as:
         *
         *       filter()
         *       map()
         *       sorted()
         *       distinct()
         *       limit()
         *       skip()
         *       collect()
         *       forEach()
         *       reduce()
         *       count()
         *
         * 6. A Stream is generally created from a data source such as:
         *
         *       Collection
         *       List
         *       Set
         *       Array
         *       Stream.of()
         *
         * 7. A Stream pipeline generally contains:
         *
         *       Source
         *         ↓
         *       Intermediate Operation(s)
         *         ↓
         *       Terminal Operation
         *
         * ============================================================
         */


        // ------------------------------------------------------------
        // STEP 1: Create a List
        // ------------------------------------------------------------

        List<Integer> l = new ArrayList<>();

        l.add(54);
        l.add(77);
        l.add(18);
        l.add(10);
        l.add(8);
        l.add(14);
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(3);
        l.add(7);


        // ------------------------------------------------------------
        // STEP 2: Create a Stream from the List
        // ------------------------------------------------------------

        Stream<Integer> st = l.stream();

        /*
         * stream() creates a Stream from the List.
         *
         * Important:
         *
         * List  --->  Stream
         *
         * The Stream does not contain/store a separate copy of the
         * List's data.
         *
         * It provides a way to process the data from the List.
         *
         * Interview:
         *
         * Q: Does Stream store data?
         * A: No. Stream is not a data structure.
         *    It is used for processing data.
         */


        // ------------------------------------------------------------
        // STEP 3: filter()
        // ------------------------------------------------------------

        Stream<Integer> st1 = st.filter(i -> i % 2 == 0);

        /*
         * filter() is an INTERMEDIATE OPERATION.
         *
         * It is used to select elements based on a condition.
         *
         * Here:
         *
         *     i -> i % 2 == 0
         *
         * means:
         *     Select only even numbers.
         *
         * Original:
         *
         *     54, 77, 18, 10, 8, 14, 1, 5, 6, 3, 7
         *
         * Result:
         *
         *     54, 18, 10, 8, 14, 6
         *
         *
         * IMPORTANT:
         *
         * filter() returns another Stream.
         *
         * Therefore:
         *
         *     Stream<Integer> st1 = st.filter(...);
         *
         *
         * Interview:
         *
         * Q: Is filter() an intermediate or terminal operation?
         * A: Intermediate operation.
         *
         * Q: What does filter() return?
         * A: A Stream.
         */


        // ------------------------------------------------------------
        // STEP 4: collect()
        // ------------------------------------------------------------

        List<Integer> l1 = st1.collect(Collectors.toList());

        /*
         * collect() is a TERMINAL OPERATION.
         *
         * It is used to collect the processed Stream elements
         * into another data structure such as List or Set.
         *
         * Here:
         *
         *     Stream ---> List
         *
         * Result:
         *
         *     [54, 18, 10, 8, 14, 6]
         *
         *
         * Interview:
         *
         * Q: Is collect() an intermediate or terminal operation?
         * A: Terminal operation.
         *
         * Q: What does collect() do?
         * A: It gathers Stream elements into a result/container.
         */


        System.out.println(l1);
    }
}
