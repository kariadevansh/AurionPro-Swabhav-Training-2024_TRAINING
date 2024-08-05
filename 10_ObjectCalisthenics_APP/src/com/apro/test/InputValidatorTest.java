package com.apro.test;

import java.util.Scanner;

import com.apro.model.InputValidator;

public class InputValidatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InputValidator validator = new InputValidator();
		
		System.out.println("Enter User Name:");
		String userName = scanner.next();
		

		System.out.println("Enter Password:");
		String password = scanner.next();

		

		System.out.println("Enter Mail Id:");
		String mailId = scanner.next();
		
//		input1 = InputValidator(userName,password,mailId);
		checkUserName(userName,validator);
		validator.validatePassword(password);
		validator.validateMailId(mailId);

	}
	
	private static void checkUserName(String userName,InputValidator validator) {
		if(validator.validateUserName(userName))
			System.out.println("It is valid");
	
	}

}
