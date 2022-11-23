package com.example.safetripbackend.service;

import com.example.safetripbackend.entities.Servicio;

import java.util.List;

public interface IServicioService {
    public void insert(Servicio servicio);

    List<Servicio> list();
    public void delete(int idServicio);
    List<Servicio> search(String tipoServicio);
}
