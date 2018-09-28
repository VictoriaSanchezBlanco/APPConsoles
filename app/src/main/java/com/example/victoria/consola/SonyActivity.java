package com.example.victoria.consola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SonyActivity extends AppCompatActivity {
    Button  buttonPlay4;
    Button  buttonPlay3;
    Button  buttonPlay2;
    Button  buttonPlay1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sony);
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

        buttonPlay1 = (Button)findViewById(R.id.buttonPlay1);
        buttonPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationPS1Activity.class);
                startActivity(intent);

            }
        });

        buttonPlay2 = (Button)findViewById(R.id.buttonPlay2);
        buttonPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationPS2Activity.class);
                startActivity(intent);

            }
        });

        buttonPlay3 = (Button)findViewById(R.id.buttonPlay3);
        buttonPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationPS3Activity.class);
                startActivity(intent);

            }
        });

        buttonPlay4 = (Button)findViewById(R.id.buttonPlay4);
        buttonPlay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationPS4Activity.class);
                startActivity(intent);

            }
        });
    }

}
