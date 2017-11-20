package codeclan.com.helpers.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import codeclan.com.helpers.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = this;

        getSupportActionBar().hide();

        //this.finish();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(ctx, ThingsToDoActivity.class);
                startActivity(intent);
                MainActivity.this.finish();

//                setContentView(R.layout.activity_things_to_do);

            }
        }, 3000);

    }
}
