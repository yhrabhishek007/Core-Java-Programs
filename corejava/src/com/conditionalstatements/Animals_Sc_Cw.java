package com.conditionalstatements;

import java.util.Scanner;

//1. Write a Java program to display the selected animal?
//Main Menu:
//1 → Domestic Animals
//2 → Wild Animals
//Domestic:
//1 → Cow
//2 → Dog
//Wild:
//1 → Lion
//2 → Tiger
//switch (caty) {
//
//case "Domestic Animals" -> {
//    System.out.println("Choose Animal:");
//    // nested switch
//}
//
//case "Wild Animals" -> {
//    System.out.println("Choose Animal:");
//    // nested switch
//}
//
//default -> {
//    System.out.println("Entered Category Currently Developing");
//}
//}
public class Animals_Sc_Cw {

	public static void main(String[] args) {
		System.out.println("Welcome to Zoo");
		Scanner sc = new Scanner(System.in);
		String change;
		do {
		System.out.println("Choose Category:(Domestic Animals(1) / Wild Animals(2))");
		int caty = sc.nextInt();
		 
		switch(caty) {
		case 1->{
			System.out.println("Choose Animal:(Cow / Dog)");
			int name=sc.nextInt();
			switch(name) {
			case 1->System.out.println("Cow");
			case 2->System.out.println("Dog");
			default->System.out.println("Invalid Animal selection");
			}
		}
		case 2->{
			System.out.println("Choose Animal:(Lion / Tiger)");
			int name=sc.nextInt();
			switch(name) {
			case 1->System.out.println("Lion");
			case 2->System.out.println("Tiger");
			default->System.out.println("Invalid Animal selection");

			}
		}
		default->System.out.println("Invalid Category");
		
		}
		
		System.out.println("Do you Want to change category? (yes/no)");
		change=sc.next().toLowerCase();
		} while(change.equals("yes"));
		System.out.println("Thank you, Please visit again");


	}

}

