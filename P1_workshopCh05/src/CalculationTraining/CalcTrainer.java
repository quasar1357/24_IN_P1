package CalculationTraining;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CalcTrainer {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie viele Aufgaben sollen erstellt werden?");
        int number = scan.nextInt();
        TaskList tl = new TaskList(number); // Objekt Instanziieren
        ArrayList<AdditionTask> tasks = tl.getTasks(); // Liste mit Aufgaben holen
        Iterator<AdditionTask> iter = tasks.iterator(); // Iterator darauf erstellen

        int numCorrect = 0;
        while (iter.hasNext()) {
            AdditionTask task = iter.next();
            task.displayTask();
            int answer = scan.nextInt();
            if (task.checkAnswer(answer)) {
                System.out.println("Richtig!");
                numCorrect++;
            } else {
                System.out.println("Falsch! Richtig wäre " + task.getResult());
            }
        }
        System.out.println("========= ENDE =========");
        System.out.println("BILANZ: " + numCorrect + " von " + number + " richtig.");
    }

}
