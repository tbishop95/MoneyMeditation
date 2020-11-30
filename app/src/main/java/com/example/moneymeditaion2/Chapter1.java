package com.example.moneymeditaion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chapter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);
    }

    public void viewAccount(View view) {
        startActivity(new Intent(getApplicationContext(),Profile.class));
        finish();
    }
}