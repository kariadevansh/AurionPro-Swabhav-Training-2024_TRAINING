package com.apro.creational.singleton.model;

public class Database {
	private static Database database= null;
	private static String url ="https:\\MongoDb\table\1";
	private static String userName = "admin";
	private static int passCode= 101;
	
	private Database(){
		System.out.println("Database created!");
	}
	
	public static Database initiateDatabase(String urlInput , String userNameInput, int passCodeInput) {
		System.out.println("initiation");
		if(urlInput == url && userNameInput ==userName && passCodeInput == passCode) {
			System.out.println("initating");
			database = new Database();
		}
		return database;
		
	}
	
	
	public void connect() {
		System.out.println("Connected to the database");
	}
}
