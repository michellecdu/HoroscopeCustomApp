package com.dumichelle.customapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button btn;
    Button infobtn;
    Button horoscopebtn;
    EditText edit_text;
    TextView text_name;
    Resources res;
    String name;
    Button sharedAnnouncement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = getResources();
        btn = findViewById(R.id.btn);
        text_name = findViewById(R.id.text_name);
        edit_text = findViewById(R.id.edit_text);
        horoscopebtn = findViewById(R.id.button7);
        infobtn = findViewById(R.id.learnmorebtn);
        sharedAnnouncement = findViewById(R.id.saved_info);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = edit_text.getText().toString();
                Log.i("clickResponse", "I love CS");
                text_name.setText("Hi " + name  + "! Let's generate horoscopes!");
            }
        });
    }

    public void goToActivity2 (View view){
        setContentView(R.layout.horoscopesall);
    }

    public void gotoCapricorn (View view){
        //saved name and capricorn
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "capricorn");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "capricorn");
        startActivity(intent);
    }

    public void getStoredData(View view) {
        String temp = sharedPreferences.getString("shared_data", "");
        Gson gson = new Gson();
        Data stored = gson.fromJson(temp, Data.class);
        sharedAnnouncement.setText("Results for: " + stored.name + "! You are a " + stored.horoscope);
        finish();
    }

    public void gotoFragment(View view) {
        Intent intent = new Intent(getApplicationContext(), FragmentMain.class);
        intent.putExtra("com.dumichelle.customapp.FragmentMain.MESSAGE", "random");
        startActivity(intent);
        //setContentView(R.layout.fragment);
    }

    public void gotoAquarius (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "aquarius");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "aquarius");
        startActivity(intent);
        //setContentView(R.layout.aquarius);
    }
    public void gotoTaurus (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "taurus");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "taurus");
        startActivity(intent);
        //setContentView(R.layout.taurus);
    }
    public void gotoAries (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "aries");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "aries");
        startActivity(intent);
        //setContentView(R.layout.aquarius);
    }
    public void gotoGemini (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "gemini");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "gemini");
        startActivity(intent);
        //setContentView(R.layout.gemini);
    }
    public void gotoLibra (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "libra");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "libra");
        startActivity(intent);
        //setContentView(R.layout.libra);
    }
    public void gotoLeo (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "leo");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "leo");
        startActivity(intent);
        //setContentView(R.layout.leo);
    }
    public void gotoScorpio (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "scorpio");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "scorpio");
        startActivity(intent);
        // setContentView(R.layout.scorpio);
    }
    public void gotoVirgo (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "virgo");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "virgo");
        startActivity(intent);
        //setContentView(R.layout.virgo);
    }
    public void gotoPisces (View view) {
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "pisces");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "pisces");
        startActivity(intent);
        //setContentView(R.layout.pisces);
    }
    public void gotoSagittarius (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "sagittarius");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "sagittarius");
        startActivity(intent);
    }
    public void gotoCancer (View view){
        Gson gson = new Gson();
        //object to store
        Data stored = new Data (name, "cancer");
        String json = gson.toJson(stored, Data.class);
        //store the data
        sharedPreferences = getSharedPreferences(String.valueOf("data"), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("shared_data", json);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Horoscope.class);
        intent.putExtra("com.dumichelle.customapp.horoscope.MESSAGE", "cancer");
        startActivity(intent);
    }

    public void returnHome(View view) {
        Intent returnBtn = new Intent(getApplicationContext(),
                MainActivity.class);
        startActivity(returnBtn);
        //setContentView(R.layout.activity_main);
    }

}