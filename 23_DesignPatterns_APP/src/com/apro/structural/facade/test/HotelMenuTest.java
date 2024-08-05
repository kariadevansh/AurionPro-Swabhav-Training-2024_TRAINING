package com.apro.structural.facade.test;

import java.util.Scanner;

import com.apro.structural.facade.model.HotelReception;

public class HotelMenuTest {
	public static void main(String[] args) {
		HotelReception reception = new HotelReception();
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("which cuisine would u like?\n1.Indian\n2.Chinese\n3.Italian");
		int choice = scanner.nextInt();
		menuDriver(choice,reception);
		scanner.close();
	}
	
	private static void menuDriver(int choice,HotelReception reception) {
		switch(choice) {
		case 1:
			reception.getIndianMenu();
			break;
		case 2:
			reception.getChineseMenu();
			break;
		case 3:
			reception.getItalianMenu();
			break;
		default:
			System.out.println("select a valid option");
			break;
		}
	}
}
