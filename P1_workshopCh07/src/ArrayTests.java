public class ArrayTests {
    public static void main(String[] args) throws Exception {
        // Test String array
        String[] arr1 = new String[5];
        arr1[0] = "string1";
        arr1[1] = "string2";
        System.out.println("length: " + arr1.length);
        for(String arrEl : arr1) {
            System.out.println(arrEl);
        }
        // Test int array and initialization list
        int[] arr2 = {1, 2, 3, 4};
        arr2[0] = 10;
        arr2[1] = 20;
        System.out.println("length: " + arr2.length);
        for(int arrEl : arr2) {
            System.out.println(arrEl);
        }

        // Test 2D array
        int[][] testArr = new int[2][3];
        for(int[] row : testArr) {
            for(int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Test 2D array with different row lengths
        String[][] testString = {{"a", "b", "c"}, {"c", "d"}};
        System.out.println("num rows: " + testString.length);
        for(String[] row : testString) {
            System.out.print("num cols: " + row.length + " | ");
            for(String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Test variable number of arguments
        createAndPrintIntArr(1, 2, 3, 45, 21, 14);
        int[] arr3 = createAndPrintIntArr(5, 4, 3);
        System.out.println("length: " + arr3.length);

        // Test swapping method
        int[] swapArray = {1,2,3,4,5,6};
        for(int el : swapArray) System.out.print(el);
        System.out.println();
        swap(swapArray, 2,4);
        for(int el : swapArray) System.out.print(el);
        System.out.println();

        // Test letter counter
        String sentence1 = "Ich bin mir sehr sicher, dass das geht!"; //" abcdefghijklmnopqrstuvwxyz";
        int[] countSentence1 = letterCount(sentence1);
        for(int i=0; i<26; i++) System.out.println((char)('a' + i) + ": " + countSentence1[i]);
        System.out.println("others: " + countSentence1[26]);
    }

    private static int[] createAndPrintIntArr(int ... arrIn) {
        int[] arr = arrIn;
        System.out.println("length: " + arr.length);
        for(int arrEl : arr) {
            System.out.println(arrEl);
        }
        return arr;
    }

    private static void swap(int[] values, int i, int j) {
        if (!(i>0 && i<values.length && j>0 && j<values.length))
            return;
        int initI = values[i];
        values[i] = values[j];
        values[j] = initI;
    }

    private static int[] letterCount(String sentence){
        final int NUM_CHARS = 26;
        int[] charCount = new int[NUM_CHARS+1];
        int specialCount = 0;
        char current; // current character in loop below

        String sLower = sentence.toLowerCase(); // we do not differentiate upper/lower case

        for(int pos = 0; pos< sLower.length(); pos++){ // go through sentence
            // Options:
            // - switch statement
            // - go through characters: for(int cIdx = 0; cIdx < NUM_CHARS; cIdx++) if ...
            // - use and compare character values... !!!
            current = sLower.charAt(pos);
            if(current >= 'a' && current <= 'z')
                charCount[current - 'a']++; // e.g. 'g' - 'a' = 103 - 97 = 6
            else specialCount++; // special character                
        }
        charCount[NUM_CHARS] = specialCount;
        return charCount;
    }
}
