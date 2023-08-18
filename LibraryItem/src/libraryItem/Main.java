package libraryItem;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book("T1", 1, "Aaa");
		
		DVD dvd = new DVD("T2", 2, 30.0);
		
		StudentMember sm1 = new StudentMember(21,"Das");
		System.out.println(sm1.getName());
		sm1.borrowItem(dvd);
		System.out.println(sm1.getBorrowedItem());
		
		StudentMember sm2 = new StudentMember(22,"Dasvanth");
		sm2.borrowItem(dvd);
		
	}

}
