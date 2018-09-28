package com.example.victoria.consola;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NintendoActivity extends AppCompatActivity {
    Button buttonWii;
    Button buttonWiiU;
    Button buttonNintendo3ds;
    Button buttonNintendoSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nintendo);
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

        buttonWii = (Button)findViewById(R.id.buttonWii);
        buttonWii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationWiiActivity.class);
                startActivity(intent);

            }
        });

        buttonWiiU = (Button)findViewById(R.id.buttonWiiU);
        buttonWiiU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationWiiUActivity.class);
                startActivity(intent);

            }
        });

        buttonNintendo3ds = (Button)findViewById(R.id.buttonNintendo3ds);
        buttonNintendo3ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationNintendo3dsActivity.class);
                startActivity(intent);

            }
        });

        buttonNintendoSwitch = (Button)findViewById(R.id.buttonNintendoSwitch);
        buttonNintendoSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),InformationNintendoSwitchActivity.class);
                startActivity(intent);

            }
        });
    }

}
