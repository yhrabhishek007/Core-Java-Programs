package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestListD4 {

	public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();

        li.add(10);  // index 0
        li.add(20);  // index 1
        li.add(30);  // index 2
        li.add(40);  // index 3
        li.add(50);  // index 4
        li.add(60);  // index 5
        li.add(70);  // index 6
        li.add(80);  // index 7


        // Get elements from index 5 to index 7.
        // 5 is included, 8 is not included.
        //
        // index 5 = 60
        // index 6 = 70
        // index 7 = 80
        //
        // So l2 = [60, 70, 80]

        List<Integer> l2 = li.subList(5, 8);

        System.out.println(l2);
        // Output: [60, 70, 80]


        // Add 100 to l2.
        // It will also be added to li.
        l2.add(100);


        // Add 200 to l2.
        // It will also be added to li.
        l2.add(200);


        // remove(1) means remove element at index 1 of l2.
        //
        // l2 = [60, 70, 80, 100, 200]
        //           ↑
        //         index 1 = 70
        //
        // So 70 is removed.

        l2.remove(1);


        // l2 = [60, 80, 100, 200]
        //
        // Because l2 comes from li using subList(),
        // changes in l2 also change li.

        System.out.println(li);

        // Output:
        // [10, 20, 30, 40, 50, 60, 80, 100, 200]
    }
}
