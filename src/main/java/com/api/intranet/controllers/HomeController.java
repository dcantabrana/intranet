package com.api.intranet.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.api.intranet.entities.Departamento;
import com.api.intranet.entities.Empleado;
import com.api.intranet.pojos.EmpleadoRequest;
import com.api.intranet.services.DepartamentoService;
import com.api.intranet.services.EmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class HomeController {
    
    @Autowired
    EmpleadoService empleadoService;

    @Autowired DepartamentoService departamentoService;


    @GetMapping("hola")
    public String sayHello(){
        return "hola";
    }

    // Devuelve todos los empleados
    @GetMapping("empleados")
    public List<Empleado> getEmpleados(){
        return empleadoService.getEmpleados();
    }

    // Post de empleado sin departamento
    // @PostMapping()
    // public Empleado saveEmpleado(@RequestBody Empleado empleado){
    //     return empleadoService.saveEmpleado(empleado);
    // }
    
    // Devuelve el empleado con el id x
    @GetMapping(path = "empleados/{id}")
    public Optional<Empleado> obetenerEmpleadoPorId(@PathVariable("id") Long id){
        return this.empleadoService.obtenerPorId(id);
    }

    // Eliminar con el id
    @DeleteMapping( path = "empleados/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.empleadoService.eliminarEmpleado(id);
        if (ok){
            return "Se ha eliminado el empleado con id " + id;
        }else {
            return "No se pudo eliminar el empleado con id " + id;
        }
    }

    //sacar empleado anadiendo el campo nombre con postman 
    @GetMapping("getempleado")
    public ArrayList<Empleado> getEmpleado(String nombre){
        return this.empleadoService.getNombre(nombre);
    }

    // Post de empleado con departamento/s
    @PostMapping("empleados")
    public Empleado addEmpleado(@RequestBody EmpleadoRequest empleadoRequest){
        return empleadoService.addEmpleadoConDepartamento(empleadoRequest);
    }

    // Devuelve todos los departamentos
    @GetMapping("departamentos")
    public List<Departamento> getDepartamentos(){
        return departamentoService.getDepartamentos();
    }

}
