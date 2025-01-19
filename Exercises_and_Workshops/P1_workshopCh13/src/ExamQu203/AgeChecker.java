package ExamQu203;

import java.util.Scanner;

public class AgeChecker {

    private static final int MAX_AGE = 120;

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie ein Alter ein: ");
        int age = scan.nextInt();
        try{
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws IllegalArgumentException {
        if(age > MAX_AGE || age < 0) {
            throw new IllegalArgumentException(age);
        }
        else {
            System.out.println("Alter akzeptiert.");
        }
    }

}
