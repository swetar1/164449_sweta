package com.onkar.bank;

public class CurrentAccount extends BankAccount
{
  private double odLimit;
  public CurrentAccount (String accountHolderName, double accountBalance)
  {
	  super(accountHolderName,accountBalance);
  }
}
