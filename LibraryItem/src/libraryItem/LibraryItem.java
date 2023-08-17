package libraryItem;

public class LibraryItem {
	
	private String title;
	private int itemID;
	
	public LibraryItem(String title, int itemID) {
		this.title = title;
		this.itemID = itemID;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public void displayInfo() {
		System.out.println("This is LibraryItem");
	}

}

class Book extends LibraryItem{
	
	private String author;
	
	public Book(String title, int itemID, String author) {
		super(title, itemID);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void displayInfo() {
		System.out.println("This is Book");

	}
	
}

class DVD extends LibraryItem{
	
	private double duration;
	
	public DVD(String title, int itemID, double duration) {
		super(title, itemID);
		this.duration = duration;
	}
	
	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public void displayInfo() {
		System.out.println("This is DVD");

	}
	
}
