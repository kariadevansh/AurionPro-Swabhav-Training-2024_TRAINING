package com.apro.lamdas.test;

import com.apro.lamdas.model.Ifactorial;

public class IfactorialTest {
	public static void main(String[] args) {
		Ifactorial factor =(int number) ->{
			long fact =1;
			if(number<=0) {
				System.out.println("Invalid number");
				return 0;
			}
			for(int i = number;i>0;i--) {
				fact *=i;
			}
			return fact; 	
		};
		
		System.out.println(factor.factorial(5));
	}
}
