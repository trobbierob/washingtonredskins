package com.example.android.washingtonredskins;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound;

    public void playSound(View view) {
        mySound.start();
        Toast.makeText(MainActivity.this, "southpark.cc.com",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this, R.raw.high);
    }

}