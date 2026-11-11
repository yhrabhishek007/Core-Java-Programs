package com.conditionalstatements;

import java.util.Scanner;

public class Switch_return {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a Week day: ");
	        String day = sc.next();

	        System.out.println(getDayInfo(day));

	        sc.close();
	    }

	    static String getDayInfo(String day) {

	        String info=switch(day.toLowerCase()) {

	            case "monday" -> {
	                System.out.println("Mondays are always Lazy days");
	                yield "Lazy day";
	            }

	            case "tuesday", "wednesday", "thursday" -> "Active days";
	            case "friday" -> "Weekend Started";
	            case "saturday" -> "Funny day";
	            case "sunday" -> "Relax Mode";
	            default -> "Invalid day";
	        };
	        return info;
	    }  
}