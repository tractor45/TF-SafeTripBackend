package com.example.safetripbackend.service;

import com.example.safetripbackend.entities.Resultado;
import com.example.safetripbackend.entities.Viajero;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IViajeroService {
    public boolean insertar(Viajero viajero);

    public void eliminar(int idViajero);

    Optional<Viajero> listarId(int idViajero);

    List<Viajero> listar();

    List<Viajero> buscarContacto(String nameContacto);

    List<Viajero> buscarViajero(String tipoViajero);

}
