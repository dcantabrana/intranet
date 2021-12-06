package com.api.intranet.entities;

import javax.persistence.*;

@Entity
@Table(name="directorio_telefonico")
public class Directorio {
    
    @Id
    @Column(name="id_directorio_tel")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre")
    private String nombreDirectorio;
    private int telefono;
    private String email;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDirectorio() {
        return this.nombreDirectorio;
    }

    public void setNombreDirectorio(String nombreDirectorio) {
        this.nombreDirectorio = nombreDirectorio;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
