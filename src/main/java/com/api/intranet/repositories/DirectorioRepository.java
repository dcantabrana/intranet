package com.api.intranet.repositories;

import com.api.intranet.entities.Directorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorioRepository extends JpaRepository<Directorio, Integer>{
    
    public Directorio findById(int id);
}
