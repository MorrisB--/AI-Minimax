import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		boolean playing = true;
		char[][] board = new char[3][3];

		while (playing) {

			System.out.print("Choose a location: ");
			int choice = keyboard.nextInt();

			switch (choice) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			}
		}
		keyboard.close();

	}
	
	public static boolean isAvailable(char[][] board, int row, int column){
		if (board[row][column] == 0)
			return true;
		return false;
	}
	

}
