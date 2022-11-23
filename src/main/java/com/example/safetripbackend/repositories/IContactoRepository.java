package com.example.safetripbackend.repositories;


import com.example.safetripbackend.entities.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto,Integer> {

@Query("from Contacto c where c.nameContacto like %:nameContacto%")
    List<Contacto>buscarNombre(@Param("nameContacto")String nameContacto);

@Query(value = "select *from contacto c where c.num_cel like '943%' ",nativeQuery = true)
  List<Contacto> buscarnumCel();
    @Query(value = "select v.name_viajero  , count (c.id_contacto) from contacto c inner join viajero v ON v.id_contacto= c.id_contacto group by v.name_viajero order by v.name_viajero asc",nativeQuery = true)
    List<String[]> cantidadContactos();
}

