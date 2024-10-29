package S04Ex06;

import java.util.ArrayList;
import java.util.Scanner;

public class PigGame {

    private final int SIDES = 6;
    private final int WINNING_SCORE = 100;
    private final int COMPUTER_THRESH = 20;
    private PairOfDice dicePair;
    private int playerScore;
    private int computerScore;
    private boolean playerTurn;
    private Scanner scan;

    public PigGame() {
        this.dicePair = new PairOfDice(SIDES);
        this.playerScore = 0;
        this.computerScore = 0;
        this.playerTurn = true;
        this.scan = new Scanner(System.in);
    }

    public static void main(String[] args) {
        PigGame game = new PigGame();
        game.play();
    }

    public void play() {
        do {
            if (playerTurn) playerTurn();
            else computerTurn();
            System.out.println("\nSCORE: Player " + playerScore + " | Computer " + computerScore + "\n");
        } while (playerScore < WINNING_SCORE && computerScore < WINNING_SCORE);
        System.out.println("===== GAME OVER =====");
        if (playerScore >= WINNING_SCORE) System.out.println("Player wins!");
        else System.out.println("Computer wins!");
    }

    public void playerTurn() {
        System.out.println("Player's turn. Ready? (press enter)");
        this.scan.nextLine();
        int turnScore = 0;
        int points;
        ArrayList<Integer> roll;
        // boolean continueTurn = true;
        do {
            points = this.dicePair.roll();
            roll = this.dicePair.getRolls();
            turnScore += points;
            System.out.println("Player rolled: " + roll +
                               " | turn score: " + (roll.contains(1) ? 0 : (turnScore)));
        } while (!roll.contains(1) && checkContinue());
        if(points==2){
            this.playerScore = 0;
            System.out.println("Perfect FAIL! Score: " + this.playerScore);
        } else if(roll.contains(1)) {
            turnScore = 0;
            System.out.println("You've rolled a 1... total score: " + this.playerScore);
        } else {
            playerScore += turnScore;
            System.out.println("Sweet! Your new score: " + this.playerScore);
        }
        this.playerTurn = false;
    }

    public void computerTurn() {
        System.out.println("Computer's turn. Ready? (press enter)");
        this.scan.nextLine();
        int turnScore = 0;
        int points;
        ArrayList<Integer> roll;
        boolean continueTurn;
        do {
            points = this.dicePair.roll();
            roll = this.dicePair.getRolls();
            turnScore += points;
            System.out.println("Computer rolled: " + roll +
                               " | turn score: " + (roll.contains(1) ? 0 : (turnScore)));
            continueTurn = turnScore < COMPUTER_THRESH;
        } while (!roll.contains(1) && continueTurn);
        if(points==2){
            this.computerScore = 0;
            System.out.println("Perfect FAIL! Score: " + this.computerScore);
        } else if(roll.contains(1)) {
            turnScore = 0;
            System.out.println("Computer rolled a 1... total score: " + this.computerScore);
        } else {
            computerScore += turnScore;
            System.out.println("Computer's new score: " + this.computerScore);
        }
        this.playerTurn = true;
    }

    private boolean checkContinue() {
        System.out.println("Continue? (y/n)");
        boolean continueTurn = this.scan.next().equalsIgnoreCase("y");
        return continueTurn;
    }

}
