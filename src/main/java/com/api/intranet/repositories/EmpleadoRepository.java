package com.api.intranet.repositories;

import java.util.ArrayList;

import com.api.intranet.entities.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    // Devuelve ArrayList por si hay mas de 1.
    public abstract ArrayList<Empleado> findByNombre(String nombre);

    public Empleado findById(long id);
    
}
