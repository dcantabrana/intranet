package com.dca.intranet.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="diaFestivo") 
public class DiaFestivoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idFestivo;

    private Date fecha;
    private String nombre;

    public Long getIdFestivo() {
        return this.idFestivo;
    }

    public void setIdFestivo(Long idFestivo) {
        this.idFestivo = idFestivo;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
