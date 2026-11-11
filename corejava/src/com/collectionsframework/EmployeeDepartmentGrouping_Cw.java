package com.collectionsframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Core java 
//Write a Java program group employees based on their departments.
//
//Requirements 
//1. Use HashMap<String, ArrayList<String>>.
//2. Store the department name as the key.
//3. Store the employee names as an ArrayList value.
//4. If a department already exists, add the new employee to its existing list.
//5. Display the employees grouped department-wise.
//
//Example Input: 
//Department    Employee
//-----------------------
//IT            Ravi
//HR            Priya
//IT            Arun
//Sales         Kiran
//HR            Sneha
//IT            Anil
//
//Expected Output 
//IT    → [Ravi, Arun, Anil]
//HR    → [Priya, Sneha]
//Sales → [Kiran]
public class EmployeeDepartmentGrouping_Cw {

	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> employees = new HashMap<>();

		addEmployee(employees, "IT", "Ravi");
		addEmployee(employees, "HR", "Priya");
		addEmployee(employees, "IT", "Arun");
		addEmployee(employees, "Sales", "Kiran");
		addEmployee(employees, "HR", "Sneha");
		addEmployee(employees, "IT", "Anil");

		// Display employees department-wise
		for (Map.Entry<String, ArrayList<String>> entry : employees.entrySet()) {

			System.out.println(entry.getKey() + " → " + entry.getValue());

		}

	}

	private static void addEmployee(HashMap<String, ArrayList<String>> employees, String department, String employee) {

		if (employees.containsKey(department)) {
			// Department already exists

			employees.get(department).add(employee);
		}

		else {
			// Department does not exist
			ArrayList<String> employeeList = new ArrayList<>();

			employeeList.add(employee);

			employees.put(department, employeeList);
		}
	}
	
//	Approach 2 --> using computeIfAbsent()
//	If a department already exists, add the employee to its existing list. Otherwise, create a new list.
	
//	public static void main(String[] args) {
//
//        HashMap<String, ArrayList<String>> employees = new HashMap<>();
//
//        employees.computeIfAbsent("IT", k -> new ArrayList<>()).add("Ravi");
//        employees.computeIfAbsent("HR", k -> new ArrayList<>()).add("Priya");
//        employees.computeIfAbsent("IT", k -> new ArrayList<>()).add("Arun");
//        employees.computeIfAbsent("Sales", k -> new ArrayList<>()).add("Kiran");
//        employees.computeIfAbsent("HR", k -> new ArrayList<>()).add("Sneha");
//        employees.computeIfAbsent("IT", k -> new ArrayList<>()).add("Anil");
//
//        for (Map.Entry<String, ArrayList<String>> entry : employees.entrySet()) {
//            System.out.println(entry.getKey() + " → " + entry.getValue());
//        }
//    }

}
