package com.example.victoria.consola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MicrosoftActivity extends AppCompatActivity {

    Button buttonXbox;
    Button buttonXbox360;
    Button buttonXboxOne;
    Button buttonXboxOneX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonXbox = (Button)findViewById(R.id.buttonXbox);
        buttonXbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationXboxActivity.class);
                startActivity(intent);

            }
        });

        buttonXbox360 = (Button)findViewById(R.id.buttonXbox360);
        buttonXbox360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationXbox360Activity.class);
                startActivity(intent);

            }
        });

        buttonXboxOne = (Button)findViewById(R.id.buttonXboxOne);
        buttonXboxOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationXboxOneActivity.class);
                startActivity(intent);

            }
        });

        buttonXboxOneX = (Button)findViewById(R.id.buttonXboxOneX);
        buttonXboxOneX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationXboxOneXActivity.class);
                startActivity(intent);

            }
        });
    }



}
