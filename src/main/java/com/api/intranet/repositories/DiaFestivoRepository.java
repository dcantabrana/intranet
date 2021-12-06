package com.api.intranet.repositories;

import com.api.intranet.entities.DiaFestivo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaFestivoRepository extends JpaRepository<DiaFestivo, Integer>{
    
    public DiaFestivo findById(int id);
}
