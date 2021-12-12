package com.api.intranet.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tablon_anuncios")
public class TablonAnuncio {
    
    @Id
    @Column(name="id_anuncio")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String msg;
    private Date fecha;

    // Relacion de mucho a uno para empleados
    @ManyToOne
    @JoinColumn(name="id_empleado")
    private Empleado autor;

    private byte isDelete;

    // Relacion de muchos a muchos para departamentos
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name="dep_tab",
    joinColumns = @JoinColumn(name="id_anuncio"),
    inverseJoinColumns = @JoinColumn(name="id_departamento"))
    private Set<Departamento> depart_visible = new HashSet<>();
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public byte getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<Departamento> getDepart_visible() {
        return this.depart_visible;
    }

    public void setDepart_visible(Set<Departamento> depart_visible) {
        this.depart_visible = depart_visible;
    }


    public Empleado getAutor() {
        return this.autor;
    }

    public void setAutor(Empleado autor) {
        this.autor = autor;
    }


}
