package student;

public class Student {
	
	private String name;
	private int age;
	private int studentid;
	private static int id = 0;
	
	public Student() {
		this.name = "Unknown";
		this.age = 0;
		this.id++;
		this.studentid = id;
	}
	
	public Student(String name) {
		this.name = name;
		this.id++;
		this.studentid = id;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.id++;
		this.studentid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentid() {
		return studentid;
	}
	
	public void displayDetails() {
		System.out.println("Name : " + name + " Age : " + age + " Studentid : " + studentid);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentid=" + studentid + "]";
	}
	
	

	
	
	

}
