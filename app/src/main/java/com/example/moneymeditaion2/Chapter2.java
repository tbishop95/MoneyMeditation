package com.example.moneymeditaion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Chapter2 extends AppCompatActivity {
    MediaPlayer player;
    ImageView playBtn, pauseBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);

        playBtn = findViewById(R.id .playBtn);
        pauseBtn = findViewById(R.id .pauseBtn);

    }

    public void viewAccount(View view) {
        startActivity(new Intent(getApplicationContext(),Profile.class));
        finish();
    }

    public void play(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.chapter1);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }

        player.start();

        playBtn.setVisibility(View.INVISIBLE);
        pauseBtn.setVisibility(View.VISIBLE);
    }

    public void pause(View view) {
        if (player != null) {
            player.pause();
        }

        playBtn.setVisibility(View.VISIBLE);
        pauseBtn.setVisibility(View.INVISIBLE);
    }

    public void takeQuiz(View view) {
        stopPlayer();
        startActivity(new Intent(getApplicationContext(),Quiz1Activity.class));
        finish();

    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}