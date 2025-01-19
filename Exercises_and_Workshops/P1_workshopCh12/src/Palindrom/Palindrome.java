package Palindrom;

public class Palindrome {

    public static void main(String[] args) {
        String text = "abccba";
        boolean isPalin = isPalindrome(text);

        System.out.println(text + " is " + (isPalin ? "" : "not ") + "a palindrome");

    }

    public static boolean isPalindrome(String textIn) {
        if (textIn.length() <= 1) { // Basisfall: Wenn der Text nur noch 1 oder 0 Zeichen hat, ist es ein Palindrom
            return true;
        } else {
            char first = textIn.charAt(0);
            char last = textIn.charAt(textIn.length() - 1);
            if (first != last) { // Wenn erster und letzter Buchstabe nicht übereinstimmen, ist es kein Palindrom
                return false;
            } else { // Wenn erster und letzter Buchstabe übereinstimmen, prüfe den Rest des Textes
                String shorter = textIn.substring(1, textIn.length() - 1);
                return isPalindrome(shorter); // Rekursiver Aufruf mit verkürztem Text
            }
        }
    }

}
