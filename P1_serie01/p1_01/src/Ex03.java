// Roman Schwob, 05-126-024

import java.util.Scanner;

public class Ex03 {
    public static final double POUNDS_PER_GRAMS = 453.592;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter value in grams: ");
        double valInGrams = scan.nextDouble();
        double valInPounds = valInGrams / POUNDS_PER_GRAMS;
        System.out.println(valInGrams + " grams are "
        + valInPounds + " pounds.");
    }
}
