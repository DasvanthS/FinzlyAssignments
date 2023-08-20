
public class Employee {
	
	private int id;
	private String name;
	private static int count = 0;
	
	public Employee(String name) {
		this.name = name;
		this.count++;
		this.id = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	
	

}
