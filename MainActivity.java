package com.example.ecous.mygame;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity { // allow to get to the canvas bellow the activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); // allow the activity to take the entire screen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE); // allow to remove the title to get the hole screen

        setContentView(new GameView(this)); // enable the object GameView
    }
}
