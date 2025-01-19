package S04Ex03;

import java.util.Random;

public class PiApprox {

    private static final int NUM_ITER = 2 * (int) Math.pow(10,9);
    private static final int PRNT_EVERY = 1 * (int) Math.pow(10,5);
    static Random rand = new Random();

    public static void main(String[] args) {
        int num_in_circle = 0;
        double piApprox;
        for(int count=1; count<=NUM_ITER; count++){
            if(randInCircle()) num_in_circle++;
            piApprox = 4.0 * num_in_circle / count;
            if(count%PRNT_EVERY == 0)
                System.out.println("Iteration " + count +
                                   " Approximation of Pi: " + piApprox);
        }
    }


    private static boolean randInCircle(){
        double x = randExclZero();
        double y = randExclZero();
        double distToOrig = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
        return distToOrig < 1.0;
    }

    private static double randExclZero() {
        double num;
        do{
            num = rand.nextFloat();
        } while(num==0.0);
        return num;
    }
}
