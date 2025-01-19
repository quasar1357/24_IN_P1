public class Recursion {
    private static int[] numbers = {1, 1, 1, 1, 1};
    
    public static int r(int max) {
        if (max > 0) {
            int sum = 0;
            for (int i = 0; i < max; i++)
                sum += numbers[i];
            return sum + r(max / 2);
        } else
            return 0;
    }
    
    public static void main(String[] args) {
    System.out.println(Recursion.r(numbers.length));
    }
}