package com.example.safetripbackend.entities;


import javax.persistence.*;

@Entity
@Table(name="Contacto")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContacto;
@Column(name="nameContacto",length = 35,nullable = false)
    private String nameContacto;
@Column(name="numCel",length = 35,nullable = false)
    private String numCel;

   public Contacto(){

   }

   public Contacto(int idContacto,String nameContacto, String numCel){
this.idContacto=idContacto;
this.nameContacto=nameContacto;
this.numCel=numCel;
   }


   public int getIdContacto(){return idContacto;}
    public void setIdContacto(int idContacto){this.idContacto=idContacto;}

    public String getNameContacto(){return nameContacto;}
    public void setNameContacto(String nameContacto){this.nameContacto = nameContacto;}

    public String getNumCel(){return numCel;}

    public void setNumCel(String numCel) {
        this.numCel = numCel;
    }
}
