package S02Ex05;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class LogIn {

    public static void main(String[] args) {

        // Generate the USERNAME

        // Ask for the name
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = nameScanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = nameScanner.nextLine();
        
        // Extract the first 5 characters of the last name
        String lPart;
        if(lastName.length() > 5){
            lPart = lastName.substring(0, 5);
        // OR the whole last name if it has less than 5 characters
        } else {
            lPart = lastName;
        }
        lPart = lPart.toUpperCase(); // Convert to uppercase

        // Generate a random number between 000 and 999
        Random rand = new Random();
        int randNum = rand.nextInt(1000);
        // Format the random number to have 3 digits
        DecimalFormat df = new DecimalFormat("000");
        String dPart = df.format(randNum);

        // Generate the username
        String username = firstName.toUpperCase().charAt(0) + lPart + dPart;
        System.out.println("Your username is: " + username);

        // Generate the PASSWORD
        
        // First part
        int pwLeadInt = rand.nextInt(7, 10);
        String pwLead = Integer.toString(pwLeadInt);
        
        // Second part
        int pwMidInt = rand.nextInt(0, 99999);
        DecimalFormat df2 = new DecimalFormat("00000");
        String pwMid = df2.format(pwMidInt);
        
        // Third part
        String pwEnd = "";
        for (int i = 0; i < 3; i++) {
            // Generate and concatenate a random uppercase letter
            int uniCode = rand.nextInt(65, 91);
            pwEnd += (char) uniCode;
        }

        // Concatenate the parts
        String password = pwLead + pwMid + "-" + pwEnd;
        System.out.println("Your password is: " + password);

    }

}
