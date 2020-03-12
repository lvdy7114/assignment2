package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {
	double balance =0;
		java.util.Date date = new java.util.Date();
		CDOffering offering = new CDOffering(1,0.01);
	//Constructor
	public CDAccount(CDOffering offering, double openingBalance) {
		this.offering = offering;
		this.balance = openingBalance;
		
	}
	
	public double getBalance() {
		 double balance = 0;
		return balance;
	}
	public double getInterestRate() {
		double InterestRate=0.0;
		return InterestRate;
		
	}
	public int getTerm() {
	  int term = 1;
		return term;
	}
	public java.util.Date  getStartDate() {
		
		return date;
	}
	public long getAccountNumber( ) {
		long accountNumber = 0L;
		return accountNumber;
	}
	
	
	public double futureValue() {
		double futureValue = 0;
		return futureValue;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
