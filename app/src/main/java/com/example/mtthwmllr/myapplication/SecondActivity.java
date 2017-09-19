package com.example.mtthwmllr.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    int i = 0, passwordInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button button1 = (Button) findViewById(R.id.button6);
        Button button2 = (Button) findViewById(R.id.button7);
        Button button4 = (Button) findViewById(R.id.button8);
        Button button3 = (Button) findViewById(R.id.button9);
        Button submit = (Button) findViewById(R.id.button10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passwordHandler(1);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passwordHandler(2);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passwordHandler(3);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passwordHandler(4);

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passwordHandler(5);

            }
        });
    }

    private void passwordHandler(int passNum) {

        i = i + 1;

        if(passNum == 1 && passwordInt == 0) {
            passwordInt = 1;
        }
        else if(passNum == 2 && passwordInt == 1) {
            passwordInt = 2;
        }
        else if(passNum == 3 && passwordInt == 2) {
            passwordInt = 3;
        }
        else if(passNum == 4 && passwordInt == 3) {
            passwordInt = 4;
        }
        else if(passNum != 5){
            passwordInt = 0;
        }

        if(passNum == 5) {
            if (passwordInt == 4) {

                setContentView(R.layout.activity_main);
                TextView text = (TextView) findViewById(R.id.textView1);
                text.setText("Welcome to the App! The App is UNLOCKED!");
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);


            }
            else {

                setContentView(R.layout.activity_main);
                TextView text = (TextView) findViewById(R.id.textView1);
                text.setText("Welcome to the App! The App is LOCKED!");
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);


            }

        }
        if(i == 5) {
            passwordInt = 0;
            i = 0;
        }

    }

}
