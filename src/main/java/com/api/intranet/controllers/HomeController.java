package com.api.intranet.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.api.intranet.entities.Departamento;
import com.api.intranet.entities.DiaFestivo;
import com.api.intranet.entities.Directorio;
import com.api.intranet.entities.Empleado;
import com.api.intranet.entities.TablonAnuncio;
import com.api.intranet.pojos.EmpleadoRequest;
import com.api.intranet.services.DepartamentoService;
import com.api.intranet.services.DiaFestivoService;
import com.api.intranet.services.DirectorioService;
import com.api.intranet.services.EmpleadoService;
import com.api.intranet.services.TablonAnuncioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class HomeController {
    
    @Autowired EmpleadoService empleadoService;
    @Autowired DepartamentoService departamentoService;
    @Autowired DiaFestivoService diaFestivoService;
    @Autowired DirectorioService directorioService;
    @Autowired TablonAnuncioService tablonAnuncioService;


    // --------------------------------- EMPLEADOS --------------------------------
    // Devuelve todos los empleados
    @GetMapping("empleados")
    public List<Empleado> getEmpleados(){
        return empleadoService.getEmpleados();
    }
    // Anade empleado con departamento/s
    @PostMapping("empleados")
    public Empleado addEmpleado(@RequestBody EmpleadoRequest empleadoRequest){
        return empleadoService.addEmpleadoConDepartamento(empleadoRequest);
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
    // Devuelve el empleado con el nombre x 
    @GetMapping("getempleado")
    public ArrayList<Empleado> getEmpleado(String nombre){
        return this.empleadoService.getNombre(nombre);
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
    // ----------------------------------------------------------------------------


    // ------------------------------- DEPARTAMENTOS ------------------------------
    @GetMapping("departamentos")
    public List<Departamento> getDepartamentos(){
        return departamentoService.getDepartamentos();
    }
    @PostMapping("departamentos")
    public Departamento addDepartamento(@RequestBody Departamento departamento){
        return departamentoService.addDepartamento(departamento);
    }
    // ----------------------------------------------------------------------------



    // ------------------------------- DIAS FESTIVOS ----------------------------
    @GetMapping("diasfestivos")
    public List<DiaFestivo> getDiasFestivos(){
        return diaFestivoService.getDiasFestivos();
    }
    @PostMapping("diasfestivos")
    public DiaFestivo addDiaFestivo(@RequestBody DiaFestivo diaFestivo){
        return diaFestivoService.addDiaFestivo(diaFestivo);
    }
    // ----------------------------------------------------------------------------

    
    // -------------------------- DIRECTORIO TELEFONICO ----------------------------
    @GetMapping("directorio")
    public List<Directorio> getDirectorio(){
        return directorioService.getDirectorio();
    }
    @PostMapping("directorio")
    public Directorio addDirectorio(@RequestBody Directorio directorio){
        return directorioService.addDirectorio(directorio);
    }
    // ----------------------------------------------------------------------------

    // --------------------------------- ANUNCIOS --------------------------------
    // Devuelve todos los empleados
    @GetMapping("anuncios")
    public List<TablonAnuncio> getAnuncios(){
        return tablonAnuncioService.getAnuncios();
        
    }
    // ----------------------------------------------------------------------------
}
