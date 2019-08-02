package com.example.pontos;

//import android.content.Intent;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    @TargetApi(Build.VERSION_CODES.KITKAT)
    JSONArray location;
    int dataJson = R.raw.mapadeigarassu;
    private GoogleMap mMap;

    public void teste() throws JSONException {
        location = new JSONArray(dataJson);

        ArrayList<String> nome = null;
        ArrayList<String> latitude = null;
        ArrayList<String> longitude = null;
        ArrayList<String> adress = null;
        ArrayList<String> descricao = null;

//        ArrayList<ArrayList> data = null;
//        data.add(nome);
//        data.add(latitude);
//        data.add(longitude);
//        data.add(adress);
//        data.add(descricao);

        try {
            JSONObject obj = new JSONObject(Integer.toString(dataJson));

            JSONArray pontosArray = obj.getJSONArray("locations");

            for (int i = 0; i < pontosArray.length(); i++) {
                JSONObject pontoDetail = pontosArray.getJSONObject(i);

                nome.add(pontoDetail.getString("name"));
                latitude.add(pontoDetail.getString("latitude"));
                longitude.add(pontoDetail.getString("longitude"));
                adress.add(pontoDetail.getString("adress"));
                descricao.add(pontoDetail.getString("descricao"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        for (int i = 0; i < nome.size(); i++) {
            nome.add(new latitude(String.valueOf(latitude.get(i)), longitude.get(i)));
            mMap.addMarker(new MarkerOptions().position(ponto.get(i)).title("ponto.get(i)");
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ponto.get(i)));
        }
    }
}
