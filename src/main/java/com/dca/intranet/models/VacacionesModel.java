package com.dca.intranet.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="vacaciones")
public class VacacionesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idVacaciones;

    private Long idEmpleado;
    private Date fechaInicio;
    private Date fechaFin;
    private Byte isOk;

    public Long getIdVacaciones() {
        return this.idVacaciones;
    }

    public void setIdVacaciones(Long idVacaciones) {
        this.idVacaciones = idVacaciones;
    }

    public Long getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Byte getIsOk() {
        return this.isOk;
    }

    public void setIsOk(Byte isOk) {
        this.isOk = isOk;
    }
}
