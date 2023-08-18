package BankAccount;

public abstract class BankAccount {
	
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	
	public abstract String getAccountNumber();

	public abstract double getBalance();
	
	public abstract String getAccountHolderName();
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	

}


