package com.example.user.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score_team_a;
    private int score_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //New game button
    public void click_new_game(View view) {
        score_team_a = 0;
        score_team_b = 0;
        displayScore_a();
        displayScore_b();
    }

    //Team A buttons
    public void click_touchdown_a(View view) {
        score_team_a += 6;
        displayScore_a();
    }

    public void click_field_goal_a(View view) {
        score_team_a += 3;
        displayScore_a();
    }

    public void click_safety_a(View view) {
        score_team_a += 2;
        displayScore_a();
    }

    public void click_extra_2_a(View view) {
        score_team_a += 2;
        displayScore_a();
    }

    public void click_extra_1_a(View view) {
        score_team_a += 1;
        displayScore_a();
    }

    //Team B buttons
    public void click_touchdown_b(View view) {
        score_team_b += 6;
        displayScore_b();
    }

    public void click_field_goal_b(View view) {
        score_team_b += 3;
        displayScore_b();
    }

    public void click_safety_b(View view) {
        score_team_b += 2;
        displayScore_b();
    }

    public void click_extra_2_b(View view) {
        score_team_b += 2;
        displayScore_b();
    }

    public void click_extra_1_b(View view) {
        score_team_b += 1;
        displayScore_b();
    }

    //Display method when team A scores
    private void displayScore_a() {
        TextView TextScoreA = (TextView) findViewById(R.id.text_score_a);
        String score_a = "" + score_team_a;
        TextScoreA.setText(score_a);
    }

    //Display method when team B scores
    private void displayScore_b() {
        TextView TextScoreB = (TextView) findViewById(R.id.text_score_b);
        String score_b = "" + score_team_b;
        TextScoreB.setText(score_b);
    }
}
