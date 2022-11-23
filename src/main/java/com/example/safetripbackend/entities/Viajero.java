package com.example.safetripbackend.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="Viajero")
public class Viajero implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViajero;

    @Column(name = "nameViajero", length = 60, nullable = false)
    private String nameViajero;

    @Column(name = "tipoViajero", length = 50, nullable = false)
    private String tipoViajero;

    @Column(name = "emailViajero", length = 70, nullable = false)
    private String emailViajero;


    @ManyToOne
    @JoinColumn(name = "idContacto", nullable = false)
    private Contacto contacto;

    public Viajero(int idViajero, String tipoViajero, String emailViajero,Contacto contacto) {
        this.idViajero = idViajero;
        this.nameViajero= nameViajero;
        this.tipoViajero = tipoViajero;
        this.emailViajero= emailViajero;
        this.contacto = contacto;
    }

    public Viajero() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getIdViajero() {
        return idViajero;
    }

    public void setIdViajero(int idViajero) {
        this.idViajero = idViajero;
    }

    public String getNameViajero(){return nameViajero;}
    public void setNameViajero(String nameViajero) {this.nameViajero=nameViajero;}

    public String getEmailViajero(){return emailViajero;}

    public void setEmailViajero(String emailViajero){this.emailViajero=emailViajero;}

    public String getTipoViajero() {
        return tipoViajero;
    }

    public void setTipoViajero(String tipoViajero) {
        this.tipoViajero = tipoViajero;
    }


    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
