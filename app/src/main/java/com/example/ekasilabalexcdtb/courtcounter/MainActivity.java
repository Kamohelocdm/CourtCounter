package com.example.ekasilabalexcdtb.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for TeamA
    int scoreTeamA = 0;

    // Tracks score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle action bar item clicks here. the action bar will
        // automatically handle clicks on the home/up button, so long
        // as you specify a parent activity in the AndroididManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifitableIfStatement
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayforTeamA(scoreTeamA);
    }

    /**
     * increase the score for Team A by 2 ponts.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayforTeamA(scoreTeamA);

    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayforTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 points.
     */
    public void addOneforTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayforTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayforTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 3 points.
     */

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayforTeamB(scoreTeamB);

    }

    /**
     * Reset the score for both teams bact to 0.
     */
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayforTeamA(scoreTeamA);
        displayforTeamB(scoreTeamB);

    }


    /**
     * Display the given score for Team A.
     */
    public void displayforTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Team B.
     */
    public void displayforTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



}

