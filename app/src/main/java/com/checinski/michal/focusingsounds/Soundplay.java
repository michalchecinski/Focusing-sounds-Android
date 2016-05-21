package com.checinski.michal.focusingsounds;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Soundplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundplay);

        final ImageButton rain = (ImageButton) findViewById(R.id.imageButtonRain);
        final ImageButton sea = (ImageButton) findViewById(R.id.imageButtonSea);
        final ImageButton coffee = (ImageButton) findViewById(R.id.imageButtonCoffee);

        final Player player = new Player();

        assert rain != null;
        assert sea != null;
        assert coffee != null;

        rain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player.play(getApplicationContext(),"rain");
            }
        });


        sea.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player.play(getApplicationContext(),"sea");
            }
        });

        coffee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player.play(getApplicationContext(),"coffee");
            }
        });
    }
}
