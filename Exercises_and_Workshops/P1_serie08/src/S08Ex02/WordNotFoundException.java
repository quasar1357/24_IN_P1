package S08Ex02;

public class WordNotFoundException extends Exception {
    public WordNotFoundException(String word) {
        super("Das Wort "+ word + " ist nicht im Wörtebuch vorhanden!");
    }
}
