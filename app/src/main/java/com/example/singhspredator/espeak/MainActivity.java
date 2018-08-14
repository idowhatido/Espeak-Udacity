package com.example.singhspredator.espeak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Numbers Intent Onclick Listener

        TextView numbers = (TextView)findViewById(R.id.number);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        }

        );

        // Family Intent Onclick Listener

        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent familyintent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyintent);
            }
        }

        );

        // Color Intent Onclick Listener

        TextView color = (TextView)findViewById(R.id.color);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent colorintent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorintent);

            }
        });

        // Phrase Intent Onclick Listener


        TextView phrase = (TextView)findViewById(R.id.phrase);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent phraseintent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phraseintent);

            }
        });



    }


}

