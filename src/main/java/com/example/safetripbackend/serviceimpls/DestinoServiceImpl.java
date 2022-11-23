package com.example.safetripbackend.serviceimpls;

import com.example.safetripbackend.entities.Destino;
import com.example.safetripbackend.repositories.IDestinoRepository;
import com.example.safetripbackend.service.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DestinoServiceImpl implements IDestinoService {
    @Autowired
    private IDestinoRepository dR;

    @Override
    public void insert(Destino destino) {
        dR.save(destino);
    }

    @Override
    public List<Destino> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDestino) {
        dR.deleteById(idDestino);
    }

    @Override
    public List<Destino> search(String nameDestino) {
        return dR.buscarDestino(nameDestino);
    }
}
