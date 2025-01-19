package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        Double[] doubles = {3.1, 4.5, 1.3, 0.9, 7.9, 11.2, 18.9, 4.6};
        Double[] doublesBackup = doubles.clone();
        System.out.println("Bubble sort:");
        bubbleSort(doubles);
        for (Double aDouble : doubles) {
            System.out.println(aDouble + " ");
        }
        System.out.println("Bucket sort:");
        ArrayList<Double> sortedDoubles = bucketSort(doublesBackup);
        for (Double aDouble : sortedDoubles) {
            System.out.println(aDouble + " ");
        }
    }

    // Specific implementation; only works with Doubles
    // private static void bubbleSort(Double[] doubles) {
    // }
    
    // Generic implementation; Doubles are Comparable, so it works with Doubles (but also other Comparables)
    private static <T> void bubbleSort(Comparable<T>[] list) {
        for (int i = 0; i <= list.length; i++) {
            for (int j = list.length - 1; j>i; j--) {
                T elBefore = (T) list[j-1];
                if (list[j].compareTo(elBefore) < 0) {
                    swap(list, j, j-1);
                }
            }
        }
    }

    private static <T> void swap(Comparable<T>[] list, int i, int j) {
        Comparable<T> temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    private static ArrayList<Double> bucketSort(Double[] numbers) {
        int n = numbers.length;
        Double maxVal = Collections.max(Arrays.asList(numbers));

        // Normalize numbers
        Double[] normNumbers = new Double[n];
        Double factor = 1.3;
        for (int i = 0; i < n; i++) {
            normNumbers[i] = numbers[i] / (maxVal * factor); // Note: multiplying by factor to avoid out of bounds for last bucket
        }

        // Create buckets
        ArrayList[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Double>();
        }
        for (Double number : normNumbers) {
            int index = (int) (number * n); // Note: casting to int also takes the floor
            Double val = number * (maxVal * factor);
            val = Math.round(val * 100) / 100.0;
            buckets[index].add(val);
        }

        // Sort buckets
        ArrayList<Double> sortedNumbers = new ArrayList<>();
        for (ArrayList<Double> bucket : buckets) {
            // bubbleSort(bucket.toArray(new Double[0]));
            Collections.sort(bucket);
            sortedNumbers.addAll(bucket);
        }
        return sortedNumbers;
    }
}
