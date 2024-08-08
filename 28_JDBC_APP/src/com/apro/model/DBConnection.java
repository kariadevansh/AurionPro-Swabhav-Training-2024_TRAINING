package com.apro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {
	private Connection connection = null;
	private Statement statement = null;
	private Scanner scanner = new Scanner(System.in);
	private PreparedStatement preparedStatement;

	public void ConnectToDB() {
		try {
			// 1. register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. create connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			System.out.println("Connection successful");

			// 3. create statement of connection
			statement = connection.createStatement();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getStudentdetails() {
		try {
			// run .executeQuery on statement to execute any query on the db
			ResultSet dbStudentData = statement.executeQuery("select* from students");
			while (dbStudentData.next()) {
				System.out.println(dbStudentData.getInt("roll_number") + "\t" + dbStudentData.getString("name") + "\t\t"
						+ dbStudentData.getDouble("percentage"));
			}
			// System.out.println("Printing data using column index");
			// while(dbStudentData.next()) {
			// System.out.println(dbStudentData.getInt(1)+"\t"+dbStudentData.getString(2)+"\t"
			// +dbStudentData.getDouble(3));
			// }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addStudent() {

		System.out.println("enter roll_number :");
		int rollNumber = scanner.nextInt();
		System.out.println("enter studnet name :");
		String name = scanner.next();
		System.out.println("enter percentage :");
		double percentage = scanner.nextDouble();
		try {
			statement
					.executeUpdate("insert into students values(" + rollNumber + ",'" + name + "'," + percentage + ")");
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addStudentUsingPreparedStatement() {

		System.out.println("enter roll_number :");
		int rollNumber = scanner.nextInt();
		System.out.println("enter studnet name :");
		String name = scanner.next();
		System.out.println("enter percentage :");
		double percentage = scanner.nextDouble();
		try {
			preparedStatement= connection.prepareStatement("insert into students values(?,?,?)");
			preparedStatement.setInt(1, rollNumber);
			preparedStatement.setString(2,name);
			preparedStatement.setDouble(3, percentage);
			preparedStatement.executeUpdate();
			System.out.println("Record added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateName() {
		// getStudentdetails();
		System.out.println("Enter the rollNumber :");
		int rollNumber = scanner.nextInt();
		System.out.println("enter the updated name :");
		String name = scanner.next();

		try {
			statement.executeUpdate("update students set name='" + name + "' where roll_number = " + rollNumber + "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateNameUsingPreparedStatement() {
		// getStudentdetails();
		System.out.println("Enter the rollNumber :");
		int rollNumber = scanner.nextInt();
		System.out.println("enter the updated name :");
		String name = scanner.next();

		try {
			preparedStatement = connection.prepareStatement("update students set name=? where roll_number = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, rollNumber);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updatePercentage() {
		// getStudentdetails();
		System.out.println("Enter the rollNumber :");
		int rollNumber = scanner.nextInt();
		System.out.println("enter the updated percentage :");
		double percentage = scanner.nextDouble();

		try {
			statement.executeUpdate(
					"update students set percentage='" + percentage + "' where roll_number = " + rollNumber + "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updatePercentageUsingPreparedStatement() {
		// getStudentdetails();
		System.out.println("Enter the rollNumber :");
		int rollNumber = scanner.nextInt();
		System.out.println("enter the updated percentage :");
		double percentage = scanner.nextDouble();

		try {
			preparedStatement = connection.prepareStatement("update students set percentage=? where roll_number = ?");
			preparedStatement.setDouble(1, percentage);
			preparedStatement.setInt(2, rollNumber);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteEntry() {
		System.out.println("Enter the rollnumber of the record to be deleted:");
		int rollNumber = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("delete from students where roll_number = ?");
			preparedStatement.setInt(1, rollNumber);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
