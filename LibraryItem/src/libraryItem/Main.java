package libraryItem;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book("T1", 1, "A");
		System.out.println(book.getTitle());
		book.displayInfo();
		
		DVD dvd = new DVD("T2", 2, 30.0);
		System.out.println(dvd.getItemID());
		dvd.displayInfo();
		
		StudentMember sm = new StudentMember();
		sm.borrowItem();
		
		FacultyMember fm = new FacultyMember();
		fm.borrowItem();

	}

}
