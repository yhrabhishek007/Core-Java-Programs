package com.conditionalstatements;

import java.util.Scanner;

//1. Write a Java program to display the ticket price based on movie category?
//G → ₹150, P → ₹250, V → ₹400
public class MovieTickets_Sc_Cw {

	public static void main(String[] args) {

		System.out.println("Welcome to PVR Cinemas");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie category:");
		char Mcat=sc.next().charAt(0);
		
		
		switch(Mcat) {
		case 'G' ->  System.out.println("Gold Category Tickets");
		case 'P' ->  System.out.println("Premium Category Tickets");
		case 'V' ->  System.out.println("VIP Category Tickets");
		default->System.out.println("Invalid Category Entry");

		}
	}

}
