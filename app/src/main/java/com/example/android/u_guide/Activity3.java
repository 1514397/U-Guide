package com.example.android.u_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by 怡梅 on 2015/12/2.
 */
public class Activity3 extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_events);
        Button button =(Button) findViewById(R.id.back);
        Button button1=(Button) findViewById(R.id.quit);
        Button button2=(Button) findViewById(R.id.add_personal_events);
        Button button3=(Button) findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Activity3.this, Activity1.class);
                startActivity(intent7);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(Activity3.this, MainActivity.class);
                startActivity(intent8);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(Activity3.this,Activity4.class);
                startActivity(intent9);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(Activity3.this, Activity2.class);
                startActivity(intent12);
            }
        });
        find_and_modify_view();
    }
    private static final String[] mevents={"Trip to the Bedfordshire","Walking for wellbeing","Academic Writing"};
    private void find_and_modify_view() {
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner_1);
        ArrayList allevents = new ArrayList<String>();
        for (int i = 0; i < mevents.length; i++) {
            allevents.add(mevents[i]);
        }
       ArrayAdapter aspnEvents =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,allevents);
        aspnEvents.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(aspnEvents);
    }

}