package S02Ex01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = scan.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double area = 4 * Math.PI *Math.pow(radius, 2);
        DecimalFormat formatter = new DecimalFormat("#,##0.0000");
        String volumeString = formatter.format(volume);
        String areaString = formatter.format(area);
        System.out.println("The volume of the sphere is: " + volumeString);
        System.out.println("The area of the sphere is: " + areaString);
    }
}

