package com.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

//8.Write a Java program to print a square matrix pattern of size n = 5. 
//The program should overwrite both the main diagonal and the anti-diagonal 
//cells using the characters of the name "DHONI" corresponding to that row index. 
//All remaining empty cells must be filled sequentially with the standard alphabet 
//starting from 'A'.
//Input: n = 5
//Output:
//D A B C D
//D H E H F
//G H O I J
//K N L N M
//I N O P I
public class DhoniMatrixPattern {

	public static void main(String[] args) {
		
		System.out.println("Main method sstarted");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows:");
		int row=sc.nextInt();
		System.out.println("Enter cols:");
		int col=sc.nextInt();
		
		String[][] arr= new String[row][col];
		System.out.println("Enter array elements:");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.next();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if(i==j) {
					System.out.println();
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));


	}

}
