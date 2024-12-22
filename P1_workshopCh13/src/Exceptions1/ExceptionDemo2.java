package Exceptions1;

import java.util.Scanner;

public class ExceptionDemo2 {

    private static final int MAX_LENGTH = 20;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;

        do {
            System.out.print("Geben Sie eine Zeichenkette mit höchstens " +
            MAX_LENGTH + " Zeichen" +
            " (done zum Abbrechen): ");
            String input = scan.nextLine();

            if( (input.equalsIgnoreCase("DONE"))) {
                System.out.println("Programm beendet.");
                done = true;
            }

            else {

                try {
                    checkLength(input);
                } catch (StringTooLongException e) {
                    System.err.println(e.getMessage());
                }

            }
        } while (!done);
    }

    private static void checkLength(String input) throws StringTooLongException {
        if(input.length() > MAX_LENGTH) {
            throw new StringTooLongException(input);
        }
        System.out.println("Eingabe OK.");
    }


}
