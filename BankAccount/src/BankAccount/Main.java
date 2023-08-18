package BankAccount;

public class Main {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount("1111", "AAA", 100, 7.5);
		System.out.println(s.getAccountHolderName());
		s.deposit(1000);
		s.withdraw(50);
		System.out.println(s.getBalance());
		
		CheckingAccount c = new CheckingAccount("2222", "BBB", 1000, 8.5);
		System.out.println(c.getAccountHolderName());
		c.deposit(1000);
		c.withdraw(1);
		System.out.println(c.getBalance());
		
	}

}
