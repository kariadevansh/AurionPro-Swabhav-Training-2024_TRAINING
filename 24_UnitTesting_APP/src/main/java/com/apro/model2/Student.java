package com.apro.model2;

public class Student {
	private IStudentService studentService;
	
	public Student(IStudentService studentService) {
		this.studentService = studentService;
	}

	public double calculatePercentage() {
		return (studentService.getMarks()/studentService.numberOfSubjects());
	}
}
