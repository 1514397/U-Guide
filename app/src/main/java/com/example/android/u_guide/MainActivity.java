package com.example.android.u_guide;
import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;

import java.util.Vector;

public class MainActivity extends Activity {

    public static Button button;
    private static final String DATABASE_NAME = "U-GUIDE.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "username";
    private boolean isInit = false;
    private EditText nameText, passText;
    private DatebaseHelper databaseHelper;
    private SQLiteDatabase db;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.login);
        Button button3=(Button)findViewById(R.id.guest_login);
        nameText=(EditText)findViewById(R.id.username);
        passText=(EditText)findViewById(R.id.pasw);
        button.setOnClickListener(new LoginListener());
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MainActivity.this, Activity6.class);
                startActivity(intent7);
            }
        });
    }

    class LoginListener implements OnClickListener {
        public void onClick(View v) {
            String nameString = nameText.getText().toString();
            String passString = passText.getText().toString();
            if (nameString.equals("") || passString.equals("")) {
                new AlertDialog.Builder(MainActivity.this).setTitle("Error")
                        .setMessage("The username and password cannot be empty").setPositiveButton("Yes", null)
                        .show();
            } else {
                isUserinfo(nameString, passString);
            }
        }
    }

    public Boolean isUserinfo(String name, String pass) {
        String nameString = name;
        String passString = pass;
        databaseHelper = new DatebaseHelper(MainActivity.this, DATABASE_NAME, null, DATABASE_VERSION);
        init(name, pass);
        db = databaseHelper.getReadableDatabase();
        try {
            Cursor cursor = db.query(TABLE_NAME, new String[]{"name", "password"}, "name=?", new String[]{nameString}, null, null, "password");
            while (cursor.moveToNext()) {
                String password = cursor.getString(cursor.getColumnIndex("password"));

                System.out.println("1");
                if (passString.equals(password)) {
                    new AlertDialog.Builder(MainActivity.this).setTitle("Congratulation")
                            .setMessage("Success log in").setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent a = new Intent(MainActivity.this, Activity1.class);
                            startActivity(a);
                        }
                    }).show();

                    break;
                } else {
                    Toast.makeText(this, "Wrong username or password", Toast.LENGTH_LONG).show();
                    break;
                }
            }


        } catch (SQLiteException e) {
            CreatTable();
        }
        return false;
    }

    private void CreatTable() {
        // TODO Auto-generated method stub
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                + " (name varchar(30) primary key,password varchar(30));";
        try {
            db.execSQL(sql);
        } catch (SQLException ex) {
        }
    }
    public void init(String nameString, String passtring) {
        ;
        db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select sum(name) from " + TABLE_NAME + ";", null);
        int i = cursor.getColumnCount();
        if (i == 0) {
            Vector<String> userNameVec = new Vector<String>();
            Vector<String> userPwdVec = new Vector<String>();
            int userNum = 1;
            userNameVec.add("1514404");
            // userNameVec.add("1514397");
            // userNameVec.add("1514406");
            // userNameVec.add("1511549");
            //userNameVec.add("1225745");
            userPwdVec.add("1514404");
            // userPwdVec.add("1514397");
            //userPwdVec.add("1514406");
            // userPwdVec.add("1511549");
            // userPwdVec.add("1225745");
            for (int j = 0; j != userNum; ++j) {
                String namestring = userNameVec.get(j);
                String passstring = userPwdVec.get(j);
                System.out.println(namestring + "  " + passstring);
                db.execSQL("insert into username (name,password) values(?,?)", new String[]{namestring, passstring});
            }
        }
    }
}





