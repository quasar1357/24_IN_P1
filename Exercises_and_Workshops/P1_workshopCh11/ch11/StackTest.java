package ch11;

public class StackTest {

    public static void main(String[] args) {
        OwnStack<Integer> stack = new OwnStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (!stack.empty()) { // RÜCKWÄRTS ausgeben
            System.out.println(stack.pop());
        }
        stack.push(6);
        stack.push(7);
        System.out.println(stack.peek());

        // Mit Strings
        OwnStack<String> stack2 = new OwnStack<String>();
        stack2.push("Hallo");
        stack2.push("Welt");
        stack2.push("!");
        while (!stack2.empty()) { // RÜCKWÄRTS ausgeben
            System.out.println(stack2.pop());
        }
        stack2.push("Java");
        stack2.push("ist");
        stack2.push("toll");
        System.out.println(stack2.peek());
    }

}
