package ExamQu203;

public class IllegalArgumentException extends Exception {

    public IllegalArgumentException(int input) {
        super("Input " + input + " nicht im gültigen Bereich!");
    }
}
