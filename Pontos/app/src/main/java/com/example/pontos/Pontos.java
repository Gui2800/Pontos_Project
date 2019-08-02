package com.example.pontos;

import org.json.JSONException;
import org.json.JSONObject;

public class Pontos extends MapsActivity{
private String Lat;
private String Long;
private String Descricao;
private String Nome;



    public String getLat() {
        return Lat;
    }
    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLong() {
        return Long;
    }
    public void setLong(String aLong) {
        Long = aLong;
    }

    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public Pontos(){
//        this.setLat(lat);
//        this.setLong(lng);
//        this.setDescricao(descricao);
//        this.setNome(nome);
    }
}
