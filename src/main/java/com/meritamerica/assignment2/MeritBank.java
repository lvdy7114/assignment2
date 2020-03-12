package com.meritamerica.assignment2;
//import com.meritamerica.assignment2.CheckingAccount;
import java.util.Arrays;
import java.util.Random;
import com.meritamerica.assignment2.AccountHolder;
public class MeritBank {
	
	static long nextAccountNumber= 0L;
	static double totalBalances =0;
	static 	double futureValue = 0.0d;
	//AccountHolder accountHolder = new AccountHolder();
	static CheckingAccount checkingAccount = new CheckingAccount();	
	static SavingsAccount savingAccount = new SavingsAccount();
	
	// addAccountHolder(AccountHolder accountHolder)
	public static void addAccountHolder(AccountHolder accountHolder) {
		accountHolder = accountHolder;
	}
	//static AccountHolder[] getAccountHolders()
	 public static AccountHolder[] getAccountHolders() {
		 AccountHolder[] accountHolders = new AccountHolder[0];
		 return accountHolders;
	 }
	//static CDOffering[] getCDOfferings()  , the rates are in %
	public static CDOffering[] getCDOfferings() {
		CDOffering cdOfferings[] = new CDOffering[10];
			//{0.018, 0.019, 0.02, 0.025,0.022};
		return cdOfferings;
	}
	//static CDOffering getBestCDOffering(double depositAmount)
	//public static CDOffering getBestCDOffering(double depositAmount) {
		
	/*	double currentBalance = (checkingAccount.getBalance() + savingAccount.getBalance() );
		if(currentBalance > 250000) {
			System.out.println("You can open new CD Account.");
			currentBalance += depositAmount;
		}
		else {
			System.out.println("Insufficient Balance to open new CD Account.");
		}
		*/
	//	return depositAmount ;
	//}
	//static CDOffering getSecondBestCDOffering(double depositAmount)
	/*public static CDOffering getSecondBestOffering(double depositAmount) {
		
	//	return depositAmount;
	}*/
	//static void clearCDOfferings()
	 static void clearCDOfferings() {
		 
	 }
	 
	 //static void setCDOfferings(CDOffering[] offerings)
	 public static void setCDOfferings(CDOffering[] offerings) {
		 
	 }
	//static long getNextAccountNumber()
	 public static long getNextAccountNumber() {
		 
		 return nextAccountNumber;
	 }
	//static double totalBalances()
	 public static double totalBalances() {
		 
		 return totalBalances;
	 }
	
	public static double futureValue(double presentValue, double interestRate, int term) {
	
		return futureValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
