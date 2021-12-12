package com.api.intranet.entities;


import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @Column(name="id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name="apellido", nullable = false)
    private String apellido;
    private Date fechaNacimiento;
    private String genero;

    private String pais;
    private String calle;
    private int cp;
    private int telefono;
    private String email;
    private String localidad;
    private int porcentaje;
    private String puesto;
    private String login;
    private String password;
    
    private String foto;
    private String dni;
    
    private Date fechaEntrada;
    private Date fechaSalida;

    private byte isActif;
    private byte isDelete;


    // @JsonIgnore
    // private String password;a

    
    

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name="emp_dep",
    joinColumns = @JoinColumn(name="id_empleado"),
    inverseJoinColumns = @JoinColumn(name="id_departamento"))
    private Set<Departamento> departamento = new HashSet<>();

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "id_empleado")
    private Set<TablonAnuncio> anuncios;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public byte getIsActif() {
        return isActif;
    }

    public void setIsActif(byte isActif) {
        this.isActif = isActif;
    }

    public byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }

    public Set<Departamento> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Set<Departamento> departamento) {
        this.departamento = departamento;
    }



    public Set<TablonAnuncio> getAnuncios() {
        return this.anuncios;
    }

    public void setAnuncios(Set<TablonAnuncio> anuncios) {
        this.anuncios = anuncios;
    }

    // public void addAnuncioAutor(TablonAnuncio anuncio){
    //     this.anuncios.add(anuncio);
    // }

    
}
