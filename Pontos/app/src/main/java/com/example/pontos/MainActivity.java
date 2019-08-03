package com.example.pontos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapsActivity maps = new MapsActivity();

        try {

            maps.teste();


        } catch (JSONException e) {

            e.printStackTrace();

        }
    }
}
