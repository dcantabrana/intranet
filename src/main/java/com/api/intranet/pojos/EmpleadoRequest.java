package com.api.intranet.pojos;


import java.sql.Date;
import java.util.Set;

import com.api.intranet.entities.Departamento;

public class EmpleadoRequest {
    
    public Long id;

    public String nombre;
    public String apellido;
    public Date fechaNacimiento;
    public String genero;
    public String pais;
    public String calle;
    public int cp;
    public int telefono;
    public String email;
    public String localidad;
    public int porcentaje;
    public String puesto;
    public String login;
    public String password;
    
    public String foto;
    public String dni;
    
    public Date fechaEntrada;
    public Date fechaSalida;

    public byte isActif;
    public byte isDelete;

    public Set<Departamento> departamento;
}
