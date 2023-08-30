package bank;

public class Bank {

	private static long nextAccNo = 101;
	private long accNo;
	private String name;
	private double balance;
	
	public Bank(String name) {
		this.accNo = nextAccNo++;
		this.name = name;
		this.balance = 0;
	}
	
	
	public long getAccNo() {
		return this.accNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
            balance += amount;
        } 
		else {
            System.out.println("Invalid amount.");
        }
	}
	
	public void withdraw(double amount) {
		 if (amount > 0 && amount <= balance) {
	            balance -= amount;
	     }
		 else {
	            System.out.println("Invalid amount or insufficient balance.");
	     }
	}


	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

	
	
	
	

}
