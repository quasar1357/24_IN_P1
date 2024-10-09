package S02Ex04;

import java.util.Scanner;

public class GeomSeries {
    /**
     * This program asks the user for the first term, the common ratio
     * and the number of terms (all as integers)
     * and calculates the n-th term of a geometric series.
     */
    public static void main(String[] args) {
        // Ask for the first term, the common ratio and the number of terms
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a = scanner.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = scanner.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Check if the number of terms is valid
        if (n < 1) {
            System.out.println("The number of terms must be greater than 0.");
            System.exit(1);
        }
        
        // Calculate the n-th term of the geometric series and print it
        int nTerm = a * (int) Math.pow(r, n - 1);
        System.out.println("The n-th term an is " + nTerm);
    }
}
