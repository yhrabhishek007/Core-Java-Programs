package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;

public class TestParallelStreamDemo9 {

//	Def--> A parallel stream divides the stream elements into multiple parts and processes those parts simultaneously using multiple threads.
//	 It can improve performance for large, CPU-intensive tasks, but it should be used carefully because it has overhead and does not guarantee order with forEach().
	
    public static void main(String[] args) {

        // Creating a list of names
        List<String> names = Arrays.asList(
                "John", "Jane", "Jack", "Jill", "Jerry", "Jim"
        );

        // parallelStream() processes the elements in parallel
        // using multiple threads.
        //
        // It is useful when we have:
        // 1. Large amount of data
        // 2. CPU-intensive operations
        //
        // Important:
        // - Parallel stream does NOT always improve performance.
        // - For small data, normal stream may be faster because
        //   parallel processing has some overhead.
        // - It uses the Fork/Join framework and common ForkJoinPool.
        //
        // forEach() does NOT guarantee the original order
        // because multiple threads may process elements at the same time.
        names.parallelStream()
                .forEach(name ->
                        System.out.println(
                                name + " -> " + Thread.currentThread()
                        )
                );


        // If we want to maintain the original order,
        // we can use forEachOrdered().
        //
        // names.parallelStream()
        //      .forEachOrdered(System.out::println);


        // IMPORTANT:
        // Avoid modifying shared variables or shared collections
        // inside a parallel stream without proper synchronization.
        // Otherwise, it can cause thread-safety issues.
    }
}
