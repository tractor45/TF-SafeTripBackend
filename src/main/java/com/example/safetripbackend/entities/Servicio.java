package com.example.safetripbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    @Column(name = "tipoServicio",length = 20,nullable = false)
    private String tipoServicio;
    @Column(name = "oferta",length = 20,nullable = false)
    private String oferta;
    @Column(name = "descripcion",length = 20,nullable = false)
    private String descripcion;

    public Servicio() {
    }

    public Servicio(int idServicio, String tipoServicio, String oferta, String descripcion) {
        this.idServicio = idServicio;
        this.tipoServicio = tipoServicio;
        this.oferta = oferta;
        this.descripcion = descripcion;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
