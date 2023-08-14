import java.util.Scanner;

public class Main {

	static int hrr = 7;
	static int hcc = 0;

	public static void main(String[] args) {
		
		String[][] arr = {{" "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "},
		{" "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "},
		{" "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "},
		{" "," "," "," "," "," "," "," "},{"H"," "," "," "," "," "," "," "}};
		
		printArr(arr);
		
		boolean b = true;
		while(b) {
			userIndex(arr, hrr, hcc);
			printArr(arr);
			System.out.println("Press c to continue and q to quit");
			Scanner scan = new Scanner(System.in);
			String q = scan.nextLine();
			if(q.equals("q")) {
				System.out.println("Game ended");
				break;
			}
		}
	}
	
	public static void printArr(String[][] arr) {
		System.out.println();
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.print(arr[i][j] + "" + "|");
			}
			System.out.println();
		}
		System.out.println("-------");
		System.out.println();
	}
	
	public static void userIndex(String[][] arr, int hr, int hc) {
		
		possibleMoves(arr, hr, hc);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row");
		int r = scan.nextInt();
		System.out.println("Enter column");
		int c = scan.nextInt();
		
		
		
		if(r>=0 && r<=7 && c>=0 && c<=7) {
			if(check(arr, hr, hc, r, c)) {
				move(arr, hr, hc, r, c );
			}
			else {
				System.out.println("Knight can't move there");
				userIndex(arr, hr, hc);
			}

		}
		else {
			System.out.println("Invalid row and column");
			userIndex(arr, hr, hc);
		}	
	}
	
	public static void move(String[][] arr, int hr, int hc, int r, int c) {
		arr[hr][hc] = " ";
		arr[r][c] = "H";
		hrr = r;
		hcc = c;
	}
	
	public static boolean check(String[][] arr, int hr, int hc, int r, int c) {
		if(hr-r == -2 && hc-c==-1) {
			return true;
			
		}
		if(hr-r == -2 && hc-c==1) {
			return true;
			
		}
		if(hr-r == -1 && hc-c==-2) {
			return true;
			
		}
		if(hr-r == -1 && hc-c==2) {
			return true;
			
		}
		if(hr-r == 2 && hc-c==-1) {
			return true;
			
		}
		if(hr-r == 2 && hc-c==1) {
			return true;
			
		}
		if(hr-r == 1 && hc-c==-2) {
			return true;
			
		}
		if(hr-r == 1 && hc-c==2) {
			return true;
			
		}
		return false;
	}
	
	public static void possibleMoves(String[][] arr, int hr, int hc) {
		int count = 0;
		
		System.out.println("Possible moves : ");
		if(hr-2>=0 && hr-2<=7 && hc-1>=0 && hc-1<=7) {
			count++;
			System.out.println("Row : "+ (hr-2) + " Column : " + (hc-1));
		}
		if(hr-2>=0 && hr-2<=7 && hc+1>=0 && hc+1<=7) {
			count++;
			System.out.println("Row : "+ (hr-2) + " Column : " + (hc+1));
		}
		if(hr-1>=0 && hr-1<=7 && hc-2>=0 && hc-2<=7) {
			count++;
			System.out.println("Row : "+ (hr-1) + " Column : " + (hc-2));
		}
		if(hr-1>=0 && hr-1<=7 && hc+2>=0 && hc+2<=7) {
			count++;
			System.out.println("Row : "+ (hr-1) + " Column : " + (hc+2));
		}
		if(hr+2>=0 && hr+2<=7 && hc-1>=0 && hc-1<=7) {
			count++;
			System.out.println("Row : "+ (hr+2) + " Column : " + (hc-1));
		}
		if(hr+2>=0 && hr+2<=7 && hc+1>=0 && hc+1<=7) {
			count++;
			System.out.println("Row : "+ (hr+2) + " Column : " + (hc+1));
		}
		if(hr+1>=0 && hr+1<=7 && hc-2>=0 && hc-2<=7) {
			count++;
			System.out.println("Row : "+ (hr+1) + " Column : " + (hc-2));
		}
		if(hr+1>=0 && hr+1<=7 && hc+2>=0 && hc+2<=7) {
			count++;
			System.out.println("Row : "+ (hr+1) + " Column : " + (hc+2));
		}
		System.out.println("Total possible moves : "+count);
	}


}
