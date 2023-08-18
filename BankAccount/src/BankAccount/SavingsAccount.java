package BankAccount;

class SavingsAccount extends BankAccount{

	private double interestRate;
	
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super.accountNumber = accountNumber;
		super.accountHolderName = accountHolderName;
		super.balance = balance;
		this.interestRate = interestRate;
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

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
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
		if(amount>0 && amount<=balance) {
			this.balance -= amount;
			System.out.println("Amount withdrawn");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
}
