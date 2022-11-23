package com.example.safetripbackend.controllers;


import com.example.safetripbackend.entities.Contacto;
import com.example.safetripbackend.entities.Resultado;
import com.example.safetripbackend.service.IContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contactos")
public class ContactoController {
    @Autowired
    private IContactoService cService;

    @PostMapping
    public void insert(@RequestBody Contacto c) {
        cService.insert(c);
    }

    @GetMapping
    public List<Contacto> list() {
        return cService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Contacto c) {
        cService.insert(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Contacto> buscar(@RequestBody String nombre) throws ParseException {
        List<Contacto> listaContactos;
        listaContactos = cService.buscarNombre(nombre);
        return listaContactos;
    }

    @GetMapping("/{id}")
    public Optional<Contacto> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }

    @GetMapping("/buscarnumCel")
    public List<Contacto> buscarnumCel() {
        return cService.buscarnumCel();
    }
    @GetMapping("/cantidades")
    List<Resultado>buscarCantidadContactos(){return cService.cantidadContactos();}
}

