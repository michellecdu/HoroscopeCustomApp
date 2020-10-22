package com.dumichelle.customapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;


public class Horoscope extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    Button sharedAnnouncement;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.horoscopesall);

        //get intent!
        Intent intent = getIntent();
        String sign = intent.getStringExtra("com.dumichelle.customapp.horoscope.MESSAGE");
        switch (sign) {
            case "capricorn":
                setContentView(R.layout.capricorn);
                break;
            case "aquarius":
                setContentView(R.layout.aquarius);
                break;
            case "aries":
                setContentView(R.layout.aries);
                break;
            case "cancer":
                setContentView(R.layout.cancer);
                break;
            case "gemini":
                setContentView(R.layout.gemini);
                break;
            case "leo":
                setContentView(R.layout.leo);
                break;
            case "libra":
                setContentView(R.layout.libra);
                break;
            case "virgo":
                setContentView(R.layout.virgo);
                break;
            case "scorpio":
                setContentView(R.layout.scorpio);
                break;
            case "sagittarius":
                setContentView(R.layout.sagittarius);
                break;
            case "pisces":
                setContentView(R.layout.pisces);
                break;
            case "taurus":
                setContentView(R.layout.taurus);
                break;
        }
    }
    public void returnHome(View view) {
        setContentView(R.layout.activity_main);
        sharedAnnouncement = findViewById(R.id.saved_info);
        /*Intent returnBtn = new Intent(getApplicationContext(),
                MainActivity.class);
        startActivity(returnBtn);*/
    }

    public void getStoredData(View view) {
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        String temp = sharedPreferences.getString("shared_data", "");
        Gson gson = new Gson();
        Data stored = gson.fromJson(temp, Data.class);
        sharedAnnouncement.setText("Results for :" + stored.name + "! You are a " + stored.horoscope);
    }
}
