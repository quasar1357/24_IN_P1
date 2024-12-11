package S07Ex04;

public class Bag {

    int value;
    Bag bag;

    public Bag() {}

    public Bag(int value) {
        this.addValue(value);
    }

    public void addValue(int value) {
        if(value == 0) {
            System.out.println("0 is not a valid input, as this is used for empty bags.");
            return;
        }
        if(this.value == 0) { // If empty, add the value and a new bag inside this bag
            this.value = value;
            this.bag = new Bag();
        } else { // if already occupied, we also already have a bag inside, and can add to that one
            this.bag.addValue(value);
        }
    }

    public String toString() {
        return (this.value != 0 ? "(" + this.value + ", " + this.bag + ")" : "EMPTY");
    }
}
