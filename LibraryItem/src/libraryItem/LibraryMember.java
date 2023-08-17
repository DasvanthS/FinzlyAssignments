package libraryItem;

public abstract class LibraryMember {
	
	private int memberID;
	private String name;
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	abstract void borrowItem();


}

class StudentMember extends LibraryMember{

	@Override
	void borrowItem() {
		System.out.println("This is StudentMember");
		
	}
	
}

class FacultyMember extends LibraryMember{

	@Override
	void borrowItem() {
		System.out.println("This is FacultyMember");
		
	}
	
}
