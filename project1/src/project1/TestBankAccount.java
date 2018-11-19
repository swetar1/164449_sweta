package project1;

import project1.BankAccount;
import project1.CurrentAccount;
import project1.SavingsBankAccount;

public class TestBankAccount {

	public static void TestBankAccountMethod() {
		BankAccount acc = new BankAccount();
		acc.setAccountHolderName("sachin");
	}

	public static void testSavingsBankAccount() {
		SavingsBankAccount savingsacc = new SavingsBankAccount("onkar", 5000);
		System.out.println("acc number is " + savingsacc.getAccountNo());
		System.out.println("acc balance is " + savingsacc.getAccountBalance());
		savingsacc.deposit(5000);
		System.out.println("acc balance is " + savingsacc.getAccountBalance());
		System.out.println("=================");
		savingsacc.withdraw(3000);
		System.out.println("acc balance is " + savingsacc.getAccountBalance());
	}

	public static void testCurrentAccount() {
		CurrentAccount currentacc = new CurrentAccount("omkar", 40000);
		System.out.println("acc number is " + currentacc.getAccountNo());
		System.out.println("acc balance is " + currentacc.getAccountBalance());
		currentacc.deposit(5000);
		System.out.println("acc balance is " + currentacc.getAccountBalance());
		System.out.println("=================");
		currentacc.withdraw(3000);
		System.out.println("acc balance is " + currentacc.getAccountBalance());
	}
	
	public static void TestBankAccountMethod()
	{
		
	}
	
public static void main()
	public static void main(String[] args){
		// testBankAccontMethod();
		testSavingsBankAccount();
		testCurrentAccount();
		
		public static void main("String[] args"){
			BankAccount acc=getBankAccount("Current");
			System.out.println("Account Name"+acc.getAccountHolderName());
			System.out.println("Account Balance"+acc.getAccountBalance());
			acc.withdraw(3000);
			System.out.println("Account Balance:"+acc.getAccountBalance());
			
		SavingAccountVer2 acc= new SavingAccountVer2();
		acc.withdraw(400);
		acc.deposit(4000);
		acc.isSalaryAccount()
		
		}
	}
}
