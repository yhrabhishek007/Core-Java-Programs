package com.conditionalstatements;

import java.util.Scanner;

public class NaukriNested {
//	Field	Sample Values
//	Experience	0 years, 1-3 years, 4-7 years, 8+ years
//	Current CTC	0 LPA, 3 LPA, 8 LPA, 15 LPA
//	Expected CTC	Less than current, Equal, 20% hike, 50% hike
//	Notice Period	Immediate, 15 Days, 30 Days, 60 Days, 90 Days
//	Employment Status	Employed, Unemployed, Serving Notice
//	Job Type	Full-time, Contract, Internship
//	Education	B.Tech, M.Tech, MCA, MBA
//	Profile Type	Fresher, Experienced
//	Location	Hyderabad, Bangalore, Pune, Chennai
//	Work Mode	Remote, Hybrid, Onsite
//	Skills Match	Low (<50%), Medium (50-80%), High (>80%)
//	Resume Uploaded	Yes, No
//	Profile Completion	<50%, 50-90%, 100%	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Profile Type (Fresher/Experienced):");
		String profileType = sc.nextLine();

		System.out.println("Enter Education (B.Tech/M.Tech/MCA/MBA):");
		String education = sc.nextLine();

		System.out.println("Resume Uploaded (Yes/No):");
		String resume = sc.nextLine();

		System.out.println("Enter Skills Match (Low/Medium/High):");
		String skills = sc.nextLine();

		System.out.println("Enter Work Mode (Remote/Hybrid/Onsite):");
		String workMode = sc.nextLine();

		if (profileType.equalsIgnoreCase("Fresher")) {

			if (education.equalsIgnoreCase("B.Tech")) {

				if (resume.equalsIgnoreCase("Yes")) {

					if (skills.equalsIgnoreCase("High")) {

						if (workMode.equalsIgnoreCase("Remote")) {
							System.out.println("Eligible for Remote Jobs");
						} else {
							System.out.println("Eligible for Hybrid/Onsite Jobs");
						}

					} else {
						System.out.println("Improve Your Skills");
					}

				} else {
					System.out.println("Please Upload Resume");
				}

			} else {
				System.out.println("Education Not Matching");
			}

		} else {

			System.out.println("Enter Experience (0-3 years, 4-7 years, 8+ years):");
			String exp = sc.nextLine();

			if (exp.equalsIgnoreCase("4-7 years")) {

				if (resume.equalsIgnoreCase("Yes")) {

					if (skills.equalsIgnoreCase("High")) {
						System.out.println("Eligible for Mid-Level Jobs");
					} else {
						System.out.println("Need Better Skill Match");
					}

				} else {
					System.out.println("Please Upload Resume");
				}

			} else {
				System.out.println("Experience Criteria Not Met");
			}
		}

		sc.close();
	}
}
