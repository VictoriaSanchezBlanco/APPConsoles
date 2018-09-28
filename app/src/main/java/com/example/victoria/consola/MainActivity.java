package com.example.victoria.consola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button buttonCuriosities;
    TextView textViewResponse;
    Button buttonListGames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==1){
                    Intent intent = new Intent(getApplicationContext(),MicrosoftActivity.class);
                    startActivity(intent);
                }
                if (i==2){
                    Intent intent = new Intent(getApplicationContext(),NintendoActivity.class);
                    startActivity(intent);
                }
                if (i==3){
                    Intent intent = new Intent(getApplicationContext(),SonyActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        buttonListGames=(Button)findViewById(R.id.buttonListGames);
        buttonListGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),GamesActivity.class);
                startActivity(intent);
            }
        });

        buttonCuriosities = (Button)findViewById(R.id.buttonCuriosities);
        textViewResponse=(TextView)findViewById(R.id.textViewResponse);
        buttonCuriosities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showCuriosities();
            }
        });
    }

    private void showCuriosities() {

        String url = "http://192.168.201.89:4000/api/curiosities";
        //RequestQueue queue;
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                textViewResponse.setText(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textViewResponse.setText(error.toString());
            }
        });

        RequestQueue queue= Volley.newRequestQueue(this);
        queue.add(jsonObjectRequest);

    }



}
