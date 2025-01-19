package ActivitySelection;

import java.util.ArrayList;
import java.util.Arrays;

public class Activities {

    Activity[] activities;

    public Activities(Activity[] actArray){
        this.activities = actArray;
    }

    public ArrayList<Activity> selectActivities() {
        Arrays.sort(this.activities); // NOTE: This builds on the fact that the Activity class implements Comparable !
        ArrayList<Activity> selection = new ArrayList<Activity>();
        Activity currEl = this.activities[0];
        selection.add(currEl);
        for(int i = 1; i < this.activities.length; i++) {
            Activity nextEl = activities[i];
            if (nextEl.compatibleWith(currEl)) {
                currEl = nextEl;
                selection.add(currEl);
            }
        }
        return selection;
    }
}