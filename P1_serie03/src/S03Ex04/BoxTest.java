// Roman Schwob, 05-126-024

package S03Ex04;

public class BoxTest {
    /**
     * Test class for Box and Cargo classes
     */

    public static void main(String[] args) {
        // Definiere ein paar Stückgüter
        Cargo bottle = new Cargo("Flasche", 3, 3, 15);
        Cargo ball = new Cargo("Ball", 15, 15, 15);
        Cargo book = new Cargo("Buch", 13, 8, 2);

        // Teste toString und getter Methoden
        System.out.println("\n=== toString Methode für Stückgut ===");
        System.out.println(bottle);
        System.out.println("\n=== Getters für Stückgut ===");
        System.out.println(bottle.getName() + ": " + bottle.getLength() + "x" +
                           bottle.getWidth() + "x" + bottle.getHeight());

        // Teste setter Methoden
        System.out.println("\n=== Ändere Eigenschaften der Flasche ===");
        bottle.setName("Flasche (gross)");
        bottle.setLength(5);
        bottle.setWidth(5);
        // Teste falschen Eingabewert
        bottle.setHeight(-16);
        System.out.println(bottle); // Höhe sollte 15 bleiben...

        // Definiere eine Box mit Parameter
        System.out.println("\n=== Definiere Boxen ===");
        Box smallBox = new Box(15, 15, 7);
        System.out.println(smallBox);

        // Definiere eine grosse Box aber (noch) ohne Parameter
        Box largeBox = new Box();
        // Setze die Dimensionen der grossen Boxe
        largeBox.setDims(20, 20, 40);
        // Gib die grosse Box aus
        System.out.println(largeBox);

        // Versuche, Stückgüter in die Boxen zu platzieren
        System.out.println("\n=== Teste Zufügen von Stückgütern ===");
        System.out.println("Kleine Box voll: " + smallBox.getFull()); // false
        smallBox.addCargo(bottle); // Sollte nicht gehen
        System.out.println("Kleine Box voll: " + smallBox.getFull()); // false
        smallBox.addCargo(book); // Sollte gehen
        System.out.println("Kleine Box voll: " + smallBox.getFull()); // true
        largeBox.addCargo(ball); // Sollte gehen
        System.out.println("Grosse Box voll: " + largeBox.getFull()); // true
        largeBox.addCargo(bottle); // Sollte nicht gehen, da schon voll!
        System.out.println("Grosse Box voll: " + largeBox.getFull()); // true

        // Teste getCapacity Methode
        System.out.println("\n=== Erhalte Kapazitäten ===");
        System.out.println("Kapazität kleine Box: " + smallBox.getCapacity());
        System.out.println("Kapazität grosse Box: " + largeBox.getCapacity());

        // Gib Boxen mit Stückgütern aus
        System.out.println("\n=== Volle Boxen ===");
        System.out.println("\nKleine Box:");
        System.out.println(smallBox);
        System.out.println("\nGrosse Box:");
        System.out.println(largeBox);
    }

}
