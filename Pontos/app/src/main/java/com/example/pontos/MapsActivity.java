package com.example.pontos;

//import android.content.Intent;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    TextView txtjson ;
    List<Pontos> ListPonto = new ArrayList<Pontos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtjson = (TextView) findViewById(R.id.txt);


    }


    public void readJson(View view) {
        //Transforma o json em String (Parse)
        String jsonString = IOHelper.stringFromAsset(this, "mapadeigarassu.json");

        //System.out.println(jsonString);

        try {
            //Transforma a String em um objeto json
            JSONObject jsonObject = new JSONObject(jsonString);


            //pega o indice do objeto json e transforma em um array de json
            JSONArray pontosarray = jsonObject.getJSONArray("locations");

            //System.out.println(pontosarray);

            String result = "";

            //percorre o array e pega os indices do array e cria um objeto de ponto e add a List
            for (int i = 0; i < pontosarray.length(); i++) {


                ListPonto.add(new Pontos(pontosarray.getJSONObject(i).getString("longitude"),
                        pontosarray.getJSONObject(i).getString("description"),
                        pontosarray.getJSONObject(i).getString("name"),
                        pontosarray.getJSONObject(i).getString("latitude"),
                        pontosarray.getJSONObject(i).getString("address")));

                //System.out.println(pontosarray);

            }
            // Percorre o array e imprime todos pontos que existe na List
            show();
        } catch (JSONException e) {
            Log.d("jsonException", e.getLocalizedMessage());
        }

    }



    /*public void show(){


        for (Pontos e : ListPonto){
            System.out.println("ponto");
            System.out.println(e.getName());
            System.out.println(e.getLatitude());
            System.out.println(e.getLongitude());
            System.out.println(e.getAddress());
            System.out.println(e.getDescricao());
        }
    }*/

    @Override
        public void onMapReady(GoogleMap googleMap) {


        for (int i = 0; i < e.size(); i++) {
            for (Pontos e : ListPonto) {
                LatLng e.getName(i) = new LatLng(e.getLatitude(i), e.getLongitude(i));
                mMap.addMarker(new MarkerOptions().position(e.getName(i)).title(e.getName(i)));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(e.getName(i)));
            }
        }
    }

}
