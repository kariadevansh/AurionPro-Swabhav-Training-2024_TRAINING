package com.apro.model;

import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 2 numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("number1 & number2 = " + (number1 & number2));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("number1 | number2 = " + (number1 | number2));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("number1 ^ number2 = " + (number1 ^ number2));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~number1 = " + ~number1);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // number1=number1&number2
        number1 &= number2;
        System.out.println("number1= " + number1);
        
        sc.close();

	}
}
