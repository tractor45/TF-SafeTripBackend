package com.example.safetripbackend.controllers;

import com.example.safetripbackend.entities.Servicio;
import com.example.safetripbackend.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
    @Autowired
    private IServicioService svService;

    @PostMapping
    public void registrar(@RequestBody Servicio d) {
        svService.insert(d);
    }

    @GetMapping
    public List<Servicio> list() {
        return svService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        svService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Servicio s) {
        svService.insert(s);
    }

    @PostMapping("/buscar")
    public List<Servicio> buscar(@RequestBody Servicio s) {
        return svService.search(s.getTipoServicio());
    }
}
