package com.apro.srp.voilation.test;

import com.apro.srp.voilation.model.FestivalType;
import com.apro.srp.voilation.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101,"devansh",10000,3,FestivalType.valueOf("HOLI"));
		
		System.out.println("The rate of interest is: "+fd.getInterestRates());
		System.out.println("\nThe interest generated is : "+fd.calculateSimpleInterest());
	}

}
