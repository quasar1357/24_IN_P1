import java.util.Scanner;

public class VierGewinnt {
	private static final int ROWS = 6;
	private static final int COLUMNS = 7;
	private static final char EMPTY = '.';
	private static final char PLAYER1 = 'X';
	private static final char PLAYER2 = 'O';

	private char[][] board = new char[ROWS][COLUMNS];
	private boolean gameWon = false;

	/*
	 * main (nichts anpassen)
	 */
	public static void main(String[] args) {
		VierGewinnt game = new VierGewinnt();
		game.play();
	}

	/*
	 * Initialisiere das Spielfeld (nichts anpassen)
	 */
	public VierGewinnt() {
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLUMNS; col++) {
				board[row][col] = EMPTY;
			}
		}
	}

	/*
	 * Spielsteuerung (nichts anpassen)
	 */
	public void play() {
		Scanner scanner = new Scanner(System.in);
		char currentPlayer = PLAYER1;
		int turn = 0;

		while (turn < ROWS * COLUMNS && !gameWon) {
			this.printBoard();
			System.out.println(
					"Spieler " + (currentPlayer == PLAYER1 ? "1 (X)" : "2 (O)") + ", wählen Sie eine Spalte (1-7): ");

			int col;
			do {
				col = scanner.nextInt() - 1;
			} while (!this.valid(col));

			this.makeMove(currentPlayer, col);

			if (this.checkWin(currentPlayer)) {
				this.gameWon = true;
				this.printBoard();
				System.out.println("Spieler " + (currentPlayer == PLAYER1 ? "1 (X)" : "2 (O)") + " hat gewonnen!");
				break;
			}
			currentPlayer = (currentPlayer == PLAYER1) ? PLAYER2 : PLAYER1;
			turn++;
		}
		if (!gameWon) {
			printBoard();
			System.out.println("Unentschieden! Das Spielfeld ist voll.");
		}
		scanner.close();
	}

	/*
	 * TODO 0:
	 */
	private boolean valid(int col) {
		return true;
	}

	/*
	 * TODO 1:
	 */
	private void makeMove(char player, int col) {

	}

	/*
	 * TODO 2:
	 */
	private boolean checkWin(char player) {
		return false;
	}

	/*
	 * TODO 3:
	 */
	private void printBoard() {

	}

}
