package com.example.safetripbackend.repositories;

import com.example.safetripbackend.entities.Viajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IViajeroRepository extends JpaRepository<Viajero, Integer> {
    @Query("from Viajero v where v.contacto.nameContacto like %:nameContacto")
    List<Viajero> buscarContacto(@Param("nameContacto")String nameContacto);

    @Query("from Viajero v where v.tipoViajero like %:tipoViajero%")
   List<Viajero> buscarViajero(@Param("tipoViajero") String tipoViajero);


}
