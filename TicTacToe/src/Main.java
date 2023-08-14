import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 1;
		String[][] arr = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
		printArr(arr);
		for(int i=0; i<9; i++) {
			userIndex(count, arr);
			printArr(arr);
			if(check(arr)) {
				break;
			}
			count++;
		}
		System.out.println("Match draw");
	
	}
	
	public static void printArr(String[][] arr) {
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + "" + "|");
			}
			System.out.println();
		}
		System.out.println("-------");
		System.out.println();
	}
	
	public static void userIndex(int count, String[][] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row");
		int r = scan.nextInt();
		System.out.println("Enter column");
		int c = scan.nextInt();
		
		if(r>=0 && r<=2 && c>=0 && c<=2) {
			if(arr[r][c] == "-") {
				if(count%2!=0) {
					arr[r][c] = "X";
				}
				else {
					arr[r][c] = "O";
				}
			}
			else {
				System.out.println("Already filled. Enter someother row and column");
				userIndex(count, arr);
			}
		}
		else {
			System.out.println("Invalid row and column");
			userIndex(count, arr);
		}	
	}
	
	public static boolean check(String[][] arr) {
		if((arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2]=="O") ||
				(arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2]=="O") ||
				(arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == ")") ||
				(arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0]=="O") ||
				(arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1]=="O") ||
				(arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O") ||
				(arr[0][0] ==  "O" && arr[1][1] == "O" && arr[2][2] == "O" ) || 
				(arr[0][2] ==  "O" && arr[1][1] =="O" && arr[2][0] == "O")) {
			System.out.println("O won!");
			return true;
		}
		else if((arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2]=="X") ||
				(arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2]=="X") ||
				(arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X") ||
				(arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0]=="X") ||
				(arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1]=="X") ||
				(arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X") ||
				(arr[0][0] ==  "X" && arr[1][1] == "X" && arr[2][2] == "X" ) || 
				(arr[0][2] ==  "X" && arr[1][1] =="X" && arr[2][0] == "X")) {
			System.out.println("X won");
			return true;
		}
		else {
			return false;
		}
	}

}
