package com.example.android.u_guide;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.util.TimeFormatException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by 怡梅 on 2015/12/3.
 */
public class Activity4 extends AppCompatActivity {
    private int year, monthOfYear, dayOfMonth, hourOfDay, minute;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_personal_events);
        Button button = (Button) findViewById(R.id.back);
        Button button1 = (Button) findViewById(R.id.quit);
        Button button2 = (Button) findViewById(R.id.add);
        final EditText text = (EditText) findViewById(R.id.editText);
        final EditText text1 = (EditText) findViewById(R.id.editText2);
        Calendar calendar = Calendar.getInstance();
        hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        year =calendar.get(Calendar.YEAR);
        monthOfYear=calendar.get(Calendar.MONTH);
        dayOfMonth =calendar.get(Calendar.DAY_OF_MONTH);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(Activity4.this, Activity1.class);
                startActivity(intent10);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(Activity4.this, MainActivity.class);
                startActivity(intent11);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13 = new Intent(Activity4.this, Activity2.class);
                startActivity(intent13);
            }
        });
        find_and_modify_view();

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 实例化一个TimePickerDialog的对象
                 * 第二个参数是一个TimePickerDialog.OnTimeSetListener匿名内部类，当用户选择好时间后点击done会调用里面的onTimeset方法
                 */
                TimePickerDialog timePickerDialog = new TimePickerDialog(Activity4.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        text1.setText("Time: " + hourOfDay + ":" + minute);
                    }
                }, hourOfDay, minute, true);

                timePickerDialog.show();
            }
        });
        text.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                /**
                 * 实例化一个DatePickerDialog的对象
                 * 第二个参数是一个DatePickerDialog.OnDateSetListener匿名内部类，当用户选择好日期点击done会调用里面的onDateSet方法
                 */
                DatePickerDialog datePickerDialog = new DatePickerDialog(Activity4.this, new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth)
                    {
                        text.setText("Date：" + year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
                    }
                }, year, monthOfYear, dayOfMonth);

                datePickerDialog.show();
            }
        });
    }


    private static final String[] mlocation = {"Luton Campus", "Bedford Campus"};

    private void find_and_modify_view() {
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner_2);
        ArrayList allevents = new ArrayList<String>();
        for (int i = 0; i < mlocation.length; i++) {
            allevents.add(mlocation[i]);
        }
        ArrayAdapter aspnEvents = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, allevents);
        aspnEvents.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(aspnEvents);
    }
}