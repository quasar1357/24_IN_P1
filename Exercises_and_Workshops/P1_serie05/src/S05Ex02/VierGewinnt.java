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
		boolean inRange = 0 <= col && col < COLUMNS;
		if(!inRange) return false;
		boolean notFull = board[0][col] == EMPTY;
		return notFull;
	}

	/*
	 * TODO 1:
	 */
	private void makeMove(char player, int col) {
		for(int r = ROWS - 1; r>=0; r--){ // put in first empty row from below
			char[] currRow = board[r];
			if(currRow[col] == EMPTY){
				currRow[col] = player;
				break;
			}
		}
	}

	/*
	 * TODO 2:
	 */
	private boolean checkWin(char player) {
		// check horizontal
		for(int r = 0; r < ROWS; r++){
			for(int c = 0; c <= COLUMNS - 4; c++){
				boolean win = true;
				for(int i = 0; i < 4; i++){
					if(board[r][c+i] != player){
						win = false;
						break;
					}
				}
				if(win) return true;
			}
		}

		// check vertical
		for(int c = 0; c < COLUMNS; c++){
			for(int r = 0; r <= ROWS - 4; r++){
				boolean win = true;
				for(int i = 0; i < 4; i++){
					if(board[r+i][c] != player){
						win = false;
						break;
					}
				}
				if(win) return true;
			}
		}

		// check diagonal
		for(int r = 0; r <= ROWS - 4; r++){
			for(int c = 0; c <= COLUMNS - 4; c++){
				boolean win = true;
				for(int i = 0; i < 4; i++){
					if(board[r+i][c+i] != player){
						win = false;
						break;
					}
				}
				if(win) return true;
			}
		}

		for(int r = 0; r <= ROWS - 4; r++){
			for(int c = COLUMNS - 1; c >= 3; c--){
				boolean win = true;
				for(int i = 0; i < 4; i++){
					if(board[r+i][c-i] != player){
						win = false;
						break;
					}
				}
				if(win) return true;
			}
		}

		return false;
		
	}



	/*
	 * TODO 3:
	 */
	private void printBoard() {
		for(char[] r : board){
			for(char field : r){
				System.out.print(field + " ");
			}
			System.out.println();
		}
		for(int r=0; r<COLUMNS; r++){
			System.out.print("--");
		}
		System.out.println();
		for(int r=0; r<COLUMNS; r++){
			System.out.print((r+1) + " ");
		}
		System.out.println();
	}
}
