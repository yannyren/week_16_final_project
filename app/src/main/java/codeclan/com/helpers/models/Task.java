package codeclan.com.helpers.models;

import java.sql.Time;

/**
 * Created by yanren on 17/11/2017.
 */

public class Task {
    private String id;
    private String startingTime;
    private String finishingTime;
    private String taskDescription;

    public Task(String id, String startingTime, String finishingTime, String taskDescription) {
        this.id = id;
        this.startingTime = startingTime;
        this.finishingTime = finishingTime;
        this.taskDescription = taskDescription;
    }

    public String getId() {return this.id;}

    public String getStartingTime() {
        return this.startingTime;
    }

    public String getFinishingTime() {
        return this.finishingTime;
    }

    public String getTaskDescription()  {return this.taskDescription;}


}
