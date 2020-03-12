package com.meritamerica.assignment2;

public class CheckingAccount {
	
	private double  balance;
	public final double interestRate= 0.0001;   //0.01%
	private double  futureValue;
	private int year;
	long accountNumber;
	
	
	public CheckingAccount() {
		this.balance = 0;
		this.accountNumber = (long)((Math.random()*100));
	}
	//auto generates
	public CheckingAccount(double balance) {
		this.balance = balance;
		this.accountNumber = (long)((Math.random()*100));
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public double getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}
	//deposit(to set an amount to checking Account) 
	//if amount>0 then add to the previous balance and return boolean
	public boolean deposit(double amount)
	{
		if(amount>0) {
			this.balance= this.balance + amount;
			return true;
		}else {
			return false;
		}
		
		
	}
	
	//first check there is suffiecient amount before withdraw,
	//return boolean
	public boolean withdraw(double amount)
	{
		if(balance>=amount) {
			this.balance=this.balance - amount;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		interestRate = interestRate;
	}
	
	//Calculate future value
	public double futureValue(int year) {
		this.year=year;
		this.futureValue= this.balance * Math.pow((1+ this.interestRate),year);
		return this.futureValue;
	}
	
	//long getAccountNumber()
	public long getAccountNumber() {
		return  this.accountNumber;
	}
	
	@Override
	public String toString() {
		return "Checking Account Balance: " + this.balance +
				"\n Checking Account Interest Rate" + interestRate +
				"\n Checking Account Balance in " + this.year + " "+  "years: " + this.futureValue
				;
	}
	


}