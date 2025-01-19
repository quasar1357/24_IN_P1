package S04Ex05;

import java.util.Random;

public class Coin {
    private boolean isHeads;
    private static Random rand = new Random();

    public Coin(){
        this.flip();
    }

    public void flip(){
        isHeads = rand.nextBoolean();
    }

    public boolean getIsHeads() {
        return isHeads;
    }

    public boolean equals(Coin otherCoin){
        return otherCoin.getIsHeads() == this.isHeads;
    }

    public String toString() {
        return (isHeads ? "Kopf" : "Zahl");
    }
}
