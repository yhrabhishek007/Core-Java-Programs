package com.java8features.dateapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestDateApiPrograms {

	public static void main(String[] args) {

		// 1. Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);

		// 2. Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time: " + time);

		// 3. Current Date + Time
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Date & Time: " + now);

		// 4. Create a specific date
		LocalDate date = LocalDate.of(2024, 8, 12);
		System.out.println("Specific Date: " + date);

		// 5. Get Day, Month and Year
		System.out.println("Day: " + date.getDayOfMonth());
		System.out.println("Month: " + date.getMonth());
		System.out.println("Year: " + date.getYear());

		// 6. Add days
		System.out.println("After 10 days: " + date.plusDays(10));

		// Add months
		System.out.println("After 2 months: " + date.plusMonths(2));

		// Add years
		System.out.println("After 1 year: " + date.plusYears(1));

		// 7. Subtract days
		System.out.println("Before 10 days: " + date.minusDays(10));

		// 8. Check Leap Year
		System.out.println("Leap Year: " + date.isLeapYear());

		// 9. Find Day of Week
		System.out.println("Day of Week: " + date.getDayOfWeek());

		// 10. Find number of days in month
		System.out.println("Days in Month: " + date.lengthOfMonth());

		// 11. Compare two dates
		LocalDate date2 = LocalDate.of(2025, 8, 12);

		System.out.println("Is date before date2? " + date.isBefore(date2));

		System.out.println("Is date after date2? " + date.isAfter(date2));

		System.out.println("Are dates equal? " + date.isEqual(date2));

		// 12. String → LocalDate
		String dateString = "12/08/2024";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate convertedDate = LocalDate.parse(dateString, formatter);

		System.out.println("String to Date: " + convertedDate);

		// 13. LocalDate → String
		String formattedDate = date.format(formatter);

		System.out.println("Date to String: " + formattedDate);

		// 14. Difference between two dates
		LocalDate start = LocalDate.of(2024, 1, 1);

		LocalDate end = LocalDate.of(2024, 8, 1);

		long days = ChronoUnit.DAYS.between(start, end);

		System.out.println("Days Between: " + days);

		// 15. Period → Years, Months, Days
		Period period = Period.between(start, end);

		System.out.println("Years: " + period.getYears());

		System.out.println("Months: " + period.getMonths());

		System.out.println("Days: " + period.getDays());

		// 16. Duration → Time difference
		LocalTime startTime = LocalTime.of(10, 30);

		LocalTime endTime = LocalTime.of(12, 45);

		Duration duration = Duration.between(startTime, endTime);

		System.out.println("Time Difference in Minutes: " + duration.toMinutes());

		// 17. Calculate Age
		LocalDate dob = LocalDate.of(2000, 5, 15);

		int age = Period.between(dob, today).getYears();

		System.out.println("Age: " + age);

		// 18. Check Weekend
		DayOfWeek day = today.getDayOfWeek();

		if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {

			System.out.println("Today is Weekend");

		} else {

			System.out.println("Today is Weekday");
		}

		// 19. Time Zone
		ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

		System.out.println("India Time: " + indiaTime);

		// 20. Instant
		Instant instant = Instant.now();

		System.out.println("Current Instant: " + instant);
	}
}
