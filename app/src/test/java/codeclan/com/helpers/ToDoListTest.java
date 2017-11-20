package codeclan.com.helpers;

import org.junit.Test;

import java.util.ArrayList;

import codeclan.com.helpers.models.Task;
import codeclan.com.helpers.models.ToDoList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 20/11/2017.
 */

public class ToDoListTest {

    @Test
    public void canGetList() {

        ToDoList toDoList = new ToDoList();

        assertEquals(11, toDoList.getList().size());
    }
}
