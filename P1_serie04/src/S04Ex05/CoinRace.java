package S04Ex05;

public class CoinRace {
    private static final int ROW_TO_WIN = 3; // How many heads in a row to win
    public static void main(String[] args) {
        // Initialize the coins, counters for heads in a row, and a round counter
        Coin coin1 = new Coin(), coin2 = new Coin();
        int headsRow1 = 0, headsRow2 = 0;
        int counter = 1;
        // Print; check + increment rows if heads; flip to start new ...
        do {
            System.out.println("Runde " + counter + ": " +
                               coin1 + " | " + coin2);
            headsRow1 = coin1.getIsHeads() ? headsRow1+1 : 0;
            headsRow2 = coin2.getIsHeads() ? headsRow2+1 : 0;
            coin1.flip(); coin2.flip();
            counter++;
        // ... until one row reaches the goal value
        } while(headsRow1<ROW_TO_WIN && headsRow2<ROW_TO_WIN);
        // Print result
        if(headsRow1==ROW_TO_WIN && headsRow2==ROW_TO_WIN)
            System.out.println("Unentschieden!");
        else System.out.println((headsRow1==ROW_TO_WIN ? "Münze 1" : "Münze 2")
                                + " gewinnt");
    }

}
