// Roman Schwob, 05-126-024

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter value for a: ");
        int a = scan.nextInt();
        System.out.print("Please enter value for b: ");
        int b = scan.nextInt();
        if(b == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int sumInt = a + b;
        int resultInt = sumInt*sumInt / b;
        double sumDouble = (double)a + b;
        double resultDouble = sumDouble*sumDouble / b;
        int resultRemainder = (sumInt*sumInt) % b;
        System.out.println("=================");
        System.out.println("(a+b)**2 / b = " + resultDouble);
        System.out.println("=================");
        System.out.println("As integer: " + resultInt);
        System.out.println("-> Remainder: " + resultRemainder);
    }
}
