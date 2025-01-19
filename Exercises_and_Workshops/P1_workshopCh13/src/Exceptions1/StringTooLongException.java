package Exceptions1;

public class StringTooLongException extends Exception {

    public StringTooLongException(String message) {
        super("Eingabe \"" + message + "\" ist zu lange!");
    }

}
