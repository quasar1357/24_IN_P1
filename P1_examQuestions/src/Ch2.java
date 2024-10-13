package P1_examQuestions.src;

public class Ch2 {
    public static void main(String[] args) {
        System.out.println(5 + 5 + " bin ich");
        // q17();
        q18();
        q19();
        q20();
    }

    private static void q17(){
        int result = 25;
        result = result + 5;
        // result = result / 8.0; // Error: cannot convert from double to int (without casting)
        result = result * 2;
        System.out.println(result);
    }

    private static void q18(){
        int result = 9;
        result += 8;
        result *= result; // 289
        result /= 6; // 48
        result -= 3; // 45
        System.out.println(result);
    }

    private static void q19(){
        int result = 15, total = 100, min = 15, num = 10;
        result /= (total - min) % num;
        System.out.println(result);
    }

    private static void q20(){
        int result1, num1 = 27, num2 = 5;
        double result2, num3 = 12.0;
        result1 = num1 / num2;
        System.out.println(result1);
        result2 = num1 / num2;
        System.out.println(result2);
        result2 = num3 / num2;
        System.out.println(result2);
        result1 = (int) num3 / num2;
        System.out.println(result1);
        result2 = (double) num1 / num2;
        System.out.println(result2);
    }

}
