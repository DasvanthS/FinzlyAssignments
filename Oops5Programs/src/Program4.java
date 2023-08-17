//4. Method Overriding and Overloading: Build a reservation systems for hotel. 
//Create a class Room with properties like roomNumber, capacity, an pricePerNight. 
//Implement methods to check availability and make a reservation. Override the toString()
//method to provide a customized string representation of a room. Implement method 
//overloading for reservation methods to handle different scenarios, like reserving with 
//or without specific check-in/check-out dates.

import java.util.*;
import java.time.LocalDate;

public class Program4 {
		
	public static void main(String[] args) {
		
		List<Room> rooms = new ArrayList<>();
		
		for(int i=101; i<=110; i++) {
			rooms.add(new Room(i, 1000));
		}
		
		

		System.out.println(rooms);
		
	}

}

class Room{
	
	private int roomNo;
	private static int capacity;
	private int pricePerNight;
	private boolean available;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Room(int roomNo,int pricePerNight) {
		this.roomNo = roomNo;
		this.pricePerNight = pricePerNight;
		this.available = false;
		this.checkIn = null;
		this.checkOut = null;
	}
	
	public boolean isAvailable() {
		return !available;
	}
	
	public boolean isAvailable(LocalDate start, LocalDate end) {
		if(!available) {
			return true;
		}
		if(start.isAfter(checkOut) || end.isBefore(checkIn)) {
			return true;
		}
		return false;
	}
	
	public void reservation() {
		if(!available) {
			available = true;
			capacity++;
			System.out.println(roomNo + " is reserved successfully");
		}
		else {
			System.out.println(roomNo + " is already reserved");

		}
		
	}
	
	public void reservation(LocalDate start, LocalDate end) {
		if(!available && isAvailable(start, end)) {
			available = true;
			checkIn = start;
			checkOut = end;
			capacity++;
			System.out.println(roomNo + "is reserved successfully");
		}
		else {
			System.out.println(roomNo + "is already reserved");

		}
	}
	
	public static void getCapacity() {
		System.out.println("Capacity" + capacity);
	}
	
	public String toString() {
		return roomNo + " " + pricePerNight + " " + available + " " + checkIn + " " + checkOut + "\n";
	}
	
}
