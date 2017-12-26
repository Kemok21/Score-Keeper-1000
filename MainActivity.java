package com.example.android.scorekeeper1000;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreRed = 0;
    int scoreBlue = 0;
    int scoreGreen = 0;
    int boltCountForRed = 0;
    int boltCountForBlue = 0;
    int boltCountForGreen = 0;

    /**
     * add and dell score for Red
     */
    public void addHundredForRed (View v) {
        scoreRed += 100;
        displayForRed(scoreRed);
    }
    public void addTenForRed (View v) {
        scoreRed += 10;
        displayForRed(scoreRed);
    }
    public void addFiveForRed (View v) {
        scoreRed += 5;
        displayForRed(scoreRed);
    }
    public void dellHundredForRed (View v) {
        scoreRed -= 100;
        displayForRed(scoreRed);
    }
    public void dellTenForRed (View v) {
        scoreRed -= 10;
        displayForRed(scoreRed);
    }
    public void dellFiveForRed (View v) {
        scoreRed -= 5;
        displayForRed(scoreRed);
    }

    /**
     * add and dell score for Blue
     */
    public void addHundredForBlue (View v) {
        scoreBlue += 100;
        displayForBlue(scoreBlue);
    }
    public void addTenForBlue (View v) {
        scoreBlue += 10;
        displayForBlue(scoreBlue);
    }
    public void addFiveForBlue (View v) {
        scoreBlue += 5;
        displayForBlue(scoreBlue);
    }
    public void dellHundredForBlue (View v) {
        scoreBlue -= 100;
        displayForBlue(scoreBlue);
    }
    public void dellTenForBlue (View v) {
        scoreBlue -= 10;
        displayForBlue(scoreBlue);
    }
    public void dellFiveForBlue (View v) {
        scoreBlue -= 5;
        displayForBlue(scoreBlue);
    }

    /**
     * add and dell score for Green
     */
    public void addHundredForGreen (View v) {
        scoreGreen += 100;
        displayForGreen(scoreGreen);
    }
    public void addTenForGreen (View v) {
        scoreGreen += 10;
        displayForGreen(scoreGreen);
    }
    public void addFiveForGreen (View v) {
        scoreGreen += 5;
        displayForGreen(scoreGreen);
    }
    public void dellHundredForGreen (View v) {
        scoreGreen -= 100;
        displayForGreen(scoreGreen);
    }
    public void dellTenForGreen (View v) {
        scoreGreen -= 10;
        displayForGreen(scoreGreen);
    }
    public void dellFiveForGreen (View v) {
        scoreGreen -= 5;
        displayForGreen(scoreGreen);
    }

    /**
     * Displays the given score for Red.
     */
    public void displayForRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Blue.
     */
    public void displayForBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Green.
     */
    public void displayForGreen(int score) {
        TextView scoreView = (TextView) findViewById(R.id.green_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset all variable
     */
    public void scoreReset(View v) {
        scoreRed = 0;
        scoreBlue = 0;
        scoreGreen = 0;
        displayForRed(scoreRed);
        displayForBlue(scoreBlue);
        displayForGreen(scoreGreen);
    }

    /**
     * Button for Barrel display
     */
    public void burrelRed(View v) {
        TextView scoreView = (TextView) findViewById(R.id.red_score);
        scoreView.setText(String.valueOf("Barrel"));
        scoreRed = 880;
    }

    public void burrelBlue(View v) {
        TextView scoreView = (TextView) findViewById(R.id.blue_score);
        scoreView.setText(String.valueOf("Barrel"));
        scoreBlue = 880;
    }

    public void burrelGreen(View v) {
        TextView scoreView = (TextView) findViewById(R.id.green_score);
        scoreView.setText(String.valueOf("Barrel"));
        scoreGreen = 880;
    }

    /**
     * For add Bolt
     */
    public void boltRed(View v) {
        boltCountForRed += 1;
        if (boltCountForRed == 1) {
            TextView boltView = (TextView) findViewById(R.id.red_bolt);
            boltView.setText(String.valueOf("| - -"));
        }
        if (boltCountForRed == 2) {
            TextView boltView = (TextView) findViewById(R.id.red_bolt);
            boltView.setText(String.valueOf("| | -"));
        }
        if (boltCountForRed == 3) {
            boltCountForRed = 0;
            scoreRed -= 120;
            displayForRed(scoreRed);
            TextView boltView = (TextView) findViewById(R.id.red_bolt);
            boltView.setText(String.valueOf("- - -"));
        }
    }

    public void boltBlue(View v) {
        boltCountForBlue += 1;
        if (boltCountForBlue == 1) {
            TextView boltView = (TextView) findViewById(R.id.blue_bolt);
            boltView.setText(String.valueOf("| - -"));
        }
        if (boltCountForBlue == 2) {
            TextView boltView = (TextView) findViewById(R.id.blue_bolt);
            boltView.setText(String.valueOf("| | -"));
        }
        if (boltCountForBlue == 3) {
            boltCountForBlue = 0;
            scoreBlue -= 120;
            displayForBlue(scoreBlue);
            TextView boltView = (TextView) findViewById(R.id.blue_bolt);
            boltView.setText(String.valueOf("- - -"));

        }
    }

    public void boltGreen(View v) {
        boltCountForGreen += 1;
        if (boltCountForGreen == 1) {
            TextView boltView = (TextView) findViewById(R.id.green_bolt);
            boltView.setText(String.valueOf("| - -"));
        }
        if (boltCountForGreen == 2) {
            TextView boltView = (TextView) findViewById(R.id.green_bolt);
            boltView.setText(String.valueOf("| | -"));
        }
        if (boltCountForGreen == 3) {
            boltCountForGreen = 0;
            scoreGreen -= 120;
            displayForGreen(scoreGreen);
            TextView boltView = (TextView) findViewById(R.id.green_bolt);
            boltView.setText(String.valueOf("- - -"));
        }
    }
}
