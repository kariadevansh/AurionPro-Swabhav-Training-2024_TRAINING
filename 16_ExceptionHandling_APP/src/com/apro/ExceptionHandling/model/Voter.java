package com.apro.ExceptionHandling.model;

import com.apro.ExceptionHandling.model.AgeNotValidException;
public class Voter {
	private int voterID;
	private String firstName;
	private String lastName;
	private int age;
	
	public Voter(int voterID, String firstName, String lastName, int age)  {
		super();
		this.voterID = voterID;
		this.firstName = firstName;
		this.lastName = lastName;
		
		if(age<18) 
			throw new AgeNotValidException(age);
		this.age = age;
	}

	public int getVoterID() {
		return voterID;
	}

	public void setVoterID(int voterID) {
		this.voterID = voterID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		try {
			if(age<18)
				throw new AgeNotValidException(age);
			this.age = age;
		}catch(AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}
	}
	@Override
	public String toString() {
		return "Voter [voterID=" + voterID + ", firstName=" + firstName + ", LastName=" + lastName + ", age=" + age
				+ "]";
	}
	
}
