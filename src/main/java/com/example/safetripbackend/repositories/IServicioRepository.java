package com.example.safetripbackend.repositories;

import com.example.safetripbackend.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {
    @Query("from Servicio s where s.tipoServicio like %:tipoServicio")
    List<Servicio>buscarServicio(@Param("tipoServicio")String tipoServicio);
}
