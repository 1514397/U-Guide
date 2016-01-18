package com.example.android.u_guide;

/**
 * Created by 怡梅 on 2016/1/17.
 */
import android.app.AlertDialog;
import android.content.DialogInterface;
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
public class Activity6 extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Button button = (Button) findViewById(R.id.quit);
        Button button1 = (Button) findViewById(R.id.Block_A);
        Button button2 = (Button) findViewById(R.id.Block_B);
        Button button3 = (Button) findViewById(R.id.Block_C);
        Button button4 = (Button) findViewById(R.id.Block_D);
        Button button5 = (Button) findViewById(R.id.Block_E);
        Button button6 = (Button) findViewById(R.id.Block_F);
        Button button7 = (Button) findViewById(R.id.Block_G);
        Button button8 = (Button) findViewById(R.id.Block_H);
        Button button9 = (Button) findViewById(R.id.Block_J);
        Button button10 = (Button) findViewById(R.id.Block_P);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Activity6.this,MainActivity.class);
                startActivity(intent3);
            }
        });
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent4);
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent5);
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent6);
            }
        });
        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent7);
            }
        });
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent8);
            }
        });
        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent9);
            }
        });
        button8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent10);
            }
        });
        button9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent11);
            }
        });
        button10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent12);
            }
        });

    }
}