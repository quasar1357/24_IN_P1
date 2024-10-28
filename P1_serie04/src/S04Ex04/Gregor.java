package S04Ex04;

import java.util.Scanner;

public class Gregor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String again;
        boolean isLeap;
        do {
            System.out.println("Gib ein Jahr ein (nach 1582): ");
            int yearIn = scan.nextInt();
            isLeap = IsLeapYear(yearIn);
            System.out.println("Dies ist " + (isLeap ? "" : "k") + "ein Schaltjahr");
            System.out.println("Nochmals? (y/n) ");
            again = scan.next();
        } while(again.equalsIgnoreCase("y"));
    }

    public static boolean IsLeapYear(int year){
        if (year<1582) {
            System.out.println("Das Jahr ist zu klein!");
            return false;
        }
        // Go through cases in decreasing priorities, returning if true
        if (year%400==0) return true;
        if (year%100==0) return false;
        if (year%4==0) return true;
        return false;
    }
}
