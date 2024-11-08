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
        // Test variable number of arguments
        createAndPrintIntArr(1, 2, 3, 45, 21, 14);
        int[] arr3 = createAndPrintIntArr(5, 4, 3);
        System.out.println("length: " + arr3.length);
    }

    private static int[] createAndPrintIntArr(int ... arrIn) {
        int[] arr = arrIn;
        System.out.println("length: " + arr.length);
        for(int arrEl : arr) {
            System.out.println(arrEl);
        }
        return arr;
    }
}
