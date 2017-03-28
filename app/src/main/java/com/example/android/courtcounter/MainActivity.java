package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    int teamApoints = 0;
    int teamBpoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * TEAM A Buttons
     */

    public void aThreePoints(View view) {


        teamApoints = teamApoints + 3;
        displayAscore(teamApoints);
    }

    public void aTwoPoints(View view) {


        teamApoints = teamApoints + 2;
        displayAscore(teamApoints);
    }

    public void aFreeThrow(View view) {


        teamApoints = teamApoints + 1;
        displayAscore(teamApoints);
    }


    /**
     * TEAM B Buttons
     */

    public void bThreePoints(View view) {


        teamBpoints = teamBpoints + 3;
        displayBscore(teamBpoints);
    }

    public void bTwoPoints(View view) {


        teamBpoints = teamBpoints + 2;
        displayBscore(teamBpoints);
    }

    public void bFreeThrow(View view) {


        teamBpoints = teamBpoints + 1;
        displayBscore(teamBpoints);
    }

    /**
     * This method displays the score of TEAM A on the screen.
     */
    private void displayAscore(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.a_score);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the score of TEAM B on the screen.
     */

    private void displayBscore(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.b_score);
        quantityTextView.setText("" + number);
    }


    /**
     * To RESET the score of TEAMs on the screen.
     */


    public void reset(View view) {


        teamApoints = 0;
        displayAscore(teamApoints);
        teamBpoints = 0;
        displayBscore(teamBpoints);
    }

    /**
     * This method RESETS the score of TEAM A on the screen.
     */

    private void resetAscore(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.a_score);
        quantityTextView.setText("" + number);
    }
}
