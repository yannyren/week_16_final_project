package codeclan.com.helpers.models;

import java.sql.Time;

/**
 * Created by yanren on 17/11/2017.
 */

public class Task {
    private Integer id;
    private Integer startingTime;
    private Integer finishingTime;
    private String taskDescription;

    public Task(Integer id, Integer startingTime, Integer finishingTime, String taskDescription) {
        this.id = id;
        this.startingTime = startingTime;
        this.finishingTime = finishingTime;
        this.taskDescription = taskDescription;
    }

    public Integer getId() {return this.id;}

    public Integer getStartingTime() {
        return this.startingTime;
    }

    public Integer getFinishingTime() {
        return this.finishingTime;
    }

    public String getTaskDescription()  {return this.taskDescription;}


}
