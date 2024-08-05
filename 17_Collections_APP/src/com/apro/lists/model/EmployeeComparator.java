package com.apro.lists.model;

import java.util.Comparator;

public class EmployeeComparator {
	public static class EmployeeIdComparator implements Comparator<Employee>{



		@Override
		public int compare(Employee employee1, Employee employee2) {
			
			return employee1.employeeID-employee2.employeeID;
		}

	}

	public static class EmployeeSalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			return (int) (employee1.employeeSalary - employee2.employeeSalary);
		}
		

	}

	public static class StudentNameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getEmployeeName().compareToIgnoreCase(employee2.getEmployeeName()) ;
		}
		

	}

}
