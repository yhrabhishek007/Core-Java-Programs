package com.collectionsframework;

//Write a Java program using the List interface to find and display all unique pairs of numbers 
//whose sum is equal to a given target value.
//Input:
//List = [2, 7, 4, 3, 5, 8, 1]
//Target = 9
//Expected Output:
//(2, 7)
//(4, 5)
//(8, 1)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniquePairsWithTargetSum {

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		List<Integer> l = new ArrayList<>();

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		System.out.println("Enter elements:");

		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}

		System.out.println("Enter target:");
		int target = sc.nextInt();

//		for(int i=0;i<l.size();i++) {
//			for(int j=i+1;j<l.size();j++) {
//				
//				if(l.get(i)+l.get(j)==target) {
//					System.out.println("("+l.get(i)+","+l.get(j)+")");
//				}
//			}
//		}

		List<List<Integer>> Li = new ArrayList<>();
		Collections.sort(l);
		int i = 0;
		int j = n - 1;
		int sum = 0;
		while (i < j) {
			sum = l.get(i) + l.get(j);
			if (sum == target) {

				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(l.get(i));
				l1.add(l.get(j));

				Li.add(l1);
				i++;
				j--;
			} else if (sum < target) {
				i++;

			} else {
				j--;
			}

		}
		System.out.println(Li);

		sc.close();

	}

}
