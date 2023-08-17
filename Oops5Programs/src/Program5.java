//5. Static and Instance Members: Build a student management system Create a class 
//Student with instance variables like studentID, name, and static variable totalStudents
//to keep track of the number of students Implement methods to enroll and drop students, 
//updating the totalStudents count accordingly.

import java.util.*;

public class Program5 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "AAA");
		s1.enroll(s1);
		
		Student s2 = new Student(2, "BBB");
		s1.enroll(s2);
		
		Student s3 = new Student(3, "CCC");
		s1.enroll(s3);
		
		
		
		Student.printStudents();
		System.out.println(Student.countTotalStudents());
		
		

	}

}

class Student{
	private int studentID;
	private String name;
	private static int totalStudent;
	private static List<Student> students = new ArrayList<>();
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void enroll(Student stu) {
		students.add(stu);
		totalStudent++;
	}
	
	public void drop(Student stu) {
		students.remove(stu);
		totalStudent--;
	}
	
	public static void printStudents(){
		for(Student s : students) {
			System.out.println(s);
		}
	}
	
	public static int countTotalStudents() {
		return totalStudent;
	}
	
	public String toString() {
		return this.studentID + " " + this.name;
	}
	
}


