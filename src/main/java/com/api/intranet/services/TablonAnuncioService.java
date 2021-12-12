package com.api.intranet.services;

import java.util.List;
import java.util.stream.Collectors;

import com.api.intranet.entities.Departamento;
import com.api.intranet.entities.Empleado;
import com.api.intranet.entities.TablonAnuncio;
import com.api.intranet.pojos.TablonAnuncioRequest;
import com.api.intranet.repositories.DepartamentoRepository;
import com.api.intranet.repositories.EmpleadoRepository;
import com.api.intranet.repositories.TablonAnuncioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TablonAnuncioService {
    
    @Autowired TablonAnuncioRepository tablonAnuncioRepository;
    @Autowired DepartamentoRepository departamentoRepo;
    @Autowired EmpleadoRepository empleadoRepo;
    
    public TablonAnuncioService(){}

    public List<TablonAnuncio> getAnuncios(){
        return tablonAnuncioRepository.findAll();
    }

    // Guardar un anuncio
    public TablonAnuncio addUnAnuncio(TablonAnuncioRequest tablonAnuncioRequest){
        TablonAnuncio tablonAnuncio = new TablonAnuncio();
        tablonAnuncio.setId(tablonAnuncioRequest.id);
        tablonAnuncio.setTitulo(tablonAnuncioRequest.titulo);
        tablonAnuncio.setMsg(tablonAnuncioRequest.msg);
        tablonAnuncio.setFecha(tablonAnuncioRequest.fecha);
        tablonAnuncio.setIsDelete(tablonAnuncioRequest.isDelete);
        
        // Anade el empleado buscandolo por el id
        Empleado autor = empleadoRepo.findById(tablonAnuncioRequest.autor).get();
        tablonAnuncio.setAutor(autor);
        
        // Anade los departamentos
        tablonAnuncio.setDepart_visible(tablonAnuncioRequest.depart_visible
        .stream()
        .map(elDepartamento -> {
            Departamento dddepartamentos = elDepartamento;
            if(dddepartamentos.getIdDepartamento() > 0){
                dddepartamentos = departamentoRepo.findById(dddepartamentos.getIdDepartamento());
            }
            dddepartamentos.addAnuncioDep(tablonAnuncio);
            return dddepartamentos;
        })
        .collect(Collectors.toSet()));

        return tablonAnuncioRepository.save(tablonAnuncio);
    }

}
