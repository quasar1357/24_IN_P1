package S08Ex02;

import java.util.Scanner;

public class translator {

    static Dictionary dict;

    public static void main(String[] args) {
        getInput();
        findWords();
    }

    private static void findWords() {
        if(dict == null) {
            System.out.println("Please first eneter some words to the dictionery.");
            return;
        }
        String de, en;
        Scanner scan = new Scanner(System.in);
        do {
            // Ask for a German word
            System.out.println("Bitte geben Sie ein Wort zur Übersetzung ein: (0 um abzubrechen)");
            de = scan.nextLine();
            // If the user isn't done yet, try to find the German word in the dict
            if(!"0".equals(de)) {
                try {
                    en = dict.translate(de);
                    System.out.println(en);
                // If the input is invalid, throw the appropriate error
                } catch (WordNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println();
            }
            // If the user aborts, exit the program
        } while(!"0".equals(de));
    }

    private static void getInput() {
        String de, en;
        if(dict == null){
            dict = new Dictionary();
        }
        Scanner scan = new Scanner(System.in);
        do {
            // Ask for and read two words to add to the dict
            System.out.print("Bitte geben Sie ein deutsches und ein englisches Wort ein, " + 
            "separiert durch einen Leerschlag (oder 'DONE' zum Beenden): ");
            de = scan.next();
            // If the user isn't done yet, try to create new doc and add it to the list
            if(!"done".equals(de.toLowerCase())) {
                en = scan.next();
                dict.put(de, en);
                System.out.println("Gültige Eingabe: " + de  + " " + en);
            }
            // If the user is done, print a final message ...
            else {
                System.out.println("Programm beendet.");
            }
            // ... and exit the program
        } while(!"done".equals(de.toLowerCase()));
        System.out.println("\nFinal dictionary\n===\n" + dict);
    }
}
