package ch11;

import java.util.HashMap;
import java.util.TreeSet;

public class MapSetDemo {

    public static void main( String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(24, "Wert zum Schlüssel 24");
        map.put(42, "Wert zum Schlüssel 42");

        System.out.println(map.get(24));
        System.out.println(map.get(42));
        
        TreeSet<Double> tree = new TreeSet<Double>();
        tree.add(3.1); // Wird automatisch zur Wurzel des Baumes; BINÄRER SUCHBAUM
        tree.add(2.2); // Wird als linker Nachfolger von 3.1 eingefügt
        tree.add(4.4); // Wird als rechter Nachfolger von 3.1 eingefügt
        tree.add(1.1); // Wird als linker Nachfolger von 2.2 eingefügt
        tree.add(3.2); // Wird als linker Nachfolger von 4.4 eingefügt
        // Minimum immer = linkster Knoten
        System.out.println("Min: " + tree.first());
        // Maximum immer = rechtester Knoten
        System.out.println("Max: " + tree.last());
        // Alle Elemente sind von l nach r in aufsteigender Reihenfolge
        for (Double d : tree) {
            System.out.println(d);
        }
        // Tree structure
        //         3.1
        //         /   \
        //       2.2   4.4
        //      /     /
        //    1.1   3.2


    }

}
