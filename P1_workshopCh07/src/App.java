public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[5];
        // int[] arr = {1, 2, 3, 4, 5};
        arr[0] = 1;
        arr[1] = 2;
        System.out.println("length: " + arr.length);
        for(int arrEl : arr) {
            System.out.println(arrEl);
        }
        createAndPrintArr();//1, 2, 3, 45, 21, 14);
    }

    private static <T> void createAndPrintArr() {
        T[] arr = (T[]) new Object[5];
        System.out.println("length: " + arr.length);
        for(T arrEl : arr) {
            System.out.println(arrEl.getClass());
        }
        // System.out.println("length: " + arrIn.length);
        // System.out.println("type" + arrIn.getClass().getComponentType());
        // for(T arrEl : arrIn) {
        //     System.out.println(arrEl);
        // }
    }
}
