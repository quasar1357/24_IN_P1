package ActivitySelection;

public class Activity implements Comparable<Activity> { // NOTE: Has to implement Comparable so we can use this method for sorting with built-in methods !
    private String name;
    private int start;
    private int finish;

    public Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public int getFinish() {
        return finish;
    }

    public boolean compatibleWith(Activity otherAct){
        boolean before = this.finish <= otherAct.getStart();
        boolean after = this.start >= otherAct.getFinish();
        return before || after;
    }

    public int compareTo(Activity otherAct) {
        return this.finish - otherAct.getFinish();
    }

    @Override
    public String toString() {
        return name + " (" + start + ", " + finish + ")";
    }
}
