package com.example.rieck.supergame.world;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        WorldView view = new WorldView(this);
        view.setBackgroundColor(Color.BLACK);
        setContentView(view);
    }
}
