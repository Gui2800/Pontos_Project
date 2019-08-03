package com.example.pontos;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

public class Pontos extends MapsActivity{

    @SerializedName("longitude")
    private String Long;

    @SerializedName("description")
    private String Descricao;

    @SerializedName("name")
    private String Nome;

    @SerializedName("latitude")
    private String Lat;

    @SerializedName("address")
    private String address;


    public String getAdress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



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

    public Pontos(String lat, String lng, String descricao, String nome, String address){
        this.setLat(lat);
        this.setLong(lng);
        this.setDescricao(descricao);
        this.setNome(nome);
        this.setAddress(address);
    }
}
