//package com.example.pontos;
//
//import java.io.Serializable;
//
//public class ConexaoJson implements Serializable{
//
//
//    JSONArray location;
//    int dataJson = R.raw.mapadeigarassu;
//    @TargetApi(Build.VERSION_CODES.KITKAT)
//    public void teste() throws JSONException {
//        location = new JSONArray(dataJson);
//
//        ArrayList<String> nome = null;
//        ArrayList<String> latitude = null;
//        ArrayList<String> longitude = null;
//        ArrayList<String> adress = null;
//        ArrayList<String> descricao = null;
//
//        ArrayList<ArrayList> data = null;
//        data.add(nome);
//        data.add(latitude);
//        data.add(longitude);
//        data.add(adress);
//        data.add(descricao);
//
//        try {
//            JSONObject obj = new JSONObject(Integer.toString(dataJson));
//
//            JSONArray pontosArray = obj.getJSONArray("locations");
//
//            for (int i = 0; i < pontosArray.length(); i++) {
//                JSONObject pontoDetail = pontosArray.getJSONObject(i);
//
//                nome.add(pontoDetail.getString("name"));
//                latitude.add(pontoDetail.getString("latitude"));
//                longitude.add(pontoDetail.getString("longitude"));
//                adress.add(pontoDetail.getString("adress"));
//                descricao.add(pontoDetail.getString("descricao"));
//            }
//
//            Bundle lng = new Bundle();
//            lng.putStringArrayList("longitude", longitude);
//
//            Bundle lat = new Bundle();
//            lat.putStringArrayList("lantitude", latitude);
//
//            Bundle name = new Bundle();
//            name.putStringArrayList("nome", nome);
//
//            Bundle adr = new Bundle();
//            adr.putStringArrayList("adress", adress);
//
//            Bundle dsc = new Bundle();
//            dsc.putStringArrayList("descricao", descricao);
//
//            Bundle dados = new Bundle();
//
//            dados.putStringArrayList("data", data);
//
//            Intent i = new Intent(this, MapsActivity.class);
//
//
//            Intent in = new Intent(getApplicationContext(), MapsActivity.class);
//            in.putStringArrayListExtra("nome", nome);
//            startActivity(in);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    Pontos ponto = new Pontos();
//}
