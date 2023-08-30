package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static List<Student> students = new ArrayList<>();
	private static List<Teacher> teachers = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            
            switch(choice) {
            case 1:
            	addStudent(scan);
            	break;
            case 2:
            	addTeacher(scan);
            	break;
            case 3:
            	showAllStudents();
            	break;
            case 4:
            	showAllTeachers();
            	break;
            case 5:
            	System.exit(0);
            case 6:
            	System.out.println("Invalid choice");
            }
		}

	

		
	}
	
	public static void addStudent(Scanner scan) {
		 System.out.print("Enter Student Name: ");
         String name = scan.nextLine();
         System.out.print("Enter Student Age: ");
         int age = scan.nextInt();
         scan.nextLine();
         Student student = new Student(name, age);
         students.add(student);
	}
	
	public static void addTeacher(Scanner scan) {
		System.out.print("Enter Teacher Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Teacher Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        Teacher teacher = new Teacher(name, age);
        teachers.add(teacher);
	}
	
	public static void showAllStudents() {
		for (Student student : students) {
            System.out.println(student);
        }
	}
	
	public static void showAllTeachers() {
		for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
	}
	
	

}
