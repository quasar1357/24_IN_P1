package ch11;

public class Item<T> {

    private T value;
    private Item<T> below;

    public Item(T value) {
        this.value = value;
        this.below = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Item<T> getBelow() {
        return below;
    }

    public void setBelow(Item<T> below) {
        this.below = below;
    }

}
