package com.example.pontos;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class pop_up extends Activity{
    public static Object java;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heith = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(heith*.6));
    }
}