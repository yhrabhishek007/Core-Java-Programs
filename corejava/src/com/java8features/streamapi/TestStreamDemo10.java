package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;

// Employee class
class Employee {

    int sid;
    String name;
    double salary;

    // Constructor to initialize Employee objects
    public Employee(int sid, String name, double salary) {
        super();
        this.sid = sid;
        this.name = name;
        this.salary = salary;
    }

    // toString() is overridden to print Employee object details
    @Override
    public String toString() {
        return "Employee [sid=" + sid + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class TestStreamDemo10 {

    public static void main(String[] args) {

        // Creating a list of Employee objects
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Srikanth", 50000.00),
                new Employee(102, "Sudheer", 70000.00),
                new Employee(103, "Siddik", 80000.00)
        );

        // stream() creates a stream from the employees list
        //
        // filter() checks the salary of each employee
        // and selects only employees whose salary is greater than 50000.
        //
        // emp represents each Employee object in the stream.
        //
        // forEach() processes each filtered employee.
        // System.out::println is a method reference used
        // to print each Employee object.
        employees.stream()
                .filter(emp -> emp.salary > 50000.00)
                .forEach(System.out::println);
    }
}
