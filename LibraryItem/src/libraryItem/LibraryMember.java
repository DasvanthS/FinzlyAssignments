package libraryItem;

import java.util.*;

public abstract class LibraryMember implements Reservable{
	
	public static List<LibraryItem> reservation = new ArrayList<>();
	
	@Override
	public void reserveItem(LibraryItem item) {
		if(this.reservation.contains(item)) {
			System.out.println("Already reserved");
		}
		else {
			this.reservation.add(item);
			System.out.println("Item added");
		}
	}
	
	public void removeReserveItem(LibraryItem item) {
		if(this.reservation.contains(item)) {
			this.reservation.remove(item);
			System.out.println("Item removed");
		}
		else {
			System.out.println("Item not found");
		}
	}
	
	private int memberID;
	private String name;
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void borrowItem(LibraryItem item);


}



