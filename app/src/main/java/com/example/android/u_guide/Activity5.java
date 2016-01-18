package com.example.android.u_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 怡梅 on 2016/1/14.
 */
public class Activity5 extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        Button button =(Button) findViewById(R.id.back);
        Button button1=(Button) findViewById(R.id.quit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(Activity5.this, Activity6.class);
                startActivity(intent12);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13 = new Intent(Activity5.this, MainActivity.class);
                startActivity(intent13);
            }
        });
    }
}
