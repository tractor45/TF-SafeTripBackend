package com.example.safetripbackend.serviceimpls;


import com.example.safetripbackend.entities.Contacto;
import com.example.safetripbackend.entities.Resultado;
import com.example.safetripbackend.repositories.IContactoRepository;
import com.example.safetripbackend.service.IContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactoServiceImpl implements IContactoService {
@Autowired
  private IContactoRepository cR;
    @Override
    public void insert(Contacto contacto){cR.save(contacto);}
    @Override
    public List<Contacto> list(){return cR.findAll();}

    @Override
    public void eliminar(int idContacto){cR.deleteById(idContacto);}

    @Override
    public Optional<Contacto> listarId(int idContacto) {
        return cR.findById(idContacto);
    }
   @Override
    public List<Contacto> buscarNombre(String nameContacto){return cR.buscarNombre(nameContacto);}

    @Override
     public List<Contacto> buscarnumCel(){
// TODO Auto-generated method stub
        return cR.buscarnumCel();
    }
    @Override
    public List<Resultado> cantidadContactos(){
        List<Resultado> lista=new ArrayList<>();
        cR.cantidadContactos().forEach(y->{
            Resultado r = new Resultado();
            r.setCantidad(y[1]);
            r.setViajero(y[0]);
            lista.add(r);
        });

        return lista;
    }
}
