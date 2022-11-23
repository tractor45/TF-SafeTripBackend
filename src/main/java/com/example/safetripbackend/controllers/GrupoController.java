package com.example.safetripbackend.controllers;

import com.example.safetripbackend.entities.Grupo;
import com.example.safetripbackend.service.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {
    @Autowired
    private IGrupoService gService;

    @PostMapping
    public void registrar(@RequestBody Grupo g) {
        gService.insert(g);
    }

    @GetMapping
    public List<Grupo> list() {return gService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        gService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Grupo g) {
        gService.insert(g);
    }

    @PostMapping("/buscar")
    public List<Grupo> buscar(@RequestBody Grupo g) {
        return gService.search(g.getNombreGrupo());
    }
}
