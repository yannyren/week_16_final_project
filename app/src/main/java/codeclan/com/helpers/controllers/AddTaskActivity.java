package codeclan.com.helpers.controllers;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import codeclan.com.helpers.R;
import codeclan.com.helpers.data.DatabaseHelper;
import codeclan.com.helpers.models.Task;

public class AddTaskActivity extends AppCompatActivity {
    DatabaseHelper toDoRepo;
    EditText editStartingTime, editFinishingTime, editTaskDescription, editTextId;
    Button addTaskButtonInAddPage;
    Button viewAll;
    Button upDateButton;
    Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        toDoRepo = new DatabaseHelper(this);

        editStartingTime = findViewById(R.id.editText_starting_time);
        editFinishingTime = findViewById(R.id.editText_finishing_time);
        editTaskDescription = findViewById(R.id.editText_task_description);
        editTextId = findViewById(R.id.editText_id);

        addTaskButtonInAddPage = findViewById(R.id.add_button_addpager);
        viewAll = findViewById(R.id.view_all_button_in_addpage);
        upDateButton = findViewById(R.id.update_button_addpage);
        deleteButton = findViewById(R.id.delete_button_addpage);

        addData();
        viewAll();
        updateData();
        deleteData();
    }

    public void deleteData() {
        deleteButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = toDoRepo.deleteData(editTextId.getText().toString());
                        if(deletedRows > 0 ){
                            Toast.makeText(AddTaskActivity.this, "Data Deleted", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(AddTaskActivity.this, "Data not Deleted", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }

    public void addData(){
        addTaskButtonInAddPage.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean dataIsInserted = toDoRepo.insertData(editStartingTime.getText().toString(),
                                editFinishingTime.getText().toString(),
                                editTaskDescription.getText().toString());
                        if(dataIsInserted == true) {
                            Toast.makeText(AddTaskActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(AddTaskActivity.this, "Data not inserted", Toast.LENGTH_SHORT).show();
                        }
            }
        });
    }

    public void updateData() {
        upDateButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isUpdate = toDoRepo.updateData(
                                editTextId.getText().toString(),
                                editStartingTime.getText().toString(),
                                editFinishingTime.getText().toString(),
                                editTaskDescription.getText().toString());
                        if(isUpdate == true) {
                            Toast.makeText(AddTaskActivity.this, "Data updated", Toast.LENGTH_SHORT).show();
                        } else
                            Toast.makeText(AddTaskActivity.this, "Data not updated", Toast.LENGTH_SHORT).show();
                        }

                }
        );
    }


    public void viewAll() {
        viewAll.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Cursor res = toDoRepo.getAllData();
                        if(res.getCount() ==0) {
                            // show message
                            showMessage("Error", "No data found");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext()) {

//                            Task task = new Task(
//                                    res.getString(0),
//                                    res.getString(1),
//                                    res.getString(2),
//                                    res.getString(3)
//                            );
                            buffer.append("Id :" + res.getString(0) + "\n");
                            buffer.append("Starting Time :" + res.getString(1) + "\n");
                            buffer.append("Finishing Time :" + res.getString(2) + "\n");
                            buffer.append("Task Description :" + res.getString(3) + "\n\n");

                        }

                        //show all data

                        showMessage("Data", buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
