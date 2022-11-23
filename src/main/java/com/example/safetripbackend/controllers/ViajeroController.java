package com.example.safetripbackend.controllers;

import com.example.safetripbackend.entities.Resultado;
import com.example.safetripbackend.entities.Viajero;
import com.example.safetripbackend.service.IViajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.safetripbackend.entities.Contacto;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viajeros")
public class ViajeroController {
    @Autowired
    private IViajeroService vService;

    @PostMapping
    public void registrar(@RequestBody Viajero v) {
        vService.insertar(v);
    }

    @PutMapping
    public void modificar(@RequestBody Viajero v) {
        vService.insertar(v);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        vService.eliminar(id);
    }

    @GetMapping
    public List<Viajero> listar() {
        return vService.listar();

    }

    @PostMapping("/buscar")
    public List<Viajero> buscar(@RequestBody Viajero v) throws ParseException {

        List<Viajero> listaViajeros;
        listaViajeros = vService.buscarViajero(v.getTipoViajero());
        if (listaViajeros.isEmpty()) {

            listaViajeros = vService.buscarContacto(v.getContacto().getNameContacto());
        }
        return listaViajeros;

    }
    @GetMapping("/{id}")
    public Optional<Viajero> listarId(@PathVariable("id") Integer id) {
        return vService.listarId(id);
    }

}
