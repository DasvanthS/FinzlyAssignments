

public class Developer extends Employee{
	
	private String programmingLanguage;
	
	public Developer(String name, String programmingLanguage) {
		super(name);
		this.programmingLanguage = programmingLanguage;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public void displayDetails() {
		System.out.println("Name : " + super.getName() + " ProgrammingLanguage : " + programmingLanguage + " id : " + super.getId());
	}

	@Override
	public String toString() {
		return "Name : " + super.getName() + " ProgrammingLanguage : " + programmingLanguage + " id : " + super.getId();
	}
	
	
	
	

}

