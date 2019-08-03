package com.example.pontos;

import com.google.gson.annotations.SerializedName;
import java.util.List;


public class JsonModel {

    @SerializedName("locations")
    private List<Pontos> pontos;


    public List<Pontos> getPontos(){
        return pontos;
    }


}
