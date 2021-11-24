package com.dca.intranet.models;
import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name="tablonAnuncios") 
public class TablonAnunciosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idAnuncio;

    @Column(length = 512)
    private String titulo;
    @Column(length = 1512)
    private String msg;
    private Date fecha;
    private Long idEmpleado;
    private Byte isDelete;
    private Long idTablonAcces;

    public Long getIdAnuncio() {
        return this.idAnuncio;
    }

    public void setIdAnuncio(Long idAnuncio) {
        this.idAnuncio = idAnuncio;
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

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Byte getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Long getIdTablonAcces() {
        return this.idTablonAcces;
    }

    public void setIdTablonAcces(Long idTablonAcces) {
        this.idTablonAcces = idTablonAcces;
    }
}
