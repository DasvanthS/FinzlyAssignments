package employeeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee Details");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            
            switch(choice) {
            case 1 : 
            	addEmployee(scan);
            	break;
            case 2 :
            	showAllEmployees();
            	break;
            case 3 :
            	viewEmployee(scan);
            	break;
            case 4 :
                System.exit(0);
            default :
            	System.out.println("Invalid choice");
            }
		}
		
	}
	
	public static void addEmployee(Scanner scan) {
		System.out.print("Enter Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scan.nextDouble();
        scan.nextLine();
        Employee employee = new Employee(name, salary);
        employeeList.add(employee);
	}
	
	public static void showAllEmployees() {
		for (Employee employee : employeeList) {
            System.out.println(employee);
        }	
	}
	
	public static void viewEmployee(Scanner scan) {
		System.out.print("Enter Employee ID : ");
        int searchId = scan.nextInt();
        for (Employee employee : employeeList) {
            if (employee.getId() == searchId) {
                System.out.println("Employee found:\n" + employee);
                break;
            }
        }
        
	}

}
