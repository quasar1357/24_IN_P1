// Roman Schwob, 05-126-024

package S03Ex02;

import java.time.Year;

public class Car {
    /**
     * Modelliert ein Auto mit Marke, Modell und Jahrgang
     */

    // Marke, Modell und Jahrgang
    private String brand, model;
    private int releaseYear;
    // Grenzwert für Alter für antike Autos
    private final int antiqueThresh = 45;

    // Konstruktor mit allen drei Parametern
    public Car(String brandIn, String modelIn, int yearIn) {
        this.brand = brandIn;
        this.model = modelIn;
        this.releaseYear = yearIn;
    }

    // Getter Methoden
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.releaseYear;
    }

    // Setter Methoden
    public void setBrand(String brandIn) {
        this.brand = brandIn;
    }

    public void setModel(String modelIn) {
        this.model = modelIn;
    }

    public void setYear(int yearIn) {
        this.releaseYear = yearIn;
    }

    // Methode zum Prüfen, ob es ein Oldie ist
    public boolean isAntique() {
        int currentYear = Year.now().getValue();
        int age = currentYear - this.releaseYear;
        return (age > antiqueThresh);
    }

    // toString Methode fürs Printen
    public String toString() {
        return "MODEL: " + this.model +
        "\nBRAND: " + this.brand +
        "\nYEAR:  " + this.releaseYear;
    }
}
