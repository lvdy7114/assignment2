package com.meritamerica.assignment2;


public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
	
		
		CheckingAccount check1 = new CheckingAccount();
		check1.deposit(500);
		
		SavingsAccount savings = new SavingsAccount();
		savings.deposit(1000);
		
		
		//Depositing and having an opening balance
		CheckingAccount check2 = new CheckingAccount(500);
		check2.deposit(500);
		
		AccountHolder ah1 = new AccountHolder("Abc","def", "ghi", "123456");
		System.out.println(ah1);
		
		ah1.addCheckingAccount(check1);
		ah1.addCheckingAccount(check2);
		ah1.addCheckingAccount(1000);
		
		ah1.getCheckingBalance();
		System.out.println(ah1.getCheckingBalance());
		
		
	}
}