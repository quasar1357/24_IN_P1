package S04Ex02;

import java.util.Scanner;

public class HeronSqrt {
    private static double w;
    private static int steps;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String again; // Variable to check if user wants to go again...
        do {
            System.out.println("Gib die Zahl ein, von der du die Wurzel ziehen möchtest: ");
            w = scan.nextDouble();
            System.out.println("Und wieviele Berechnungsschritte sollen durchgeführt werden? ");
            steps = scan.nextInt();
            System.out.println("Resultat: " + heron(w, steps));
            System.out.println("Nochmals? J oder y für ja... ");
            again = scan.next();
        } while(again.equalsIgnoreCase("j") ||
                again.equalsIgnoreCase("y"));
    }

    public static double heron(double w, int steps){
        double x = w/2; // initialize as suggested in the exercise
        for(int count=1; count<=steps; count++){
            x = (x + w/x )/2;
            // System.out.println(""+x);
        }
        return x;
    }

}
