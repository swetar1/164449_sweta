package bank;

import com.onkar.bank.BankAccount;

public class Bank1 
{
	public static void Bank1Method()
	{
	BankAccount acc=new BankAccount();
	acc.setAccountHolderName("Sweta");
	}
public static void Saving_acc ()
{
	Saving_acc savingAcc = new Saving_acc("Sweta",5000);
	System.out.println("Account No is"+savingAcc.getAccountNo());
	System.out.println("Account Balance is"+savingAcc.getAccountBalance());
	savingAcc.deposit(5000);
	System.out.println("Account Balance "+savingAcc.getAccountBalance());
	System.out.println("=====================");
	savingAcc.withdraw(3000);
	System.out.println("Account Balance "+savingAcc.getAccountBalance());
	}

public static void Current_acc extends Bank1()
{
	Current_acc currentAcc = new Current_acc();
	System.out.println("Account No is"+currentAcc.getAccountNo());
	System.out.println("Account Balance is"+currentAcc.getAccountBalance());
	currentAcc.deposit(5000);
	System.out.println("Account Balance "+currentAcc.getAccountBalance());
	System.out.println("=====================");
	currentAcc.withdraw(3000);
	System.out.println("Account Balance "+currentAcc.getAccountBalance());
		
}
public static void testSavingAccount(){
	public static void testCurrentAccount(){
		public static BankAccount get BankAccount(String accountType){
			BankAccount acc=null;
			if(accountType.equals("Saving")) {
				acc=new SavingAccount("Onkar",4000);
			}
			else if(account.Type.equals("Current")){
				acc=new CurrentAccount("Rahul",7000);
			}
			else{
				acc=null;
			}
		}
		return acc;
	}
	public static void main("String[] args"){
		BankAccount acc=getBankAccount("Current");
		System.out.println("Account Name"+acc.getAccountHolderName());
		System.out.println("Account Balance"+acc.getAccountBalance());
		acc.withdraw(3000);
		System.out.println("Account Balance:"+acc.getAccountBalance());
		
		//testSavingAccount();
		//testCurrentAccount();
	}
