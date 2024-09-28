// Roman Schwob, 05-126-024

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter value for speed (km/h as int): ");
        int speedIn = scan.nextInt();
        System.out.print("Please enter value for distance (km as int): ");
        int kmIn = scan.nextInt();
        double timeOut = (double) kmIn / speedIn;
        System.out.println("Time needed to travel " + kmIn + " km with "
        + speedIn + " km/h: "+ timeOut + " hours.");
    }
}
