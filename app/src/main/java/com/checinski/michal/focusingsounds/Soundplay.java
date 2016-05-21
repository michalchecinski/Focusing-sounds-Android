package com.checinski.michal.focusingsounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Soundplay extends AppCompatActivity {

    final Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundplay);

        final ImageButton rain = (ImageButton) findViewById(R.id.imageButtonRain);
        final ImageButton sea = (ImageButton) findViewById(R.id.imageButtonSea);
        final ImageButton coffee = (ImageButton) findViewById(R.id.imageButtonCoffee);

        assert rain != null;
        assert sea != null;
        assert coffee != null;

        rain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player.play(getApplicationContext(),"rain");
                Toast.makeText(getApplicationContext(),"Rain/thunder", Toast.LENGTH_SHORT).show();
            }
        });


        sea.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player.play(getApplicationContext(),"sea");
                Toast.makeText(getApplicationContext(),"Sea waves", Toast.LENGTH_SHORT).show();
            }
        });

        coffee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                player.play(getApplicationContext(),"coffee");
                Toast.makeText(getApplicationContext(),"Coffee", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                startActivity(new Intent(this, AboutActivity.class));
                return true;

            case R.id.action_stop:
                player.stop();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
