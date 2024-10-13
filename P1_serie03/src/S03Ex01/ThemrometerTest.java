// Roman Schwob, 05-126-024

package S03Ex01;

public class ThemrometerTest {
    /**
     * Testklasse für die Klasse Thermometer
     */

    public static void main(String[] args) {
        Thermometer t = new Thermometer();
        System.out.println("Initialisiert:    " + t);
        t.increase();
        System.out.println("Increased:      " + t);
        t.changeUnit();
        System.out.println("Unit changed:   " + t);
        t.increase();
        System.out.println("Increased:      " + t);
        t.changeUnit();
        System.out.println("Unit changed:   " + t);
        t.reset();
        System.out.println("Reset:          " + t);
        System.out.println("Temperatur via getter: " + t.getTemp());
        t.changeUnit();
        System.out.println("Unit changed, Temp. via getter: " + t.getTemp());
        Thermometer t2 = new Thermometer(13.2);
        System.out.println("Initialisiert mit 13.2: " + t2);
    }

}
