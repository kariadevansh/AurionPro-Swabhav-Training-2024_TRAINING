package com.apro.ExceptionHandling.test;

public class Division {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NumberFormatException{
		try {
			int number1= Integer.parseInt(args[0]);
			int number2= Integer.parseInt(args[1]);
			
			double result = (double)number1/number2;
			System.out.println("Division result is: "+result);
		}catch(ArithmeticException exception) {
			System.out.println("Invalid output");
		}catch(Exception exception){
			System.out.println("Exception occured");
		}finally {
			System.out.println("Inside Finally");
		}
		
		System.out.println("Bye bye");
	}
}
