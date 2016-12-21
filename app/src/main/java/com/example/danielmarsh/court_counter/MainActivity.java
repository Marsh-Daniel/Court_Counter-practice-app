package com.example.danielmarsh.court_counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void addTwoToScoreTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeToScoreTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addOneToScoreTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addTwoToScoreTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeToScoreTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addOneToScoreTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
