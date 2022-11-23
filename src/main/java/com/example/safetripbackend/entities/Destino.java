package com.example.safetripbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Destino")
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDestino;
    @Column(name = "fechaDestino", length = 50, nullable = false)
    private String fechaDestino;
    @Column(name = "nameDestino", length = 60, nullable = false)
    private String nameDestino;
    @Column(name = "despDesino", length = 200, nullable = false)
    private String despDestino;

    public Destino() {
    }

    public Destino(int idDestino, String fechaDestino, String nameDestino, String despDestino) {
        this.idDestino = idDestino;
        this.fechaDestino = fechaDestino;
        this.nameDestino = nameDestino;
        this.despDestino = despDestino;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getFechaDestino() {
        return fechaDestino;
    }

    public void setFechaDestino(String fechaDestino) {
        this.fechaDestino = fechaDestino;
    }

    public String getNameDestino() {
        return nameDestino;
    }

    public void setNameDestino(String nameDestino) {
        this.nameDestino = nameDestino;
    }

    public String getDespDestino() {
        return despDestino;
    }

    public void setDespDestino(String despDestino) {
        this.despDestino = despDestino;
    }

}
