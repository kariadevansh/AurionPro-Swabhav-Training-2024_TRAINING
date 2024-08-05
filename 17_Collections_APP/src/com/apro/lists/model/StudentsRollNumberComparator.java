package com.apro.lists.model;

import java.util.Comparator;

public class StudentsRollNumberComparator implements Comparator<Student>{



	@Override
	public int compare(Student student1, Student student2) {
		
		return student1.getRollNumber()-student2.getRollNumber();
	}

}
