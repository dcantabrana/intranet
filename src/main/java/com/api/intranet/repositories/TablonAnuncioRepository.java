package com.api.intranet.repositories;

import com.api.intranet.entities.TablonAnuncio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TablonAnuncioRepository extends JpaRepository<TablonAnuncio, Integer>{
    

    public TablonAnuncio findById(int id);
}
