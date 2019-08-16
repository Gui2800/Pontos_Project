package com.example.pontos;

public class Pontos {

    private String longitude;

    private String descricao;

    private String name;

    private String latitude;

    private  String address;

    public Pontos(String longitude, String descricao, String name, String latitude, String address) {
        this.longitude = longitude;
        this.descricao = descricao;
        this.name = name;
        this.latitude = latitude;
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
