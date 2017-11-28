package codeclan.com.helpers.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import codeclan.com.helpers.R;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        int id = getIntent().getExtras().getInt("id");

        //TaskRepo taskrepo = new TaskRepo(this);

        //Task task = taskrepo.findById(id);
    }
}
