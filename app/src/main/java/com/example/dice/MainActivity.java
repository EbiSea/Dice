package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.Button;
import android.view.View;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RABABA = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button roller = findViewById(R.id.button);
        final ImageView dicer = findViewById(R.id.diceone);

        roller.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int numbah = randomDiceValue();
                        int changah = getResources().getIdentifier("dice"+ numbah, "drawable","com.example.dice");

                        dicer.setImageResource(changah);

                    }
                }


        );
    }
    public static int randomDiceValue(){
        return RABABA.nextInt(6)+1;
    }
}
