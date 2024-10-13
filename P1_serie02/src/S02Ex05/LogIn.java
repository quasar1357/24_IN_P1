package S02Ex05;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class LogIn {

    public static void main(String[] args) {
        /*
         * Generates a username and a password for a user
         * given their first and last name (taken as user input).
         */

        // 1) Generate the USERNAME

        // Ask for the name
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Enter your first name (ä = ae etc.): ");
        String firstName = nameScanner.nextLine();
        System.out.println("Enter your last name (ä = ae etc.): ");
        String lastName = nameScanner.nextLine();
        
        // Remove spaces and "-" from the last name
        String lastNameEdited = lastName.replace(" ", "");
        lastNameEdited = lastNameEdited.replace("-", "");
        // Extract the first 5 characters of the last name
        String lPart;
        if(lastNameEdited.length() > 5){
            lPart = lastNameEdited.substring(0, 5);
        // OR the whole last name if it has less than 5 characters
        } else {
            lPart = lastNameEdited;
        }
        lPart = lPart.toUpperCase(); // Convert to uppercase

        // Generate a random number between 000 and 999
        Random rand = new Random();
        int randNum = rand.nextInt(1000);
        // Format the random number to have 3 digits
        DecimalFormat df = new DecimalFormat("000");
        String dPart = df.format(randNum);

        // Concatenate the parts & print the username
        String username = firstName.toUpperCase().charAt(0) + lPart + dPart;
        System.out.println("Your username is: " + username);

        // 2) Generate the PASSWORD
        
        // First part
        int pwLeadInt = rand.nextInt(7, 10);
        String pwLead = Integer.toString(pwLeadInt);
        
        // Second part
        int pwMidInt = rand.nextInt(0, 99999);
        DecimalFormat df2 = new DecimalFormat("00000");
        String pwMid = df2.format(pwMidInt);
        
        // Third part: 3 random uppercase letters
        String pwEnd = "";
        for (int i = 0; i < 3; i++) {
            // Generate and concatenate a random uppercase letter
            int uniCode = rand.nextInt(65, 91);
            pwEnd += (char) uniCode;
        }

        // Concatenate the parts & print the password
        String password = pwLead + pwMid + "-" + pwEnd;
        System.out.println("Your password is: " + password);
    }
}
