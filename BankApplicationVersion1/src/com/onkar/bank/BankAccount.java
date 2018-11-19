package com.onkar.bank; //collection of logical classes.

public class BankAccount 
 { 
	//static variable
	private static int autoAccountNo;
	
	
	//instance variable/class variable(we cannot access instance variable if objects are not created/existed.)
	private int AccountNo;
	private String accountHolderName;
	private double accountBalance;
	
	//int block
	{
	 AccountNo=++autoAccountNo;
	} 
	
	//static variable is not depending on object variable
	//static variable gets loaded the moment class gets loaded
	//common fundamental to an object
	

	public BankAccount()//default constructors:initializing instance variable./class variable
	{
		AccountNo=++autoAccountNo;
		accountHolderName="Unkown";
		accountBalance=0;
	}
	//parameterized constructor(information is designed before object
	public BankAccount(String accountHolderName,double accountBalance)//method 
	{
		//setter method-modify/re-initialize member variables.
     public void setAccountHolderName(String AccountholderName)
     {
      BankAccount acc=new BankAccount();
      BankAccount acc2=new BankAccount("onkar",5000);
		
		AccountNo=++autoAccountNo;
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	}
	
 }
	
public static int getAutoAccountNo() {
		return autoAccountNo;
	}
	public static void setAutoAccountNo(int autoAccountNo) {
		BankAccount.autoAccountNo = autoAccountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void withdraw(double amount)
	{
		this.accountBalance-=amount;
	}
	public void deposit(double amount)
	{
		this.accountBalance-=amount;
	}
public static void main (String args[])
{
	BankAccount acc=new BankAccount();
	BankAccount acc2=new BankAccount("Onkar",5000);
}
	

	
		

	

}
