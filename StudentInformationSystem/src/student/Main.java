
package student;

import java.util.*;

public class Main {
	
	public static List<Student> students = new ArrayList<>();


	public static void main(String[] args) {
		
		
		boolean b = true;
		
		while(b) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 0 to add student without name & age \n"
					+ "Enter 1 to add student with name alone \n"
					+ "Enter 2 to add student with name and age");
			int e = scan.nextInt();
			scan.nextLine();
			if(e == 0) {
				students.add(new Student());

			}
			else if(e == 1) {
				System.out.println("Enter name");
				String n = scan.nextLine();
				students.add(new Student(n));

			}
			else if(e == 2) {
				System.out.println("Enter name");
				String n = scan.nextLine();
				System.out.println("Enter age");
				int a = scan.nextInt();
				students.add(new Student(n,a));

			}
			System.out.println("Enter c to add another student \n"
					+ "v to view particular student \n"
					+ "d to display all students \n"
					+ "q to quit");
			char c = scan.next().charAt(0);
			if(c == 'v') {
				viewStudent();
			}
			else if(c == 'd') {
				displayStudents();
			}
			else if(c == 'q') {
				b = false;
			}
			
		}
		
	}
	
	public static void viewStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id");
		int i = scan.nextInt();
		System.out.println(students.get(i-1));
	}
	
	public static void displayStudents() {
		System.out.println(students);

	}

}
