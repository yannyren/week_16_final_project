package codeclan.com.helpers.controllers;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import codeclan.com.helpers.R;
import codeclan.com.helpers.models.Task;
import codeclan.com.helpers.models.ToDoList;

/**
 * Created by yanren on 20/11/2017.
 */

public class ToDoListAdapter extends ArrayAdapter<Task>{

    public ToDoListAdapter(Context context, ArrayList<Task> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Task currentTask = getItem(position);

        TextView taskId = listItemView.findViewById(R.id.item_id);
        taskId.setText(currentTask.getId().toString());

        TextView taskStartingTime = listItemView.findViewById(R.id.starting_time);
        taskStartingTime.setText(currentTask.getStartingTime().toString());

        TextView taskFinishingTime = listItemView.findViewById(R.id.finish_time);
        taskFinishingTime.setText(currentTask.getFinishingTime().toString());

        TextView taskDescription = listItemView.findViewById(R.id.description);
        taskDescription.setText(currentTask.getTaskDescription());


        listItemView.setTag(currentTask);

        return listItemView;

    }
}
