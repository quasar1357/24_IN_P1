// Roman Schwob, 05-126-024

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number with 3 digits: ");
        int number = scan.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("The number must be a 3-digit number.");
            return;
        }
        int hundreds = number / 100;
        int tens = (number - hundreds*100) / 10;
        int ones = number - hundreds*100 - tens*10;
        int sumOfDigits = hundreds + tens + ones;
        System.out.println("The sum of the digits is: " + sumOfDigits);
    }
}
