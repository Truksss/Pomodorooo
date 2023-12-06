package com.example.studyapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.studyapp.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        new Handler().postDelayed(new Runnable() {
            @Override
                    public void run(){
                    Intent intent = new Intent(Splash.this, MenuActivity.class);
                    startActivity(intent);
                    finish();
            }
        }, 3000);

    }
}