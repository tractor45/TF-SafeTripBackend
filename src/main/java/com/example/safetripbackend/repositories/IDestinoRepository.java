package com.example.safetripbackend.repositories;

import com.example.safetripbackend.entities.Destino;
import com.example.safetripbackend.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDestinoRepository extends JpaRepository<Destino, Integer> {
    @Query("from Destino d where d.nameDestino like %:nameDestino")
    List<Destino> buscarDestino(@Param("nameDestino")String nameDestino);
}
