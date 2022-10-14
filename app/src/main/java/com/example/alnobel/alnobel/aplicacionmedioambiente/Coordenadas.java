package com.example.alnobel.alnobel.aplicacionmedioambiente;

public class Coordenadas {
    private double lat;
    private double lng;

    public Coordenadas(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return String.valueOf(lat);
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getLng() {
        return String.valueOf(lng);
    }

    public void setLng(double lng) {
        this.lng = lng;
    }


}