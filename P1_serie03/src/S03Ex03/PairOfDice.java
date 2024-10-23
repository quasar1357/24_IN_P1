// Roman Schwob, 05-126-024

package S03Ex03;

public class PairOfDice {
    /**
     * Modelliert ein Paar von Würfeln
     */

    // Zwei Würfel
    private Dice die1, die2;

    // Konstruktor
    public PairOfDice() {
        this.die1 = new Dice();
        this.die2 = new Dice();
    }

    // Setter für Würfelwerte
    public void setPoints1(int dieVal) {
        this.die1.setPoints(dieVal); // Input values are checked in Dice Class
    }
    public void setPoints2(int dieVal) {
        this.die2.setPoints(dieVal); // Input values are checked in Dice Class
    }

    // Getter für Würfelwerte
    public int getPoints1() {
        return this.die1.getPoints();
    }
    public int getPoints2() {
        return this.die2.getPoints();
    }

    // Methode zum Werfen der beiden Würfel und gib die Summe zurück
    public int rollDice() {
        // roll() returns the value of the die; but also sets the value of the die
        return this.die1.roll() + this.die2.roll();
    }

    // Erhalte die aktuelle Summe, ohne Würfel neu zu werfen
    public int getSum() {
        return this.die1.getPoints() + this.die2.getPoints();
    }

    public String toString() {
        return "Pair of Dice with values " +
        this.die1.getPoints() + " and " +
        this.die2.getPoints();
    }

}
