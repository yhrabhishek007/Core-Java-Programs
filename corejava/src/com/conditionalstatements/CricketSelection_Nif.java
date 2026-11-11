package com.conditionalstatements;

import java.util.Scanner;

//Age
//Fitness Status
//Batting Average
//Bowling Average
//Experience
//Trial Performance
//State Team Played
//Medical Clearance
//Attendance in Practice
//Disciplinary Record
public class CricketSelection_Nif {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("=== Andhra Cricket Association Vijay Hazare Trophy Selection ===");

	        System.out.print("Enter Player Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Mobile Number: ");
	        long mobile = sc.nextLong();

	        System.out.print("Enter Role (Batsman/Bowler/Allrounder): ");
	        String role = sc.next();

	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();

	        if (age >= 19 && age <= 25) {

	            System.out.print("Fitness Status (Fit/Unfit): ");
	            String fitness = sc.next();

	            if (fitness.equalsIgnoreCase("Fit")) {

	                if (role.equalsIgnoreCase("Batsman")) {

	                    System.out.print("Enter Batting Average: ");
	                    float batAvg = sc.nextFloat();

	                    if (batAvg >= 40) {

	                        System.out.print("Domestic Cricket Experience (Years): ");
	                        int exp = sc.nextInt();

	                        if (exp >= 2) {

	                            System.out.print("Trial Performance (1-10): ");
	                            int trial = sc.nextInt();

	                            if (trial >= 8) {

	                                System.out.print("Played State Level? (Yes/No): ");
	                                String state = sc.next();

	                                if (state.equalsIgnoreCase("Yes")) {

	                                    System.out.print("Medical Clearance (Passed/Failed): ");
	                                    String medical = sc.next();

	                                    if (medical.equalsIgnoreCase("Passed")) {

	                                        System.out.print("Attendance Percentage: ");
	                                        double attendance = sc.nextDouble();

	                                        if (attendance >= 95) {

	                                            System.out.print("Disciplinary Record (Good/Bad): ");
	                                            String discipline = sc.next();

	                                            if (discipline.equalsIgnoreCase("Good")) {

	                                                System.out.println("\nCongratulations " + name);
	                                                System.out.println("Selected as BATSMAN");

	                                            } else {
	                                                System.out.println("Poor disciplinary record.");
	                                            }

	                                        } else {
	                                            System.out.println("Attendance criteria not met.");
	                                        }

	                                    } else {
	                                        System.out.println("Medical clearance failed.");
	                                    }

	                                } else {
	                                    System.out.println("State-level experience required.");
	                                }

	                            } else {
	                                System.out.println("Trial performance not satisfactory.");
	                            }

	                        } else {
	                            System.out.println("Minimum 2 years experience required.");
	                        }

	                    } else {
	                        System.out.println("Batting average below required criteria.");
	                    }

	                } else if (role.equalsIgnoreCase("Bowler")) {

	                    System.out.print("Enter Bowling Economy: ");
	                    float economy = sc.nextFloat();

	                    if (economy <= 7.5) {
	                        System.out.println("Bowling criteria satisfied.");
	                        System.out.println("Proceed for remaining rounds...");
	                    } else {
	                        System.out.println("Bowling economy too high.");
	                    }

	                } else if (role.equalsIgnoreCase("Allrounder")) {

	                    System.out.print("Enter Batting Average: ");
	                    float batAvg = sc.nextFloat();

	                    System.out.print("Enter Bowling Economy: ");
	                    float economy = sc.nextFloat();

	                    if (batAvg >= 35) {

	                        if (economy <= 7.5) {

	                            System.out.println("All-rounder criteria satisfied.");
	                            System.out.println("Proceed for remaining rounds...");

	                        } else {
	                            System.out.println("Bowling economy too high.");
	                        }

	                    } else {
	                        System.out.println("Batting average below criteria.");
	                    }

	                } else {
	                    System.out.println("Invalid role entered.");
	                }

	            } else {
	                System.out.println("Player is not fit for selection.");
	            }

	        } else {
	            System.out.println("Age criteria not satisfied.");
	        }

	        sc.close();
	    }
	}

//	public static void main(String[] args) {
//		System.out.println("Welcome to Andhra Cricket Association Vijay Hazare Trophy Squad selections");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Name:");
//		String name=sc.nextLine();
//		System.out.println("Enter Mobile Number:");
//		long mob=sc.nextLong();
//		System.out.println("Role:Batsmen/Bowler/Allrounder");
//		String role=sc.next();
//		System.out.println("Enter age:");
//		int age=sc.nextInt();
//		
//		if(age>=19 && age<=25) {
//			System.out.println("Age criteria is satisfied , you can go ahead");
//			System.out.println("Fitness Status:");
//			String fit=sc.next();
//			
//			if(fit.equalsIgnoreCase("Fit")) {
//				System.out.println("Player is fit to play");
//				System.out.println("Batting Average:");
//				float batavg=sc.nextFloat();
//				if(batavg>40 && batavg<=60){
//					System.out.println("Good Batting average ,proceed for further steps");
//					System.out.println("Bowling Economy:");
//					float boweco=sc.nextFloat();
//					if(boweco<=7.5 && boweco>=4) {
//						System.out.println("Good Bowling economy,proceed for further steps");
//						System.out.println("Experience in domestic cricket or State level:");
//						int exp=sc.nextInt();
//						if(exp>=2 && exp<=10) {
//							System.out.println("Better experience , move to further step");
//							System.out.println("Trial Performance:");
//							int trial=sc.nextInt();
//							if(trial<=10 && trial>=9){
//								System.out.println("Outstanding performance , proceed to further steps");
//								System.out.println("Played in State Level:");
//								String state=sc.next();
//								if(state.equalsIgnoreCase("Yes")) {
//									System.out.println("Great , proceed to next step");
//									System.out.println("Medical Clearance:");
//									String med=sc.next();
//									if(med.equalsIgnoreCase("Passed")) {
//										System.out.println("Medical Clearance Passed , proceed to next step");
//										System.out.println("Atendnace in Practice:");
//										double attd=sc.nextDouble();
//										if(attd>=95 && attd<=100) {
//											System.out.println("Good attendance maintained");
//											System.out.println("Disciplinary Record:");
//											String dis=sc.next();
//											if(dis.equalsIgnoreCase("Good")) {
//												System.out.println("Good Disciplinary Record maintianed");
//												System.out.println("Congratulations you are selected to Andhra Cricket State team");
//											}else {
//												System.out.println("Should Maintain good Disciplinary Record,criteria not matching");
//											}
//										}else {
//											System.out.println("Attendance not matching, criteria not satisfied ");
//										}
//		
//									}else {
//										System.out.println("Medical clearance not passed , better luck next time");
//									}
//								}else {
//									System.out.println("Not matching state team criteria , beter luck next time");
//								}
//							}else {
//								System.out.println("Trial Performance not matching the criteria,better luck next time");
//							}
//							
//						}else {
//							System.out.println("Experience not matching , criteria not satisfying");
//						}
//					}else {
//						System.out.println("Bowling economy Not mathing to the criteria , better luck next time");
//					}
//					
//				}else {
//					System.out.println("Batting average not matching to the criteria ,better luck next time");
//				}
//			}else {
//				System.out.println("Player is not fit for the selections");
//			}
//			
//		}else {
//			System.out.println("Not matching age criteria , you are under aged or over aged");
//			
//		}
//
//		
//	}
//
//}
