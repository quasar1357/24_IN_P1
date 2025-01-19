package S04Ex01;

import java.util.Random;

public class SinCos {
    private static final int NUM_ITERS = 100;
    private static final int MAX_VAL = 20;
    
    public static void main(String[] args) {
        Random rand = new Random();
        for(int count = 1; count <= NUM_ITERS; count++){
            int intOne = rand.nextInt(MAX_VAL) + 1; // 0-MAX_VAL excl. -> +1 -> 1-MAX_VAL incl.
            int intTwo = rand.nextInt(MAX_VAL) + 1;
            // System.out.println(""+intOne + " "+intTwo + " | " + count);
            int sumVal = intOne + intTwo;
            System.out.println("value one: " + intOne + ", " +
                               "value two: " + intTwo + ", " +
                               "sum: " + sumVal + ", " +
                               "sinus: " + Math.sin(Math.toRadians(sumVal)) + ", " +
                               "cosinus: " + Math.cos(Math.toRadians(sumVal)));
        }
    }
}
