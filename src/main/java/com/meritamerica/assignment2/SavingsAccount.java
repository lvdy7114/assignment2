package com.meritamerica.assignment2;

public class SavingsAccount {
	
		
	 double  balance;
	public  double interestRate= 0.01;
	private double  futureValue;
	private int month;
	long accountNumber;
	
	public SavingsAccount() {
		this.balance = 0;
		this.accountNumber= (long)(Math.random()*100);
	}
	
	public SavingsAccount(double balance) {
		this.balance = balance;
		this.accountNumber= (long)(Math.random()*100);
		
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//To deposit saving account, add the new amount to the previous balance
	//return boolean
	public boolean deposit(double amount)
	{
		if(amount>0) {
			this.balance=this.balance + amount;
			return true;
		}else {
			return false;
		}
	}
	
	//First check if there is sufficient balance. return boolean
	public boolean withdraw(double amount)
	{
		if(balance>=amount) {
			this.balance=this.balance - amount;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	public double getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//Calculate Future value
	public double futureValue(int month) {
	this.month=month;
	
		this.futureValue=this.balance * Math.pow((1+this.interestRate), month);
		return this.futureValue;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "\n Savings Account Balance:" + this.balance +
				"\n Savings Account Interest Rate: " + this.interestRate +
				"\n Savings Account Balance in" + " "+ (this.month/12) +" " + "years:" + this.futureValue;
				
	
	}


}