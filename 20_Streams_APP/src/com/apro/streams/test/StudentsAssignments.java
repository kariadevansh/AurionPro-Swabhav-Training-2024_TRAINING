package com.apro.streams.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentsAssignments {

	public static void main(String[] args) {
		List<String> students = Arrays.asList("devansh","pranay","shivam","vinayak","nishank","elon","john","ema");
		
		System.out.println("First 3 students in ascending order :\n");
		students.stream()
		        .sorted()
		        .limit(3)
		        .forEach((student)->System.out.println(student+"\n"));
		
		System.out.println("First 3 students in ascending order if name contains 'a' :\n");
		students.stream()
		        .filter((student)->student.contains("a"))
		        .sorted()
		        .limit(3)
		        .forEach((student)->System.out.println(student+"\n"));
		
		System.out.println("students in descending order : \n");
		students.stream()
				.sorted(Comparator.reverseOrder())
		        .forEach((student)->System.out.println(student+"\n"));
		
		System.out.println("First 3 chars of students' names:\n");
		students.stream()
		        .sorted()
		        .forEach((student)->System.out.println(student.subSequence(0, 3)+"\n"));
		
		System.out.println("students' names which contain 4 or less chars:\n");
		students.stream()
		        .filter((student)->student.length()<=4)
		        .sorted()
		        .forEach((student)->System.out.println(student+"\n"));
		
	}

}
