package Exceptions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo1 {

    public static void main(String[] args) {
        int[] numbers = {88, 99, 111};
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        while(!done) {
            try {
                System.out.print("Wähle zwischen 88, 99 und 111: "
                + "via Index (0, 1, 2): ");
                int index = scan.nextInt();
                System.out.println("Wähle einen Teiler: ");
                int q = scan.nextInt();

                System.out.println("Ergebnis: " + numbers[index] / q);
                done = true;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Ungültiger Index!");
            } catch (InputMismatchException e) {
                System.err.println("Index muss eine ganze Zahl sein!");
            } catch (ArithmeticException e) {
                System.err.println("Ungültige Division!");
            // } finally {
            //     scan.close();
            }
        }

    }


    // ORIGINAL: OHNE EXCEPTION HANDLING
    // public static void main(String[] args) {
    //     int[] numbers = {88, 99, 111};
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("Wähle zwischen 88, 99 und 111: "
    //     + "via Index (0, 1, 2): ");
    //     int index = scan.nextInt();

    //     System.out.println("Wähle einen Teiler: ");
    //     int q = scan.nextInt();

    //     System.out.println("Ergebnis: " + numbers[index] / q);
        
    // }

}
