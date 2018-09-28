package com.example.victoria.consola;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class GamesActivity extends AppCompatActivity {

    private static ArrayList<Games> games= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
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


        games.add(new Games("Action"));
        games.add(new Games("History"));
        games.add(new Games("Simulation"));
        games.add(new Games("Terror"));
        games.add(new Games("Shoters"));
        games.add(new Games("Fight"));

        RecyclerView recyclerViewGames = findViewById(R.id.recyclerViewGames);

        RecyclerView.LayoutManager layoutManagerGames = new GridLayoutManager(this,1);
        recyclerViewGames.setLayoutManager(layoutManagerGames);
        GamesAdapter gamesAdapter = new GamesAdapter(games);
        recyclerViewGames.setAdapter(gamesAdapter);

    }

}
