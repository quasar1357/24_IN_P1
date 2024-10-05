package S02Ex03;

import java.util.Scanner;
import java.util.Random;

public class MathGame {
    public static final int MAX_VAL = 20;
    public static final int MIN_VAL = 0;
    public static final int RANGE_VAL = MAX_VAL - MIN_VAL;
    public static void main(String[] args) {
        // Generate two random values
        Random rand = new Random();
        int val1 = MIN_VAL + rand.nextInt(RANGE_VAL + 1);
        // Second value is at max. the difference between MAX and the first value
        int rangeVal2 = RANGE_VAL - val1;
        int val2 = MIN_VAL + rand.nextInt(rangeVal2 + 1);

        // Ask for the sum of the two values
        System.out.println(val1 + " + " + val2 + " = ?");
        Scanner valScanner = new Scanner(System.in);
        int guessSum = getInputInt(valScanner, MIN_VAL, MAX_VAL);
        
        // Calculate the sum; check and print if the guess is correct
        int resultSum = val1 + val2;
        if(resultSum == guessSum){
            System.out.println("Congratulations! " +
            "You guessed the total value correctly :)");
        } else {
            System.out.println("Sorry, you guessed the sum incorrectly :(");
        }
    }
    public static int getInputInt(Scanner valScanner, int minIn, int maxIn){
        /**
        * This method reads an integer from the user and checks if it is within the specified range.
        */
        // First attempt without further information
        int inputInt = valScanner.nextInt();
        // If invalid, repeat until the input is within the specified range
        while(inputInt < minIn || inputInt > maxIn){
            System.out.println("The integer you entered is not within the specified range.");
            System.out.println("Please enter an integer between " + minIn + " and " + maxIn + ".");
            inputInt = valScanner.nextInt();
        }
        return inputInt;
    }
}
