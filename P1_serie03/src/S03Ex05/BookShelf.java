// Roman Schwob, 05-126-024

package S03Ex05;

public class BookShelf {
    /**
     * Test class for the Book class
     */

     public static void main(String[] args) {
        // Define 3 books, test both constructors
        Book book1 = new Book(123, "Harry Potter", "J.K. Rowling", "26.06.1997");
        Book book2 = new Book(456, "The Hobbit", "J.R.R. Tolkien", "21.09.1937");
        Book book3 = new Book();

        // Test toString and getter methods
        System.out.println("\n=== toString Methode für Bücher ===");
        System.out.println(book1);
        System.out.println("\n=== Getters für Bücher ===");
        System.out.println("ID: " + book1.getId());
        System.out.println("Titel: " + book1.getTitle());
        System.out.println("Autor: " + book1.getAuthor());
        System.out.println("Datum: " + book1.getDateOfPublication());

        // Test setter methods
        System.out.println("\n=== Ändere Eigenschaften des ersten Buches ===");
        book1.setId(124);
        book1.setTitle("Harry Potter and the Prisoner of Azkaban");
        book1.setAuthor("Joanne Rowling");
        book1.setDateOfPublication("08.07.1999");
        System.out.println(book1);
        System.out.println("\n=== Ändere Eigenschaften des leeren Buches ===");
        book3.setId(789);
        book3.setTitle("Dune");
        book3.setAuthor("Frank Herbert");
        book3.setDateOfPublication("01.06.1965");
        System.out.println(book3);

        // Test age method
        System.out.println("\n=== Alter der Bücher ===");
        System.out.println(book1.getTitle() + ": " + book1.age() + " Jahre");
        System.out.println(book2.getTitle() + ": " + book2.age() + " Jahre");
        System.out.println(book3.getTitle() + ": " + book3.age() + " Jahre");

        // Test input method
        System.out.println("\n=== Eingabe eines neuen Buches ===");
        Book book4 = new Book();
        book4.input();
        System.out.println(book4);
     }

}
