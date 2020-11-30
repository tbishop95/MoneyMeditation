package com.example.moneymeditaion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        finish();
    }

    public void register(View view) {
        startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
        finish();
    }
}