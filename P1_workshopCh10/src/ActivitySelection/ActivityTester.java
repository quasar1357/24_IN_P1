package ActivitySelection;

import java.util.ArrayList;

public class ActivityTester {

    public static void main(String[] args) {
        Activity[] acts = {new Activity("Sport", 1, 4),
                           new Activity("Music", 3, 5),
                           new Activity("Read", 6, 10),
                           new Activity("Yoga", 4, 6),
                           new Activity("Cinema", 15, 16),
                           new Activity("Netflix", 8, 11),
                           new Activity("Sport", 2, 14),
                           new Activity("Eat", 10, 18),
                           new Activity("Go out", 12, 13)};
        Activities activities = new Activities(acts);
        ArrayList<Activity> selection = activities.selectActivities();
        for(Activity a : selection)
            System.out.println(a);
        
    }

}
