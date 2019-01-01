package com.bajpaiarjun0333.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton= (Button) findViewById(R.id.rollButton);
        final ImageView leftDice=(ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice=(ImageView) findViewById(R.id.image_rightDice);
        //Detect taps on the screen
        final int[] dicearray={R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Roll Button has been pressed");
                Random randomNumberGenerator=new Random();
                int number=randomNumberGenerator.nextInt(6);
                Log.d("Dicee","Number is "+number);
                leftDice.setImageResource(dicearray[number]);
                //Reusing the number variable to generate random variable for the
                //Right Dice
                number=randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(dicearray[number]);
            }
        });



    }
}
