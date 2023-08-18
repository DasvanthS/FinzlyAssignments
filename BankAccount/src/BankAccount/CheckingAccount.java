package BankAccount;

class CheckingAccount extends BankAccount{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private double overdraftLimit;
	
	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public String getAccountHolderName() {
		return this.accountHolderName;
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
		if(amount>0 && amount<=balance) {
			this.balance -= amount;
			System.out.println("Amount withdrawn");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
}

