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


    JSONArray location = new JSONArray();
    String dataJson = String.valueOf(R.raw.mapadeigarassu).toString();
    private GoogleMap mMap;
    Context context;

    ArrayList<Pontos> Mpontos =  new ArrayList<Pontos>();

    List<Pontos> pontos;


    public void teste() throws JSONException {


        String json;




        //location = new JSONArray(R.raw.mapadeigarassu);


//        ArrayList<ArrayList> data = null;
//        data.add(nome);
//        data.add(latitude);
//        data.add(longitude);
//        data.add(adress);
//        data.add(descricao);


        try {

            Gson gson = new  Gson();

            JsonModel model = gson.fromJson(getjson(), JsonModel.class);

            pontos = model.getPontos();


            for (int i = 0; i < pontos.size(); i++){
                System.out.println("------------");
                System.out.println(pontos.get(i).getNome());
                System.out.println(pontos.get(i).getAdress());

            }

           /* InputStream is = getAssets().open("mapadeigarassu.json");

            int size = is.available();
            byte[] buffer = new byte[size];

            is.read();
            is.close();

            json = new String(buffer, "UTF-8");
           */


           // JSONObject obj = new JSONObject(getjson());

            //JSONArray pontosArray = obj.getJSONArray("locations");

            /*
            for (int i = 0; i < pontosArray.length(); i++) {
                JSONObject pontoDetail = pontosArray.getJSONObject(i);

                Mpontos.add(new Pontos(pontoDetail.getString("latitude"), pontoDetail.getString("longitude"), pontoDetail.getString("descricao"), pontoDetail.getString("name"), pontoDetail.getString("adress")));

                nome.add(pontoDetail.getString("name"));
                latitude.add(pontoDetail.getString("latitude"));
                longitude.add(pontoDetail.getString("longitude"));
                adress.add(pontoDetail.getString("adress"));
                descricao.add(pontoDetail.getString("descricao"));


            }

            for (int i = 0; i < Mpontos.size(); i++) {
                //nome.add(new latitude(String.valueOf(latitude.get(i)), longitude.get(i)));
                //mMap.addMarker(new MarkerOptions().position(ponto.get(i)).title("ponto.get(i)"));
                //mMap.moveCamera(CameraUpdateFactory.newLatLng(ponto.get(i)));
                System.out.println(Mpontos.get(i).nome);
                System.out.println(Mpontos.get(i).descricao);
                System.out.println(Mpontos.get(i).longitude);
            }

            */

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


        @Override
        public void onMapReady(GoogleMap googleMap) {

        for (int i = 0; i < Mpontos.size(); i++) {
            //nome.add(new latitude(String.valueOf(latitude.get(i)), longitude.get(i)));
            //mMap.addMarker(new MarkerOptions().position(ponto.get(i)).title("ponto.get(i)"));
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(ponto.get(i)));
        }
    }


    public String getjson(){

        String json = null;

        Context context = this;

        //String jsonString = IOHelper.stringFromAsset(this,"mapadeigarassu.json");

        try {

            InputStream is = context.getAssets().open("mapadeigarassu.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public static  String stringFromStream(InputStream is){
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            String line = null;

            while ((line = reader.readLine()) != null){
                sb.append(line).append("\n");
                reader.close();
                return sb.toString();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    public static String stringFromAsset(Context context, String assetFileName){
        AssetManager am = context.getAssets();
        try {

            InputStream is = am.open(assetFileName);
            String result = stringFromStream(is);
            is.close();

            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
