package com.api.intranet.services;

import java.util.List;

import com.api.intranet.entities.Departamento;
import com.api.intranet.repositories.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {

    @Autowired DepartamentoRepository departamentoRepository;

    public DepartamentoService(){}

    public List<Departamento> getDepartamentos(){
        return departamentoRepository.findAll();
    }
    
}
