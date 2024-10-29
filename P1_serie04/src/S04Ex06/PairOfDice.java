package S04Ex06;

import java.util.ArrayList;

public class PairOfDice {

    private final int sides;
    private Dice dice1;
    private Dice dice2;
    private ArrayList<Integer> rolls;

    public PairOfDice(int sidesIn, int pointsIn1, int pointsIn2) {
        this.sides = sidesIn;
        this.dice1 = new Dice(sidesIn, pointsIn1);
        this.dice2 = new Dice(sidesIn, pointsIn2);
        this.rolls = new ArrayList<Integer>();
        rolls.add(pointsIn1);
        rolls.add(pointsIn2);
    }

    public PairOfDice(int sidesIn) {
        this.sides = sidesIn;
        this.dice1 = new Dice(sidesIn);
        this.dice2 = new Dice(sidesIn);
        this.rolls = new ArrayList<Integer>();
        this.rolls.add(dice1.getPoints());
        this.rolls.add(dice2.getPoints());
    }

    public int roll() {
        int points1 = this.dice1.roll();
        int points2 = this.dice2.roll();
        this.rolls.set(0, points1);
        this.rolls.set(1, points2);
        return points1 + points2;
    }

    public int getPoints1() {
        return this.dice1.getPoints();
    }

    public int getPoints2() {
        return this.dice2.getPoints();
    }

    public ArrayList<Integer> getRolls() {
        return this.rolls;
    }

    public int getSides() {
        return this.sides;
    }

    public void setPoints1(int pointsIn) {
        this.dice1.setPoints(pointsIn);
    }

    public void setPoints2(int pointsIn) {
        this.dice2.setPoints(pointsIn);
    }

    public String toString() {
        return "Pair of dice with " + this.sides + " sides and points " + this.points1 + " and " + this.points2;
    }

}
