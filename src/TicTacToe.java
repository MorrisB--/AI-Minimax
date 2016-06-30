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
				userPlays(board, 0, 0);
				break;
			case 1:
				userPlays(board, 0, 1);
				break;
			case 2:
				userPlays(board, 0, 2);
				break;
			case 3:
				userPlays(board, 1, 0);
				break;
			case 4:
				userPlays(board, 1, 1);
				break;
			case 5:
				userPlays(board, 1, 2);
				break;
			case 6:
				userPlays(board, 2, 0);
				break;
			case 7:
				userPlays(board, 2, 1);
				break;
			case 8:
				userPlays(board, 2, 2);
				break;
			}
			
			
		}
		keyboard.close();

	}

	public static boolean isAvailable(char[][] board, int row, int column) {
		if (board[row][column] == 0)
			return true;
		return false;
	}

	public static void userPlays(char[][] board, int row, int column) {
		if (isAvailable(board, row, column))
			board[row][column] = 'X';
	}
}
