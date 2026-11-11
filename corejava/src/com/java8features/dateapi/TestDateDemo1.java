package com.java8features.dateapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//It is Old Style

//java.time
//|
//+-- LocalDate        → date only
//|
//+-- LocalTime        → time only
//|
//+-- LocalDateTime    → date + time
//|
//+-- ZonedDateTime    → date + time + timezone
//|
//+-- Instant           → timestamp
//|
//+-- DateTimeFormatter → formatting/parsing

public class TestDateDemo1 {

	public static void main(String[] args) throws ParseException {

//		Old Style
		
		// Returns the current time in milliseconds
		// The value represents the number of milliseconds
		// elapsed since January 1, 1970 (Unix Epoch)
		long startMillinSec = System.currentTimeMillis();

		// Creating a Date object using the milliseconds value
		Date date = new Date(startMillinSec);

		// Prints the current date and time
		System.out.println(date);

		
		System.out.println("**************************************");
//		Conversions---------------------------
		
		// byte can store values from -128 to 127.
		// 130 is outside this range, so explicit casting is required.
		// After conversion, the value becomes -126.

		
//		int to byte --> Explicit Type casting
		byte b = (byte) 130;

		// float normally requires 'F' at the end of the decimal value.
//		int to Integer --> Auto-Boxing
		Integer i2 = 200;
		float f = (float) 55.5F;

		// A float value can be automatically promoted to double.
		double d1 = 55.5F;

		// String containing a number
//		String to int conversion : Parsing
		String i = "100";

		// Converts the String "100" into an int value 100
		int i1 = Integer.parseInt(i);

		// 100 + 200 = 300
		System.out.println(i1 + 200);

		System.out.println("***********************");

//		New Date Style
		
		// Date as a String
		// Here the format is: day/month/year
		String oldDateString = "12/08/2024";

		String newDateString;

		// Format of the input date
		String OLD_FORMAT = "dd/MM/yyyy";

		// Format that we want for the output date
		String NEW_FORMAT = "dd-MM-yyyy";

		// SimpleDateFormat is used to convert
		// String -> Date and Date -> String
		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);

		// Converts the String "12/08/2024" into a Date object
		Date d = sdf.parse(oldDateString);

		// Change the date format from dd/MM/yyyy to dd-MM-yyyy
		sdf.applyPattern(NEW_FORMAT);

		// Converts the Date object back into a String
		// using the new format
		newDateString = sdf.format(d);

		System.out.println("old Date : " + oldDateString);
		System.out.println("new Date : " + newDateString);
	}
}