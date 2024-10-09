package S02Ex02;

import java.util.Scanner;

public class Line {
    /**
     * This program reads the coordinates of 2 points from the user
     * and calculates the slope between them.
     */
    public static void main(String[] args) {
        // Read the coordinates of 2 points from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point " +
        "(separated by a space or on separate lines): ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Enter the coordinates of the second point " +
        "(separated by a space or on separate lines): ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        // Check if the x coordinates are the same and raise an error if they are
        if (x1 == x2) {
            System.out.println("The slope is undefined " +
            "because the x coordinates are the same.");
            System.exit(1);
        }
        
        // Calculate and print the slope
        double slope = (y2 - y1) / (x2 - x1);
        System.out.println("The slope between the two points is: " + slope);
    }
}
