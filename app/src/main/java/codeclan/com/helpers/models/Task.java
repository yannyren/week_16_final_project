package codeclan.com.helpers.models;

import java.sql.Time;

/**
 * Created by yanren on 17/11/2017.
 */

public class Task {
    private Time startingTime;
    private Time finishingTime;
    private String taskDescription;

    public Task(Time startingTime, Time finishingTime, String taskDescription) {
        this.startingTime = startingTime;
        this.finishingTime = finishingTime;
        this.taskDescription = taskDescription;
    }

    public Time getStartingTime() {
        return this.startingTime;
    }

    public Time getFinishingTime() {
        return this.finishingTime;
    }


}
