package com.apro.srp.solutions.test;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.apro.srp.solutions.model.CalculateSimpleInterest;
import com.apro.srp.solutions.model.FestivalType;
import com.apro.srp.solutions.model.FixedDeposit;
// Create and move this in OCP packages along with all codes
//TODO: solve the error Exception in thread "main" java.lang.NullPointerException
//at com.apro.srp.solutions.model.GetInterstRate.getInterestRate(GetInterstRate.java:13)
//at com.apro.srp.solutions.model.CalculateSimpleInterest.calculateSimpleInterest(CalculateSimpleInterest.java:14)
//at com.apro.srp.solutions.test.FixedDepositTest.main(FixedDepositTest.java:18)

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101,"devansh",10000,3,"HOLI");
		
		System.out.println(fd.getName()+"  "+ fd.getFestival());
//		System.out.println("The rate of interest is: ");
		CalculateSimpleInterest interest = new CalculateSimpleInterest(fd);
//		
		System.out.println("\nThe interest generated is : "+interest.calculateSimpleInterest());
	}

}
