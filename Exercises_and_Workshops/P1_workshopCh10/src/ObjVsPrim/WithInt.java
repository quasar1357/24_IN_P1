package ObjVsPrim;

public class WithInt {
    public static void main(String[] args) {
        int number = 17;
        incrementBy(number, 5);
        System.out.println(number); // Ausgabe = 17
    } // Value of number is NOT changed; actual (argument) and formal parameters are independent
    
    private static int incrementBy(int number, int stepSize) {
        number = number + stepSize;
        return number;
    }
    
}
