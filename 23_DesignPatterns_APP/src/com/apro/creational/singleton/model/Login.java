package com.apro.creational.singleton.model;

public class Login {
	private static Login login;
	private Login(){
		System.out.println("Login created!");
	}
	
	public static Login getLogin() {
		if(login == null)
			login = new Login();
		return login ;
	}
	
	public void status() {
		System.out.println("Login successful!");
	}
}
