package com.example.alnobel.alnobel.aplicacionmedioambiente;

public class Medicion {
    private String tiempo;
    private String coordLat;
    private String coordLong;
    private String valor;


    public Medicion(String tiempo, String coordLat, String coordLong, String valor) {
        this.tiempo = tiempo;
        this.coordLat = coordLat;
        this.coordLong = coordLong;
        this.valor = valor;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCoordLat() {
        return coordLat;
    }

    public void setCoordLat(String coordLat) {
        this.coordLat = coordLat;
    }

    public String getCoordLong() {
        return coordLong;
    }

    public void setCoordLong(String coordLong) {
        this.coordLong = coordLong;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}