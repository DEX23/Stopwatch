package com.example.android.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class StopwatchActivity extends Activity {

    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }

    //Start the stopwatch running when Start button is clicked.
    public void onClickStart(View view) {
        running = true;
    }

    //Stop the stopwatch running when Stop button is clicked.
    public void onClickStop(View view) {
        running = false;
    }

    //Reset the stopwatch when Reset button is clicked.
    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }
}
