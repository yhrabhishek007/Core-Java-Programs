package com.java8features.dateapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDateDemo2 {

	public static void main(String[] args) {

		
		
		String oldDateString = "12/08/2024";

		DateTimeFormatter oldFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

//		String -> LocalDate
		LocalDate date = LocalDate.parse(oldDateString, oldFormat);

//		LocalDate -> String
		String newDateString = date.format(newFormat);

		System.out.println("Old Date : " + oldDateString);
		System.out.println("New Date : " + newDateString);

	}

}
