package hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
    private static Map<Integer, Patient> patients = new HashMap<>();
    private static int id=1;


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Show Patients");
            System.out.println("4. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            
            switch(choice) {
            case 1 : 
            	addPatient(scan);
            	break;
            case 2 :
            	SearchPatient(scan);
            	break;
            case 3 :
            	showPatients();
            	break;
            case 4 :
                System.exit(0);
            default :
            	System.out.println("Invalid choice");
            }

		}
	}
	
	public static void addPatient(Scanner scan) {
		System.out.println("Enter Name: ");
        String name = scan.nextLine();
        System.out.println("Enter Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Gender: ");
        String gender = scan.nextLine();

        Patient patient = new Patient(name, age, gender);
        patients.put(id, patient);
        id++;
	}
	
	public static void SearchPatient(Scanner scan) {
		System.out.println("Enter ID: ");
        int id = scan.nextInt();
        Patient patient = patients.get(id);
        if (patient != null) {
            System.out.println(patient);
        } else {
            System.out.println("Patient not found.");
        }
	}
	
	public static void showPatients() {
		for (int key : patients.keySet()) {
            System.out.println(key + " : " + patients.get(key));
        }
	}

}
