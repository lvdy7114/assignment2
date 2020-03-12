package com.meritamerica.assignment2;

import java.util.Arrays;


public class AccountHolder {
	
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	int checkingAccountNum = 0;
	int savingAccountNum=0;
	int cdAccountNum = 0;
	
	CheckingAccount checkingAccount[] = new CheckingAccount[50];
	SavingsAccount savingsAccount[] = new SavingsAccount[50];
	CDAccount cdAccount[] = new CDAccount[50];
	
	
	
	public AccountHolder() {
		
	}


	//Constructor with all parameters
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.ssn=ssn;
	
		}


	public String getFirstName() {
		return firstName;
	}
	
	public void setFristName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSocialSecurityNumber() {
		return ssn;
	}
	
	public void setSocialSecurityNumber(String ssn) {
		this.ssn = ssn;
	}
	
	// Creates new acct holder , then adds acct to checkingaccount array[i]
	public CheckingAccount addCheckingAccount(double openingBalance) {
		CheckingAccount acct = new CheckingAccount(openingBalance);
		checkingAccount[checkingAccountNum] = acct;
		checkingAccountNum++;
		return checkingAccount[checkingAccountNum -1];
	}
	
	
	//adds accts to checkingAccounts array
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccountX) {
		checkingAccount[checkingAccountNum] = checkingAccountX;
		checkingAccountNum++;
		return checkingAccount[checkingAccountNum -1];
		
	}
	public CheckingAccount[] getCheckingAccounts() {
		return this.checkingAccount;
		
	}
	public int  getNumberOfCheckingAccounts(){
		 return checkingAccount.length;
	 }
	public double getCheckingBalance() {
		double totalBalance=0;
		
		for(int i=0; i<checkingAccountNum; i++) {
			
			totalBalance += checkingAccount[i].getBalance();
		}
		
		return totalBalance;
	}
	//SavingsAccount addSavingsAccount(double openingBalance)
	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount savingAcct = new SavingsAccount(openingBalance);
		savingsAccount[savingAccountNum] = savingAcct;
		savingAccountNum++;
		return savingsAccount[savingAccountNum-1];
	}
	
	//SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)   ??????????
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccountX) {
		savingsAccount[savingAccountNum] = savingsAccountX;
		savingAccountNum++;
		return savingsAccount[savingAccountNum-1];
	}
	//SavingsAccount[] getSavingsAccounts()
	public SavingsAccount[] getSavingsAccounts() {
		return this.savingsAccount;
		
	}
	//int getNumberOfSavingsAccounts()
	public int getNumberOfSavingsAccounts() {
		return savingsAccount.length;
	}
	//double getSavingsBalance()
	public double getSavingsBalance() {
		double totalBalance=0;
		
		for(int i=0; i<savingAccountNum; i++) {
			
			totalBalance += savingsAccount[i].getBalance();
		}
		
		return totalBalance;
	}
	
	//CDAccount addCDAccount(CDOffering offering, double openingBalance)
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount cdAcct = new CDAccount(offering, openingBalance) ;
			cdAccount[cdAccountNum] = cdAcct;
			cdAccountNum++;
			return cdAccount[cdAccountNum-1];
		}
	//	CDAccount addCDAccount(CDAccount cdAccount)
	public CDAccount addCDAccount(CDAccount cdAccountX) {
		
		cdAccount[cdAccountNum]=cdAccountX;
		cdAccountNum++;
		return cdAccount[cdAccountNum-1];
	
	}
	//CDAccount[] getCDAccounts()
	public CDAccount[] getCDAccounts() {
		return this.cdAccount;
	}
	
	//int getNumberOfCDAccounts()
	public int getNumberOfCDAccounts() {
		return cdAccount.length;
	}
	//double getCDBalance()
	public double getCDBalance() {
		double totalBalance= 0;
		for(int i=0; i<cdAccountNum; i++) {
			totalBalance +=cdAccount[i].getBalance();
		}
		return totalBalance;
		
	}
	//double getCombinedBalance()
	
	public double getCombinedBalance() {
		return (getCheckingBalance() + getSavingsBalance() + getCDBalance());
	}

	
}