package S04Ex06;

import java.util.Random;

public class Dice {
    private final int sides;
    private int points;
    private Random rand;

    public Dice(int sidesIn, int pointsIn) {
        this.sides = sidesIn;
        this.points = pointsIn;
        this.rand = new Random();
    }

    public Dice(int sidesIn) {
        this.sides = sidesIn;
        this.rand = new Random();
        this.roll();
    }
    public int roll() {
        this.points = rand.nextInt(sides) + 1;
        return this.points;
    }

    public int getPoints() {
        return this.points;
    }
    public int getSides() {
        return this.sides;
    }
    public void setPoints(int pointsIn) {
        this.points = pointsIn;
    }
    public String toString() {
        return "Dice with " + this.sides + " sides and " + this.points + " points";
    }
}
