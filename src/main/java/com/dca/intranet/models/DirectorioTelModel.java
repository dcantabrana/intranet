package com.dca.intranet.models;
import javax.persistence.*;

@Entity
@Table(name="directorioTelefonico") 
public class DirectorioTelModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idDirectorioTel;

    private String nombre;
    private Integer telefono;
    private String email;

    public Long getIdDirectorioTel() {
        return this.idDirectorioTel;
    }

    public void setIdDirectorioTel(Long idDirectorioTel) {
        this.idDirectorioTel = idDirectorioTel;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}
