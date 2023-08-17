//2. Encapsulation and Access Control: You are designing a banking application. 
//Create a class BankAccount with private properties like accountNumber, balance, and 
//ownerName. Provide public methods for depositing, withdrawing, and getting the balance.
//Implement encapsulation by restricting direct access to the properties and using public
//methods to interact with them.

public class Program2 {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(12345, 10000, "AAA");
		ba.deposit(100);
		ba.withdraw(50.5);
		System.out.println(ba.getBalance());

	}

}

class BankAccount{
	private long accountNo;
	private double balance;
	private String ownerName;
	
	public BankAccount(long accountNo, double balance, String ownerName) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("Deposit success");
		}
		else {
			System.out.println("Deposit failed");

		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			this.balance -= amount;
			System.out.println("Withdraw success");
		}
		else {
			System.out.println("Withdraw failed");

		}
	}
}
