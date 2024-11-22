package S05Ex01;

public class Cesar {

    private final static int START_IDX = 65;
    private final static int END_IDX = 122;
    private final static int SPAN = END_IDX-START_IDX + 1;

    public static String encryptCesar(int k, String textIn){
        int numChars = textIn.length();
        String newText = "";
        for(int i = 0; i<numChars; i++){
            char c = textIn.charAt(i);
            // NOTE: adding span makes sure to have modulo of a positive number
            // (modulo of negaitves can be problematic in Java)
            char newChar = (char) ((c - START_IDX + k + SPAN) % SPAN + START_IDX);
            newText += newChar;
        }
        return newText;
    }

    // IDEA OF MICHELLE: decrypt is just encrypt with negative key
    public static String decryptCesar(int k, String textIn){
        return encryptCesar(-k, textIn);

    // public static String decryptCesar(int k, String textIn){
    //     int numChars = textIn.length();
    //     String newText = "";
    //     for(int i = 0; i<numChars; i++){
    //         char currChar = textIn.charAt(i);
    //         char newChar = (char) ((currChar - END_IDX - k) % SPAN + END_IDX);
    //         newText += newChar;
    //     }
    //     return newText;
    }

    public static void main(String[] args){
        String input = "abcwxzWXZ";
        int k =3;
        String encrypted = encryptCesar(k, input);
        String decrypted = decryptCesar(k, encrypted);
        System.out.println("input: " + input + " | key: " + k);
        System.out.println("encrypted: " + encrypted);
        System.out.println("decrypted: " + decrypted);
        String decrypted2 = encryptCesar(-k, encrypted);
        System.out.println("decrypted2: " + decrypted2);
    }
}
