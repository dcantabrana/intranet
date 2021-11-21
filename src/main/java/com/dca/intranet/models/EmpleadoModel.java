package com.dca.intranet.models;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class EmpleadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idEmpleado;
    
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String genero;
    private String pais;
    private String calle;
    private Integer cp;
    private Integer telefono;
    private String email;
    private String localidad;
    private Integer porcentaje;
    private String puesto;
    private String login;
    private String password;
    private Blob photo;
    private Blob dni;
    private Date fechaEntrada;
    private Date fechaSalida;
    private Byte isActif;
    private Byte isDelete;

    public Long getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getCp() {
        return this.cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Integer getPorcentaje() {
        return this.porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Blob getPhoto() {
        return this.photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public Blob getDni() {
        return this.dni;
    }

    public void setDni(Blob dni) {
        this.dni = dni;
    }

    public Date getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Byte getIsActif() {
        return this.isActif;
    }

    public void setIsActif(Byte isActif) {
        this.isActif = isActif;
    }

    public Byte getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    
}
