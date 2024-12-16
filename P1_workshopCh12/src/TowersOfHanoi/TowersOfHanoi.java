package TowersOfHanoi;

public class TowersOfHanoi {

    private int totalDisks;
    private int step = 0;

    public TowersOfHanoi(int disks) {
        totalDisks = disks;
    }

    public void solve() {
        moveTower(totalDisks, 1, 3, 2);
    }

    private void moveTower(int numDisks, int start, int end, int temp) {
        if (numDisks == 1) {
            moveOneDisk(start, end);
        } else {
            moveTower(numDisks - 1, start, temp, end); // Bewege die oberen n-1 Scheiben auf den Hilfsstapel
            moveOneDisk(start, end); // Bewege die grösste Scheibe an die Zielposition
            moveTower(numDisks - 1, temp, end, start); // Bewege die n-1 Scheiben vom Hilfsstapel auf die Zielposition
        }
    }

    private void moveOneDisk(int start, int end) {
        step++;
        System.out.println("Step " + step + ": Move one disk from " + start + " to " + end);
    }

}
