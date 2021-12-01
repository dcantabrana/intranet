package com.api.intranet.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.api.intranet.entities.Departamento;
import com.api.intranet.entities.Empleado;
import com.api.intranet.pojos.EmpleadoRequest;
import com.api.intranet.repositories.DepartamentoRepository;
import com.api.intranet.repositories.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    
    @Autowired EmpleadoRepository empleadosRepository;
    @Autowired DepartamentoRepository departamentoRepo;

    public EmpleadoService(){}

    // Devuelve empleado en lista por si hay mas de uno
    public List<Empleado> getEmpleados(){
        return empleadosRepository.findAll();
    }

    // public Empleado saveEmpleado(Empleado empleado) {
    //     return empleadosRepository.save(empleado);
    // }
    
    // Para sacar por id el empleado
    public Optional<Empleado> obtenerPorId(Long id){
        return empleadosRepository.findById(id);
    }

    public boolean eliminarEmpleado(Long id) {
        try{
            empleadosRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    // Buscar por nombre de empleados
    public ArrayList<Empleado> getNombre(String nombre) {
        return empleadosRepository.findByNombre(nombre);
    }

    public Empleado addEmpleadoConDepartamento(EmpleadoRequest empleadoRequest){
        Empleado empleado = new Empleado();
        empleado.setId(empleadoRequest.id);
        empleado.setNombre(empleadoRequest.nombre);
        empleado.setApellido(empleadoRequest.apellido);
        empleado.setFechaNacimiento(empleadoRequest.fechaNacimiento);
        empleado.setGenero(empleadoRequest.genero);
        empleado.setPais(empleadoRequest.pais);
        empleado.setCalle(empleadoRequest.calle);
        empleado.setCp(empleadoRequest.cp);
        empleado.setTelefono(empleadoRequest.telefono);
        empleado.setEmail(empleadoRequest.email);
        empleado.setLocalidad(empleadoRequest.localidad);
        empleado.setPorcentaje(empleadoRequest.porcentaje);
        empleado.setPuesto(empleadoRequest.puesto);
        empleado.setLogin(empleadoRequest.login);
        empleado.setPassword(empleadoRequest.password);
        empleado.setFoto(empleadoRequest.foto);
        empleado.setDni(empleadoRequest.dni);
        empleado.setFechaEntrada(empleadoRequest.fechaEntrada);
        empleado.setFechaSalida(empleadoRequest.fechaSalida);
        empleado.setIsActif(empleadoRequest.isActif);
        empleado.setIsDelete(empleadoRequest.isDelete);
 
        empleado.setDepartamento(empleadoRequest.departamento
        .stream()
        .map(departamento -> {
            Departamento ddepartamentos = departamento;
            if(ddepartamentos.getIdDepartamento() > 0){
                ddepartamentos = departamentoRepo.findById(ddepartamentos.getIdDepartamento());
            }
            ddepartamentos.addEmpleado(empleado);
            return ddepartamentos;
        })
        .collect(Collectors.toSet()));
        return empleadosRepository.save(empleado);
    }


}
