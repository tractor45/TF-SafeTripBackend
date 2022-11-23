package com.example.safetripbackend.repositories;

import com.example.safetripbackend.entities.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGrupoRepository extends JpaRepository<Grupo, Integer> {
    @Query("from Grupo g where g.nombreGrupo like %:nombreGrupo")
    List<Grupo>buscarGrupo(@Param("nombreGrupo")String nombreGrupo);
}
