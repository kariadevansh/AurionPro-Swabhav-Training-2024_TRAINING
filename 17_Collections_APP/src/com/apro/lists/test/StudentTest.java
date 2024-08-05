package com.apro.lists.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.apro.lists.model.Student;
import com.apro.lists.model.StudentComparator;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		readStudents(scanner,students);
		
		printStudents(students);
		
		
		Collections.sort(students, new StudentComparator.StudentsRollNumberComparator());
		System.out.println("\nstudents sorted according to roll number :");
		printStudents(students);
		
		
		Collections.sort(students, new StudentComparator.StudentPercentageComparator());
		System.out.println("\nstudents sorted according to percentage :");
		printStudents(students);
		
		Collections.sort(students, new StudentComparator.StudentNameComparator());
		System.out.println("\nstudents sorted according to name :");
		printStudents(students);
	}
	
	private static void readStudents(Scanner scanner,List<Student> students) {
		System.out.println("Enter the number of students:");
		int n = scanner.nextInt();
		while(n>0) {
			System.out.println("\nEnter the rollNumber : ");
			int rollNumber = scanner.nextInt();
			System.out.println("Enter the name : ");
			String name = scanner.next();
			System.out.println("Enter the percentage : ");
			double percentage = scanner.nextDouble();
			
			students.add(new Student(rollNumber,name,percentage));
			n--;		
		}		
	}
	 
	private static void printStudents(List<Student> students) {
		for(Student student:students) {
			System.out.println(student);
		}
	}

}
