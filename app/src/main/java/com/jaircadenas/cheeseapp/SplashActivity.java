package com.jaircadenas.cheeseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ScheduledExecutorService schedule = Executors.newSingleThreadScheduledExecutor();
        schedule.schedule(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent( SplashActivity.this, LoginActivity.class );
                startActivity(i);
            }
        }, 3, TimeUnit.SECONDS );
    }

}
