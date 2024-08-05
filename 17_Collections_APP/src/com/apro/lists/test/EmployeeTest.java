package com.apro.lists.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.apro.lists.model.Employee;
import com.apro.lists.model.EmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		readStudents(scanner, employees);

		printStudents(employees);

		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		System.out.println("\nemployees sorted according to employee id :");
		printStudents(employees);

		Collections.sort(employees, new EmployeeComparator.StudentNameComparator());
		System.out.println("\nemployees sorted according to name :");
		printStudents(employees);

		Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator().reversed());
		System.out.println("\nemployees  sorted according to salary :");
		printStudents(employees);

	}

	private static void readStudents(Scanner scanner, List<Employee> employees) {
		System.out.println("Enter the number of employees:");
		int n = scanner.nextInt();
		while (n > 0) {
			System.out.println("\nEnter the employee Id : ");
			int employeeID = scanner.nextInt();
			System.out.println("Enter the employee name : ");
			String employeeName = scanner.next();
			System.out.println("Enter the employee salary : ");
			int employeeSalary = scanner.nextInt();

			employees.add(new Employee(employeeID, employeeName, employeeSalary));
			n--;
		}
	}

	private static void printStudents(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
