package com.apro.lists.model;

import java.util.Comparator;

public class StudentPercentageComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return (int) (student1.getPercentage() - student2.getPercentage());
	}
	

}
