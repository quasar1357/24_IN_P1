package S02Ex02;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point " +
        "(separated by a space or on separate lines): ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Enter the coordinates of the second point " +
        "(separated by a space or on separate lines): ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        // Calculate the slope
        double slope = (y2 - y1) / (x2 - x1);
        System.out.println("The slope between the two points is: " + slope);
    }
}
