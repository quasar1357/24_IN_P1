package Ex6aInh;


public class Main {
    public static void main(String[] args) {
    C c = new C();
    c.printB();
    c.printA();
    c.printA(3);
    }

    // Ausgabe:
    // Konstruktor A
    // Konstruktor B
    // BACAAA
}
