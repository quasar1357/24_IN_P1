import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        // double a = 13.45;
        // double b = a % 2;
        // System.out.println(b);

        // float f = 2.5f;
        // System.out.println(f);

        // String orig = "let's try to split this!";
        // String[] res = orig.split(" ");
        // for(String part: res){
        //     System.out.println(part);
        // }

        
        // String path = "C:/Programming/java_projects/24_IN_P1/P1_simpleTests/src/test.txt";
        // PrintWriter outFile = new PrintWriter(path); // create a file
        // final int MAX = 10;
        // for (int line = 1; line <= MAX; line++) {
        //     for (int num = line; num <= MAX; num++) {
        //         outFile.print(num * line + " "); // write to file
        //     }
        //     outFile.println(); // write line break to file
        // }
        // outFile.close(); // close file

        // System.out.println((64-32) * (5/9));
        // System.out.println((64-32) * 5/9);

        // int[] arr = new int[3];
        // arr[4] = 5;
        // System.out.println(arr[4]); // ArrayIndexOutOfBoundsException is thrown at runtime

        double d = 8.99;
        int i = (int) d;
        System.out.println(i); // --> 8

        String name = "emilie";
        name.replace("e", "x"); // replace() returns a new string !!! Strings are immutable
        System.out.println(name.contains("x")); // --> false

        boolean a = false, b = false, c = true;
        boolean e = (!a || b) && c;
        System.out.println(e); // --> true

        int[][] nums = { {1, 2, 3}, {4, 5, 6, 7} };
        System.out.println(nums[1].length); // Indexing starts at 0 !!! --> 4

        int p = 17, TOTAL = 100;
        System.out.println((p > TOTAL) ? "Q" : "W"); // --> W

        int val1 = 7, val2 = 3;
        boolean on = false;
        if (val1 > val2 * 2) {
            if (!on)
                System.out.print("Blau ");
            else
                System.out.print("Schwarz ");
            } else
                System.out.print("Rot ");
            System.out.print("Gelb "); // --> Blau Gelb

        for (int i2 = 1; i2 < 3; i2++)
            for (int j = 3; j > i2; j--)
                System.out.print(i2 * j + " "); // --> 3 2 6

        double sum = 0.0;
        do {
            sum += 2; // Result is a DOUBLE !!!
        } while (sum < 3);
        System.out.print(sum); // --> 4.0

        System.out.println();

        int[] v = {0, 2, 1, 1, 3, 2, 1};
        for(int idx = 1; idx < v.length; idx++) {
            if(v[idx-1] < v[idx] && v[idx] >v[idx + 1])
            System.out.print(v[idx] + " ");
        }

    }

    // public static void main(String[] args) { // Ambuiguity in method signature fails at compile time
    //     System.out.println("Hello World!");
    // }
}
