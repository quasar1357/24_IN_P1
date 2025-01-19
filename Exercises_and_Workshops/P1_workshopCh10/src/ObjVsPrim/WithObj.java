package ObjVsPrim;

public class WithObj {
    public static void main(String[] args) {
        int[] numbers = {17, 17, 17};
        incrementBy(numbers, 5);
        for (int num : numbers) {
            System.out.print(num + " "); // Ausgabe = 22 22 22
        } // Values in the array are changed; actual (argument) and formal parameters are Aliases
    }
    
    private static void incrementBy(int[] numbers, int stepSize) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += stepSize;
        }
    }
    
}
