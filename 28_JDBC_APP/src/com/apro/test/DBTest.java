package com.apro.test;

import java.util.Scanner;

import com.apro.model.DBConnection;

public class DBTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DBConnection db = new DBConnection();
		db.ConnectToDB();
		
		menuDriver(scanner,db);
	}
	
	public static void menuDriver(Scanner scanner,DBConnection db) {
		
		db.ConnectToDB();
		boolean flag = true;
		
		while(flag) {
			System.out.println("Select any option:\n1.get details\n2.add student\n3.add using prepared"
					+ "\n4.update name \n5.update name using prepared \n6.update percentage"
					+ "\n7.update percentage using prepared\n8delete a record \n9.EXIT");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				db.getStudentdetails();
				return;
			case 2:
				db.addStudent();
				db.getStudentdetails();
				return;
			case 3:
				db.addStudentUsingPreparedStatement();
				db.getStudentdetails();
				return;
			case 4:
				db.updateName();
				db.getStudentdetails();
				return;
			case 5:
				db.updateNameUsingPreparedStatement();
				db.getStudentdetails();
				return;
				
			case 6:
				db.updatePercentage();
				db.getStudentdetails();
				return;
			case 7:
				db.updatePercentageUsingPreparedStatement();;
				db.getStudentdetails();
				return;
			case 8:
				return;
			case 9:
				flag = false;
				break;
			default:
				System.out.println("select a valid option");
				return;
			}
		}
	}

}
