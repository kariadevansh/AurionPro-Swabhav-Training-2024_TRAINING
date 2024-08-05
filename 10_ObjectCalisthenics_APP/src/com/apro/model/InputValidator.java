package com.apro.model;

public class InputValidator {
	private String userName;
	private String password;
	private String mailId;
	public InputValidator(){
		userName = " ";
		password = " ";
		mailId = " ";
	}
	public InputValidator(String name, String password, String mail){
		this.userName = name;
		this.password = password;
		this.mailId = mail;
	}
	public boolean validateUserName(String userName) {
		return vaildateInput(userName,3,20);
	}
	
	public boolean validatePassword(String password) {
		return vaildateInput(password,8,30);
	}
	
	public void validateMailId(String mailId) {
		vaildateInput(mailId,5,50);

		if(mailId.contains("@") && mailId.contains(".")) {
			System.out.println("Mail Id is valid");
			return;
		}
		System.out.println("Mail Id is not valid");
	}
	
	public boolean vaildateInput(String str,int min, int max) {
		if(str.isEmpty()|| str == null) {
			System.out.println("It cant be empty or null");
			return false;
		}
		if(str.length() <min && str.length()>max) {
			System.out.println(" length must be between "+min+" and "+max);
			return false;
		}
		return true;
	}
}
