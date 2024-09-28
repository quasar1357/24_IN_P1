// Roman Schwob, 05-126-024

import java.util.Scanner;

public class Ex05 {
    public static final int MIN_WARM = 24;
    public static final int MIN_COMFY = 15;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a temperature: ");
        int temperatureIn = scan.nextInt();
        if(temperatureIn >= MIN_WARM)
            System.out.println("It is warm.");
        else if(temperatureIn >= MIN_COMFY)
            System.out.println("It is comfy.");
        else
            System.out.println("It is cold.");
    }
}
