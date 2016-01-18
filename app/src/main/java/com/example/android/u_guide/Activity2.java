package com.example.android.u_guide;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 怡梅 on 2015/12/2.
 */
public class Activity2 extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);
        Button button = (Button) findViewById(R.id.back);
        Button button1= (Button) findViewById(R.id.quit);
        Button button2 =(Button)findViewById(R.id.advanced_networkingL);
        Button button3 =(Button)findViewById(R.id.advanced_networkingP);
        Button button4 =(Button)findViewById(R.id.research_methodologies);
        Button button5 =(Button)findViewById(R.id.social_and_professionalL);
        Button button6 =(Button)findViewById(R.id.social_and_professionalP);
        Button button7 =(Button)findViewById(R.id.social_and_professionalP2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent4);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Activity2.this, Activity1.class);
                startActivity(intent5);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Activity2.this).setTitle("Message")
                    .setMessage("Are you in the building?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent a = new Intent(Activity2.this, Activity5.class);
                            startActivity(a);
                        }
                    })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent a = new Intent(Activity2.this, Activity5.class);
                        startActivity(a);
                    }
                }).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15 = new Intent(Activity2.this, Activity5.class);
                startActivity(intent15);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(Activity2.this, Activity5.class);
                startActivity(intent16);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17 = new Intent(Activity2.this, Activity5.class);
                startActivity(intent17);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18 = new Intent(Activity2.this, Activity5.class);
                startActivity(intent18);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19 = new Intent(Activity2.this, Activity5.class);
                startActivity(intent19);
            }
        });
    }
}