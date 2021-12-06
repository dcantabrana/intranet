package com.api.intranet.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="departamentos")
public class Departamento {
    
    @Id
    @Column(name = "id_departamento")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //@JsonIgnore
    private int idDepartamento;

    @Column(name="nombre_departamento")
    private String nombreDepartamento;

    private String abreviatura;
    private String email;

    @ManyToMany(mappedBy="departamento")
    @JsonIgnore
    private Set<Empleado> empleados = new HashSet<>();

    @ManyToMany(mappedBy="depart_visible")
    @JsonIgnore
    private Set<TablonAnuncio> tablonAnuncios = new HashSet<>();


    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public Set<TablonAnuncio> getTablonAnuncios() {
        return this.tablonAnuncios;
    }

    public void setTablonAnuncios(Set<TablonAnuncio> tablonAnuncios) {
        this.tablonAnuncios = tablonAnuncios;
    }
    

}
