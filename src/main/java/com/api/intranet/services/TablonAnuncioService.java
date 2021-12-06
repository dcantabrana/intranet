package com.api.intranet.services;

import java.util.List;

import com.api.intranet.entities.TablonAnuncio;
import com.api.intranet.repositories.TablonAnuncioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TablonAnuncioService {
    
    @Autowired TablonAnuncioRepository tablonAnuncioRepository;

    public TablonAnuncioService(){}

    public List<TablonAnuncio> getAnuncios(){
        return tablonAnuncioRepository.findAll();
    }
}
