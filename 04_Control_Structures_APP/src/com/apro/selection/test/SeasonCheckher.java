package com.apro.selection.test;

import java.util.Scanner;

public class SeasonCheckher {
	public void Check(int month) {
		
		switch(month) {
		case  2:
		case  3:
		case  4:
		case  5:
			System.out.println("The Season in  Month "+month+" is Summer");
			break;	
		case  6:
		case  7:
		case  8:
		case  9:
			System.out.println("The Season in  Month "+month+" is Monsoon");
			break;	
		case  10:
		case  11:
		case  12:
		case  1:
			System.out.println("The Season in  Month "+month+" is Winter");
			break;	
		default:
			System.out.println("The Month no. "+month+" is not a valid");
			break;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Month(its number):");
		
		int month = sc.nextInt();
		SeasonCheckher ob1 = new SeasonCheckher();
		ob1.Check(month);
		sc.close();
	}
}
