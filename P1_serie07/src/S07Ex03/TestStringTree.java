package S07Ex03;

public class TestStringTree {

    public static void main(String[] args) {
        StringTree st = new StringTree();
        st.add("f");
        st.add("g");
        st.add("c");
        st.add("k");
        st.add("b");
        st.add("c");
        System.out.println("Minumum: " + st.minimum());
        System.out.println("Ordered Values: ");
        st.printMe();

        StringTree st2 = new StringTree();
        String input = StringTree.readFile("P1_serie07/src/S07Ex03/strings.txt");
        st2.readString(input);
        System.out.println("Minumum: " + st2.minimum());
        System.out.println("Ordered Values: ");
        st2.printMe();

    }

}
