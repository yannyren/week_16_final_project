package codeclan.com.helpers.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import codeclan.com.helpers.data.DatabaseHelper;
import codeclan.com.helpers.R;
import codeclan.com.helpers.adapters.ToDoListAdapter;
import codeclan.com.helpers.models.Task;
import codeclan.com.helpers.models.ToDoList;

public class ThingsToDoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);


        ToDoList toDoList = new ToDoList();
        ArrayList<Task> list = toDoList.getList();

        ToDoListAdapter toDoListAdapter = new ToDoListAdapter(this,list);
        ListView toDoListView = (ListView) findViewById(R.id.things_to_do_list_view);
        toDoListView.setAdapter(toDoListAdapter);

    }

    public void getTask(View listItemSelected) {
        Task task = (Task)listItemSelected.getTag();
        Log.d("Task Descrition", task.getTaskDescription());
        Toast.makeText(this, String.valueOf(task.getStartingTime()),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TaskActivity.class);


        intent.putExtra("id", task.getId());
        startActivity(intent);

    }





}
