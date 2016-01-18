package com.example.android.u_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by 怡梅 on 2015/12/2.
 */
public class Activity1 extends AppCompatActivity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button button = (Button) findViewById(R.id.quit);
        Button button1= (Button) findViewById(R.id.schedule);
        Button button2= (Button)findViewById(R.id.add_events);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Activity1.this, Activity2.class);
                startActivity(intent3);
            }
        });
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Activity1.this, MainActivity.class);
                startActivity(intent2);
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(Activity1.this, Activity3.class);
                startActivity(intent6);
            }
        });

    }
    }
