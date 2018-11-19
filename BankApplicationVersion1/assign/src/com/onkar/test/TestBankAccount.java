package com.onkar.Test;

import com.onkar.bank.BankAccount;
import com.onkar.bank.CurrentAccount;
import com.onkar.bank.SavingsBankAccount;

public class TestBankAccount 
{
  public static void  testBankAccountMethod()
	  {
		  BankAccount acc =new BankAccount();
		  acc.setAccountHolderName("sachin");
	  }
   public static void  testSavingsBankAccount()
   {
	   SavingsBankAccount savingsacc = new SavingsBankAccount("onkar",5000);
	   System.out.println("acc number is "+savingsacc.getAccountNo());
	   System.out.println("acc balance is "+savingsacc.getAccountBalance());
	   savingsacc.deposit(5000);
	   System.out.println("acc balance is "+savingsacc.getAccountBalance());
	   System.out.println("=================");
	   savingsacc.withdraw(3000);
	   System.out.println("acc balance is "+savingsacc.getAccountBalance());
	   }
   public static void  testCurrentAccount()
   {
	   CurrentAccount currentacc = new CurrentAccount("omkar",5000);
	   System.out.println("acc number is "+currentacc.getAccountNo());
	   System.out.println("acc balance is "+currentacc.getAccountBalance());
	   currentacc.deposit(5000);
	   System.out.println("acc balance is "+currentacc.getAccountBalance());
	   System.out.println("=================");
	   currentacc.withdraw(3000);
	   System.out.println("acc balance is "+currentacc.getAccountBalance());
	   }
  public static void main(String[] args) 
  {
	//  testBankAccontMethod();
	testSavingsBankAccount();
	testCurrentAccount();
}
	   
   }

