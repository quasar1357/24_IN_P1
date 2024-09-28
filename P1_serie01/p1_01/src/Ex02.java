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
        int sum1 = a + b;
        int resultInt = sum1*sum1 / b;
        double aa = (double) a;
        double bb = (double) b;
        double sum2 = aa + bb;
        double resultDouble = sum2*sum2 / bb;
        double resultRemainder = resultDouble - resultInt;
        System.out.println("(a+b)**2 / b = " + resultDouble);
        System.out.println("As integer: = " + resultInt);
        System.out.println("Remainder = " + resultRemainder);
    }
}
