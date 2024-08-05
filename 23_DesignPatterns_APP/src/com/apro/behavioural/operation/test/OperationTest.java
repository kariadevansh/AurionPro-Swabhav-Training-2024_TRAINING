package com.apro.behavioural.operation.test;

import java.util.Scanner;

import com.apro.behavioural.operation.model.AddOperation;
import com.apro.behavioural.operation.model.MultiplicationOperation;
import com.apro.behavioural.operation.model.OperationStrategy;

public class OperationTest {
	public static void main(String[] args) {
		OperationStrategy operation = new OperationStrategy(new AddOperation());
		Scanner scanner = new Scanner(System.in);
		System.out.println("give any two numbers:");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.println("Choose any Operation:\n1.Addition\n2.Multiplication");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition result : "+operation.doOperation(number1, number2));
			return;
		case 2:
			operation.setOperation(new MultiplicationOperation());
			System.out.println("Multiplication result : "+operation.doOperation(number1, number2));			
			return;
		default:
			break;
		}
	}
}
