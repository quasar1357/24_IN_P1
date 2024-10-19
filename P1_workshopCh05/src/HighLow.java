import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Random randGenerator = new Random();
        Scanner numScan = new Scanner(System.in);
        Scanner decScan = new Scanner(System.in);

        int MAX = 100;
        String decision = "y";

        while (decision.equalsIgnoreCase("y")) {
            System.out.println("Errate eine Zahl zwischen 1 und " + MAX + ".");
            int choice = randGenerator.nextInt(MAX+ 1);
            System.out.println("CHEAT: " + choice); // TODO: Delete...
            System.out.println("Gib deinen Tipp ein: ");
            int guess = numScan.nextInt();
            int count = 1;

            while (guess != choice) {
                if (guess < choice) {
                    System.out.println("Zu niedrig. Versuche es noch einmal: ");
                } else {
                    System.out.println("Zu hoch. Versuche es noch einmal: ");
                }
                guess = numScan.nextInt();
                count++;
            }
            System.out.println("Richtig! Versuche gebraucht: " + count);
            System.out.println("Weitere Runde? (y/n)");
            decision = numScan.next();
        }
    }
}
