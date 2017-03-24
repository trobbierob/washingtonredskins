package com.example.android.washingtonredskins;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mySound;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this, R.raw.high);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
            }
        });
    }

    // Play sound
    private void playSound() {
        mySound.start();
        Toast.makeText(MainActivity.this, "southpark.cc.com",
                Toast.LENGTH_LONG).show();
    }
}