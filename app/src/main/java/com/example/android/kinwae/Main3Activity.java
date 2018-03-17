package com.example.android.kinwae;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.kofigyan.stateprogressbar.StateProgressBar;

public class Main3Activity extends AppCompatActivity {
    String[] descriptionData = {"Personal","Contact","Upload"};
    CardView card1;
    CardView card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        card1= findViewById(R.id.card_view);
        card2=findViewById(R.id.cardView2);
        StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Congratulations!, User your account has been created!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Card Clicked, Action Yet to be added", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Card Clicked, Action Yet to be added", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
