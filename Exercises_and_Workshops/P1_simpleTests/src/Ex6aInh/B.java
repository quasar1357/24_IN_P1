package Ex6aInh;

public class B extends A {
    public B() {
    System.out.println("Konstruktor B");
    }
    public void printB() {
    System.out.print("B");
    }
    public void printA(int num) {
    for (int i = 0; i < num; i++)
    System.out.print("A");
    }
    }