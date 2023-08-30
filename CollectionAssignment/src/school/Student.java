package school;

public class Student extends Person{
	
	private static int nextStudentId = 1001;
    private int studentId;
	
	public Student(String name, int age) {
		super(name, age);
        this.studentId = nextStudentId++;
	}
	
	public int getId() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
	}

	
	
	

}
