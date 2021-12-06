package com.api.intranet.services;

import java.util.List;

import com.api.intranet.entities.Directorio;
import com.api.intranet.repositories.DirectorioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorioService {
    @Autowired DirectorioRepository directorioRepository;

    public DirectorioService(){}

    public List<Directorio> getDirectorio(){
        return directorioRepository.findAll();
    }

    public Directorio addDirectorio(Directorio directorio){
        return directorioRepository.save(directorio);
    }
}
