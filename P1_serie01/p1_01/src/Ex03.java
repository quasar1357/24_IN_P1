// Roman Schwob, 05-126-024

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter value in grams: ");
        double valInGrams = scan.nextDouble();
        double valInPounds = valInGrams / 453.592;
        System.out.println(valInGrams + " grams are "
        + valInPounds + " pounds.");
    }
}
