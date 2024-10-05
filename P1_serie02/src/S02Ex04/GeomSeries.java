package S02Ex04;

import java.util.Scanner;

public class GeomSeries {
    public static void main(String[] args) {
        // Ask for the first term, the common ratio and the number of terms
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a = scanner.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = scanner.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        // Calculate the n-th term of the geometric series and print it
        int nTerm = a * (int) Math.pow(r, n - 1);
        System.out.println("The n-th term an is " + nTerm);
    }
}
