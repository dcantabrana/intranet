package com.api.intranet.entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="dias_festivos") 
public class DiaFestivo {
    
    @Id
    @Column(name="id_festivo")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private Date fecha;
    @Column(name="nombre")
    private String nombreFestivo;



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreFestivo() {
        return this.nombreFestivo;
    }

    public void setNombreFestivo(String nombreFestivo) {
        this.nombreFestivo = nombreFestivo;
    }


    
}
