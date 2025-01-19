// Roman Schwob, 05-126-024

package S03Ex05;

import java.util.Date;
import java.util.Scanner;
import java.text.*;

public class Book {

	// Instance variables
	private int id;
	private String title, author;
	private Date dateOfPublication;
	// Constant for the conversion from milliseconds to years
	private final long MILLISECONDS_PER_YEAR = (long) 1000 * 60 * 60 * 24 * 365;
	// Constant for the date format
	public static final String DATE_FORMAT = "dd.MM.yyyy";

	//--- constructors ---
	public Book(int idIn, String titleIn, String authorIn, String dateIn) {
		if (idIn > 99 && idIn < 1000) {
			this.id = idIn;
		} else {
			System.out.println("Ungültige ID. Muss zwischen 100 und 999 sein.");
			System.out.println("Setze ID auf 0.");
			this.id = 0;
		}
		this.title = titleIn;
		this.author = authorIn;
		this.dateOfPublication = stringToDate(dateIn);
	}

	public Book() {
		this.id = 0;
		this.title = "tbd";
		this.author = "tbd";
		this.dateOfPublication = new Date();
	}

	/** Returns the age of the book in days since publication */
	public int age() {
		Date today = new Date();
		long diff = today.getTime() - this.dateOfPublication.getTime();
		return (int) (diff / MILLISECONDS_PER_YEAR);
	}

	/** Returns a String representation of the book */
	public String toString() {
		return "" + this.id + ", " + 
					this.title + ", " +
					this.author + ", " +
					dateToString(this.dateOfPublication);
	}

	/** Reads all book data from user input */
	public void input() {
		// ID
		Scanner idScanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die ID des Buches ein:");
		this.setId(idScanner.nextInt()); // Use setter which checks ID
		// Title, author, date
		Scanner bookScanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Titel des Buches ein:");
		this.title = bookScanner.nextLine();
		System.out.println("Bitte geben Sie den Autor des Buches ein:");
		this.author = bookScanner.nextLine();
		System.out.println("Bitte geben Sie das Erscheinungsdatum des Buches ein (dd.MM.yyyy):");
		this.dateOfPublication = stringToDate(bookScanner.next());	
	}

	//--- Get-/Set-methods ---
	public int getId() {
		return this.id;
	}
	public void setId(int idIn) {
		if (idIn > 99 && idIn < 1000) {
			this.id = idIn;
		} else {
			System.out.println("Ungültige ID. Muss zwischen 100 und 999 sein.");
			System.out.println("ID nicht geändert.");
		}
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String titleIn) {
		this.title = titleIn;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String authorIn) {
		this.author = authorIn;
	}
	public Date getDateOfPublication() {
		return this.dateOfPublication;
	}
	public void setDateOfPublication(String dateIn) {
		this.dateOfPublication = stringToDate(dateIn);
	}

	//--- helper methods -- DO NOT CHANGE ------------------------------------
	/** Converts the Date object d into a String object */
	public static String dateToString( Date d )	{
		SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
		return fmt.format( d );
	}

	/** Converts the String object s into a Date object */
	public static Date stringToDate( String s ) {
		Date r = null;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
			r = fmt.parse( s );
		} catch ( ParseException e ){
			System.err.println( e );
			System.exit(1);
		}
		return r;
	}
}
