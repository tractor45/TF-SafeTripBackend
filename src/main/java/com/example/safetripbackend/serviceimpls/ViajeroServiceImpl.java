package com.example.safetripbackend.serviceimpls;


import com.example.safetripbackend.entities.Resultado;
import com.example.safetripbackend.entities.Viajero;
import com.example.safetripbackend.repositories.IViajeroRepository;
import com.example.safetripbackend.service.IViajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ViajeroServiceImpl implements IViajeroService {
    @Autowired
    private IViajeroRepository vR;

    @Override
    @Transactional
    public boolean insertar(Viajero viajero) {
        Viajero objViajero = vR.save(viajero);
        if (objViajero == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idViajero) {

        vR.deleteById(idViajero);

    }

    @Override
    public Optional<Viajero> listarId(int idViajero) {

        return vR.findById(idViajero);
    }

    @Override
    public List<Viajero> listar() {
        return vR.findAll();
    }

    @Override
    public List<Viajero> buscarContacto(String nameContacto) {
        return vR.buscarContacto(nameContacto);
    }

    @Override
    public List<Viajero> buscarViajero(String tipoViajero) {
        return vR.buscarViajero(tipoViajero);
    }

}
