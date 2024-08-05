package com.apro.ExceptionHandling.test;

import java.util.Scanner;

import com.apro.ExceptionHandling.model.AgeNotValidException;
import com.apro.ExceptionHandling.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		Voter voter1 = null;
		try {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Voter id:");
		int id = scanner.nextInt();
		
		System.out.println("Enter first name:");
		String firstName = scanner.next();
		
		System.out.println("Enter last name:");
		String lastName = scanner.next();
		
		System.out.println("Enter age:");
		int age = scanner.nextInt();
//		if(age<18) 
//			throw new AgeNotValidException();
		
		
		voter1 = new Voter(id,firstName,lastName,age);
		
		}catch(AgeNotValidException exception){
			System.out.println(exception.getMessage());
		}
		System.out.println(voter1);
	}

}
