package com.example.moneymeditaion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LessonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
    }

    public void viewAccount(View view) {
        startActivity(new Intent(getApplicationContext(),Profile.class));
        finish();
    }

    public void startLsn1(View view) {
        startActivity(new Intent(getApplicationContext(),Chapter1.class));
        finish();
    }

    public void startLsn2(View view) {
        startActivity(new Intent(getApplicationContext(),Chapter2.class));
        finish();
    }

    public void startLsn3(View view) {
        startActivity(new Intent(getApplicationContext(),Chapter3.class));
        finish();
    }

    public void startLsn4(View view) {
        startActivity(new Intent(getApplicationContext(),Chapter4.class));
        finish();
    }
}