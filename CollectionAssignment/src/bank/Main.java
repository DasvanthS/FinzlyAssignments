package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
    private static List<Bank> accounts = new ArrayList<>();



	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
		
            System.out.println("1. Create Account");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            
            switch(choice) {
            case 1:
            	addCustomer(scan);
            	break;
            case 2:
            	deposit(scan);
            	break;
            case 3:
            	withdraw(scan);
            	break;
            case 4:
            	checkBalance(scan);
            	break;
            case 5:
            	showAll();
            	break;
            case 6:
            	System.exit(0);
            default:
            	System.out.println("Invalid choice");
            	
            }
		}
	}
	
	public static void addCustomer(Scanner scan) {
		System.out.println("Enter Name: ");
        String name = scan.nextLine();
        Bank account = new Bank(name);
        accounts.add(account);
	}
	
	public static void deposit(Scanner scan) {
		System.out.println("Enter Account Number: ");
        long accNo = scan.nextLong();
        System.out.println("Enter Amount:");
        double amount = scan.nextDouble();
        scan.nextLine();

        for (Bank account : accounts) {
            if (account.getAccNo() == accNo) {
                account.deposit(amount);
            }
        }
	}
	
	public static void withdraw(Scanner scan) {
		System.out.println("Enter Account Number: ");
        long accNo = scan.nextLong();
        System.out.print("Enter Amount:");
        double amount = scan.nextDouble();
        scan.nextLine();
        for (Bank account : accounts) {
            if (account.getAccNo() == accNo) {
                account.withdraw(amount);
            }
        }
	}
	
	public static void showAll() {
		for (Bank account : accounts) {
            System.out.println(account);
        }
	}
	
	public static void checkBalance(Scanner scan) {
		System.out.print("Enter Account Number: ");
        long accNo = scan.nextInt();
        for (Bank account : accounts) {
            if (account.getAccNo() == accNo) {
                System.out.println("Account Balance:" + account.getBalance());
            }
        }	
	}

}
