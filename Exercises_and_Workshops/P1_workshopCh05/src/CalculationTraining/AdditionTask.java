package CalculationTraining;

import java.util.Random;

public class AdditionTask {

    private final int MAX = 100;
    private int op1, op2, result;
    private Random rand;

    public AdditionTask() {
        this.rand = new Random();
        this.op1 = rand.nextInt(MAX + 1); // Note (MAX) + 1 wäre 1-MAX statt 0-MAX
        this.op2 = rand.nextInt(MAX - this.op1 + 1);
        this.result = this.op1 + this.op2;
    }

    // NOTE: Die Aufgaben-Klasse selbst soll verantwortlich sein,
    // die Antwort zu prüfen!!! Macht Sinn, da dies eher eine Eigenheit
    // der Aufgabe ist und nicht der Liste oder so
    public boolean checkAnswer(int answer) {
        return answer == this.result;
    }

    public void displayTask() {
        System.out.println("Addition: " + this.op1 + " + " + this.op2 + " = ?");
    }

    public int getResult() {
        return this.result;
    }

}
