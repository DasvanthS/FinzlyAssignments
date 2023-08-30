package school;

public class Teacher extends Person{
	
	private static int nextTeacherId = 2001;
    private int teacherId;
	
	public Teacher(String name, int age) {
		super(name, age);
		this.teacherId = nextTeacherId++;
	}
	
	public int getId() {
		return teacherId;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
	}

	
	
	
	

}
