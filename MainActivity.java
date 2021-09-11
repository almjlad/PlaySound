package com.example.playsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rainy_day_1);
        Button button = findViewById(R.id.btn_play);

        button.setOnClickListener(v -> mediaPlayer.start());

    }
}