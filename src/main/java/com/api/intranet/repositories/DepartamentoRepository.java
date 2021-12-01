package com.api.intranet.repositories;

import com.api.intranet.entities.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{
    
    public Departamento findById(int id);
}
