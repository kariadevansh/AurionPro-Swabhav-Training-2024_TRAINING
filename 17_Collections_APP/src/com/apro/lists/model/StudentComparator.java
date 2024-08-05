package com.apro.lists.model;

import java.util.Comparator;

public class StudentComparator {
	public static class StudentsRollNumberComparator implements Comparator<Student>{



		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getRollNumber()-student2.getRollNumber();
		}

	}

	public static class StudentPercentageComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			return (int) (student1.getPercentage() - student2.getPercentage());
		}
		

	}

	public static class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			return student1.getName().compareToIgnoreCase(student2.getName()) ;
		}
		

	}
	
}
