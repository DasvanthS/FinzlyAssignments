
public class Manager extends Employee{
	
	private String department;
	
	public Manager(String name, String department) {
		super(name);
		this.department = department;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Name : " + super.getName() + " Department : " + department + " id : " + super.getId());
	}


	@Override
	public String toString() {
		return "Name : " + super.getName() + " Department : " + department + " id : " + super.getId();
	}
	
	
	

}
