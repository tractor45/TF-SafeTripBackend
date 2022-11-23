package com.example.safetripbackend.serviceimpls;

import com.example.safetripbackend.entities.Servicio;
import com.example.safetripbackend.repositories.IServicioRepository;
import com.example.safetripbackend.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements IServicioService {
    @Autowired
    private IServicioRepository sR;

    @Override
    public void insert(Servicio servicio) {
        sR.save(servicio);
    }

    @Override
    public List<Servicio> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idServicio) {
        sR.deleteById(idServicio);
    }

    @Override
    public List<Servicio> search(String tipoServicio) {
        return sR.buscarServicio(tipoServicio);
    }
}
