package project1;

public class CurrentAccount extends BankAccount {
	private double odLimit;

	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		this.odLimit = 5000;
	}

	public CurrentAccount() {
		this.odLimit = 5000;
	}

	public double odLimit() {
		return odLimit;
	}

	@Override
	public void withdraw(double amount) {
		if ((this.getAccountBalance() + this.odLimit) >=amount){
			System.out.println("valid amount");
			
		} else if (amount <= 0) {
			System.out.println("Invalid Amount");
		}
		else if((this.getAccountBalance()-amount)<0)
		{
	      double odamount=amount-this.getAccountBalance();
	      this.accountBalance=0;
	      this.odLimit-=odamount;
		}
		else{
			this.accountBalance-=this.accountBalance;
		}
		}
	}

