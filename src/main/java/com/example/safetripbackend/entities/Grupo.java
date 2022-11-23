package com.example.safetripbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrupo;
    @Column(name = "nombreGrupo", length = 45, nullable = false)
    private String nombreGrupo;
    @Column(name = "numIntegrantes", length = 10, nullable = false)
    private int numIntegrantes;
    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;
    @Column(name = "lider", length = 15, nullable = false)
    private String lider;

    public Grupo() {
    }

    public Grupo(int idGrupo, String nombreGrupo, int numIntegrantes, String descripcion, String lider) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
        this.numIntegrantes = numIntegrantes;
        this.descripcion = descripcion;
        this.lider = lider;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }
}
