package com.example.safetripbackend.serviceimpls;

import com.example.safetripbackend.entities.Grupo;
import com.example.safetripbackend.repositories.IGrupoRepository;
import com.example.safetripbackend.service.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoServiceImpl implements IGrupoService {
    @Autowired
    private IGrupoRepository gR;

    @Override
    public void insert(Grupo grupo) {
        gR.save(grupo);
    }

    @Override
    public List<Grupo> list() {
        return gR.findAll();
    }

    @Override
    public void delete(int idGrupo) {
        gR.deleteById(idGrupo);
    }

    @Override
    public List<Grupo> search(String nombreGrupo) {
        return gR.buscarGrupo(nombreGrupo);
    }
}
