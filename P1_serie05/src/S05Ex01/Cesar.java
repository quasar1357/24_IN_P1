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
            char newChar = (char) ((c - START_IDX + k) % SPAN + START_IDX);
            newText += newChar;
        }
        return newText;
    }

    public static String decryptCesar(int k, String textIn){
        int numChars = textIn.length();
        String newText = "";
        for(int i = 0; i<numChars; i++){
            char currChar = textIn.charAt(i);
            char newChar = (char) ((currChar - END_IDX - k) % SPAN + END_IDX);
            newText += newChar;
        }
        return newText;
    }

    public static void main(String[] args){
        String input = "abcwxzWXZ";
        int k =3;
        String encrypted = encryptCesar(k, input);
        String decrypted = decryptCesar(k, encrypted);
        System.out.println("input: " + input + " | key: " + k);
        System.out.println("encrypted: " + encrypted);
        System.out.println("decrypted: " + decrypted);
    }
}
