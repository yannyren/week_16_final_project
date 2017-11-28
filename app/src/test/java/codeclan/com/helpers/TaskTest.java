package codeclan.com.helpers;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.helpers.models.Task;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 19/11/2017.
 */

public class TaskTest {

    private Task task;

    @Before
    public void before() {
        this.task = new Task("1","1030", "1130", "pick up letter");
    }

    @Test
    public void hasStartingTime(){
        assertEquals("1030",task.getStartingTime());
    }

    @Test
    public void canGetJobDescription() {
        assertEquals("pick up letter", this.task.getTaskDescription());
    }

}
