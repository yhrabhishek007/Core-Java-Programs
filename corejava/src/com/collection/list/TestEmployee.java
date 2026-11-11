package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Rakesh", 65000, 23);
		Employee emp2 = new Employee(102, "Bhanu", 70000, 23);
		Employee emp3 = new Employee(103, "Bhargav", 80000, 23);
		Employee emp4 = new Employee(104, "Vamsi", 90000, 23);
		Employee emp5 = new Employee(105, "Sudheer", 100000, 23);

		List<Employee> empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

}
