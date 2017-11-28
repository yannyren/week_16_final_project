package codeclan.com.helpers.models;

import java.util.ArrayList;

/**
 * Created by yanren on 20/11/2017.
 */

public class ToDoList {

//ToDoRepo

    //public void save(Task task) {
    //  dbLogic to save task
    //}

    //public void update(Task task) {

    //}

    //public ArrayList<Task> getAll() {

    //}


    private ArrayList<Task> list;

    public ToDoList(){

        Task task1 = new Task("1","1030","1100", "drop off parents");
        Task task2 = new Task("2","1100","1200", "go to gym");
        Task task3 = new Task("3","1200","1300", "lunch with friend");
        Task task4 = new Task("4","1300","1330", "meeting with client");
        Task task5 = new Task("5","1330","1400", "meeting with supplier");
        Task task6 = new Task("6","1400","1430", "meeting with marketing manager");
        Task task7 = new Task("7","1430","1500", "meeting with sales team");
        Task task8 = new Task("8","1500","1510", "tea break");
        Task task9 = new Task("9","1510","1530", "call business school");
        Task task10 = new Task("10","1530","1600", "pick up parents");
        Task task11 = new Task("11","1600","1630", "proposal prep");


        this.list = new ArrayList<>();

        this.list.add(task1);
        this.list.add(task2);
        this.list.add(task3);
        this.list.add(task4);
        this.list.add(task5);
        this.list.add(task6);
        this.list.add(task7);
        this.list.add(task8);
        this.list.add(task9);
        this.list.add(task10);
        this.list.add(task11);

    }

    public ArrayList<Task> getList() {
        return this.list;
    }
}
