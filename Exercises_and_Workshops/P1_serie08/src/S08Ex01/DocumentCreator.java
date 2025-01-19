package S08Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class DocumentCreator {

    public static void main(String[] args) {
        String name;
        ArrayList<Document> DocList = new ArrayList<Document>();
        Scanner scan = new Scanner(System.in);
        do {
            // Ask for and read a Document name
            System.out.print("Bitte geben Sie eine Dokumentbezeichnung ein (oder 'DONE' zum Beenden): ");
            name = scan.nextLine();
            System.out.println(name);
            // If the user isn't done yet, try to create new doc and add it to the list
            if(!"done".equals(name.toLowerCase())) {
                try {
                    Document newDoc = new Document(name);
                    DocList.add(newDoc);
                    System.out.println("Gültige Dokumentbezeichnung: " + name);
                // If the input is invalid, throw the appropriate error
                } catch (InvalidDocumentCodeException e) {
                    System.out.println(e.getMessage());
                }
            }
            // If the user is done, print a final message ...
            else {
                System.out.println("Programm beendet.");
            }
            // ... and exit the program
        } while(!"done".equals(name.toLowerCase()));
        System.out.println("\nThe final list of documents: " + DocList);

    }

}
