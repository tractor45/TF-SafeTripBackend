package com.example.safetripbackend.service;

import com.example.safetripbackend.entities.Contacto;
import com.example.safetripbackend.entities.Resultado;

import java.util.List;
import java.util.Optional;


public interface IContactoService {
     public void insert(Contacto contacto);
     List<Contacto> list();
     public void eliminar(int idContacto);

     public Optional<Contacto> listarId(int idContacto);

     List<Contacto> buscarNombre(String nameContacto);

     List<Contacto> buscarnumCel();

     List<Resultado> cantidadContactos();

}
