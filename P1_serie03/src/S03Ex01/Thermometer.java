// Roman Schwob, 05-126-024

package S03Ex01;

public class Thermometer {
    /**
     * Thermometer, welches die Temperatur in Celsius oder Fahrenheit
     * speichert und umrechnen kann.
     */

    // Temperatur in Celcius
    private double temp;
    // Einheit der Temperatur (Boolean mit True = Celsius, False = Fahrenheit)
    private boolean inC = true;

    // Konstruktor ohne Argumente; setzt die Temperatur auf 37.0 Grad Celsius
    public Thermometer() {
        this.temp = 37.0;
    }

    // Konstruktor mit Temperatur (optional; nicht gefragt in Aufgabe)
    public Thermometer(double tempIn) {
        this.temp = tempIn;
    }

    // Methode zur Erhöhung der Temperatur um 0.1 Grad Celsius
    public void increase() {
        this.temp += 0.1;
    }

    // Getter Methode für die Temperatur
    public double getTemp() {
        return this.temp;
    }

    // Methode zum Einheit wechseln
    public void changeUnit() {
        if (inC) {
            this.temp = celsiusToFahrenheit(this.temp);
            inC = false;
        } else {
            this.temp = fahrenheitToCelsius(this.temp);
            inC = true;
        }
    }

    // Methode zum Umrechnen von Celsius zu Fahrenheit
    private double celsiusToFahrenheit(double celsius) {
        double fVal = celsius * 9 / 5 + 32;
        // Runden auf 2 Nachkommastellen (nicht gefragt in Aufgabe)
        return Math.round(fVal*100) / 100.0;
    }

    // Methode zum Umrechnen von Fahrenheit zu Celsius
    private double fahrenheitToCelsius(double fahrenheit) {
        double cVal = (fahrenheit - 32) * 5 / 9;
        // Runden auf 2 Nachkommastellen (nicht gefragt in Aufgabe)
        return Math.round(cVal*100) / 100.0;
    }

    // Methode zum Zurücksetzen der Temperatur (auf 37.0°C oder 98.6°F)
    public void reset() {
        if (inC) {
            this.temp = 37.0;
        } else {
            this.temp = fahrenheitToCelsius(98.6);
        }
    }

    // toString Methode
    public String toString() {
        String unitString;
        if (inC) { unitString = "Celsius"; }
        else { unitString = "Fahrenheit"; }
        return "Thermometer mit Temperatur: " + this.temp + " " + unitString;
    }

}
