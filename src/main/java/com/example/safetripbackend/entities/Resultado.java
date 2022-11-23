package com.example.safetripbackend.entities;

public class Resultado {

    private String cantidad;
    private String viajero;

    public Resultado() {
    }

    public Resultado(String cantidad, String viajero) {
        this.cantidad = cantidad;
        this.viajero = viajero;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getViajero() {
        return viajero;
    }

    public void setViajero(String contacto) {
        this.viajero = contacto;
    }
}

