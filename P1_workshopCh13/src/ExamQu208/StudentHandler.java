package ExamQu208;

public class StudentHandler {

    public static void increaseSemester(Student s) throws NotInitializedException { // added "throws..."

        if(s == null) { // added condition to throw the exception...
            throw new NotInitializedException();
        }

    }

    public static void main (String[] args) throws NotInitializedException {
        Student s;
        increaseSemester(s);
    }

}
