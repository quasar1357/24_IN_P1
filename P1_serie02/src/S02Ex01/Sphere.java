package S02Ex01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere {
    /**
    Reads the radius of a sphere from the user
    and calculates the volume and area of the sphere.
    */
    public static void main(String[] args) {
        // Read the radius from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = scan.nextDouble();

        // Calculate the volume and area of the sphere
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double area = 4 * Math.PI * Math.pow(radius, 2);
        DecimalFormat formatter = new DecimalFormat("#,##0.####");
        String volumeString = formatter.format(volume);
        String areaString = formatter.format(area);

        // Print the results
        System.out.println("The volume of the sphere is: " + volumeString);
        System.out.println("The area of the sphere is: " + areaString);
    }
}
