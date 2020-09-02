package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //declare view variables
    private SeekBar diceRollsBar;
    private TextView resultsTextView;
    private Button rollButton;
    //private RelativeLayout relativeLayout;

    //declare object for roll class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the different views and widgets from the layout file to the corresponding variables
        diceRollsBar = findViewById(R.id.diceRollsBar);
        resultsTextView = findViewById(R.id.resultsTextview);
        rollButton = findViewById(R.id.rollButton);


        //Pressing the roll button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();
                //setting the results text to a randomly generated number based on the seek bar progress
                int randomNumber = randomGenerator.nextInt(diceRollsBar.getProgress()) + 1;
                resultsTextView.setText(String.valueOf(randomNumber));
            }
        };
        rollButton.setOnClickListener(listener);

        
    }
}