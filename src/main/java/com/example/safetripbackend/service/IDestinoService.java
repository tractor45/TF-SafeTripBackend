package com.example.safetripbackend.service;

import com.example.safetripbackend.entities.Destino;

import java.util.List;

public interface IDestinoService {
    public void insert(Destino destino);
    List<Destino> list();
    public void delete(int idDestino);
    List<Destino> search(String nameDestino);
}
