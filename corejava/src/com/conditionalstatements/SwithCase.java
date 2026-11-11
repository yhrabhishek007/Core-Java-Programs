package com.conditionalstatements;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter jersey number:");
		int jsy=sc.nextInt();
		
		switch(jsy) {
		case 7:System.out.println("Mahindra Singh Dhoni");
		System.out.println("Captain Cool + Best Wicket Keeper in the world");
		break;
		case 18:System.out.println("Virat Kohli");
		System.out.println("King Kohli + Aggresive play style");
		break;
		case 33:System.out.println("Hardik Pandya");
		System.out.println("No 1 Allrounder in the World cricket");
		break;
		}
	}

}
