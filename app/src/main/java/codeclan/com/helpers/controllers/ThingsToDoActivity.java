package codeclan.com.helpers.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import codeclan.com.helpers.R;
import codeclan.com.helpers.models.Task;
import codeclan.com.helpers.models.ToDoList;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

//        final Context ctx = this;
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                Intent intent = new Intent(ctx, TaskActivity.class);
//                startActivity(intent);
//
////                setContentView(R.layout.activity_things_to_do);
//
//            }
//        }, 4000);


//        ArrayAdapter<Task> adapter = new ArrayAdapter<Task>(
//                this,
//                R.layout.list_item_things_to_do,
//                R.id.text_view_things_to_do,
//                thingsToDoList);
//
//
//        ListView toDolistView = findViewById(R.id.things_to_do_list_view);
//        toDolistView.setAdapter(adapter);
//
//
//        toDolistView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(ThingsToDoActivity.this, ""+i, Toast.LENGTH_SHORT).show();
//            }
//        });

        ToDoList toDoList = new ToDoList();
        ArrayList<Task> list = toDoList.getList();

        ToDoListAdapter toDoListAdapter = new ToDoListAdapter(this,list);
        ListView toDoListView = (ListView) findViewById(R.id.things_to_do_list_view);
        toDoListView.setAdapter(toDoListAdapter);


    }

    public void getTask(View listView) {
//        Task task = (Task)listItem.getTag();

    }



}
