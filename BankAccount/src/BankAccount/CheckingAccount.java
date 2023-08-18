package BankAccount;

class CheckingAccount extends BankAccount{

	private double overdraftLimit;
	
	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super.accountNumber = accountNumber;
		super.accountHolderName = accountHolderName;
		super.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}

	public void setAccountNumber(String accountNumber) {
		super.accountNumber = accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		super.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		super.balance = balance;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String getAccountNumber() {
		return super.accountNumber;
	}

	@Override
	public double getBalance() {
		return super.balance;
	}

	@Override
	public String getAccountHolderName() {
		return super.accountHolderName;
	}

	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance += amount;
			System.out.println("Amount deposited");
		}
		else {
			System.out.println("Invalid amount");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount>this.overdraftLimit) {
			System.out.println("Daily limit reached, can't withdraw");
		}
		else {
			if(amount>0 && amount<=balance) {
				this.balance -= amount;
				System.out.println("Amount withdrawn");
			}
			else {
				System.out.println("Invalid amount");
			}
		}
		
	}
}

