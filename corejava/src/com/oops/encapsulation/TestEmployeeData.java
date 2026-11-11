package com.oops.encapsulation;

public class TestEmployeeData {

	public static void main(String[] args) {
		System.out.println("Employee Information");
		EmployeeData emp = new EmployeeData();
		
		
		emp.setId(101);
		emp.setName("Sujesh");
		emp.setSalary(78000.00);
		
		System.out.println("Employee Id:"+emp.getId());
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Employee Salary:"+emp.getSalary());

	}

}
