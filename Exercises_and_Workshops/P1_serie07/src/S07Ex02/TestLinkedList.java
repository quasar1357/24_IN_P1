public class TestLinkedList {

    public static void main(String[] args) {
        OwnLinkedList<Integer> list = new OwnLinkedList<Integer>();
        System.out.println("Liste: " + list);
        System.out.println("Grösse: " + list.size());
        list.add(1);
        System.out.println("Liste: " + list);
        System.out.println("Grösse: " + list.size());
        list.add(2);
        System.out.println("Liste: " + list);
        System.out.println("Grösse: " + list.size());
        list.add(3);
        System.out.println("Liste: " + list);
        System.out.println("Grösse: " + list.size());

        OwnLinkedList<String> list2 = new OwnLinkedList<String>();
        list2.add("a");
        System.out.println(list2.getStartNode().getNext());
        System.out.println(list2.size());
        list2.add("b");
        System.out.println(list2.getStartNode().getNext());
        System.out.println(list2.size());
    }

}
