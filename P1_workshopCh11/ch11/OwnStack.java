package ch11;

public class OwnStack<T> {

    private Item<T> top;

    public boolean empty() {
        return this.top == null;
    }

    public void push(T value) {
        Item<T> newItem = new Item<T>(value);
        newItem.setBelow(this.top); // newItem wird auf den alten top gesetzt
        this.top = newItem; // newItem wird zum neuen top
    }

    public T pop() { // Keine Parameter, immer das oberste Element
        if (this.empty()) { // Wenn Stack leer ist
            return null;
        }
        T topEl = this.top.getValue(); // Wert vom obersten Element speichern
        this.top = this.top.getBelow(); // top wird auf den zweitobersten Wert gesetzt
        // NOTE: this.top.getBelow() == null, wenn this.top das einzige Element ist
        return topEl;
    }

    public T peek() {
        if (this.empty()) {
            return null;
        }
        return this.top.getValue();
    }

}
