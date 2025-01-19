package CalculationTraining;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<AdditionTask> tasks;

    public TaskList(int number) {
        this.tasks = new ArrayList<AdditionTask>();
        int i = 0;
        while (i < number) {
            this.tasks.add(new AdditionTask());
            // Alternativ ginge auch (aber überflüssige Zuweisung/Variable):
            // AdditionTask addT = new AdditionTask();
            // this.tasks.add(addT);
            i++;
        }
    }

    public ArrayList<AdditionTask> getTasks() {
        return this.tasks;
    }

}
