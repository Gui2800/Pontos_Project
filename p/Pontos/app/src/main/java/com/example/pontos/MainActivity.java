package com.example.pontos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    TextView txtjson ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtjson = (TextView) findViewById(R.id.txt);


    }


    public void readJson(View view) {
        String jsonString = IOHelper.stringFromAsset(this, "mapadeigarassu.json");
        try {
            //JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray pontos = new JSONArray(jsonString);

            String result = "";
            for (int i = 0; i < pontos.length(); i++) {
                JSONObject p = pontos.getJSONObject(i);
                //new Gson().fromJson(city.toString(), City.class);
                result += "  " + p.getString("name") + "\n" +
                        " " + p.getString("latitude") + "\n" +
                        "  " + p.getDouble("longitude") + "\n"+
                        "  "+ p.getString("address") + "\n" +
                        "  " + p.getString("description");
            }
            Log.d("msg", result);
            txtjson.setText(result);
        } catch (Exception e) {
            Log.d("ReadPlacesFeedTask", e.getLocalizedMessage());
        }
    }

}
