import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<Employee> employees = new ArrayList<>();


	public static void main(String[] args) {
		
		boolean b = true;
		
		while(b) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1 to add Manager \n"
					+ "Enter 2 to add new Developer");
			int e = scan.nextInt();
			scan.nextLine();
			
			if(e == 1) {
				System.out.println("Enter name");
				String n = scan.nextLine();
				System.out.println("Enter department");
				String d = scan.nextLine();
				employees.add(new Manager(n,d));

			}
			else if(e == 2) {
				System.out.println("Enter name");
				String n = scan.nextLine();
				System.out.println("Enter programming language");
				String p = scan.nextLine();
				employees.add(new Developer(n,p));

			}
			
			System.out.println("Enter c to add employee \n"
					+ "v to view particular employee \n"
					+ "d to display all employee \n"
					+ "q to quit");
			
			char c = scan.next().charAt(0);
			if(c == 'v') {
				viewEmployee();
			}
			else if(c == 'd') {
				displayEmployeess();
			}
			else if(c == 'q') {
				b = false;
			}
			
		}

	}
	
	public static void viewEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id");
		int i = scan.nextInt();
		System.out.println(employees.get(i-1));
	}
	
	public static void displayEmployeess() {
		System.out.println(employees);

	}

}
