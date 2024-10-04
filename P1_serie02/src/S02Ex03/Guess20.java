package S02Ex03;

import java.util.Scanner;
import java.util.Random;

public class Guess20 {
    public static final int MAX_VAL = 20;
    public static final int MIN_VAL = 0;
    public static final int RANGE_VAL = MAX_VAL - MIN_VAL;
    public static void main(String[] args) {
        Scanner valScanner = new Scanner(System.in);
        System.out.println("Do you want to see the values? (true/false)");
        boolean showValues = valScanner.nextBoolean();
        System.out.println("How many tries do you want to have?");
        int maxTries = valScanner.nextInt();
        int separationVal, firstVal, secondVal, guessTotalVal;
        int totalVal = -20;
        int numTries = 0;
        // Get the first attempt
        guessTotalVal = getInputInt(valScanner, MIN_VAL, MAX_VAL);
        // Repeat as long as necessary
        while(guessTotalVal != totalVal && numTries < maxTries){
            numTries++;
            Random rand = new Random();
            totalVal = MIN_VAL + 1 + rand.nextInt(RANGE_VAL);
            separationVal = MIN_VAL + rand.nextInt(totalVal + 1);
            firstVal = totalVal - separationVal;
            secondVal = totalVal - firstVal;
            if(showValues){
                System.out.println("The total value is " + totalVal +
                ", the separation value is " + separationVal +
                ", the first value is " + firstVal +
                ", and the second value is " + secondVal + ".");
            }
            System.out.println("Guess the total value!");
            guessTotalVal = getInputInt(valScanner, MIN_VAL, MAX_VAL);
            if(guessTotalVal == totalVal){
                System.out.println("Congratulations! You guessed the total value correctly.");
            } else {
                System.out.println("Sorry, you guessed the total value incorrectly." + 
                " This was attempt number " + numTries + "/" + maxTries + ".");
                System.out.println("Start a new round with any key, or exit with 'exit'.");
                if(valScanner.next() == "exit"){
                    break;
                }
            }
        }
    }

    public static int getInputInt(Scanner valScanner, int minIn, int maxIn){
        System.out.println("Please enter an integer between " + minIn + " and " + maxIn + ".");
        int inputInt = valScanner.nextInt();
        while(inputInt < minIn || inputInt > maxIn){
            System.out.println("The integer you entered is not within the specified range.");
            System.out.println("Please enter an integer between " + minIn + " and " + maxIn + ".");
            inputInt = valScanner.nextInt();
        }
        return inputInt;
    }
}
