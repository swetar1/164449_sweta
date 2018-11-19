package com.onkar.bank;


public class Savingsbank extends BankAccount
{
	public SavingAccount(String AccountHolderName,double amount)
	{
	super();
	}
	this.isSalaryAccount=true;
	}
	public SavingAccount()
	{
		this.isSalaryAccount=true;
	}
public SavingAccount(String AccountHoldername,double accountBalance,Boolean isSalaryAccount){
super(accountHolderName,accountBalance);
this.isSalaryAccount=isSalaryAccount;
}
}

