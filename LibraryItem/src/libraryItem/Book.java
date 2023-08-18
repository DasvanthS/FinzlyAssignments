package libraryItem;

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
		System.out.println(this.toString());

	}
	
	@Override
	public String toString() {
		return "Book [" + super.getTitle()  + ","+ super.getItemID() + "," + author  + "] \n";
	}
	
}
