package libraryItem;

import java.util.*;

class StudentMember extends LibraryMember{
	
	public StudentMember(int memberID, String name) {
		super.setMemberID(memberID);
		super.setName(name);
	}
	
	@Override
	public int getMemberID() {
		return super.getMemberID();
	}

	@Override
	public void setMemberID(int memberID) {
		super.setMemberID(memberID);;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);;
	}
	
	private List<LibraryItem> borrowedItem = new ArrayList<>();

	@Override
	void borrowItem(LibraryItem item) {
		if(super.reservation.contains(item)) {
			System.out.println("Item already reserved");
		}
		else {
			this.borrowedItem.add(item);
			super.reservation.add(item);
			System.out.println("Item borrowed");

		}
	}

	public List<LibraryItem> getBorrowedItem() {
		return borrowedItem;
	}

	@Override
	public String toString() {
		return "StudentMember [borrowedItem=" + borrowedItem + "]";
	}

	
	
	
	
	
	
	
	
}
