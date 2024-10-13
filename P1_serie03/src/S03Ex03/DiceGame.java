// Roman Schwob, 05-126-024

package S03Ex03;

public class DiceGame {
    /**
     * Testklasse für die Klasse PairOfDice
     */

    public static void main(String[] args){
        PairOfDice testPair = new PairOfDice();
        System.out.println("Initialisiertes Würfelpaar:");
        System.out.println(testPair);

        // Teste die setters
        System.out.println("\nNach Setzen der Werte auf 3 und 4:");
        testPair.setPoints1(3);
        testPair.setPoints2(4);
        System.out.println(testPair);

        // Teste ungültige Eingabewerte der setters
        System.out.println("\nUngültige Eingaben:");
        testPair.setPoints1(0); // Wert zu tief
        testPair.setPoints1(7); // Wert zu hoch
        System.out.println("Unverändertes Würfelpaar:");
        System.out.println(testPair);
        
        // Teste die getters
        System.out.println("\nGetters:");
        System.out.println("" + testPair.getPoints1() + " | " +
                                testPair.getPoints2());
        
        // Teste die rollDice Methode
        System.out.println("\nRoll dice:");
        int diceSum1 = testPair.rollDice();
        System.out.println(diceSum1 + "");
        
        // Teste die getSum Methode
        System.out.println("\nGet sum:");
        int diceSum2 = testPair.getSum();
        System.out.println(diceSum2 + "");        
    }
}
